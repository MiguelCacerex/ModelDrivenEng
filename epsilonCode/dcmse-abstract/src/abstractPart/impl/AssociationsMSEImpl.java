/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.AgregationMSE;
import abstractPart.AssociationMSE;
import abstractPart.AssociationsMSE;
import abstractPart.ContainmentMSE;
import abstractPart.ImplementationMSE;
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
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstContainments <em>Lst Containments</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstAgregations <em>Lst Agregations</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstAssociations <em>Lst Associations</em>}</li>
 *   <li>{@link abstractPart.impl.AssociationsMSEImpl#getLstImplementations <em>Lst Implementations</em>}</li>
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstContainments() <em>Lst Containments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainmentMSE> lstContainments;

	/**
	 * The cached value of the '{@link #getLstAgregations() <em>Lst Agregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAgregations()
	 * @generated
	 * @ordered
	 */
	protected EList<AgregationMSE> lstAgregations;

	/**
	 * The cached value of the '{@link #getLstAssociations() <em>Lst Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationMSE> lstAssociations;

	/**
	 * The cached value of the '{@link #getLstImplementations() <em>Lst Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationMSE> lstImplementations;

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
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ASSOCIATIONS_MSE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentMSE> getLstContainments() {
		if (lstContainments == null) {
			lstContainments = new EObjectContainmentEList<ContainmentMSE>(ContainmentMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS);
		}
		return lstContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgregationMSE> getLstAgregations() {
		if (lstAgregations == null) {
			lstAgregations = new EObjectContainmentEList<AgregationMSE>(AgregationMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS);
		}
		return lstAgregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationMSE> getLstAssociations() {
		if (lstAssociations == null) {
			lstAssociations = new EObjectContainmentEList<AssociationMSE>(AssociationMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS);
		}
		return lstAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationMSE> getLstImplementations() {
		if (lstImplementations == null) {
			lstImplementations = new EObjectContainmentEList<ImplementationMSE>(ImplementationMSE.class, this, AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS);
		}
		return lstImplementations;
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
				return ((InternalEList<?>)getLstContainments()).basicRemove(otherEnd, msgs);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
				return ((InternalEList<?>)getLstAgregations()).basicRemove(otherEnd, msgs);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
				return ((InternalEList<?>)getLstAssociations()).basicRemove(otherEnd, msgs);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
				return ((InternalEList<?>)getLstImplementations()).basicRemove(otherEnd, msgs);
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__PATH:
				return getPath();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION:
				return getLocation();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
				return getLstContainments();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
				return getLstAgregations();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
				return getLstAssociations();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
				return getLstImplementations();
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__PATH:
				setPath((String)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION:
				setLocation((String)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
				getLstContainments().clear();
				getLstContainments().addAll((Collection<? extends ContainmentMSE>)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
				getLstAgregations().clear();
				getLstAgregations().addAll((Collection<? extends AgregationMSE>)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
				getLstAssociations().clear();
				getLstAssociations().addAll((Collection<? extends AssociationMSE>)newValue);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
				getLstImplementations().clear();
				getLstImplementations().addAll((Collection<? extends ImplementationMSE>)newValue);
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
				getLstContainments().clear();
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
				getLstAgregations().clear();
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
				getLstAssociations().clear();
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
				getLstImplementations().clear();
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
			case AbstractPartPackage.ASSOCIATIONS_MSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
				return lstContainments != null && !lstContainments.isEmpty();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
				return lstAgregations != null && !lstAgregations.isEmpty();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
				return lstAssociations != null && !lstAssociations.isEmpty();
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
				return lstImplementations != null && !lstImplementations.isEmpty();
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
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //AssociationsMSEImpl
