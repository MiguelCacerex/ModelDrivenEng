/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.Table#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link dblanguagepart.Table#getLstColumns <em>Lst Columns</em>}</li>
 *   <li>{@link dblanguagepart.Table#getPrimaryKeyConstrains <em>Primary Key Constrains</em>}</li>
 *   <li>{@link dblanguagepart.Table#getLstUniqueConstrains <em>Lst Unique Constrains</em>}</li>
 *   <li>{@link dblanguagepart.Table#getLstIndexConstrains <em>Lst Index Constrains</em>}</li>
 *   <li>{@link dblanguagepart.Table#getLstForeignConstraint <em>Lst Foreign Constraint</em>}</li>
 *   <li>{@link dblanguagepart.Table#getLstTriggers <em>Lst Triggers</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Table</em>' attribute.
	 * @see #setNameTable(String)
	 * @see dblanguagepart.DblanguagepartPackage#getTable_NameTable()
	 * @model
	 * @generated
	 */
	String getNameTable();

	/**
	 * Sets the value of the '{@link dblanguagepart.Table#getNameTable <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Table</em>' attribute.
	 * @see #getNameTable()
	 * @generated
	 */
	void setNameTable(String value);

	/**
	 * Returns the value of the '<em><b>Lst Columns</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Columns</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTable_LstColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key Constrains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Constrains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Constrains</em>' containment reference.
	 * @see #setPrimaryKeyConstrains(PrimaryKeyConstraint)
	 * @see dblanguagepart.DblanguagepartPackage#getTable_PrimaryKeyConstrains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryKeyConstraint getPrimaryKeyConstrains();

	/**
	 * Sets the value of the '{@link dblanguagepart.Table#getPrimaryKeyConstrains <em>Primary Key Constrains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Constrains</em>' containment reference.
	 * @see #getPrimaryKeyConstrains()
	 * @generated
	 */
	void setPrimaryKeyConstrains(PrimaryKeyConstraint value);

	/**
	 * Returns the value of the '<em><b>Lst Unique Constrains</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Unique Constrains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Unique Constrains</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTable_LstUniqueConstrains()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueConstraint> getLstUniqueConstrains();

	/**
	 * Returns the value of the '<em><b>Lst Index Constrains</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.IndexConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Index Constrains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Index Constrains</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTable_LstIndexConstrains()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexConstraint> getLstIndexConstrains();

	/**
	 * Returns the value of the '<em><b>Lst Foreign Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.ForeignConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Foreign Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Foreign Constraint</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTable_LstForeignConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignConstraint> getLstForeignConstraint();

	/**
	 * Returns the value of the '<em><b>Lst Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Triggers</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTable_LstTriggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getLstTriggers();

} // Table
