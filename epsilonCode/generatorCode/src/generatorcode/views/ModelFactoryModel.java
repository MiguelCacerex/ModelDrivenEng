package generatorcode.views;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import abstractPart.AbstractPartFactory;
import abstractPart.AssociationMSE;
import abstractPart.AssociationsMSE;
import abstractPart.HashCodeClassMSE;
import abstractPart.ModelFactoryAbstract;
import dblanguagepart.Column;
import dblanguagepart.DblanguagepartFactory;
import dblanguagepart.ModelFactoryRelationalModel;
import dblanguagepart.Schema;
import dblanguagepart.Table;
import specificPart.AttributeMSE;
import specificPart.ClassDiagramMSE;
import specificPart.ClassMSE;
import specificPart.InheritanceMSE;
import specificPart.MethodMSE;
import specificPart.ModelFactorySpecific;
import specificPart.PackageMSE;
import specificPart.RelationMSE;
import specificPart.SpecificPartFactory;
import specificPart.SpecificPartPackage;

public class ModelFactoryModel {

	// -------------------------------------------------------------------------- Singleton --------------------------------------------------------------------------
	
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Metodo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	//Creacion de las factories 
	ModelFactorySpecific modelFactorySpecific = SpecificPartFactory.eINSTANCE.createModelFactorySpecific();
	ModelFactoryAbstract modelFactoryAbstract = AbstractPartFactory.eINSTANCE.createModelFactoryAbstract();
	ModelFactoryRelationalModel modelFactoryAbstract_MR = DblanguagepartFactory.eINSTANCE.createModelFactoryRelationalModel();

	public ModelFactoryModel() {
		modelFactorySpecific = loadSpecificPart();
		modelFactoryAbstract = loadAbstractPart();
		modelFactoryAbstract_MR = loadAbstractPart_MR();
	}

	
	
	
	// -----------------------------------------------------------------Load and Save ModelFactorys ---------------------------------------------------------------

	/**
	 * Este metodo permite cargar el modelfactoryspecific del diagrama de clases
	 * @return El modelFactorySpecific cargada
	 */
	public ModelFactorySpecific loadSpecificPart() {
		ModelFactorySpecific modelFactorySpecific = null;
		SpecificPartPackage whoownmePackage = SpecificPartPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.specificpart");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactorySpecific = (ModelFactorySpecific) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactorySpecific);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactorySpecific;
	}

	/**
	 * Este metodo permite cargar el modelFactoryAbstract del diagrama de clases
	 * @return
	 */
	public ModelFactoryRelationalModel loadAbstractPart_MR() {
		ModelFactoryRelationalModel modelFactoryAbstracta_MR = null;
		DblanguagepartFactory whoownmePackage = DblanguagepartFactory.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.dblanguagepart");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryAbstracta_MR = (ModelFactoryRelationalModel) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstracta_MR);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryAbstracta_MR;
	}

	/**
	 * Este metodo permite cargar el modelFactoryAbstract del diagrama de clases
	 * @return
	 */
	public ModelFactoryAbstract loadAbstractPart() {
		ModelFactoryAbstract modelFactoryAbstracta = null;
		AbstractPartFactory whoownmePackage = AbstractPartFactory.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstractpart");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryAbstracta = (ModelFactoryAbstract) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstracta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryAbstracta;
	}

	/**
	 * Este metodo permite guardar el ModelFactorySpecific del diagrama de clases
	 */
	public void saveSpecificPart() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.specificpart");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactorySpecific);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo permite guardar el ModelFactorySpecific del diagrama de clases
	 */
	public void saveSpecificPart_MR() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.dblanguagepart");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstract_MR);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo permite guardar el ModelFactoryAbstract del diagrama de clases
	 */
	public void saveAbstractPart() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstractpart");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstract);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	// -------------------------------- Generacion de rutas de la parte especifica del diagrama de clases -----------------------------

	/**
	 * Genera las rutas de cada uno de los paquetes y diagramas de la raiz del proyecto
	 * @param lstPackages
	 * @param lstDiagrams
	 */
	private void generatePathsFactorySpecific(EList<PackageMSE> lstPackages, EList<ClassDiagramMSE> lstDiagrams) {

		String pathRoot = "/";

		for (PackageMSE packageMSE : lstPackages) {
			packageMSE.setPath(pathRoot);
			genereatePathsPackage(packageMSE);
		}
		for (ClassDiagramMSE classDiagramMSE : lstDiagrams) {
			classDiagramMSE.setPath(pathRoot);
			genereatePathsDiagrams(classDiagramMSE);
		}

		saveSpecificPart();
	}

	/**
	 * Genera o actualiza las rutas de los paquetes internos del proyecto
	 * @param packageMSE
	 */
	private void genereatePathsPackage(PackageMSE packageMSE) {

		packageMSE.setPath(packageMSE.getPath() + packageMSE.getName());

		if (!packageMSE.getLstDiagrams().isEmpty()) {
			for (ClassDiagramMSE diagram : packageMSE.getLstDiagrams()) {
				diagram.setPath(packageMSE.getPath() + "/");
				genereatePathsDiagrams(diagram);
			}
		}
	}

	/**
	 * Genera o actualiza las rutas de los diagramas internos
	 * @param diagram
	 */
	public void genereatePathsDiagrams(ClassDiagramMSE diagram) {

		diagram.setPath(diagram.getPath() + diagram.getName());

		if (!diagram.getLstClass().isEmpty()) {
			generatePathClass(diagram);
		}
		if (!diagram.getLstRelations().isEmpty() || !diagram.getLstInheritances().isEmpty()) {
			generatePathRelations(diagram);
		}

		if (!diagram.getLstPackages().isEmpty()) {
			for (PackageMSE packageAux : diagram.getLstPackages()) {
				packageAux.setPath(diagram.getPath() + "/");
				genereatePathsPackage(packageAux);
			}
		}
	}

