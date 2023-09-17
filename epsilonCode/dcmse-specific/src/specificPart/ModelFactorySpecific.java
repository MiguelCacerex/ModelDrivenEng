/**
 */
package specificPart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Specific</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specificPart.ModelFactorySpecific#getName <em>Name</em>}</li>
 *   <li>{@link specificPart.ModelFactorySpecific#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @see specificPart.SpecificPartPackage#getModelFactorySpecific()
 * @model
 * @generated
 */
public interface ModelFactorySpecific extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see specificPart.SpecificPartPackage#getModelFactorySpecific_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link specificPart.ModelFactorySpecific#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Packages</b></em>' containment reference list.
	 * The list contents are of type {@link specificPart.PackageMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Packages</em>' containment reference list.
	 * @see specificPart.SpecificPartPackage#getModelFactorySpecific_LstPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageMSE> getLstPackages();

} // ModelFactorySpecific
