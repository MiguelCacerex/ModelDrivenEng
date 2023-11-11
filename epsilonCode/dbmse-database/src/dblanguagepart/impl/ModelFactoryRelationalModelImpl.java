/**
 */
package dblanguagepart.impl;

import dblanguagepart.DblanguagepartPackage;
import dblanguagepart.ModelFactoryRelationalModel;
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
 * An implementation of the model object '<em><b>Model Factory Relational Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dblanguagepart.impl.ModelFactoryRelationalModelImpl#getNameFactory <em>Name Factory</em>}</li>
 *   <li>{@link dblanguagepart.impl.ModelFactoryRelationalModelImpl#getLstSchemas <em>Lst Schemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryRelationalModelImpl extends EObjectImpl implements ModelFactoryRelationalModel {
	/**
	 * The default value of the '{@link #getNameFactory() <em>Name Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFactory() <em>Name Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFactory()
	 * @generated
	 * @ordered
	 */
	protected String nameFactory = NAME_FACTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstSchemas() <em>Lst Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> lstSchemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryRelationalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblanguagepartPackage.Literals.MODEL_FACTORY_RELATIONAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFactory() {
		return nameFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFactory(String newNameFactory) {
		String oldNameFactory = nameFactory;
		nameFactory = newNameFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY, oldNameFactory, nameFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getLstSchemas() {
		if (lstSchemas == null) {
			lstSchemas = new EObjectContainmentEList<Schema>(Schema.class, this, DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS);
		}
		return lstSchemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS:
				return ((InternalEList<?>)getLstSchemas()).basicRemove(otherEnd, msgs);
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
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY:
				return getNameFactory();
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS:
				return getLstSchemas();
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
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY:
				setNameFactory((String)newValue);
				return;
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS:
				getLstSchemas().clear();
				getLstSchemas().addAll((Collection<? extends Schema>)newValue);
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
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY:
				setNameFactory(NAME_FACTORY_EDEFAULT);
				return;
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS:
				getLstSchemas().clear();
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
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY:
				return NAME_FACTORY_EDEFAULT == null ? nameFactory != null : !NAME_FACTORY_EDEFAULT.equals(nameFactory);
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS:
				return lstSchemas != null && !lstSchemas.isEmpty();
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
		result.append(" (nameFactory: ");
		result.append(nameFactory);
		result.append(')');
		return result.toString();
	}

} //ModelFactoryRelationalModelImpl
