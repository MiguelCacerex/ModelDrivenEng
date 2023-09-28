/**
 */
package abstractPart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstractPart.AbstractPartPackage
 * @generated
 */
public interface AbstractPartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractPartFactory eINSTANCE = abstractPart.impl.AbstractPartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Abstract</em>'.
	 * @generated
	 */
	ModelFactoryAbstract createModelFactoryAbstract();

	/**
	 * Returns a new object of class '<em>Package MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package MSE</em>'.
	 * @generated
	 */
	PackageMSE createPackageMSE();

	/**
	 * Returns a new object of class '<em>Class Diagram MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Diagram MSE</em>'.
	 * @generated
	 */
	ClassDiagramMSE createClassDiagramMSE();

	/**
	 * Returns a new object of class '<em>Class MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class MSE</em>'.
	 * @generated
	 */
	ClassMSE createClassMSE();

	/**
	 * Returns a new object of class '<em>Method MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method MSE</em>'.
	 * @generated
	 */
	MethodMSE createMethodMSE();

	/**
	 * Returns a new object of class '<em>Attribute MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute MSE</em>'.
	 * @generated
	 */
	AttributeMSE createAttributeMSE();

	/**
	 * Returns a new object of class '<em>Attribute Relation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Relation MSE</em>'.
	 * @generated
	 */
	AttributeRelationMSE createAttributeRelationMSE();

	/**
	 * Returns a new object of class '<em>Hash Code Class MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Code Class MSE</em>'.
	 * @generated
	 */
	HashCodeClassMSE createHashCodeClassMSE();

	/**
	 * Returns a new object of class '<em>Associations MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associations MSE</em>'.
	 * @generated
	 */
	AssociationsMSE createAssociationsMSE();

	/**
	 * Returns a new object of class '<em>Relation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation MSE</em>'.
	 * @generated
	 */
	RelationMSE createRelationMSE();

	/**
	 * Returns a new object of class '<em>Inheritance MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance MSE</em>'.
	 * @generated
	 */
	InheritanceMSE createInheritanceMSE();

	/**
	 * Returns a new object of class '<em>Containment MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment MSE</em>'.
	 * @generated
	 */
	ContainmentMSE createContainmentMSE();

	/**
	 * Returns a new object of class '<em>Agregation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agregation MSE</em>'.
	 * @generated
	 */
	AgregationMSE createAgregationMSE();

	/**
	 * Returns a new object of class '<em>Association MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association MSE</em>'.
	 * @generated
	 */
	AssociationMSE createAssociationMSE();

	/**
	 * Returns a new object of class '<em>Implementation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation MSE</em>'.
	 * @generated
	 */
	ImplementationMSE createImplementationMSE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractPartPackage getAbstractPartPackage();

} //AbstractPartFactory
