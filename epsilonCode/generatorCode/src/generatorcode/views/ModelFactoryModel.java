package generatorcode.views;

import abstractPart.AbstractPartFactory;
import abstractPart.ModelFactoryAbstract;
import specificPart.ModelFactorySpecific;
import specificPart.SpecificPartFactory;
import specificPart.SpecificPartPackage;

public class ModelFactoryModel {

	//------------------------------  Singleton ------------------------------------------------
		// Clase estatica oculta. Tan solo se instanciara el singleton una vez
		private static class SingletonHolder { 
			// El constructor de Singleton puede ser llamado desde aqui al ser protected
			private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
		}

		// Metodo para obtener la instancia de nuestra clase
		public static ModelFactoryModel getInstance() {
			return SingletonHolder.eINSTANCE;
		}
		//------------------------------  Singleton ------------------------------------------------
		ModelFactorySpecific modelFactorySpecific = SpecificPartFactory.eINSTANCE.createModelFactorySpecific();
		ModelFactoryAbstract modelFactoryAbstract = AbstractPartFactory.eINSTANCE.createModelFactoryAbstract();

		public ModelFactoryModel() {
			// TODO Auto-generated constructor stub

			modelFactorySpecific = cargarSpecificPart();
			modelFactoryAbstract = cargarAbstractPart();
		}

		public ModelFactorySpecific cargarSpecificPart() {
			ModelFactorySpecific modelFactoryConcreta = null;
			SpecificPartPackage whoownmePackage =  SpecificPartPackage.eINSTANCE;
			org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.specific");
			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
			try {
				resource.load(null);
				modelFactoryConcreta = (ModelFactorySpecific)resource.getContents().get(0);
				System.out.println("loaded: " + modelFactoryConcreta);
			}
			catch (java.io.IOException e) {
				System.out.println("failed to read " + uri); 		
				System.out.println(e);
			}
			return modelFactoryConcreta;
		}
		public ModelFactoryAbstract cargarAbstractPart() {
			ModelFactoryAbstract modelFactoryAbstracta = null;
			AbstractPartFactory whoownmePackage =  AbstractPartFactory.eINSTANCE;
			org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.abstract");
			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
			try {
				resource.load(null);
				modelFactoryAbstracta = (ModelFactoryAbstract)resource.getContents().get(0);
				System.out.println("loaded: " + modelFactoryAbstracta);
			}
			catch (java.io.IOException e) {
				System.out.println("failed to read " + uri); 		
				System.out.println(e);
			}
			return modelFactoryAbstracta;
		}


