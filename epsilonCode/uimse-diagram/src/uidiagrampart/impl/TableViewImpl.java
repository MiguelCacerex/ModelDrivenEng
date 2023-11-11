/**
 */
package uidiagrampart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagrampart.TableColumn;
import uidiagrampart.TableView;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.impl.TableViewImpl#getLstColumns <em>Lst Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableViewImpl extends GraphicElementImpl implements TableView {
	/**
	 * The cached value of the '{@link #getLstColumns() <em>Lst Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<TableColumn> lstColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagrampartPackage.Literals.TABLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumn> getLstColumns() {
		if (lstColumns == null) {
			lstColumns = new EObjectContainmentEList<TableColumn>(TableColumn.class, this, UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS);
		}
		return lstColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS:
				return ((InternalEList<?>)getLstColumns()).basicRemove(otherEnd, msgs);
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
			case UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS:
				return getLstColumns();
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
			case UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS:
				getLstColumns().clear();
				getLstColumns().addAll((Collection<? extends TableColumn>)newValue);
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
			case UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS:
				getLstColumns().clear();
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
			case UidiagrampartPackage.TABLE_VIEW__LST_COLUMNS:
				return lstColumns != null && !lstColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableViewImpl
