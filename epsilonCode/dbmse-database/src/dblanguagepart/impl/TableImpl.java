/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.ForeignConstraint;
import dblanguagepart.IndexConstraint;
import dblanguagepart.PrimaryKeyConstraint;
import dblanguagepart.Table;
import dblanguagepart.Trigger;
import dblanguagepart.UniqueConstraint;

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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.TableImpl#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getLstColumns <em>Lst Columns</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getPrimaryKeyConstrains <em>Primary Key Constrains</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getLstUniqueConstrains <em>Lst Unique Constrains</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getLstIndexConstrains <em>Lst Index Constrains</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getLstForeignConstraint <em>Lst Foreign Constraint</em>}</li>
 *   <li>{@link dblanguagepart.impl.TableImpl#getLstTriggers <em>Lst Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The default value of the '{@link #getNameTable() <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTable()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTable() <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTable()
	 * @generated
	 * @ordered
	 */
	protected String nameTable = NAME_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstColumns() <em>Lst Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> lstColumns;

	/**
	 * The cached value of the '{@link #getPrimaryKeyConstrains() <em>Primary Key Constrains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyConstrains()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKeyConstraint primaryKeyConstrains;

	/**
	 * The cached value of the '{@link #getLstUniqueConstrains() <em>Lst Unique Constrains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstUniqueConstrains()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueConstraint> lstUniqueConstrains;

	/**
	 * The cached value of the '{@link #getLstIndexConstrains() <em>Lst Index Constrains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstIndexConstrains()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexConstraint> lstIndexConstrains;

	/**
	 * The cached value of the '{@link #getLstForeignConstraint() <em>Lst Foreign Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstForeignConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignConstraint> lstForeignConstraint;

	/**
	 * The cached value of the '{@link #getLstTriggers() <em>Lst Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> lstTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTable() {
		return nameTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTable(String newNameTable) {
		String oldNameTable = nameTable;
		nameTable = newNameTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.TABLE__NAME_TABLE, oldNameTable, nameTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getLstColumns() {
		if (lstColumns == null) {
			lstColumns = new EObjectContainmentEList<Column>(Column.class, this, DblanguagepartPackage.TABLE__LST_COLUMNS);
		}
		return lstColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyConstraint getPrimaryKeyConstrains() {
		return primaryKeyConstrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyConstrains(PrimaryKeyConstraint newPrimaryKeyConstrains, NotificationChain msgs) {
		PrimaryKeyConstraint oldPrimaryKeyConstrains = primaryKeyConstrains;
		primaryKeyConstrains = newPrimaryKeyConstrains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS, oldPrimaryKeyConstrains, newPrimaryKeyConstrains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyConstrains(PrimaryKeyConstraint newPrimaryKeyConstrains) {
		if (newPrimaryKeyConstrains != primaryKeyConstrains) {
			NotificationChain msgs = null;
			if (primaryKeyConstrains != null)
				msgs = ((InternalEObject)primaryKeyConstrains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS, null, msgs);
			if (newPrimaryKeyConstrains != null)
				msgs = ((InternalEObject)newPrimaryKeyConstrains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS, null, msgs);
			msgs = basicSetPrimaryKeyConstrains(newPrimaryKeyConstrains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS, newPrimaryKeyConstrains, newPrimaryKeyConstrains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueConstraint> getLstUniqueConstrains() {
		if (lstUniqueConstrains == null) {
			lstUniqueConstrains = new EObjectContainmentEList<UniqueConstraint>(UniqueConstraint.class, this, DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS);
		}
		return lstUniqueConstrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexConstraint> getLstIndexConstrains() {
		if (lstIndexConstrains == null) {
			lstIndexConstrains = new EObjectContainmentEList<IndexConstraint>(IndexConstraint.class, this, DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS);
		}
		return lstIndexConstrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignConstraint> getLstForeignConstraint() {
		if (lstForeignConstraint == null) {
			lstForeignConstraint = new EObjectContainmentEList<ForeignConstraint>(ForeignConstraint.class, this, DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT);
		}
		return lstForeignConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getLstTriggers() {
		if (lstTriggers == null) {
			lstTriggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, DblanguagepartPackage.TABLE__LST_TRIGGERS);
		}
		return lstTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DblanguagepartPackage.TABLE__LST_COLUMNS:
				return ((InternalEList<?>)getLstColumns()).basicRemove(otherEnd, msgs);
			case DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS:
				return basicSetPrimaryKeyConstrains(null, msgs);
			case DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS:
				return ((InternalEList<?>)getLstUniqueConstrains()).basicRemove(otherEnd, msgs);
			case DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS:
				return ((InternalEList<?>)getLstIndexConstrains()).basicRemove(otherEnd, msgs);
			case DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT:
				return ((InternalEList<?>)getLstForeignConstraint()).basicRemove(otherEnd, msgs);
			case DblanguagepartPackage.TABLE__LST_TRIGGERS:
				return ((InternalEList<?>)getLstTriggers()).basicRemove(otherEnd, msgs);
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
			case DblanguagepartPackage.TABLE__NAME_TABLE:
				return getNameTable();
			case DblanguagepartPackage.TABLE__LST_COLUMNS:
				return getLstColumns();
			case DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS:
				return getPrimaryKeyConstrains();
			case DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS:
				return getLstUniqueConstrains();
			case DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS:
				return getLstIndexConstrains();
			case DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT:
				return getLstForeignConstraint();
			case DblanguagepartPackage.TABLE__LST_TRIGGERS:
				return getLstTriggers();
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
			case DblanguagepartPackage.TABLE__NAME_TABLE:
				setNameTable((String)newValue);
				return;
			case DblanguagepartPackage.TABLE__LST_COLUMNS:
				getLstColumns().clear();
				getLstColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS:
				setPrimaryKeyConstrains((PrimaryKeyConstraint)newValue);
				return;
			case DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS:
				getLstUniqueConstrains().clear();
				getLstUniqueConstrains().addAll((Collection<? extends UniqueConstraint>)newValue);
				return;
			case DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS:
				getLstIndexConstrains().clear();
				getLstIndexConstrains().addAll((Collection<? extends IndexConstraint>)newValue);
				return;
			case DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT:
				getLstForeignConstraint().clear();
				getLstForeignConstraint().addAll((Collection<? extends ForeignConstraint>)newValue);
				return;
			case DblanguagepartPackage.TABLE__LST_TRIGGERS:
				getLstTriggers().clear();
				getLstTriggers().addAll((Collection<? extends Trigger>)newValue);
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
			case DblanguagepartPackage.TABLE__NAME_TABLE:
				setNameTable(NAME_TABLE_EDEFAULT);
				return;
			case DblanguagepartPackage.TABLE__LST_COLUMNS:
				getLstColumns().clear();
				return;
			case DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS:
				setPrimaryKeyConstrains((PrimaryKeyConstraint)null);
				return;
			case DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS:
				getLstUniqueConstrains().clear();
				return;
			case DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS:
				getLstIndexConstrains().clear();
				return;
			case DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT:
				getLstForeignConstraint().clear();
				return;
			case DblanguagepartPackage.TABLE__LST_TRIGGERS:
				getLstTriggers().clear();
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
			case DblanguagepartPackage.TABLE__NAME_TABLE:
				return NAME_TABLE_EDEFAULT == null ? nameTable != null : !NAME_TABLE_EDEFAULT.equals(nameTable);
			case DblanguagepartPackage.TABLE__LST_COLUMNS:
				return lstColumns != null && !lstColumns.isEmpty();
			case DblanguagepartPackage.TABLE__PRIMARY_KEY_CONSTRAINS:
				return primaryKeyConstrains != null;
			case DblanguagepartPackage.TABLE__LST_UNIQUE_CONSTRAINS:
				return lstUniqueConstrains != null && !lstUniqueConstrains.isEmpty();
			case DblanguagepartPackage.TABLE__LST_INDEX_CONSTRAINS:
				return lstIndexConstrains != null && !lstIndexConstrains.isEmpty();
			case DblanguagepartPackage.TABLE__LST_FOREIGN_CONSTRAINT:
				return lstForeignConstraint != null && !lstForeignConstraint.isEmpty();
			case DblanguagepartPackage.TABLE__LST_TRIGGERS:
				return lstTriggers != null && !lstTriggers.isEmpty();
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
		result.append(" (nameTable: ");
		result.append(nameTable);
		result.append(')');
		return result.toString();
	}

} //TableImpl
