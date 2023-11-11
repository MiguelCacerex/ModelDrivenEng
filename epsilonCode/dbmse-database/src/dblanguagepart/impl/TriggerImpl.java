/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.TriggerImpl#getNameTrigger <em>Name Trigger</em>}</li>
 *   <li>{@link dblanguagepart.impl.TriggerImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends EObjectImpl implements Trigger {
	/**
	 * The default value of the '{@link #getNameTrigger() <em>Name Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTrigger() <em>Name Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTrigger()
	 * @generated
	 * @ordered
	 */
	protected String nameTrigger = NAME_TRIGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTrigger() {
		return nameTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTrigger(String newNameTrigger) {
		String oldNameTrigger = nameTrigger;
		nameTrigger = newNameTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.TRIGGER__NAME_TRIGGER, oldNameTrigger, nameTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<Column>(Column.class, this, DblanguagepartPackage.TRIGGER__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.TRIGGER__NAME_TRIGGER:
				return getNameTrigger();
			case DblanguagepartPackage.TRIGGER__COLUMNS:
				return getColumns();
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
			case DblanguagepartPackage.TRIGGER__NAME_TRIGGER:
				setNameTrigger((String)newValue);
				return;
			case DblanguagepartPackage.TRIGGER__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
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
			case DblanguagepartPackage.TRIGGER__NAME_TRIGGER:
				setNameTrigger(NAME_TRIGGER_EDEFAULT);
				return;
			case DblanguagepartPackage.TRIGGER__COLUMNS:
				getColumns().clear();
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
			case DblanguagepartPackage.TRIGGER__NAME_TRIGGER:
				return NAME_TRIGGER_EDEFAULT == null ? nameTrigger != null : !NAME_TRIGGER_EDEFAULT.equals(nameTrigger);
			case DblanguagepartPackage.TRIGGER__COLUMNS:
				return columns != null && !columns.isEmpty();
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
		result.append(" (nameTrigger: ");
		result.append(nameTrigger);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