	/**
	 * Genera o actualiza las rutas de las relaciones en los diagramas
	 * @param diagram
	 */
	private void generatePathRelations(ClassDiagramMSE diagram) {

		if (!diagram.getLstRelations().isEmpty()) {
			for (RelationMSE relation : diagram.getLstRelations()) {
				relation.setPath(diagram.getPath() + "/" + relation.getSource().getName() + "-->"
						+ relation.getTarget().getName());
			}
		}
		if (!diagram.getLstInheritances().isEmpty()) {
			for (InheritanceMSE inheritance : diagram.getLstInheritances()) {
				inheritance.setPath(diagram.getPath() + "/" + inheritance.getChild().getName() + "-->"
						+ inheritance.getParent().getName());
			}
		}

	}

	/**
	 * Genera o actualiza las rutas de las clases de un diagrama
	 * @param diagram
	 */
	private void generatePathClass(ClassDiagramMSE diagram) {

		for (ClassMSE classAux : diagram.getLstClass()) {

			classAux.setPath(diagram.getPath() + "/" + classAux.getName());

			if (!classAux.getLstAttributes().isEmpty()) {
				for (AttributeMSE attributeAux : classAux.getLstAttributes()) {
					attributeAux.setPath(classAux.getPath() + "/" + attributeAux.getName());
				}
			}
			if (!classAux.getLstMethods().isEmpty()) {
				for (MethodMSE methodAux : classAux.getLstMethods()) {
					methodAux.setPath(classAux.getPath() + "/" + methodAux.getName());
				}
			}
		}
	}

	
	
	
	// ----------------------------------------- Tranformacion M2M de parte especifica a parte a abstracta -------------------------------------------

	/**
	 * Este metodo realiza la transformacion del modelo especifico a el modelo
	 * abstracto
	 */
	public void transformationM2M() {

		loadAbstractPart();
		saveSpecificPart();

		//Genera las rutas de los paquetes, diagramas y realaciones
		generatePathsFactorySpecific(modelFactorySpecific.getLstPackages(), modelFactorySpecific.getLstDiagrams());

		// Creacion de la carpeta principal del proyecto

		String nameProject = ingresarInput();

		abstractPart.PackageMSE packageMain = AbstractPartFactory.eINSTANCE.createPackageMSE();
		packageMain.setName(nameProject);
		packageMain.setPath("/" + packageMain.getName());

		// Recorrido de los paquetes de la raiz del proyecto

		for (specificPart.PackageMSE packageSpc : modelFactorySpecific.getLstPackages()) {
			abstractPart.PackageMSE newPackageAbs = AbstractPartFactory.eINSTANCE.createPackageMSE();
			newPackageAbs.setPath(packageMain.getPath() + "/");
			newPackageAbs.setName(packageSpc.getName());
			newPackageAbs.setState(packageSpc.getState());
			newPackageAbs.setLocation(packageSpc.getLocation());
			newPackageAbs.setDocumentation(packageSpc.getDocumentation());
			generateProjectPacketsM2M(newPackageAbs, packageSpc);
			packageMain.getLstPackages().add(newPackageAbs);
		}

		// Recorrido de los diagamas de la raiz del proyecto

		for (ClassDiagramMSE diagramSpc : modelFactorySpecific.getLstDiagrams()) {
			abstractPart.ClassDiagramMSE newDiagramAbs = AbstractPartFactory.eINSTANCE.createClassDiagramMSE();
			newDiagramAbs.setPath("/");
			newDiagramAbs.setState(diagramSpc.getState());
			newDiagramAbs.setName(diagramSpc.getName());
			newDiagramAbs.setLocation(diagramSpc.getLocation());
			newDiagramAbs.setDocumentation(diagramSpc.getDocumentation());
			generatePackageDiagramsM2M(diagramSpc, packageMain, newDiagramAbs);
			packageMain.getLstDiagrams().add(newDiagramAbs);
		}

		//Se añade el paquete principal a el modelfactory de la parte abstracta
		
		modelFactoryAbstract.getLstPackages().add(packageMain);
		saveAbstractPart();
	}

	/**
	 * Este metodo permite la transformacion M2M de los paquetes y recorre los diagramas de los paquetes
	 * @param newPackageAbs
	 * @param packageSpc
	 */
	private void generateProjectPacketsM2M(abstractPart.PackageMSE newPackageAbs, specificPart.PackageMSE packageSpc) {

		newPackageAbs.setPath(newPackageAbs.getPath() + newPackageAbs.getName());

		abstractPart.AssociationsMSE associationPackage = AbstractPartFactory.eINSTANCE.createAssociationsMSE();
		associationPackage.setPath(newPackageAbs.getPath() + "Associations");

		if (!packageSpc.getLstDiagrams().isEmpty()) {
			for (ClassDiagramMSE diagramSpc : packageSpc.getLstDiagrams()) {

				abstractPart.ClassDiagramMSE newDiagramAbs = AbstractPartFactory.eINSTANCE.createClassDiagramMSE();

				newDiagramAbs.setState(diagramSpc.getState());
				newDiagramAbs.setName(diagramSpc.getName());
				newDiagramAbs.setPath(newPackageAbs.getPath() + "/" + newDiagramAbs.getName());
				newDiagramAbs.setLocation(diagramSpc.getLocation());
				newDiagramAbs.setDocumentation(diagramSpc.getDocumentation());
				generatePackageDiagramsM2M(diagramSpc, newPackageAbs, newDiagramAbs);

				newPackageAbs.getLstDiagrams().add(newDiagramAbs);

				if (!diagramSpc.getLstRelations().isEmpty() || !diagramSpc.getLstInheritances().isEmpty()) {
					generatePackageRelationshipsM2M(diagramSpc, associationPackage);
				}
				newPackageAbs.setAssociations(associationPackage);
			}
		}
	}

