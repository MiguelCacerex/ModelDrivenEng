/**
 */
package uidiagrampart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.Frame#getUniqueID <em>Unique ID</em>}</li>
 *   <li>{@link uidiagrampart.Frame#getLstGraphicElement <em>Lst Graphic Element</em>}</li>
 * </ul>
 *
 * @see uidiagrampart.UidiagrampartPackage#getFrame()
 * @model annotation="gmf.node label='name' label.icon='false'"
 * @generated
 */
public interface Frame extends PropertiesElement {
	/**
	 * Returns the value of the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique ID</em>' attribute.
	 * @see #setUniqueID(String)
	 * @see uidiagrampart.UidiagrampartPackage#getFrame_UniqueID()
	 * @model
	 * @generated
	 */
	String getUniqueID();

	/**
	 * Sets the value of the '{@link uidiagrampart.Frame#getUniqueID <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID</em>' attribute.
	 * @see #getUniqueID()
	 * @generated
	 */
	void setUniqueID(String value);

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
	 * @see uidiagrampart.UidiagrampartPackage#getFrame_LstGraphicElement()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<GraphicElement> getLstGraphicElement();

} // Frame
