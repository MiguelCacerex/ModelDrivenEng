/**
 */
package specificPart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import specificPart.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificPartFactoryImpl extends EFactoryImpl implements SpecificPartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecificPartFactory init() {
		try {
			SpecificPartFactory theSpecificPartFactory = (SpecificPartFactory)EPackage.Registry.INSTANCE.getEFactory(SpecificPartPackage.eNS_URI);
			if (theSpecificPartFactory != null) {
				return theSpecificPartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecificPartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC: return createModelFactorySpecific();
			case SpecificPartPackage.CLASS_DIAGRAM_MSE: return createClassDiagramMSE();
			case SpecificPartPackage.PACKAGE_MSE: return createPackageMSE();
			case SpecificPartPackage.CLASS_MSE: return createClassMSE();
			case SpecificPartPackage.RELATION_MSE: return createRelationMSE();
			case SpecificPartPackage.INHERITANCE_MSE: return createInheritanceMSE();
			case SpecificPartPackage.CONTAINMENT_MSE: return createContainmentMSE();
			case SpecificPartPackage.AGREGATION_MSE: return createAgregationMSE();
			case SpecificPartPackage.ASSOCIATION_MSE: return createAssociationMSE();
			case SpecificPartPackage.IMPLEMENTATION_MSE: return createImplementationMSE();
			case SpecificPartPackage.METHOD_MSE: return createMethodMSE();
			case SpecificPartPackage.ATTRIBUTE_MSE: return createAttributeMSE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactorySpecific createModelFactorySpecific() {
		ModelFactorySpecificImpl modelFactorySpecific = new ModelFactorySpecificImpl();
		return modelFactorySpecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramMSE createClassDiagramMSE() {
		ClassDiagramMSEImpl classDiagramMSE = new ClassDiagramMSEImpl();
		return classDiagramMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMSE createPackageMSE() {
		PackageMSEImpl packageMSE = new PackageMSEImpl();
		return packageMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMSE createClassMSE() {
		ClassMSEImpl classMSE = new ClassMSEImpl();
		return classMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMSE createRelationMSE() {
		RelationMSEImpl relationMSE = new RelationMSEImpl();
		return relationMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMSE createInheritanceMSE() {
		InheritanceMSEImpl inheritanceMSE = new InheritanceMSEImpl();
		return inheritanceMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentMSE createContainmentMSE() {
		ContainmentMSEImpl containmentMSE = new ContainmentMSEImpl();
		return containmentMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationMSE createAgregationMSE() {
		AgregationMSEImpl agregationMSE = new AgregationMSEImpl();
		return agregationMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationMSE createAssociationMSE() {
		AssociationMSEImpl associationMSE = new AssociationMSEImpl();
		return associationMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationMSE createImplementationMSE() {
		ImplementationMSEImpl implementationMSE = new ImplementationMSEImpl();
		return implementationMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodMSE createMethodMSE() {
		MethodMSEImpl methodMSE = new MethodMSEImpl();
		return methodMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMSE createAttributeMSE() {
		AttributeMSEImpl attributeMSE = new AttributeMSEImpl();
		return attributeMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPartPackage getSpecificPartPackage() {
		return (SpecificPartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecificPartPackage getPackage() {
		return SpecificPartPackage.eINSTANCE;
	}

} //SpecificPartFactoryImpl
