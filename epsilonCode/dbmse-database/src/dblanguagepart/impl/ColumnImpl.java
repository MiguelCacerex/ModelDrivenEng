/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link dblanguagepart.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link dblanguagepart.impl.ColumnImpl#getSize <em>Size</em>}</li>
 *   <li>{@link dblanguagepart.impl.ColumnImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link dblanguagepart.impl.ColumnImpl#isIsDesuso <em>Is Desuso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDesuso() <em>Is Desuso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDesuso()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESUSO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDesuso() <em>Is Desuso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDesuso()
	 * @generated
	 * @ordered
	 */
	protected boolean isDesuso = IS_DESUSO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.COLUMN__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.COLUMN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.COLUMN__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDesuso() {
		return isDesuso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDesuso(boolean newIsDesuso) {
		boolean oldIsDesuso = isDesuso;
		isDesuso = newIsDesuso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.COLUMN__IS_DESUSO, oldIsDesuso, isDesuso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.COLUMN__NAME:
				return getName();
			case DblanguagepartPackage.COLUMN__DATA_TYPE:
				return getDataType();
			case DblanguagepartPackage.COLUMN__SIZE:
				return getSize();
			case DblanguagepartPackage.COLUMN__IS_MANDATORY:
				return isIsMandatory();
			case DblanguagepartPackage.COLUMN__IS_DESUSO:
				return isIsDesuso();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DblanguagepartPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case DblanguagepartPackage.COLUMN__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case DblanguagepartPackage.COLUMN__SIZE:
				setSize((Integer)newValue);
				return;
			case DblanguagepartPackage.COLUMN__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case DblanguagepartPackage.COLUMN__IS_DESUSO:
				setIsDesuso((Boolean)newValue);
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
			case DblanguagepartPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DblanguagepartPackage.COLUMN__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case DblanguagepartPackage.COLUMN__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DblanguagepartPackage.COLUMN__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case DblanguagepartPackage.COLUMN__IS_DESUSO:
				setIsDesuso(IS_DESUSO_EDEFAULT);
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
			case DblanguagepartPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DblanguagepartPackage.COLUMN__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case DblanguagepartPackage.COLUMN__SIZE:
				return size != SIZE_EDEFAULT;
			case DblanguagepartPackage.COLUMN__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case DblanguagepartPackage.COLUMN__IS_DESUSO:
				return isDesuso != IS_DESUSO_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", size: ");
		result.append(size);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(", isDesuso: ");
		result.append(isDesuso);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
