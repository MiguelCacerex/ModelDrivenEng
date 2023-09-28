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

	ModelFactorySpecific modelFactorySpecific = SpecificPartFactory.eINSTANCE.createModelFactorySpecific();
	ModelFactoryAbstract modelFactoryAbstract = AbstractPartFactory.eINSTANCE.createModelFactoryAbstract();

	public ModelFactoryModel() {
		modelFactorySpecific = loadSpecificPart();
		modelFactoryAbstract = loadAbstractPart();
	}

	//-----------------------------------------------------------------Load and Save ModelFactorys ----------------------------------------------------------------
	
	/**
	 * Este metodo permite cargar el modelfactoryspecific
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
	 * Este metodo permite cargar el modelFactoryAbstract 
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
	 * Este metodo permite guardar el ModelFactorySpecific
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
	 * Este metodo permite guardar el ModelFactoryAbstract
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
	
	//------------------------------------------------------ Generacion de rutas de la parte especifica -----------------------------------------------------------------
	
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
	 * Genera o actualiza las paths de los diagramas internos
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
	 * Genera o actualiza las paths de las relaciones en los diagramas
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
	 * Genera o actualiza las paths de las clases de un diagrama
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


	//--------------------------------------------------------------- Tranformation Model to Model -------------------------------------------------------------------
	
	/**
	 * Este metodo realiza la transformacion del modelo especifico a el modelo abstracto
	 */
	public void transformationM2M() {
		
		loadAbstractPart();
		saveSpecificPart();

		generatePathsFactorySpecific(modelFactorySpecific.getLstPackages(), modelFactorySpecific.getLstDiagrams());

		//Creacion de la carpeta principal del proyecto
		
		String nameProject = ingresarInput();

		abstractPart.PackageMSE packageMain = AbstractPartFactory.eINSTANCE.createPackageMSE();
		packageMain.setName(nameProject);
		packageMain.setPath("/" + packageMain.getName());

		//Recorrido de los paquetes de la raiz del proyecto
		
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
		
		//Recorrido de los diagamas de la raiz del proyecto
		
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

		modelFactoryAbstract.getLstPackages().add(packageMain);
		saveAbstractPart();
	}

	/**
	 * Este metodo permite la transformacion M2M de los paquetes
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
	 * Este metodo permite la transformacion M2M de los diagramas
	 * @param diagramSpc
	 * @param newPackageAbs
	 * @param newDiagramAbs
	 */
	private void generatePackageDiagramsM2M(ClassDiagramMSE diagramSpc, abstractPart.PackageMSE newPackageAbs, abstractPart.ClassDiagramMSE newDiagramAbs) {

		//Creacion de las clases del diagrama
		
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
	 * Este metodo permite la transformacion M2M de las relaciones 
	 * @param diagramSpc
	 * @param associationPackage
	 */
	private void generatePackageRelationshipsM2M(ClassDiagramMSE diagramSpc, AssociationsMSE associationPackage) {

		for (specificPart.RelationMSE relation : diagramSpc.getLstRelations()) {
			if (relation instanceof specificPart.AgregationMSE) {
				abstractPart.AgregationMSE agregation = AbstractPartFactory.eINSTANCE.createAgregationMSE();
				agregation.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName()
						+ ")(" + relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				agregation.setType(relation.getType());
				// agregation.setTarget(convertirClassAbsToSpc(relation.getTarget(),
				// associationPackage.getPath()));
				agregation.setState(relation.getState());
				// agregation.setSource(convertirClassAbsToSpc(relation.getSource(),
				// associationPackage.getPath()));
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
				newRlContainment
						.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("
								+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlContainment.setType(relation.getType());
				// newRlContainment.setTarget(convertirClassAbsToSpc(relation.getTarget(),
				// associationPackage.getPath()));
				newRlContainment.setState(relation.getState());
				// newRlContainment.setSource(convertirClassAbsToSpc(relation.getSource(),
				// associationPackage.getPath()));
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
				newRlAssociation
						.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("
								+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlAssociation.setType(relation.getType());
				// newRlAssociation.setTarget(convertirClassAbsToSpc(relation.getTarget(),
				// associationPackage.getPath()));
				newRlAssociation.setState(relation.getState());
				// newRlAssociation.setSource(convertirClassAbsToSpc(relation.getSource(),
				// associationPackage.getPath()));
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
				abstractPart.ImplementationMSE newRlImplementation = AbstractPartFactory.eINSTANCE
						.createImplementationMSE();
				newRlImplementation
						.setName("(" + relation.getRoleSource() + ":" + relation.getSource().getClass().getName() + ")("
								+ relation.getRoleTarget() + ":" + relation.getTarget().getClass().getName() + ")");
				newRlImplementation.setType(relation.getType());
				// newRlImplementation.setTarget(convertirClassAbsToSpc(relation.getTarget(),
				// associationPackage.getPath()));
				newRlImplementation.setState(relation.getState());
				// newRlImplementation.setSource(convertirClassAbsToSpc(relation.getSource(),
				// associationPackage.getPath()));
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
			newRlInheritanceMSE.setName("Inheritance:(" + relation.getChild().getClass().getName() + ":"
					+ relation.getParent().getClass().getName() + ")");
			newRlInheritanceMSE.setType(relation.getType());
			// newRlInheritanceMSE.setChild(convertirClassAbsToSpc(relation.getChild(),
			// associationPackage.getPath()));
			newRlInheritanceMSE.setState(relation.getState());
			// newRlInheritanceMSE.setParent(convertirClassAbsToSpc(relation.getParent(),
			// associationPackage.getPath()));
			newRlInheritanceMSE.setPath(associationPackage.getPath() + "/" + newRlInheritanceMSE.getName());
			newRlInheritanceMSE.setLocation("location");
			newRlInheritanceMSE.setDocumentation(relation.getDocumentation());
			associationPackage.getLstInheritance().add(newRlInheritanceMSE);
		}
	}

	/**
	 * 
	 * @param classAux
	 * @param path
	 * @return
	 */
	private abstractPart.ClassMSE convertirClassAbsToSpc(ClassMSE classAux, String path) {
		abstractPart.ClassMSE sourceAbs = AbstractPartFactory.eINSTANCE.createClassMSE();
		sourceAbs.setName(classAux.getName());
		sourceAbs.setAbsrtact(classAux.isAbsrtact());
		sourceAbs.setDocumentation(classAux.getDocumentation());
		sourceAbs.setLocation(classAux.getLocation());
		sourceAbs.setModifier(classAux.getModifier());
		sourceAbs.setPath(path);
		sourceAbs.setLocation("location");
		sourceAbs.setState(classAux.getState());
		sourceAbs.setType(classAux.getType());
		return sourceAbs;
	}

	/**
	 * Este metodo permite la transformacion M2M de las clases
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
								newAttributeRelation.setTypeParent(relation.getParent().getName()+"");
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
	 * Este metodo permite crear un identificador unico para una clase del modelo
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

	// Metodos para obtener las herencias

	/**
	 * Este metodo permite obtener las herencias de una clase
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
	private void obtenerInheritanceDiagram(ClassDiagramMSE diagram, EList<InheritanceMSE> listInheritanceClass, ClassMSE classAux) {
		
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

	// Metodos para obtener las relaciones

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
	 * Este metodo permite  abrir un cuadro de dialogo para ingresar el nomber del proyecto
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

	//-------------------------------------------------------------- Tranformacion Model to Text  -----------------------------------------------------------------------
	
	public void transformationM2T() {
		
		String path = "C:\\Users\\Universidad\\Documents\\Universidad\\IngenierioPorModelos\\data";
		
		for (abstractPart.PackageMSE packageRoot : modelFactoryAbstract.getLstPackages()) {
			
			generatePackageM2T(path, packageRoot);
		}
		
	}
	
	private void generatePackageM2T(String path, abstractPart.PackageMSE packageAux) {

		createFolderWindows(path, packageAux.getName());

		String pathAux = path + "\\" +packageAux.getName();
		
		if(!packageAux.getLstClass().isEmpty()) {
			for (abstractPart.ClassMSE classAux : packageAux.getLstClass()) {
				
				String content = createStructClassPY(classAux);
				
				createFileWindows(pathAux, classAux.getName(), content);
			}
		}
		
		
		if (!packageAux.getLstPackages().isEmpty()) {
			for (abstractPart.PackageMSE packageNow : packageAux.getLstPackages()) {
			
				generatePackageM2T(pathAux,packageNow);
			}
		}
	}
	
	private String createStructClassPY(abstractPart.ClassMSE classAux) {
		
		String content = "";
		String header = "class "+classAux.getName()+":\n";
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if(attAux.getName().contains("Inheritance")) {
				header = "class "+classAux.getName()+"("+attAux.getTypeParent()+"):\n";
			}
		}
		String constructor = "\tdef __init__(self";
		String methods = "";
		
		for (abstractPart.AttributeMSE attAux : classAux.getLstAttributes()) {
			constructor+=","+attAux.getName();
		}
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if(!attAux.getName().contains("Inheritance")) {
				constructor+=","+attAux.getName();				
			}
		}
		constructor+="):\n";
		
		for (abstractPart.AttributeMSE attAux : classAux.getLstAttributes()) {
			constructor+="\t\tself."+attAux.getName()+" = "+attAux.getName()+"\n";
		}
		for (abstractPart.AttributeRelationMSE attAux : classAux.getLstAttributesRelations()) {
			if(!attAux.getName().contains("Inheritance")) {
				constructor+="\t\tself."+attAux.getName()+" = "+attAux.getName()+"\n";
			}
		}
		
		for (abstractPart.MethodMSE method: classAux.getLstMethods()) {
			methods+="\n\tdef "+method.getName()+"(self):\n\t\tpass";
		}
		
		content = header+constructor+methods;
		
		return content;
	}

	private void createFolderWindows (String path, String nameFolder) {

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
	
	private void createFileWindows (String path, String nameFile, String content) {

        // Combinar la ruta y el nombre del archivo
        String absolutePath = path + "\\" + nameFile+".py";

        try {
            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter(absolutePath);

            // Crear un objeto PrintWriter para escribir en el archivo de manera más conveniente
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Agregar contenido al archivo (por ejemplo, un programa Python simple)
            printWriter.println(content);
            printWriter.close();

            System.out.println("El archivo se creó exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
	}

	
}