	/**
	 * Este metodo permite la transformacion M2M de los diagramas y recorre las clases del diagrama
	 * @param diagramSpc
	 * @param newPackageAbs
	 * @param newDiagramAbs
	 */
	private void generatePackageDiagramsM2M(ClassDiagramMSE diagramSpc, abstractPart.PackageMSE newPackageAbs,
			abstractPart.ClassDiagramMSE newDiagramAbs) {

		// Creacion de las clases del diagrama

		if (!diagramSpc.getLstClass().isEmpty()) {
			generateClassesPacketsM2M(diagramSpc, newPackageAbs, newDiagramAbs);
		}

		if (!diagramSpc.getLstPackages().isEmpty()) {
			for (PackageMSE packageAux : diagramSpc.getLstPackages()) {

				abstractPart.PackageMSE newPackageAbsAux = AbstractPartFactory.eINSTANCE.createPackageMSE();
				newPackageAbsAux.setPath(newPackageAbs.getPath() + "/" + packageAux.getName());
				newPackageAbsAux.setName(packageAux.getName());
				newPackageAbsAux.setState(packageAux.getState());
				newPackageAbsAux.setLocation(packageAux.getLocation());
				newPackageAbsAux.setDocumentation(packageAux.getDocumentation());
				generateProjectPacketsM2M(newPackageAbsAux, packageAux);
				newPackageAbs.getLstPackages().add(newPackageAbsAux);
			}
		}

	}

	/**
	 * Este metodo permite la transformacion M2M de las relaciones para el diagrama de clases
	 * @param diagramSpc
	 * @param associationPackage
	 */
	private void generatePackageRelationshipsM2M(ClassDiagramMSE diagramSpc, AssociationsMSE associationPackage) {

		for (specificPart.RelationMSE relation : diagramSpc.getLstRelations()) {
			if (relation instanceof specificPart.AgregationMSE) {
				abstractPart.AgregationMSE agregation = AbstractPartFactory.eINSTANCE.createAgregationMSE();
				agregation.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName()+ ")(" + relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				agregation.setType(relation.getType());
				agregation.setState(relation.getState());
				agregation.setRoleTarget(relation.getRoleTarget());
				agregation.setRoleSource(relation.getRoleSource());
				agregation.setPath(associationPackage.getPath() + "/" + agregation.getName());
				agregation.setNavigabilityTarget(relation.isNavigabilityTarget());
				agregation.setNavigabilitySource(relation.isNavigabilitySource());
				agregation.setMultiplicityTarget(relation.getMultiplicityTarget());
				agregation.setMultiplicitySource(relation.getMultiplicitySource());
				agregation.setLocation("location");
				agregation.setDocumentation(relation.getDocumentation());
				associationPackage.getLstAgregations().add(agregation);
			}
			if (relation instanceof specificPart.ContainmentMSE) {
				abstractPart.ContainmentMSE newRlContainment = AbstractPartFactory.eINSTANCE.createContainmentMSE();
				newRlContainment.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlContainment.setType(relation.getType());
				newRlContainment.setState(relation.getState());
				newRlContainment.setRoleTarget(relation.getRoleTarget());
				newRlContainment.setRoleSource(relation.getRoleSource());
				newRlContainment.setPath(associationPackage.getPath() + "/" + newRlContainment.getName());
				newRlContainment.setNavigabilityTarget(relation.isNavigabilityTarget());
				newRlContainment.setNavigabilitySource(relation.isNavigabilitySource());
				newRlContainment.setMultiplicityTarget(relation.getMultiplicityTarget());
				newRlContainment.setMultiplicitySource(relation.getMultiplicitySource());
				newRlContainment.setLocation("location");
				newRlContainment.setDocumentation(relation.getDocumentation());
				associationPackage.getLstContainments().add(newRlContainment);
			}
			if (relation instanceof specificPart.AssociationMSE) {
				abstractPart.AssociationMSE newRlAssociation = AbstractPartFactory.eINSTANCE.createAssociationMSE();
				newRlAssociation.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlAssociation.setType(relation.getType());
				newRlAssociation.setState(relation.getState());
				newRlAssociation.setRoleTarget(relation.getRoleTarget());
				newRlAssociation.setRoleSource(relation.getRoleSource());
				newRlAssociation.setPath(associationPackage.getPath() + "/" + newRlAssociation.getName());
				newRlAssociation.setNavigabilityTarget(relation.isNavigabilityTarget());
				newRlAssociation.setNavigabilitySource(relation.isNavigabilitySource());
				newRlAssociation.setMultiplicityTarget(relation.getMultiplicityTarget());
				newRlAssociation.setMultiplicitySource(relation.getMultiplicitySource());
				newRlAssociation.setLocation("location");
				newRlAssociation.setDocumentation(relation.getDocumentation());
				associationPackage.getLstAssociations().add(newRlAssociation);
			}
			if (relation instanceof specificPart.ImplementationMSE) {
				abstractPart.ImplementationMSE newRlImplementation = AbstractPartFactory.eINSTANCE.createImplementationMSE();
				newRlImplementation.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlImplementation.setType(relation.getType());
				newRlImplementation.setState(relation.getState());
				newRlImplementation.setRoleTarget(relation.getRoleTarget());
				newRlImplementation.setRoleSource(relation.getRoleSource());
				newRlImplementation.setPath(associationPackage.getPath() + "/" + newRlImplementation.getName());
				newRlImplementation.setNavigabilityTarget(relation.isNavigabilityTarget());
				newRlImplementation.setNavigabilitySource(relation.isNavigabilitySource());
				newRlImplementation.setMultiplicityTarget(relation.getMultiplicityTarget());
				newRlImplementation.setMultiplicitySource(relation.getMultiplicitySource());
				newRlImplementation.setLocation("location");
				newRlImplementation.setDocumentation(relation.getDocumentation());
				associationPackage.getLstImplementations().add(newRlImplementation);
			}

		}
		for (specificPart.InheritanceMSE relation : diagramSpc.getLstInheritances()) {
			abstractPart.InheritanceMSE newRlInheritanceMSE = AbstractPartFactory.eINSTANCE.createInheritanceMSE();
			newRlInheritanceMSE.setName("Inheritance:(" + relation.getChild().getClass().getName() + ":"+ relation.getParent().getClass().getName() + ")");
			newRlInheritanceMSE.setType(relation.getType());
			newRlInheritanceMSE.setState(relation.getState());
			newRlInheritanceMSE.setPath(associationPackage.getPath() + "/" + newRlInheritanceMSE.getName());
			newRlInheritanceMSE.setLocation("location");
			newRlInheritanceMSE.setDocumentation(relation.getDocumentation());
			associationPackage.getLstInheritance().add(newRlInheritanceMSE);
		}
	}


