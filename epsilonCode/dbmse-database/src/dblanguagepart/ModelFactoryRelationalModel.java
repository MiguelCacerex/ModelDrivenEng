/**
 */
package dblanguagepart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Relational Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.ModelFactoryRelationalModel#getNameFactory <em>Name Factory</em>}</li>
 *   <li>{@link dblanguagepart.ModelFactoryRelationalModel#getLstSchemas <em>Lst Schemas</em>}</li>
 * </ul>
 *
 * @see dblanguagepart.DblanguagepartPackage#getModelFactoryRelationalModel()
 * @model
 * @generated
 */
public interface ModelFactoryRelationalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Factory</em>' attribute.
	 * @see #setNameFactory(String)
	 * @see dblanguagepart.DblanguagepartPackage#getModelFactoryRelationalModel_NameFactory()
	 * @model
	 * @generated
	 */
	String getNameFactory();

	/**
	 * Sets the value of the '{@link dblanguagepart.ModelFactoryRelationalModel#getNameFactory <em>Name Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Factory</em>' attribute.
	 * @see #getNameFactory()
	 * @generated
	 */
	void setNameFactory(String value);

	/**
	 * Returns the value of the '<em><b>Lst Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link dblanguagepart.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Schemas</em>' containment reference list.
	 * @see dblanguagepart.DblanguagepartPackage#getModelFactoryRelationalModel_LstSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getLstSchemas();

} // ModelFactoryRelationalModel
