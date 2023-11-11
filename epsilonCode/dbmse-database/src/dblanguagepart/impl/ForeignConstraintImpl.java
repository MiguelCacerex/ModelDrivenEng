/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.ForeignConstraint;
import dblanguagepart.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.ForeignConstraintImpl#getNameConstraint <em>Name Constraint</em>}</li>
 *   <li>{@link dblanguagepart.impl.ForeignConstraintImpl#getSourceTable <em>Source Table</em>}</li>
 *   <li>{@link dblanguagepart.impl.ForeignConstraintImpl#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link dblanguagepart.impl.ForeignConstraintImpl#getTargetColumnName <em>Target Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignConstraintImpl extends EObjectImpl implements ForeignConstraint {
	/**
	 * The default value of the '{@link #getNameConstraint() <em>Name Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameConstraint() <em>Name Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConstraint()
	 * @generated
	 * @ordered
	 */
	protected String nameConstraint = NAME_CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceTable() <em>Source Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTable()
	 * @generated
	 * @ordered
	 */
	protected Table sourceTable;

	/**
	 * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumn()
	 * @generated
	 * @ordered
	 */
	protected Column sourceColumn;

	/**
	 * The default value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected String targetColumnName = TARGET_COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.FOREIGN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameConstraint() {
		return nameConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConstraint(String newNameConstraint) {
		String oldNameConstraint = nameConstraint;
		nameConstraint = newNameConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.FOREIGN_CONSTRAINT__NAME_CONSTRAINT, oldNameConstraint, nameConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getSourceTable() {
		if (sourceTable != null && sourceTable.eIsProxy()) {
			InternalEObject oldSourceTable = (InternalEObject)sourceTable;
			sourceTable = (Table)eResolveProxy(oldSourceTable);
			if (sourceTable != oldSourceTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE, oldSourceTable, sourceTable));
			}
		}
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetSourceTable() {
		return sourceTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTable(Table newSourceTable) {
		Table oldSourceTable = sourceTable;
		sourceTable = newSourceTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE, oldSourceTable, sourceTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getSourceColumn() {
		if (sourceColumn != null && sourceColumn.eIsProxy()) {
			InternalEObject oldSourceColumn = (InternalEObject)sourceColumn;
			sourceColumn = (Column)eResolveProxy(oldSourceColumn);
			if (sourceColumn != oldSourceColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN, oldSourceColumn, sourceColumn));
			}
		}
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetSourceColumn() {
		return sourceColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceColumn(Column newSourceColumn) {
		Column oldSourceColumn = sourceColumn;
		sourceColumn = newSourceColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN, oldSourceColumn, sourceColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetColumnName() {
		return targetColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetColumnName(String newTargetColumnName) {
		String oldTargetColumnName = targetColumnName;
		targetColumnName = newTargetColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME, oldTargetColumnName, targetColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__NAME_CONSTRAINT:
				return getNameConstraint();
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE:
				if (resolve) return getSourceTable();
				return basicGetSourceTable();
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN:
				if (resolve) return getSourceColumn();
				return basicGetSourceColumn();
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME:
				return getTargetColumnName();
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
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__NAME_CONSTRAINT:
				setNameConstraint((String)newValue);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE:
				setSourceTable((Table)newValue);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN:
				setSourceColumn((Column)newValue);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME:
				setTargetColumnName((String)newValue);
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
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__NAME_CONSTRAINT:
				setNameConstraint(NAME_CONSTRAINT_EDEFAULT);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE:
				setSourceTable((Table)null);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN:
				setSourceColumn((Column)null);
				return;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME:
				setTargetColumnName(TARGET_COLUMN_NAME_EDEFAULT);
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
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__NAME_CONSTRAINT:
				return NAME_CONSTRAINT_EDEFAULT == null ? nameConstraint != null : !NAME_CONSTRAINT_EDEFAULT.equals(nameConstraint);
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_TABLE:
				return sourceTable != null;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__SOURCE_COLUMN:
				return sourceColumn != null;
			case DblanguagepartPackage.FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME:
				return TARGET_COLUMN_NAME_EDEFAULT == null ? targetColumnName != null : !TARGET_COLUMN_NAME_EDEFAULT.equals(targetColumnName);
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
		result.append(" (nameConstraint: ");
		result.append(nameConstraint);
		result.append(", targetColumnName: ");
		result.append(targetColumnName);
		result.append(')');
		return result.toString();
	}

} //ForeignConstraintImpl