	/**
	 * Este metodo permite la transformacion M2M de las clases para el diagrama de clases
	 * @param diagramSpc
	 * @param newPackageAbs
	 * @param newDiagramAbs
	 */
	private void generateClassesPacketsM2M(ClassDiagramMSE diagramSpc, abstractPart.PackageMSE newPackageAbs,
			abstractPart.ClassDiagramMSE newDiagramAbs) {

		for (ClassMSE classAux : diagramSpc.getLstClass()) {

			abstractPart.ClassMSE newClass = AbstractPartFactory.eINSTANCE.createClassMSE();

			newClass.setAbsrtact(classAux.isAbsrtact());
			newClass.setModifier(classAux.getModifier());
			newClass.setState(classAux.getState());
			newClass.setName(classAux.getName());
			newClass.setDocumentation(classAux.getDocumentation());
			newClass.setLocation(classAux.getLocation());
			newClass.setType(classAux.getType());
			newClass.setPath(newPackageAbs.getPath() + "/" + classAux.getName());
			newClass.setIdentifier(createIdentifierClass(newClass.getPath()));

			if (!classAux.getLstAttributes().isEmpty()) {
				for (AttributeMSE attributeAux : classAux.getLstAttributes()) {
					abstractPart.AttributeMSE newAttribute = AbstractPartFactory.eINSTANCE.createAttributeMSE();
					newAttribute.setName(attributeAux.getName());
					newAttribute.setModifier(attributeAux.getModifier());
					newAttribute.setLocation(attributeAux.getLocation());
					newAttribute.setDocumentation(attributeAux.getDocumentation());
					newAttribute.setInitialValue(attributeAux.getInitialValue());
					newAttribute.setType(attributeAux.getType());
					newAttribute.setState(attributeAux.getState());
					newAttribute.setPath(newClass.getPath() + "/" + newAttribute.getName());
					newClass.getLstAttributes().add(newAttribute);
				}
			}
			if (!classAux.getLstMethods().isEmpty()) {
				for (MethodMSE methodAux : classAux.getLstMethods()) {
					abstractPart.MethodMSE newMethod = AbstractPartFactory.eINSTANCE.createMethodMSE();
					newMethod.setName(methodAux.getName());
					newMethod.setModifier(methodAux.getModifier());
					newMethod.setBody(methodAux.getBody());
					newMethod.setLocation(methodAux.getLocation());
					newMethod.setDocumentation(methodAux.getDocumentation());
					newMethod.setTypeReturn(methodAux.getTypeReturn());
					newMethod.setState(methodAux.getState());
					newMethod.setPath(newClass.getPath() + "/" + newMethod.getName());
					newClass.getLstMethods().add(newMethod);
				}
			}
			if (!diagramSpc.getLstRelations().isEmpty() || diagramSpc.getLstInheritances().isEmpty()) {
				if (!diagramSpc.getLstRelations().isEmpty()) {
					if (!obtenerRelationClass(classAux).isEmpty()) {
						for (specificPart.RelationMSE relation : obtenerRelationClass(classAux)) {
							System.out.println(relation.getSource().equals(classAux));
							abstractPart.AttributeRelationMSE newAttributeRelation = AbstractPartFactory.eINSTANCE
									.createAttributeRelationMSE();
							if (relation.getSource().equals(classAux)) {
								newAttributeRelation.setName(relation.getRoleTarget());
								newAttributeRelation.setModifier("private");
								newAttributeRelation.setPath(newClass.getPath() + "/" + newAttributeRelation.getName());
								newAttributeRelation.setInitialValue("null");
								newAttributeRelation.setState("active");
								newAttributeRelation.setLocation("location");
								if (relation.getMultiplicityTarget().equals("1")) {
									newAttributeRelation.setType(relation.getTarget().getClass().getName());
								} else {
									newAttributeRelation
											.setType("ArrayList<" + relation.getTarget().getClass().getName() + ">");
								}
								newAttributeRelation
										.setDocumentation("Este atributo representa la relacion entre dos clases");
								newClass.getLstAttributesRelations().add(newAttributeRelation);
							} else {
								newAttributeRelation.setName(relation.getRoleSource());
								newAttributeRelation.setModifier("private");
								newAttributeRelation.setPath(newClass.getPath() + "/" + newAttributeRelation.getName());
								newAttributeRelation.setInitialValue("null");
								newAttributeRelation.setState("active");
								newAttributeRelation.setLocation("location");
								if (relation.getMultiplicityTarget().equals("1")) {
									newAttributeRelation.setType(relation.getTarget().getClass().getName());
								} else {
									newAttributeRelation
											.setType("ArrayList<" + relation.getTarget().getClass().getName() + ">");
								}
								newAttributeRelation
										.setDocumentation("Este atributo representa la relacion entre dos clases");
								newClass.getLstAttributesRelations().add(newAttributeRelation);
							}
						}
					}
				}
				if (!diagramSpc.getLstInheritances().isEmpty()) {
					if (!obtenerInheritanceClass(classAux).isEmpty()) {
						for (specificPart.InheritanceMSE relation : obtenerInheritanceClass(classAux)) {
							abstractPart.AttributeRelationMSE newAttributeRelation = AbstractPartFactory.eINSTANCE
									.createAttributeRelationMSE();
							if (relation.getChild().equals(classAux)) {
								newAttributeRelation.setName("Inheritance(" + relation.getChild().getName() + " -> "
										+ relation.getParent().getName() + ")");
								newAttributeRelation.setModifier("private");
								newAttributeRelation.setPath(newClass.getPath() + "/" + newAttributeRelation.getName());
								newAttributeRelation.setInitialValue("null");
								System.out.println(relation.getParent().getName());
								newAttributeRelation.setTypeParent(relation.getParent().getName() + "");
								newAttributeRelation.setState("active");
								newAttributeRelation.setLocation("location");
								newAttributeRelation.setType(relation.getParent().getClass().getName());

								newAttributeRelation
										.setDocumentation("Este atributo representa la herencia entre dos clases");
								newClass.getLstAttributesRelations().add(newAttributeRelation);
							}
						}
					}
				}
			}
			newPackageAbs.getLstClass().add(newClass);
			newDiagramAbs.getLstIdentifierClass().add(newClass.getIdentifier());
			newPackageAbs.getLstDiagrams().add(newDiagramAbs);
		}

	}

