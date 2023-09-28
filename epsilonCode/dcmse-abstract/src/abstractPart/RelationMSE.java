/**
 */
package abstractPart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation MSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.RelationMSE#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getType <em>Type</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getRoleSource <em>Role Source</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getRoleTarget <em>Role Target</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#isNavigabilitySource <em>Navigability Source</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#isNavigabilityTarget <em>Navigability Target</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getSource <em>Source</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getTarget <em>Target</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see abstractPart.AbstractPartPackage#getRelationMSE()
 * @model
 * @generated
 */
public interface RelationMSE extends EObject {
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
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getState <em>State</em>}' attribute.
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
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Source</em>' attribute.
	 * @see #setRoleSource(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_RoleSource()
	 * @model
	 * @generated
	 */
	String getRoleSource();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getRoleSource <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Source</em>' attribute.
	 * @see #getRoleSource()
	 * @generated
	 */
	void setRoleSource(String value);

	/**
	 * Returns the value of the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Target</em>' attribute.
	 * @see #setRoleTarget(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_RoleTarget()
	 * @model
	 * @generated
	 */
	String getRoleTarget();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getRoleTarget <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Target</em>' attribute.
	 * @see #getRoleTarget()
	 * @generated
	 */
	void setRoleTarget(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #setMultiplicitySource(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_MultiplicitySource()
	 * @model
	 * @generated
	 */
	String getMultiplicitySource();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getMultiplicitySource <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Source</em>' attribute.
	 * @see #getMultiplicitySource()
	 * @generated
	 */
	void setMultiplicitySource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #setMultiplicityTarget(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_MultiplicityTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicityTarget();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getMultiplicityTarget <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Target</em>' attribute.
	 * @see #getMultiplicityTarget()
	 * @generated
	 */
	void setMultiplicityTarget(String value);

	/**
	 * Returns the value of the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigability Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability Source</em>' attribute.
	 * @see #setNavigabilitySource(boolean)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_NavigabilitySource()
	 * @model
	 * @generated
	 */
	boolean isNavigabilitySource();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#isNavigabilitySource <em>Navigability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability Source</em>' attribute.
	 * @see #isNavigabilitySource()
	 * @generated
	 */
	void setNavigabilitySource(boolean value);

	/**
	 * Returns the value of the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigability Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability Target</em>' attribute.
	 * @see #setNavigabilityTarget(boolean)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_NavigabilityTarget()
	 * @model
	 * @generated
	 */
	boolean isNavigabilityTarget();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#isNavigabilityTarget <em>Navigability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability Target</em>' attribute.
	 * @see #isNavigabilityTarget()
	 * @generated
	 */
	void setNavigabilityTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClassMSE)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Source()
	 * @model
	 * @generated
	 */
	ClassMSE getSource();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClassMSE value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ClassMSE)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Target()
	 * @model
	 * @generated
	 */
	ClassMSE getTarget();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ClassMSE value);

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
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getPath <em>Path</em>}' attribute.
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
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // RelationMSE
