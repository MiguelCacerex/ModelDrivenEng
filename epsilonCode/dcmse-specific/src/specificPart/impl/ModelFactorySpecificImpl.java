/**
 */
package specificPart.impl;

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

import specificPart.ModelFactorySpecific;
import specificPart.PackageMSE;
import specificPart.SpecificPartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory Specific</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specificPart.impl.ModelFactorySpecificImpl#getName <em>Name</em>}</li>
 *   <li>{@link specificPart.impl.ModelFactorySpecificImpl#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactorySpecificImpl extends EObjectImpl implements ModelFactorySpecific {
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
	 * The cached value of the '{@link #getLstPackages() <em>Lst Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMSE> lstPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactorySpecificImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificPartPackage.Literals.MODEL_FACTORY_SPECIFIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.MODEL_FACTORY_SPECIFIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMSE> getLstPackages() {
		if (lstPackages == null) {
			lstPackages = new EObjectContainmentEList<PackageMSE>(PackageMSE.class, this, SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES);
		}
		return lstPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES:
				return ((InternalEList<?>)getLstPackages()).basicRemove(otherEnd, msgs);
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
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__NAME:
				return getName();
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES:
				return getLstPackages();
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
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__NAME:
				setName((String)newValue);
				return;
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES:
				getLstPackages().clear();
				getLstPackages().addAll((Collection<? extends PackageMSE>)newValue);
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
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES:
				getLstPackages().clear();
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
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC__LST_PACKAGES:
				return lstPackages != null && !lstPackages.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ModelFactorySpecificImpl