	/**
	 * Este metodo permite crear un identificador unico para cada clase del modelo
	 * @param path
	 * @return el codigo unico de la clase
	 */
	private HashCodeClassMSE createIdentifierClass(String path) {

		abstractPart.HashCodeClassMSE newHashCode = AbstractPartFactory.eINSTANCE.createHashCodeClassMSE();

		newHashCode.setCode(newHashCode.hashCode() + "");
		newHashCode.setState("Active");
		newHashCode.setPath(path + "/" + newHashCode.getCode());
		newHashCode.setLocation("location");

		return newHashCode;
	}


	/**
	 * Este metodo permite obtener las herencias que tiene una clase
	 * @param classAux
	 * @return
	 */
	private EList<InheritanceMSE> obtenerInheritanceClass(ClassMSE classAux) {

		EList<InheritanceMSE> listInheritanceClass = new BasicEList<InheritanceMSE>();

		for (PackageMSE packageMSE : modelFactorySpecific.getLstPackages()) {
			obtenerInheritancePackage(packageMSE, listInheritanceClass, classAux);
		}
		for (ClassDiagramMSE classDiagramMSE : modelFactorySpecific.getLstDiagrams()) {
			obtenerInheritanceDiagram(classDiagramMSE, listInheritanceClass, classAux);
		}

		return listInheritanceClass;
	}

	/**
	 * Este metodo permite recorrer los paquetes para obtener las herencias de una clase
	 * @param packageMSE
	 * @param listInheritanceClass
	 * @param classAux
	 */
	private void obtenerInheritancePackage(PackageMSE packageMSE, EList<InheritanceMSE> listInheritanceClass,
			ClassMSE classAux) {
		if (!packageMSE.getLstDiagrams().isEmpty()) {
			for (ClassDiagramMSE diagram : packageMSE.getLstDiagrams()) {
				obtenerInheritanceDiagram(diagram, listInheritanceClass, classAux);
			}
		}
	}

	/**
	 * Este metodo permite recorrer los diagramas para obtener las herencias de un clase 
	 * @param diagram
	 * @param listInheritanceClass
	 * @param classAux
	 */
	private void obtenerInheritanceDiagram(ClassDiagramMSE diagram, EList<InheritanceMSE> listInheritanceClass,
			ClassMSE classAux) {

		if (!diagram.getLstRelations().isEmpty()) {
			for (InheritanceMSE relation : diagram.getLstInheritances()) {
				if (relation.getParent().equals(classAux) == true || relation.getChild().equals(classAux)) {
					listInheritanceClass.add(relation);
				}
			}
		}
		if (!diagram.getLstPackages().isEmpty()) {
			for (PackageMSE packageAux : diagram.getLstPackages()) {
				obtenerInheritancePackage(packageAux, listInheritanceClass, classAux);
			}
		}
	}

	/**
	 * Este metodo permite obtener las relaciones de una clase
	 * @param classAux
	 * @return
	 */
	private ArrayList<RelationMSE> obtenerRelationClass(ClassMSE classAux) {

		ArrayList<RelationMSE> listRelationClass = new ArrayList<RelationMSE>();

		for (PackageMSE packageMSE : modelFactorySpecific.getLstPackages()) {
			obtenerRelationPackage(packageMSE, listRelationClass, classAux);
		}
		for (ClassDiagramMSE classDiagramMSE : modelFactorySpecific.getLstDiagrams()) {
			obtenerRelationsDiagram(classDiagramMSE, listRelationClass, classAux);
		}
		return listRelationClass;
	}

	/**
	 * Este metodo permite recorrer los paquetes para obtener las relaciones de una clase
	 * @param packageMSE
	 * @param listRelationClass
	 * @param classAux
	 */
	private void obtenerRelationPackage(PackageMSE packageMSE, ArrayList<RelationMSE> listRelationClass,
			ClassMSE classAux) {
		if (!packageMSE.getLstDiagrams().isEmpty()) {
			for (ClassDiagramMSE diagram : packageMSE.getLstDiagrams()) {
				obtenerRelationsDiagram(diagram, listRelationClass, classAux);
			}
		}
	}

	/**
	 * Este metodo permite recorrer los diagramas para obtener las relaciones de una clase
	 * @param diagram
	 * @param listRelationClass
	 * @param classAux
	 */
	private void obtenerRelationsDiagram(ClassDiagramMSE diagram, ArrayList<RelationMSE> listRelationClass,
			ClassMSE classAux) {
		if (!diagram.getLstRelations().isEmpty()) {
			for (RelationMSE relation : diagram.getLstRelations()) {
				if (relation.getSource().equals(classAux) == true || relation.getTarget().equals(classAux)) {
					listRelationClass.add(relation);
				}
			}
		}
		if (!diagram.getLstPackages().isEmpty()) {
			for (PackageMSE packageAux : diagram.getLstPackages()) {
				obtenerRelationPackage(packageAux, listRelationClass, classAux);
			}
		}
	}

	/**
	 * Este metodo permite abrir un cuadro de dialogo para ingresar el nomber del proyecto
	 * @return el nombre del proyecto
	 */
	public String ingresarInput() {
		// Mostrar un cuadro de diálogo de entrada
		String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del projecto:");

		// Comprobar si el usuario ingresó algo y mostrarlo
		if (nameProject != null) {
			return nameProject;
		} else {
			return "newProject";
		}
	}

	
	
	
	
