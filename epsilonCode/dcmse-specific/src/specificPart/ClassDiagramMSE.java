/**
 */
package specificPart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram MSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specificPart.ClassDiagramMSE#getName <em>Name</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getState <em>State</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getPath <em>Path</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getLocation <em>Location</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getLstClass <em>Lst Class</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getLstInheritances <em>Lst Inheritances</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getLstRelations <em>Lst Relations</em>}</li>
 *   <li>{@link specificPart.ClassDiagramMSE#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @see specificPart.SpecificPartPackage#getClassDiagramMSE()
 * @model
 * @generated
 */
public interface ClassDiagramMSE extends EObject {
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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link specificPart.ClassDiagramMSE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link specificPart.ClassDiagramMSE#getState <em>State</em>}' attribute.
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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link specificPart.ClassDiagramMSE#getPath <em>Path</em>}' attribute.
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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link specificPart.ClassDiagramMSE#getLocation <em>Location</em>}' attribute.
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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link specificPart.ClassDiagramMSE#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Lst Class</b></em>' containment reference list.
	 * The list contents are of type {@link specificPart.ClassMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Class</em>' containment reference list.
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_LstClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMSE> getLstClass();

	/**
	 * Returns the value of the '<em><b>Lst Inheritances</b></em>' containment reference list.
	 * The list contents are of type {@link specificPart.InheritanceMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Inheritances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Inheritances</em>' containment reference list.
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_LstInheritances()
	 * @model containment="true"
	 * @generated
	 */
	EList<InheritanceMSE> getLstInheritances();

	/**
	 * Returns the value of the '<em><b>Lst Relations</b></em>' containment reference list.
	 * The list contents are of type {@link specificPart.RelationMSE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Relations</em>' containment reference list.
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_LstRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationMSE> getLstRelations();

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
	 * @see specificPart.SpecificPartPackage#getClassDiagramMSE_LstPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageMSE> getLstPackages();

} // ClassDiagramMSE
