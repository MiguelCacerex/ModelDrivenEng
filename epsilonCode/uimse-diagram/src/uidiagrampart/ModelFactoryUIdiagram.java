/**
 */
package uidiagrampart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory UIdiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.ModelFactoryUIdiagram#getState <em>State</em>}</li>
 *   <li>{@link uidiagrampart.ModelFactoryUIdiagram#getName <em>Name</em>}</li>
 *   <li>{@link uidiagrampart.ModelFactoryUIdiagram#getLstProjectBoard <em>Lst Project Board</em>}</li>
 * </ul>
 *
 * @see uidiagrampart.UidiagrampartPackage#getModelFactoryUIdiagram()
 * @model
 * @generated
 */
public interface ModelFactoryUIdiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see uidiagrampart.UidiagrampartPackage#getModelFactoryUIdiagram_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link uidiagrampart.ModelFactoryUIdiagram#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

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
	 * @see uidiagrampart.UidiagrampartPackage#getModelFactoryUIdiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uidiagrampart.ModelFactoryUIdiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lst Project Board</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagrampart.ProjectBoard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Project Board</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Project Board</em>' containment reference list.
	 * @see uidiagrampart.UidiagrampartPackage#getModelFactoryUIdiagram_LstProjectBoard()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectBoard> getLstProjectBoard();

} // ModelFactoryUIdiagram
