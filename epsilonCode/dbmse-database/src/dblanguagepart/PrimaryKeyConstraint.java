/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.PrimaryKeyConstraint#getType <em>Type</em>}</li>
 *   <li>{@link dblanguagepart.PrimaryKeyConstraint#getNameConstraint <em>Name Constraint</em>}</li>
 *   <li>{@link dblanguagepart.PrimaryKeyConstraint#getColumnConstraint <em>Column Constraint</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getPrimaryKeyConstraint()
 * @model
 * @generated
 */
public interface PrimaryKeyConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PrimaryKey"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dblanguagepart.DblanguagepartPackage#getPrimaryKeyConstraint_Type()
	 * @model default="PrimaryKey"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dblanguagepart.PrimaryKeyConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Constraint</em>' attribute.
	 * @see #setNameConstraint(String)
	 * @see dblanguagepart.DblanguagepartPackage#getPrimaryKeyConstraint_NameConstraint()
	 * @model
	 * @generated
	 */
	String getNameConstraint();

	/**
	 * Sets the value of the '{@link dblanguagepart.PrimaryKeyConstraint#getNameConstraint <em>Name Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Constraint</em>' attribute.
	 * @see #getNameConstraint()
	 * @generated
	 */
	void setNameConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Column Constraint</b></em>' reference list.
	 * The list contents are of type {@link dblanguagepart.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Constraint</em>' reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getPrimaryKeyConstraint_ColumnConstraint()
	 * @model
	 * @generated
	 */
	EList<Column> getColumnConstraint();

} // PrimaryKeyConstraint
