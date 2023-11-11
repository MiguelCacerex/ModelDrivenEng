/**
 */
package dblanguagepart.impl;

import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.Schema;
import dblanguagepart.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.SchemaImpl#getNameSchema <em>Name Schema</em>}</li>
 *   <li>{@link dblanguagepart.impl.SchemaImpl#getLstTable <em>Lst Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
	/**
	 * The default value of the '{@link #getNameSchema() <em>Name Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSchema() <em>Name Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSchema()
	 * @generated
	 * @ordered
	 */
	protected String nameSchema = NAME_SCHEMA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstTable() <em>Lst Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> lstTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSchema() {
		return nameSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSchema(String newNameSchema) {
		String oldNameSchema = nameSchema;
		nameSchema = newNameSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.SCHEMA__NAME_SCHEMA, oldNameSchema, nameSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getLstTable() {
		if (lstTable == null) {
			lstTable = new EObjectContainmentEList<Table>(Table.class, this, DblanguagepartPackage.SCHEMA__LST_TABLE);
		}
		return lstTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DblanguagepartPackage.SCHEMA__LST_TABLE:
				return ((InternalEList<?>)getLstTable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.SCHEMA__NAME_SCHEMA:
				return getNameSchema();
			case DblanguagepartPackage.SCHEMA__LST_TABLE:
				return getLstTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DblanguagepartPackage.SCHEMA__NAME_SCHEMA:
				setNameSchema((String)newValue);
				return;
			case DblanguagepartPackage.SCHEMA__LST_TABLE:
				getLstTable().clear();
				getLstTable().addAll((Collection<? extends Table>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DblanguagepartPackage.SCHEMA__NAME_SCHEMA:
				setNameSchema(NAME_SCHEMA_EDEFAULT);
				return;
			case DblanguagepartPackage.SCHEMA__LST_TABLE:
				getLstTable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DblanguagepartPackage.SCHEMA__NAME_SCHEMA:
				return NAME_SCHEMA_EDEFAULT == null ? nameSchema != null : !NAME_SCHEMA_EDEFAULT.equals(nameSchema);
			case DblanguagepartPackage.SCHEMA__LST_TABLE:
				return lstTable != null && !lstTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameSchema: ");
		result.append(nameSchema);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
