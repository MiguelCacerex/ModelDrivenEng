/**
 */
package dblanguagepart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.ForeignConstraint#getNameConstraint <em>Name Constraint</em>}</li>
 *   <li>{@link dblanguagepart.ForeignConstraint#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link dblanguagepart.ForeignConstraint#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link dblanguagepart.ForeignConstraint#getTargetColumnName <em>Target Column Name</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getForeignConstraint()
 * @model
 * @generated
 */
public interface ForeignConstraint extends EObject {
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
	 * @see dblanguagepart.DblanguagepartPackage#getForeignConstraint_NameConstraint()
	 * @model
	 * @generated
	 */
	String getNameConstraint();

	/**
	 * Sets the value of the '{@link dblanguagepart.ForeignConstraint#getNameConstraint <em>Name Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Constraint</em>' attribute.
	 * @see #getNameConstraint()
	 * @generated
	 */
	void setNameConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Table</em>' reference.
	 * @see #setSourceTable(Table)
	 * @see dblanguagepart.DblanguagepartPackage#getForeignConstraint_SourceTable()
	 * @model
	 * @generated
	 */
	Table getSourceTable();

	/**
	 * Sets the value of the '{@link dblanguagepart.ForeignConstraint#getSourceTable <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table</em>' reference.
	 * @see #getSourceTable()
	 * @generated
	 */
	void setSourceTable(Table value);

	/**
	 * Returns the value of the '<em><b>Source Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column</em>' reference.
	 * @see #setSourceColumn(Column)
	 * @see dblanguagepart.DblanguagepartPackage#getForeignConstraint_SourceColumn()
	 * @model
	 * @generated
	 */
	Column getSourceColumn();

	/**
	 * Sets the value of the '{@link dblanguagepart.ForeignConstraint#getSourceColumn <em>Source Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Column</em>' reference.
	 * @see #getSourceColumn()
	 * @generated
	 */
	void setSourceColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column Name</em>' attribute.
	 * @see #setTargetColumnName(String)
	 * @see dblanguagepart.DblanguagepartPackage#getForeignConstraint_TargetColumnName()
	 * @model
	 * @generated
	 */
	String getTargetColumnName();

	/**
	 * Sets the value of the '{@link dblanguagepart.ForeignConstraint#getTargetColumnName <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column Name</em>' attribute.
	 * @see #getTargetColumnName()
	 * @generated
	 */
	void setTargetColumnName(String value);

} // ForeignConstraint
