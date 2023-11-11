/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.IndexConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#getNameIndex <em>Name Index</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#isIsGenerate <em>Is Generate</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#isIsSpecial <em>Is Special</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#isIsDesuso <em>Is Desuso</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#isIsRealizable <em>Is Realizable</em>}</li>
 *   <li>{@link dblanguagepart.impl.IndexConstraintImpl#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexConstraintImpl extends EObjectImpl implements IndexConstraint {
	/**
	 * The default value of the '{@link #getNameIndex() <em>Name Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameIndex() <em>Name Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameIndex()
	 * @generated
	 * @ordered
	 */
	protected String nameIndex = NAME_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsGenerate() <em>Is Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GENERATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGenerate() <em>Is Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean isGenerate = IS_GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSpecial() <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SPECIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSpecial() <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpecial()
	 * @generated
	 * @ordered
	 */
	protected boolean isSpecial = IS_SPECIAL_EDEFAULT;

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
	 * The default value of the '{@link #isIsRealizable() <em>Is Realizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRealizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRealizable() <em>Is Realizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRealizable()
	 * @generated
	 * @ordered
	 */
	protected boolean isRealizable = IS_REALIZABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnIndex() <em>Column Index</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columnIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.INDEX_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameIndex() {
		return nameIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameIndex(String newNameIndex) {
		String oldNameIndex = nameIndex;
		nameIndex = newNameIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__NAME_INDEX, oldNameIndex, nameIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGenerate() {
		return isGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGenerate(boolean newIsGenerate) {
		boolean oldIsGenerate = isGenerate;
		isGenerate = newIsGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__IS_GENERATE, oldIsGenerate, isGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSpecial() {
		return isSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpecial(boolean newIsSpecial) {
		boolean oldIsSpecial = isSpecial;
		isSpecial = newIsSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__IS_SPECIAL, oldIsSpecial, isSpecial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__IS_DESUSO, oldIsDesuso, isDesuso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRealizable() {
		return isRealizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRealizable(boolean newIsRealizable) {
		boolean oldIsRealizable = isRealizable;
		isRealizable = newIsRealizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.INDEX_CONSTRAINT__IS_REALIZABLE, oldIsRealizable, isRealizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumnIndex() {
		if (columnIndex == null) {
			columnIndex = new EObjectResolvingEList<Column>(Column.class, this, DblanguagepartPackage.INDEX_CONSTRAINT__COLUMN_INDEX);
		}
		return columnIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.INDEX_CONSTRAINT__NAME_INDEX:
				return getNameIndex();
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_UNIQUE:
				return isIsUnique();
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_GENERATE:
				return isIsGenerate();
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_SPECIAL:
				return isIsSpecial();
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_DESUSO:
				return isIsDesuso();
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_REALIZABLE:
				return isIsRealizable();
			case DblanguagepartPackage.INDEX_CONSTRAINT__COLUMN_INDEX:
				return getColumnIndex();
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
			case DblanguagepartPackage.INDEX_CONSTRAINT__NAME_INDEX:
				setNameIndex((String)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_GENERATE:
				setIsGenerate((Boolean)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_SPECIAL:
				setIsSpecial((Boolean)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_DESUSO:
				setIsDesuso((Boolean)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_REALIZABLE:
				setIsRealizable((Boolean)newValue);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__COLUMN_INDEX:
				getColumnIndex().clear();
				getColumnIndex().addAll((Collection<? extends Column>)newValue);
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
			case DblanguagepartPackage.INDEX_CONSTRAINT__NAME_INDEX:
				setNameIndex(NAME_INDEX_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_GENERATE:
				setIsGenerate(IS_GENERATE_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_SPECIAL:
				setIsSpecial(IS_SPECIAL_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_DESUSO:
				setIsDesuso(IS_DESUSO_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_REALIZABLE:
				setIsRealizable(IS_REALIZABLE_EDEFAULT);
				return;
			case DblanguagepartPackage.INDEX_CONSTRAINT__COLUMN_INDEX:
				getColumnIndex().clear();
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
			case DblanguagepartPackage.INDEX_CONSTRAINT__NAME_INDEX:
				return NAME_INDEX_EDEFAULT == null ? nameIndex != null : !NAME_INDEX_EDEFAULT.equals(nameIndex);
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_GENERATE:
				return isGenerate != IS_GENERATE_EDEFAULT;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_SPECIAL:
				return isSpecial != IS_SPECIAL_EDEFAULT;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_DESUSO:
				return isDesuso != IS_DESUSO_EDEFAULT;
			case DblanguagepartPackage.INDEX_CONSTRAINT__IS_REALIZABLE:
				return isRealizable != IS_REALIZABLE_EDEFAULT;
			case DblanguagepartPackage.INDEX_CONSTRAINT__COLUMN_INDEX:
				return columnIndex != null && !columnIndex.isEmpty();
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
		result.append(" (nameIndex: ");
		result.append(nameIndex);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isGenerate: ");
		result.append(isGenerate);
		result.append(", isSpecial: ");
		result.append(isSpecial);
		result.append(", isDesuso: ");
		result.append(isDesuso);
		result.append(", isRealizable: ");
		result.append(isRealizable);
		result.append(')');
		return result.toString();
	}

} //IndexConstraintImpl
