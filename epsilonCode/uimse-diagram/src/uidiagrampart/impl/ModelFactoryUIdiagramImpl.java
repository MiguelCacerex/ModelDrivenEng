/**
 */
package uidiagrampart.impl;

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

import uidiagrampart.ModelFactoryUIdiagram;
import uidiagrampart.ProjectBoard;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory UIdiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.impl.ModelFactoryUIdiagramImpl#getState <em>State</em>}</li>
 *   <li>{@link uidiagrampart.impl.ModelFactoryUIdiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagrampart.impl.ModelFactoryUIdiagramImpl#getLstProjectBoard <em>Lst Project Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryUIdiagramImpl extends EObjectImpl implements ModelFactoryUIdiagram {
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
	 * The cached value of the '{@link #getLstProjectBoard() <em>Lst Project Board</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstProjectBoard()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectBoard> lstProjectBoard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryUIdiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagrampartPackage.Literals.MODEL_FACTORY_UIDIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectBoard> getLstProjectBoard() {
		if (lstProjectBoard == null) {
			lstProjectBoard = new EObjectContainmentEList<ProjectBoard>(ProjectBoard.class, this, UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD);
		}
		return lstProjectBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD:
				return ((InternalEList<?>)getLstProjectBoard()).basicRemove(otherEnd, msgs);
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
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__STATE:
				return getState();
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__NAME:
				return getName();
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD:
				return getLstProjectBoard();
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
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__STATE:
				setState((String)newValue);
				return;
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__NAME:
				setName((String)newValue);
				return;
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD:
				getLstProjectBoard().clear();
				getLstProjectBoard().addAll((Collection<? extends ProjectBoard>)newValue);
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
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD:
				getLstProjectBoard().clear();
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
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD:
				return lstProjectBoard != null && !lstProjectBoard.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelFactoryUIdiagramImpl
