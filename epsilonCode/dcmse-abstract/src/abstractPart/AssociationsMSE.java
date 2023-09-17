/**
 */
package abstractPart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associations MSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.AssociationsMSE#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstRelations <em>Lst Relations</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstInheritance <em>Lst Inheritance</em>}</li>
 * </ul>
 *
 * @see abstractPart.AbstractPartPackage#getAssociationsMSE()
 * @model
 * @generated
 */
public interface AssociationsMSE extends EObject {
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
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link abstractPart.AssociationsMSE#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Lst Relations</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.RelationMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relations</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationMSE> getLstRelations();

	/**
	 * Returns the value of the '<em><b>Lst Inheritance</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.InheritanceMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Inheritance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Inheritance</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstInheritance()
	 * @model containment="true"
	 * @generated
	 */
	EList<InheritanceMSE> getLstInheritance();

} // AssociationsMSE
