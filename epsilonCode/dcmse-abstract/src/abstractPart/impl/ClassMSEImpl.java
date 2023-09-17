/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.AttributeMSE;
import abstractPart.ClassDiagramMSE;
import abstractPart.ClassMSE;
import abstractPart.HashCodeClassMSE;
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
 * An implementation of the model object '<em><b>Class MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#isAbsrtact <em>Absrtact</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getLstMethods <em>Lst Methods</em>}</li>
 *   <li>{@link abstractPart.impl.ClassMSEImpl#getLstAttributes <em>Lst Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassMSEImpl extends EObjectImpl implements ClassMSE {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #isAbsrtact() <em>Absrtact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsrtact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSRTACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsrtact() <em>Absrtact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsrtact()
	 * @generated
	 * @ordered
	 */
	protected boolean absrtact = ABSRTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected HashCodeClassMSE identifier;

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
	 * The cached value of the '{@link #getLstMethods() <em>Lst Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodMSE> lstMethods;

	/**
	 * The cached value of the '{@link #getLstAttributes() <em>Lst Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMSE> lstAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractPartPackage.Literals.CLASS_MSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsrtact() {
		return absrtact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsrtact(boolean newAbsrtact) {
		boolean oldAbsrtact = absrtact;
		absrtact = newAbsrtact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__ABSRTACT, oldAbsrtact, absrtact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashCodeClassMSE getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (HashCodeClassMSE)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractPartPackage.CLASS_MSE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashCodeClassMSE basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(HashCodeClassMSE newIdentifier) {
		HashCodeClassMSE oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.CLASS_MSE__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMSE> getLstAttributes() {
		if (lstAttributes == null) {
			lstAttributes = new EObjectContainmentEList<AttributeMSE>(AttributeMSE.class, this, AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES);
		}
		return lstAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodMSE> getLstMethods() {
		if (lstMethods == null) {
			lstMethods = new EObjectContainmentEList<MethodMSE>(MethodMSE.class, this, AbstractPartPackage.CLASS_MSE__LST_METHODS);
		}
		return lstMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
				return ((InternalEList<?>)getLstMethods()).basicRemove(otherEnd, msgs);
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
				return ((InternalEList<?>)getLstAttributes()).basicRemove(otherEnd, msgs);
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
			case AbstractPartPackage.CLASS_MSE__STATE:
				return getState();
			case AbstractPartPackage.CLASS_MSE__NAME:
				return getName();
			case AbstractPartPackage.CLASS_MSE__TYPE:
				return getType();
			case AbstractPartPackage.CLASS_MSE__MODIFIER:
				return getModifier();
			case AbstractPartPackage.CLASS_MSE__ABSRTACT:
				return isAbsrtact();
			case AbstractPartPackage.CLASS_MSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case AbstractPartPackage.CLASS_MSE__PATH:
				return getPath();
			case AbstractPartPackage.CLASS_MSE__LOCATION:
				return getLocation();
			case AbstractPartPackage.CLASS_MSE__DOCUMENTATION:
				return getDocumentation();
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
				return getLstMethods();
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
				return getLstAttributes();
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
			case AbstractPartPackage.CLASS_MSE__STATE:
				setState((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__NAME:
				setName((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__TYPE:
				setType((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__MODIFIER:
				setModifier((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__ABSRTACT:
				setAbsrtact((Boolean)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__IDENTIFIER:
				setIdentifier((HashCodeClassMSE)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__PATH:
				setPath((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__LOCATION:
				setLocation((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
				getLstMethods().clear();
				getLstMethods().addAll((Collection<? extends MethodMSE>)newValue);
				return;
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
				getLstAttributes().clear();
				getLstAttributes().addAll((Collection<? extends AttributeMSE>)newValue);
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
			case AbstractPartPackage.CLASS_MSE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__ABSRTACT:
				setAbsrtact(ABSRTACT_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__IDENTIFIER:
				setIdentifier((HashCodeClassMSE)null);
				return;
			case AbstractPartPackage.CLASS_MSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
				getLstMethods().clear();
				return;
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
				getLstAttributes().clear();
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
			case AbstractPartPackage.CLASS_MSE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractPartPackage.CLASS_MSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractPartPackage.CLASS_MSE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbstractPartPackage.CLASS_MSE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AbstractPartPackage.CLASS_MSE__ABSRTACT:
				return absrtact != ABSRTACT_EDEFAULT;
			case AbstractPartPackage.CLASS_MSE__IDENTIFIER:
				return identifier != null;
			case AbstractPartPackage.CLASS_MSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractPartPackage.CLASS_MSE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AbstractPartPackage.CLASS_MSE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
				return lstMethods != null && !lstMethods.isEmpty();
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
				return lstAttributes != null && !lstAttributes.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", absrtact: ");
		result.append(absrtact);
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //ClassMSEImpl
