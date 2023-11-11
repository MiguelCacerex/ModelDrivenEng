/**
 */
package uidiagrampart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.Group#getLstGraphicElement <em>Lst Graphic Element</em>}</li>
 * </ul>
 *
 * @see uidiagrampart.UidiagrampartPackage#getGroup()
 * @model annotation="gmf.node label='name' label.icon='false'"
 * @generated
 */
public interface Group extends GraphicElement {
	/**
	 * Returns the value of the '<em><b>Lst Graphic Element</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagrampart.GraphicElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Graphic Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Graphic Element</em>' containment reference list.
	 * @see uidiagrampart.UidiagrampartPackage#getGroup_LstGraphicElement()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<GraphicElement> getLstGraphicElement();

} // Group
