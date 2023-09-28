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
 *   <li>{@link abstractPart.AssociationsMSE#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstContainments <em>Lst Containments</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstAgregations <em>Lst Agregations</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstAssociations <em>Lst Associations</em>}</li>
 *   <li>{@link abstractPart.AssociationsMSE#getLstImplementations <em>Lst Implementations</em>}</li>
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
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstractPart.AssociationsMSE#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link abstractPart.AssociationsMSE#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Lst Containments</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.ContainmentMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Containments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Containments</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstContainments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainmentMSE> getLstContainments();

	/**
	 * Returns the value of the '<em><b>Lst Agregations</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.AgregationMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Agregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Agregations</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstAgregations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgregationMSE> getLstAgregations();

	/**
	 * Returns the value of the '<em><b>Lst Associations</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.AssociationMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Associations</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationMSE> getLstAssociations();

	/**
	 * Returns the value of the '<em><b>Lst Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link abstractPart.ImplementationMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Implementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Implementations</em>' containment reference list.
	 * @see abstractPart.AbstractPartPackage#getAssociationsMSE_LstImplementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationMSE> getLstImplementations();

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
