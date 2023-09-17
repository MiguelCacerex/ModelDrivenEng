/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.ClassDiagramMSE;
import abstractPart.ModelFactoryAbstract;
import abstractPart.PackageMSE;

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
 * An implementation of the model object '<em><b>Model Factory Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abstractPart.impl.ModelFactoryAbstractImpl#getLstPackages <em>Lst Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryAbstractImpl extends EObjectImpl implements ModelFactoryAbstract {
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	protected ModelFactoryAbstractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractPartPackage.Literals.MODEL_FACTORY_ABSTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMSE> getLstPackages() {
		if (lstPackages == null) {
			lstPackages = new EObjectContainmentEList<PackageMSE>(PackageMSE.class, this, AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES);
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES:
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__STATE:
				return getState();
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__NAME:
				return getName();
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__PATH:
				return getPath();
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LOCATION:
				return getLocation();
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__DOCUMENTATION:
				return getDocumentation();
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES:
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__STATE:
				setState((String)newValue);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__NAME:
				setName((String)newValue);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__PATH:
				setPath((String)newValue);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LOCATION:
				setLocation((String)newValue);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES:
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES:
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT__LST_PACKAGES:
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
		result.append(" (state: ");
		result.append(state);
		result.append(", name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //ModelFactoryAbstractImpl
