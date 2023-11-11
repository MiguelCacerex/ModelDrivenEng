/**
 */
package dblanguagepart.impl;

import dblanguagepart.Column;
import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.PrimaryKeyConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.PrimaryKeyConstraintImpl#getType <em>Type</em>}</li>
 *   <li>{@link dblanguagepart.impl.PrimaryKeyConstraintImpl#getNameConstraint <em>Name Constraint</em>}</li>
 *   <li>{@link dblanguagepart.impl.PrimaryKeyConstraintImpl#getColumnConstraint <em>Column Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyConstraintImpl extends EObjectImpl implements PrimaryKeyConstraint {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "PrimaryKey";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getColumnConstraint() <em>Column Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columnConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.PRIMARY_KEY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT, oldNameConstraint, nameConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumnConstraint() {
		if (columnConstraint == null) {
			columnConstraint = new EObjectResolvingEList<Column>(Column.class, this, DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT);
		}
		return columnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__TYPE:
				return getType();
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT:
				return getNameConstraint();
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT:
				return getColumnConstraint();
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
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__TYPE:
				setType((String)newValue);
				return;
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT:
				setNameConstraint((String)newValue);
				return;
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT:
				getColumnConstraint().clear();
				getColumnConstraint().addAll((Collection<? extends Column>)newValue);
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
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT:
				setNameConstraint(NAME_CONSTRAINT_EDEFAULT);
				return;
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT:
				getColumnConstraint().clear();
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
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT:
				return NAME_CONSTRAINT_EDEFAULT == null ? nameConstraint != null : !NAME_CONSTRAINT_EDEFAULT.equals(nameConstraint);
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT:
				return columnConstraint != null && !columnConstraint.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", nameConstraint: ");
		result.append(nameConstraint);
		result.append(')');
		return result.toString();
	}

} //PrimaryKeyConstraintImpl
