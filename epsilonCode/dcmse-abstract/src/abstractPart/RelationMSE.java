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
 *   <li>{@link abstractPart.RelationMSE#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getType <em>Type</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getRoleA <em>Role A</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getRoleB <em>Role B</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#isNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link abstractPart.RelationMSE#isNavigabilityB <em>Navigability B</em>}</li>
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
	 * Returns the value of the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role A</em>' attribute.
	 * @see #setRoleA(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_RoleA()
	 * @model
	 * @generated
	 */
	String getRoleA();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getRoleA <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role A</em>' attribute.
	 * @see #getRoleA()
	 * @generated
	 */
	void setRoleA(String value);

	/**
	 * Returns the value of the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role B</em>' attribute.
	 * @see #setRoleB(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_RoleB()
	 * @model
	 * @generated
	 */
	String getRoleB();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getRoleB <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role B</em>' attribute.
	 * @see #getRoleB()
	 * @generated
	 */
	void setRoleB(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity A</em>' attribute.
	 * @see #setMultiplicityA(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_MultiplicityA()
	 * @model
	 * @generated
	 */
	String getMultiplicityA();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getMultiplicityA <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity A</em>' attribute.
	 * @see #getMultiplicityA()
	 * @generated
	 */
	void setMultiplicityA(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity B</em>' attribute.
	 * @see #setMultiplicityB(String)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_MultiplicityB()
	 * @model
	 * @generated
	 */
	String getMultiplicityB();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#getMultiplicityB <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity B</em>' attribute.
	 * @see #getMultiplicityB()
	 * @generated
	 */
	void setMultiplicityB(String value);

	/**
	 * Returns the value of the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigability A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability A</em>' attribute.
	 * @see #setNavigabilityA(boolean)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_NavigabilityA()
	 * @model
	 * @generated
	 */
	boolean isNavigabilityA();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#isNavigabilityA <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability A</em>' attribute.
	 * @see #isNavigabilityA()
	 * @generated
	 */
	void setNavigabilityA(boolean value);

	/**
	 * Returns the value of the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigability B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability B</em>' attribute.
	 * @see #setNavigabilityB(boolean)
	 * @see abstractPart.AbstractPartPackage#getRelationMSE_NavigabilityB()
	 * @model
	 * @generated
	 */
	boolean isNavigabilityB();

	/**
	 * Sets the value of the '{@link abstractPart.RelationMSE#isNavigabilityB <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability B</em>' attribute.
	 * @see #isNavigabilityB()
	 * @generated
	 */
	void setNavigabilityB(boolean value);

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

} // RelationMSE