	// -------------------------------- Tranformacion M2T de parte abstracta a archivos de texto -----------------------------------------------

	/**
	 * Este metodo permite tranformar la parte abstacta del diagrama de clases a archivos de python
	 */
	public void transformationM2T() {

		//Ruta donde se van a crear los archivos
		String path = "C:\\Users\\Universidad\\Documents\\Universidad\\IngenierioPorModelos\\data";

		//Recorre los paquetes de la parte abstracta del diagrama de clases
		for (abstractPart.PackageMSE packageRoot : modelFactoryAbstract.getLstPackages()) {

			generatePackageM2T(path, packageRoot);
		}

	}

	/**
	 * Este metodo permite crear las carpetas por cada paquete del diagrama de clases
	 * @param path
	 * @param packageAux
	 */
	private void generatePackageM2T(String path, abstractPart.PackageMSE packageAux) {

		createFolderWindows(path, packageAux.getName());

		String pathAux = path + "\\" + packageAux.getName();

		if (!packageAux.getLstClass().isEmpty()) {
			for (abstractPart.ClassMSE classAux : packageAux.getLstClass()) {

				String content = createStructClassPY(classAux);

				createFileWindows(pathAux, classAux.getName(), content);
			}
		}

		if (!packageAux.getLstPackages().isEmpty()) {
			for (abstractPart.PackageMSE packageNow : packageAux.getLstPackages()) {

				generatePackageM2T(pathAux, packageNow);
			}
		}
	}

	/**
	 * Este metodo permite crear la estructura de un clase en python 
	 * @param classAux
	 * @return
	 */
	private String createStructClassPY(abstractPart.ClassMSE classAux) {

		String content = "";
		String header = "class " + classAux.getName() + ":\n";
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if (attAux.getName().contains("Inheritance")) {
				header = "class " + classAux.getName() + "(" + attAux.getTypeParent() + "):\n";
			}
		}
		String constructor = "\tdef __init__(self";
		String methods = "";

