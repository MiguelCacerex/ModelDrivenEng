/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.IndexConstraint#getNameIndex <em>Name Index</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#isIsGenerate <em>Is Generate</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#isIsSpecial <em>Is Special</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#isIsDesuso <em>Is Desuso</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#isIsRealizable <em>Is Realizable</em>}</li>
 *   <li>{@link dblanguagepart.IndexConstraint#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint()
 * @model
 * @generated
 */
public interface IndexConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Index</em>' attribute.
	 * @see #setNameIndex(String)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_NameIndex()
	 * @model
	 * @generated
	 */
	String getNameIndex();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#getNameIndex <em>Name Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Index</em>' attribute.
	 * @see #getNameIndex()
	 * @generated
	 */
	void setNameIndex(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Generate</em>' attribute.
	 * @see #setIsGenerate(boolean)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_IsGenerate()
	 * @model
	 * @generated
	 */
	boolean isIsGenerate();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#isIsGenerate <em>Is Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generate</em>' attribute.
	 * @see #isIsGenerate()
	 * @generated
	 */
	void setIsGenerate(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Special</em>' attribute.
	 * @see #setIsSpecial(boolean)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_IsSpecial()
	 * @model
	 * @generated
	 */
	boolean isIsSpecial();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#isIsSpecial <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Special</em>' attribute.
	 * @see #isIsSpecial()
	 * @generated
	 */
	void setIsSpecial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Desuso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Desuso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Desuso</em>' attribute.
	 * @see #setIsDesuso(boolean)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_IsDesuso()
	 * @model
	 * @generated
	 */
	boolean isIsDesuso();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#isIsDesuso <em>Is Desuso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Desuso</em>' attribute.
	 * @see #isIsDesuso()
	 * @generated
	 */
	void setIsDesuso(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Realizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realizable</em>' attribute.
	 * @see #setIsRealizable(boolean)
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_IsRealizable()
	 * @model
	 * @generated
	 */
	boolean isIsRealizable();

	/**
	 * Sets the value of the '{@link dblanguagepart.IndexConstraint#isIsRealizable <em>Is Realizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Realizable</em>' attribute.
	 * @see #isIsRealizable()
	 * @generated
	 */
	void setIsRealizable(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Index</b></em>' reference list.
	 * The list contents are of type {@link dblanguagepart.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Index</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Index</em>' reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getIndexConstraint_ColumnIndex()
	 * @model
	 * @generated
	 */
	EList<Column> getColumnIndex();

} // IndexConstraint
