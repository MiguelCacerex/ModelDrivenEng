/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.Trigger#getNameTrigger <em>Name Trigger</em>}</li>
 *   <li>{@link dblanguagepart.Trigger#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Trigger</em>' attribute.
	 * @see #setNameTrigger(String)
	 * @see dblanguagepart.DblanguagepartPackage#getTrigger_NameTrigger()
	 * @model
	 * @generated
	 */
	String getNameTrigger();

	/**
	 * Sets the value of the '{@link dblanguagepart.Trigger#getNameTrigger <em>Name Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Trigger</em>' attribute.
	 * @see #getNameTrigger()
	 * @generated
	 */
	void setNameTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link dblanguagepart.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getTrigger_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

} // Trigger