		public void salvarConcreta() {

			//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.concreta");
			org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(modelFactorySpecific);
			try {
				resource.save(java.util.Collections.EMPTY_MAP);
			} catch (java.io.IOException e) {
				// TO-DO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void salvarAbstracta() {

			//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.abstracta");
			org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(modelFactoryAbstract);
			try {
				resource.save(java.util.Collections.EMPTY_MAP);
			} catch (java.io.IOException e) {
				// TO-DO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void transformationM2M() {
			modelFactorySpecific = cargarSpecificPart();
			modelFactoryAbstract = cargarAbstractPart();
/*
			modelFactoryAbstract.getListPaqueteRam().get(0).getSubPaquetesRam().clear();
			//modelFactoryConcreta

			for (DiagramaClasesRam diagrama : modelFactoryConcreta.getListaDiagramaClasesRam()) {
				for (ClassRam claseConcreta : diagrama.getListClassRam()) {
					abstracta.ClassRam classRam = AbstractaFactory.eINSTANCE.createClassRam();
					classRam.setName(claseConcreta.getName());
					classRam.setAbstracta(claseConcreta.isAbstracta());
					classRam.setDescripcion(claseConcreta.getDescripcion());
					classRam.setRuta(claseConcreta.getRuta());
					agregarClaseAPaquete(classRam);

				}

				for (RelationRam relationConcreta : diagrama.getListRelacionesRam()) {

					ClassRam sourceConcreta = relationConcreta.getSource();
					ClassRam targetConcreta = relationConcreta.getTarget();

					abstracta.ClassRam classRamSource = null;
					abstracta.ClassRam classRamTarget = null;

					classRamSource = obtenerClase(sourceConcreta);
					classRamTarget = obtenerClase(targetConcreta);

					abstracta.RelationRam relationRamSource = AbstractaFactory.eINSTANCE.createRelationRam();
					relationRamSource.setSource(classRamSource);
					relationRamSource.setTarget(classRamTarget);
					classRamSource.getListRelacionesRam().add(relationRamSource);

					abstracta.RelationRam relationRamTarge = AbstractaFactory.eINSTANCE.createRelationRam();
					relationRamSource.setSource(classRamSource);
					relationRamSource.setTarget(classRamTarget);
					classRamTarget.getListRelacionesRam().add(relationRamTarge);
				}
			}
			salvarAbstracta();
		}

		private abstracta.ClassRam obtenerClase(ClassRam sourceConcreta) {
			PaqueteRam paquete = null;
			String[] split = sourceConcreta.getRuta().split("/");

			for (int i = 0; i < split.length; i++) {
				String namePaquete = split[i];
				paquete = obtenerPaquete(namePaquete,paquete);
			}
			
			for (abstracta.ClassRam iterable_element : paquete.getListClassRam()) {
				if(iterable_element.getName().equals(sourceConcreta.getName())) {
					return iterable_element;
				}
			}
			return null;
		}

		private void agregarClaseAPaquete(abstracta.ClassRam classRam) {
			String path = classRam.getRuta();
			PaqueteRam paqueteRamPadre = null;

			String[] split = path.split("/");//src/dominio/empresa

			for (int i = 0; i < split.length; i++) {
				String namePaquete = split[i];
				paqueteRamPadre = obtenerPaquete(namePaquete,paqueteRamPadre);
			}
			paqueteRamPadre.getListClassRam().add(classRam);
		}

		private PaqueteRam obtenerPaquete(String namePaquete, PaqueteRam paqueteRamPadre) {

			PaqueteRam paqueteRam = modelFactoryAbstracta.getListPaqueteRam().get(0);
			if(paqueteRam.getName().equals(namePaquete)) {
				return paqueteRam;
			}

			for (PaqueteRam paRam : paqueteRamPadre.getSubPaquetesRam()) {
				if(paRam.getName().equalsIgnoreCase(namePaquete)) {
					return paRam;
				}
			}

			PaqueteRam newPaqueteRam = AbstractaFactory.eINSTANCE.createPaqueteRam();
			newPaqueteRam.setName(namePaquete);
			paqueteRamPadre.getSubPaquetesRam().add(newPaqueteRam);
			return newPaqueteRam;
		}

		public void transformationM2T() {
			modelFactoryAbstracta = cargarAbstracta();

			for (abstracta.ClassRam iterable_element : modelFactoryAbstracta.getListPaqueteRam().get(0).getListClassRam()) {
				crearArchivoJava(iterable_element);
			}


		}

		private void crearArchivoJava(abstracta.ClassRam classRanm) {
			// TODO Auto-generated method stub
			StringBuilder cadena = new StringBuilder();

			cadena.append("public class "+classRanm.getName()+ " {\n");

			cadena.append("<?php\r\n" + 
					"class "+classRanm.getName()+" {\r\n" + 
					"  // Properties\r\n" + 

					"  public $name;\r\n" + 
					"  public $color;\r\n" + 
					"\r\n" + 
					"  // Methods\r\n" + 
					"  function set_name($name) {\r\n" + 
					"    $this->name = $name;\r\n" + 
					"  }\r\n" + 
					"  function get_name() {\r\n" + 
					"    return $this->name;\r\n" + 
					"  }\r\n" + 
					"}\r\n" + 
					"?>");


			//atributos 
			//metodos
			//constructi
 */
		}
	
}