/**
 */
package specificPart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see specificPart.SpecificPartPackage
 * @generated
 */
public interface SpecificPartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificPartFactory eINSTANCE = specificPart.impl.SpecificPartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Specific</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Specific</em>'.
	 * @generated
	 */
	ModelFactorySpecific createModelFactorySpecific();

	/**
	 * Returns a new object of class '<em>Class Diagram MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Diagram MSE</em>'.
	 * @generated
	 */
	ClassDiagramMSE createClassDiagramMSE();

	/**
	 * Returns a new object of class '<em>Package MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package MSE</em>'.
	 * @generated
	 */
	PackageMSE createPackageMSE();

	/**
	 * Returns a new object of class '<em>Class MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class MSE</em>'.
	 * @generated
	 */
	ClassMSE createClassMSE();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecificPartPackage getSpecificPartPackage();

} //SpecificPartFactory