		for (abstractPart.AttributeMSE attAux : classAux.getLstAttributes()) {
			constructor += "," + attAux.getName();
		}
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if (!attAux.getName().contains("Inheritance")) {
				constructor += "," + attAux.getName();
			}
		}
		constructor += "):\n";

		for (abstractPart.AttributeMSE attAux : classAux.getLstAttributes()) {
			constructor += "\t\tself." + attAux.getName() + " = " + attAux.getName() + "\n";
		}
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if (!attAux.getName().contains("Inheritance")) {
				constructor += "\t\tself." + attAux.getName() + " = " + attAux.getName() + "\n";
			}
		}

		for (abstractPart.MethodMSE method : classAux.getLstMethods()) {
			methods += "\n\tdef " + method.getName() + "(self):\n\t\tpass";
		}

		content = header + constructor + methods;

		return content;
	}

	/**
	 * Este metodo permite crear una carpeta en el sistema de windows
	 * @param path
	 * @param nameFolder
	 */
	private void createFolderWindows(String path, String nameFolder) {

		// Crea un objeto File que representa la carpeta
		File newFolder = new File(path, nameFolder);

		// Verifica si la carpeta ya existe
		if (!newFolder.exists()) {
			// Intenta crear la carpeta
			boolean creado = newFolder.mkdirs();
			if (creado) {
				System.out.println("La carpeta se creó exitosamente.");
			} else {
				System.out.println("No se pudo crear la carpeta.");
			}
		} else {
			System.out.println("La carpeta ya existe.");
		}
	}

	/**
	 * Este metodo permite crear un archivo en el sistema de windows
	 * @param path
	 * @param nameFile
	 * @param content
	 */
	private void createFileWindows(String path, String nameFile, String content) {

		// Combinar la ruta y el nombre del archivo
		String absolutePath = path + "\\" + nameFile + ".py";

		try {
			// Crear un objeto FileWriter para escribir en el archivo
			FileWriter fileWriter = new FileWriter(absolutePath);

			// Crear un objeto PrintWriter para escribir en el archivo de manera más
			// conveniente
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// Agregar contenido al archivo (por ejemplo, un programa Python simple)
			printWriter.println(content);
			printWriter.close();

			System.out.println("El archivo se creó exitosamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}

	
	
	
	// -------------Tranformacion M2M de la parte especifica del diagrama de clases a la parte abstracta del modelo relacional ---------------------

	/**
	 * Este metodo permite realizar la tranformacion al  modelo relacional
	 */
	public void transformationM2M_MR() {

		loadAbstractPart_MR();
		saveSpecificPart_MR();

		// Recorrido de los paquetes de la raiz del proyecto

		for (specificPart.PackageMSE packageSpc : modelFactorySpecific.getLstPackages()) {
			dblanguagepart.Schema newSchema = DblanguagepartFactory.eINSTANCE.createSchema();
			newSchema.setNameSchema(packageSpc.getName());
			recorrerProjectPacketsM2M_DB(packageSpc, newSchema, modelFactoryAbstract_MR);

			modelFactoryAbstract_MR.getLstSchemas().add(newSchema);
		}

		saveAbstractPart();
		loadAbstractPart_MR();
	}

	/**
	 * Este metodo recorre los paquetes del diagrama de clases para la transformacion al modelo relacional
	 * @param packageSpc
	 * @param newSchema
	 * @param modelFactoryAbstract_MR2
	 */
	private void recorrerProjectPacketsM2M_DB(PackageMSE packageSpc, Schema newSchema,
			ModelFactoryRelationalModel modelFactoryAbstract_MR2) {

		if (!packageSpc.getLstDiagrams().isEmpty()) {
			for (ClassDiagramMSE diagramSpc : packageSpc.getLstDiagrams()) {

				recorrerPackageDiagramsM2M_DB(diagramSpc, newSchema, modelFactoryAbstract_MR2);

				if (!diagramSpc.getLstRelations().isEmpty() || !diagramSpc.getLstInheritances().isEmpty()) {
					generateRelationshipsM2M_DB(diagramSpc, newSchema);
				}
			}
		}
	}

	/**
	 * Este metodo recorre los diagramas de los paquetes
	 * @param diagramSpc
	 * @param newSchema
	 * @param modelFactoryAbstract_MR2
	 */
	private void recorrerPackageDiagramsM2M_DB(ClassDiagramMSE diagramSpc, Schema newSchema,
			ModelFactoryRelationalModel modelFactoryAbstract_MR2) {

		// Creacion de las clases del diagrama

		if (!diagramSpc.getLstClass().isEmpty()) {
			generateTables_MR(diagramSpc, newSchema);
		}

		if (!diagramSpc.getLstPackages().isEmpty()) {
			for (PackageMSE packageAux : diagramSpc.getLstPackages()) {

				dblanguagepart.Schema newSchemaAux = DblanguagepartFactory.eINSTANCE.createSchema();
				newSchema.setNameSchema(packageAux.getName());
				recorrerProjectPacketsM2M_DB(packageAux, newSchemaAux, modelFactoryAbstract_MR2);
				modelFactoryAbstract_MR2.getLstSchemas().add(newSchemaAux);
			}
		}
	}

	/**
	 * Este metodo permite generar una tabla del modelo realcional por cada clase del diagrama de clases
	 * @param diagramSpc
	 * @param newSchema
	 */
	private void generateTables_MR(ClassDiagramMSE diagramSpc, Schema newSchema) {

		for (ClassMSE classAux : diagramSpc.getLstClass()) {

			dblanguagepart.Table newTable = DblanguagepartFactory.eINSTANCE.createTable();
			newTable.setNameTable(classAux.getName());

			dblanguagepart.Column newColumnPrimaryKey = DblanguagepartFactory.eINSTANCE.createColumn();
			newColumnPrimaryKey.setDataType("NUMERIC");
			newColumnPrimaryKey.setIsMandatory(true);
			newColumnPrimaryKey.setName("codigo" + classAux.getName());
			newColumnPrimaryKey.setSize(5);

			dblanguagepart.PrimaryKeyConstraint primaryKey = DblanguagepartFactory.eINSTANCE
					.createPrimaryKeyConstraint();

			primaryKey.setNameConstraint(newColumnPrimaryKey.getName() + "_PK");
			primaryKey.getColumnConstraint().add(newColumnPrimaryKey);
			newTable.setPrimaryKeyConstrains(primaryKey);
			newTable.getLstColumns().add(newColumnPrimaryKey);

			if (!classAux.getLstAttributes().isEmpty()) {
				for (AttributeMSE attributeAux : classAux.getLstAttributes()) {
					dblanguagepart.Column newColumnTable = DblanguagepartFactory.eINSTANCE.createColumn();

					if (attributeAux.getType().equals("String")) {
						newColumnTable.setDataType("VARCHAR");
						newColumnTable.setIsMandatory(true);
						newColumnTable.setName(attributeAux.getName());
						newColumnTable.setSize(20);
					} else {
						newColumnTable.setDataType("NUMERIC");
						newColumnTable.setIsMandatory(true);
						newColumnTable.setName(attributeAux.getName());
						newColumnTable.setSize(5);
					}

					newTable.getLstColumns().add(newColumnTable);
				}
			}
			newSchema.getLstTable().add(newTable);
		}
	}

	/**
	 * Este metodo transforma las herencias y las relaciones del diagrama de clases al modelo relacional
	 * @param diagramSpc
	 * @param schema
	 */
	private void generateRelationshipsM2M_DB(ClassDiagramMSE diagramSpc, Schema schema) {

		for (InheritanceMSE herencia : diagramSpc.getLstInheritances()) {
			Table tableChild = null;
			Table tableParent = null;
			for (Table table : schema.getLstTable()) {
				if (table.getNameTable().equals(herencia.getChild().getName())) {
					tableChild = table;
				}
				if (table.getNameTable().equals(herencia.getParent().getName())) {
					tableParent = table;
				}
			}
			for (Column columAux : tableParent.getLstColumns()) {
				if (!columAux.getName().equals("codigo" + tableParent.getNameTable())) {
					dblanguagepart.Column newColumn = DblanguagepartFactory.eINSTANCE.createColumn();

					newColumn.setDataType(columAux.getDataType());
					newColumn.setIsDesuso(columAux.isIsDesuso());
					newColumn.setIsMandatory(columAux.isIsMandatory());
					newColumn.setName(columAux.getName());
					newColumn.setSize(columAux.getSize());

					tableChild.getLstColumns().add(newColumn);
				}
			}
		}

		for (RelationMSE relation : diagramSpc.getLstRelations()) {
			createRealtionMaM(relation, schema);
			createRelationUaM(relation, schema);
			createRelationUaU(relation, schema);
		}
	}

	/**
	 * Este metodo permite transformar las relaciones uno a uno al modelo relacional
	 * @param relation
	 * @param schema
	 */
	private void createRelationUaU(RelationMSE relation, Schema schema) {
		if (relation.getMultiplicitySource().equals("1")) {
			if (relation.getMultiplicityTarget().equals("1")) {

				Table tablaSource = null;
				Table tablaTarget = null;

				for (Table tablaAux : schema.getLstTable()) {
					if (tablaAux.getNameTable().equals(relation.getSource().getName())) {
						tablaSource = tablaAux;
					}
					if (tablaAux.getNameTable().equals(relation.getTarget().getName())) {
						tablaTarget = tablaAux;
					}
				}

				dblanguagepart.Column column = DblanguagepartFactory.eINSTANCE.createColumn();

				column.setDataType(tablaTarget.getLstColumns().get(0).getDataType());
				column.setIsMandatory(true);
				column.setName("codigo_" + tablaTarget.getNameTable());
				column.setSize(tablaTarget.getLstColumns().get(0).getSize());

				dblanguagepart.ForeignConstraint fk_column1 = DblanguagepartFactory.eINSTANCE.createForeignConstraint();

				fk_column1.setNameConstraint(tablaSource.getNameTable() + "_" + tablaTarget.getNameTable() + "_FK");
				fk_column1.setSourceTable(tablaTarget);
				fk_column1.setSourceColumn(tablaTarget.getLstColumns().get(0));
				fk_column1.setTargetColumnName(column.getName());

				tablaSource.getLstColumns().add(column);
				tablaSource.getLstForeignConstraint().add(fk_column1);


				dblanguagepart.IndexConstraint idx_unique = DblanguagepartFactory.eINSTANCE.createIndexConstraint();

				idx_unique.setIsDesuso(false);
				idx_unique.setIsGenerate(true);
				idx_unique.setIsRealizable(true);
				idx_unique.setIsUnique(true);
				idx_unique.setNameIndex(tablaTarget.getLstColumns().get(0).getName() + "_IDX");
				idx_unique.getColumnIndex().add(column);
		

				tablaSource.getLstIndexConstrains().add(idx_unique);
			}
		}

	}

	/**
	 * Este metodo permite transformar las relaciones uno a muchos al modelo relacional
	 * @param relation
	 * @param schema
	 */
	private void createRelationUaM(RelationMSE relation, Schema schema) {
		if (relation.getMultiplicitySource().equals("*")) {
			if (relation.getMultiplicityTarget().equals("1")) {

				Table tablaSource = null;
				Table tablaTarget = null;

				for (Table tablaAux : schema.getLstTable()) {
					if (tablaAux.getNameTable().equals(relation.getSource().getName())) {
						tablaSource = tablaAux;
					}
					if (tablaAux.getNameTable().equals(relation.getTarget().getName())) {
						tablaTarget = tablaAux;
					}
				}

				dblanguagepart.Column column = DblanguagepartFactory.eINSTANCE.createColumn();

				column.setDataType(tablaTarget.getLstColumns().get(0).getDataType());
				column.setIsMandatory(true);
				column.setName("codigo_" + tablaTarget.getNameTable());
				column.setSize(tablaTarget.getLstColumns().get(0).getSize());

				dblanguagepart.ForeignConstraint fk_column1 = DblanguagepartFactory.eINSTANCE.createForeignConstraint();

				fk_column1.setNameConstraint(tablaSource.getNameTable() + "_" + tablaTarget.getNameTable() + "_FK");
				fk_column1.setSourceTable(tablaTarget);
				fk_column1.setSourceColumn(tablaTarget.getLstColumns().get(0));
				fk_column1.setTargetColumnName(column.getName());

				tablaSource.getLstColumns().add(column);
				tablaSource.getLstForeignConstraint().add(fk_column1);
			}
		}

	}

	/**
	 * Este metodo permite transformar las relaciones muchos a muchos al modelo relacional
	 * @param relation
	 * @param schema
	 */
	private void createRealtionMaM(RelationMSE relation, Schema schema) {
		if (relation.getMultiplicitySource().equals("*")) {
			if (relation.getMultiplicityTarget().equals("*")) {

				Table tablaSource1 = null;
				Table tablaSource2 = null;

				for (Table tablaAux : schema.getLstTable()) {
					if (tablaAux.getNameTable().equals(relation.getSource().getName())) {
						tablaSource1 = tablaAux;
					}
					if (tablaAux.getNameTable().equals(relation.getTarget().getName())) {
						tablaSource2 = tablaAux;
					}
				}

				dblanguagepart.Table newTable = DblanguagepartFactory.eINSTANCE.createTable();
				newTable.setNameTable(tablaSource1.getNameTable() + "_" + tablaSource2.getNameTable());

				dblanguagepart.Column newColumnPrimaryKey = DblanguagepartFactory.eINSTANCE.createColumn();
				newColumnPrimaryKey.setDataType("NUMERIC");
				newColumnPrimaryKey.setIsMandatory(true);
				newColumnPrimaryKey.setName("codigo" + newTable.getNameTable());
				newColumnPrimaryKey.setSize(5);

				dblanguagepart.PrimaryKeyConstraint primaryKey = DblanguagepartFactory.eINSTANCE
						.createPrimaryKeyConstraint();

				primaryKey.setNameConstraint(newColumnPrimaryKey.getName() + "_PK");
				primaryKey.getColumnConstraint().add(newColumnPrimaryKey);
				newTable.setPrimaryKeyConstrains(primaryKey);
				newTable.getLstColumns().add(newColumnPrimaryKey);

				dblanguagepart.Column column1 = DblanguagepartFactory.eINSTANCE.createColumn();
				dblanguagepart.Column column2 = DblanguagepartFactory.eINSTANCE.createColumn();

				column1.setDataType("NUMERIC");
				column1.setIsMandatory(true);
				column1.setName("codigo_" + tablaSource1.getNameTable());
				column1.setSize(5);

				column2.setDataType("NUMERIC");
				column2.setIsMandatory(true);
				column2.setName("codigo_" + tablaSource2.getNameTable());
				column2.setSize(5);

				dblanguagepart.ForeignConstraint fk_column1 = DblanguagepartFactory.eINSTANCE.createForeignConstraint();
				dblanguagepart.ForeignConstraint fk_column2 = DblanguagepartFactory.eINSTANCE.createForeignConstraint();

				fk_column1.setNameConstraint(newTable.getNameTable() + "_" + tablaSource1.getNameTable() + "_FK");
				fk_column1.setSourceTable(tablaSource1);
				fk_column1.setSourceColumn(tablaSource1.getLstColumns().get(0));
				fk_column1.setTargetColumnName(column1.getName());

				fk_column2.setNameConstraint(newTable.getNameTable() + "_" + tablaSource2.getNameTable() + "_FK");
				fk_column2.setSourceTable(tablaSource2);
				fk_column2.setSourceColumn(tablaSource2.getLstColumns().get(0));
				fk_column2.setTargetColumnName(column2.getName());

				newTable.getLstColumns().add(column1);
				newTable.getLstColumns().add(column2);
				newTable.getLstForeignConstraint().add(fk_column1);
				newTable.getLstForeignConstraint().add(fk_column2);

				schema.getLstTable().add(newTable);
			}
		}

	}

}
