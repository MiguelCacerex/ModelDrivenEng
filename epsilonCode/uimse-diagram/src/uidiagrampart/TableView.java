/**
 */
package uidiagrampart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.TableView#getLstColumns <em>Lst Columns</em>}</li>
 * </ul>
 *
 * @see uidiagrampart.UidiagrampartPackage#getTableView()
 * @model annotation="gmf.node label='name' label.icon='false'"
 * @generated
 */
public interface TableView extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Lst Columns</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagrampart.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Columns</em>' containment reference list.
	 * @see uidiagrampart.UidiagrampartPackage#getTableView_LstColumns()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false' layout='list'"
	 * @generated
	 */
	EList<TableColumn> getLstColumns();

} // TableView
