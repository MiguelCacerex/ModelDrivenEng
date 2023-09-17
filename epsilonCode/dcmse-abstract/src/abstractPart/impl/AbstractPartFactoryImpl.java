/**
 */
package abstractPart.impl;

import abstractPart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPartFactoryImpl extends EFactoryImpl implements AbstractPartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractPartFactory init() {
		try {
			AbstractPartFactory theAbstractPartFactory = (AbstractPartFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractPartPackage.eNS_URI);
			if (theAbstractPartFactory != null) {
				return theAbstractPartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractPartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPartFactoryImpl() {
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT: return createModelFactoryAbstract();
			case AbstractPartPackage.CLASS_DIAGRAM_MSE: return createClassDiagramMSE();
			case AbstractPartPackage.PACKAGE_MSE: return createPackageMSE();
			case AbstractPartPackage.HASH_CODE_CLASS_MSE: return createHashCodeClassMSE();
			case AbstractPartPackage.CLASS_MSE: return createClassMSE();
			case AbstractPartPackage.ASSOCIATIONS_MSE: return createAssociationsMSE();
			case AbstractPartPackage.RELATION_MSE: return createRelationMSE();
			case AbstractPartPackage.INHERITANCE_MSE: return createInheritanceMSE();
			case AbstractPartPackage.CONTAINMENT_MSE: return createContainmentMSE();
			case AbstractPartPackage.AGREGATION_MSE: return createAgregationMSE();
			case AbstractPartPackage.ASSOCIATION_MSE: return createAssociationMSE();
			case AbstractPartPackage.IMPLEMENTATION_MSE: return createImplementationMSE();
			case AbstractPartPackage.METHOD_MSE: return createMethodMSE();
			case AbstractPartPackage.ATTRIBUTE_MSE: return createAttributeMSE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryAbstract createModelFactoryAbstract() {
		ModelFactoryAbstractImpl modelFactoryAbstract = new ModelFactoryAbstractImpl();
		return modelFactoryAbstract;
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
	public HashCodeClassMSE createHashCodeClassMSE() {
		HashCodeClassMSEImpl hashCodeClassMSE = new HashCodeClassMSEImpl();
		return hashCodeClassMSE;
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
	public AssociationsMSE createAssociationsMSE() {
		AssociationsMSEImpl associationsMSE = new AssociationsMSEImpl();
		return associationsMSE;
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
	public AbstractPartPackage getAbstractPartPackage() {
		return (AbstractPartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractPartPackage getPackage() {
		return AbstractPartPackage.eINSTANCE;
	}

} //AbstractPartFactoryImpl
