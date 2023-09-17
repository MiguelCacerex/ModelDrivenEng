/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.AssociationsMSE;
import abstractPart.InheritanceMSE;
import abstractPart.RelationMSE;

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
 * An implementation of the model object '<em><b>Associations MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstRelations <em>Lst Relations</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstInheritance <em>Lst Inheritance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationsMSEImpl extends EObjectImpl implements AssociationsMSE {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstRelations() <em>Lst Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMSE> lstRelations;

	/**
	 * The cached value of the '{@link #getLstInheritance() <em>Lst Inheritance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstInheritance()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritanceMSE> lstInheritance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationsMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractPartPackage.Literals.ASSOCIATIONS_MSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ASSOCIATIONS_MSE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationMSE> getLstRelations() {
		if (lstRelations == null) {
			lstRelations = new EObjectContainmentEList<RelationMSE>(RelationMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS);
		}
		return lstRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InheritanceMSE> getLstInheritance() {
		if (lstInheritance == null) {
			lstInheritance = new EObjectContainmentEList<InheritanceMSE>(InheritanceMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE);
		}
		return lstInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS:
				return ((InternalEList<?>)getLstRelations()).basicRemove(otherEnd, msgs);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
				return ((InternalEList<?>)getLstInheritance()).basicRemove(otherEnd, msgs);
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__STATE:
				return getState();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS:
				return getLstRelations();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
				return getLstInheritance();
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__STATE:
				setState((String)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS:
				getLstRelations().clear();
				getLstRelations().addAll((Collection<? extends RelationMSE>)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
				getLstInheritance().clear();
				getLstInheritance().addAll((Collection<? extends InheritanceMSE>)newValue);
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS:
				getLstRelations().clear();
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
				getLstInheritance().clear();
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_RELATIONS:
				return lstRelations != null && !lstRelations.isEmpty();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
				return lstInheritance != null && !lstInheritance.isEmpty();
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
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //AssociationsMSEImpl
