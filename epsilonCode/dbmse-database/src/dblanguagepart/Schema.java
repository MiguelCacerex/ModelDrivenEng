/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.Schema#getNameSchema <em>Name Schema</em>}</li>
 *   <li>{@link dblanguagepart.Schema#getLstTable <em>Lst Table</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Schema</em>' attribute.
	 * @see #setNameSchema(String)
	 * @see dblanguagepart.DblanguagepartPackage#getSchema_NameSchema()
	 * @model
	 * @generated
	 */
	String getNameSchema();

	/**
	 * Sets the value of the '{@link dblanguagepart.Schema#getNameSchema <em>Name Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Schema</em>' attribute.
	 * @see #getNameSchema()
	 * @generated
	 */
	void setNameSchema(String value);

	/**
	 * Returns the value of the '<em><b>Lst Table</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Table</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getSchema_LstTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getLstTable();

} // Schema
