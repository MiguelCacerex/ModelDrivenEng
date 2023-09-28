/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.AttributeMSE;
import abstractPart.MethodMSE;

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
 * An implementation of the model object '<em><b>Method MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getBody <em>Body</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getTypeReturn <em>Type Return</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abstractPart.impl.MethodMSEImpl#getLstArguments <em>Lst Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodMSEImpl extends EObjectImpl implements MethodMSE {
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
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeReturn() <em>Type Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReturn()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_RETURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeReturn() <em>Type Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReturn()
	 * @generated
	 * @ordered
	 */
	protected String typeReturn = TYPE_RETURN_EDEFAULT;

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
	 * The cached value of the '{@link #getLstArguments() <em>Lst Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMSE> lstArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractPartPackage.Literals.METHOD_MSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeReturn() {
		return typeReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeReturn(String newTypeReturn) {
		String oldTypeReturn = typeReturn;
		typeReturn = newTypeReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__TYPE_RETURN, oldTypeReturn, typeReturn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.METHOD_MSE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMSE> getLstArguments() {
		if (lstArguments == null) {
			lstArguments = new EObjectContainmentEList<AttributeMSE>(AttributeMSE.class, this, AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS);
		}
		return lstArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS:
				return ((InternalEList<?>)getLstArguments()).basicRemove(otherEnd, msgs);
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
			case AbstractPartPackage.METHOD_MSE__NAME:
				return getName();
			case AbstractPartPackage.METHOD_MSE__STATE:
				return getState();
			case AbstractPartPackage.METHOD_MSE__MODIFIER:
				return getModifier();
			case AbstractPartPackage.METHOD_MSE__BODY:
				return getBody();
			case AbstractPartPackage.METHOD_MSE__TYPE_RETURN:
				return getTypeReturn();
			case AbstractPartPackage.METHOD_MSE__PATH:
				return getPath();
			case AbstractPartPackage.METHOD_MSE__LOCATION:
				return getLocation();
			case AbstractPartPackage.METHOD_MSE__DOCUMENTATION:
				return getDocumentation();
			case AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS:
				return getLstArguments();
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
			case AbstractPartPackage.METHOD_MSE__NAME:
				setName((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__STATE:
				setState((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__MODIFIER:
				setModifier((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__BODY:
				setBody((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__TYPE_RETURN:
				setTypeReturn((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__PATH:
				setPath((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__LOCATION:
				setLocation((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS:
				getLstArguments().clear();
				getLstArguments().addAll((Collection<? extends AttributeMSE>)newValue);
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
			case AbstractPartPackage.METHOD_MSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__TYPE_RETURN:
				setTypeReturn(TYPE_RETURN_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS:
				getLstArguments().clear();
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
			case AbstractPartPackage.METHOD_MSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractPartPackage.METHOD_MSE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractPartPackage.METHOD_MSE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AbstractPartPackage.METHOD_MSE__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case AbstractPartPackage.METHOD_MSE__TYPE_RETURN:
				return TYPE_RETURN_EDEFAULT == null ? typeReturn != null : !TYPE_RETURN_EDEFAULT.equals(typeReturn);
			case AbstractPartPackage.METHOD_MSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractPartPackage.METHOD_MSE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AbstractPartPackage.METHOD_MSE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AbstractPartPackage.METHOD_MSE__LST_ARGUMENTS:
				return lstArguments != null && !lstArguments.isEmpty();
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
		result.append(", state: ");
		result.append(state);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", body: ");
		result.append(body);
		result.append(", typeReturn: ");
		result.append(typeReturn);
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //MethodMSEImpl
