/**
 */
package specificPart.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import specificPart.ClassMSE;
import specificPart.RelationMSE;
import specificPart.SpecificPartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getType <em>Type</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getState <em>State</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getRoleSource <em>Role Source</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getRoleTarget <em>Role Target</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getMultiplicitySource <em>Multiplicity Source</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getMultiplicityTarget <em>Multiplicity Target</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#isNavigabilitySource <em>Navigability Source</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#isNavigabilityTarget <em>Navigability Target</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getSource <em>Source</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getPath <em>Path</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationMSEImpl extends EObjectImpl implements RelationMSE {
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
	 * The default value of the '{@link #getRoleSource() <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSource()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleSource() <em>Role Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSource()
	 * @generated
	 * @ordered
	 */
	protected String roleSource = ROLE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTarget() <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTarget() <em>Role Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTarget()
	 * @generated
	 * @ordered
	 */
	protected String roleTarget = ROLE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicitySource() <em>Multiplicity Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicitySource()
	 * @generated
	 * @ordered
	 */
	protected String multiplicitySource = MULTIPLICITY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityTarget() <em>Multiplicity Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityTarget()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityTarget = MULTIPLICITY_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigabilitySource() <em>Navigability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilitySource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABILITY_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigabilitySource() <em>Navigability Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilitySource()
	 * @generated
	 * @ordered
	 */
	protected boolean navigabilitySource = NAVIGABILITY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigabilityTarget() <em>Navigability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABILITY_TARGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigabilityTarget() <em>Navigability Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean navigabilityTarget = NAVIGABILITY_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClassMSE source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassMSE target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificPartPackage.Literals.RELATION_MSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleSource() {
		return roleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSource(String newRoleSource) {
		String oldRoleSource = roleSource;
		roleSource = newRoleSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__ROLE_SOURCE, oldRoleSource, roleSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleTarget() {
		return roleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleTarget(String newRoleTarget) {
		String oldRoleTarget = roleTarget;
		roleTarget = newRoleTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__ROLE_TARGET, oldRoleTarget, roleTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicitySource() {
		return multiplicitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicitySource(String newMultiplicitySource) {
		String oldMultiplicitySource = multiplicitySource;
		multiplicitySource = newMultiplicitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__MULTIPLICITY_SOURCE, oldMultiplicitySource, multiplicitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicityTarget() {
		return multiplicityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityTarget(String newMultiplicityTarget) {
		String oldMultiplicityTarget = multiplicityTarget;
		multiplicityTarget = newMultiplicityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__MULTIPLICITY_TARGET, oldMultiplicityTarget, multiplicityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigabilitySource() {
		return navigabilitySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigabilitySource(boolean newNavigabilitySource) {
		boolean oldNavigabilitySource = navigabilitySource;
		navigabilitySource = newNavigabilitySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__NAVIGABILITY_SOURCE, oldNavigabilitySource, navigabilitySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigabilityTarget() {
		return navigabilityTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigabilityTarget(boolean newNavigabilityTarget) {
		boolean oldNavigabilityTarget = navigabilityTarget;
		navigabilityTarget = newNavigabilityTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__NAVIGABILITY_TARGET, oldNavigabilityTarget, navigabilityTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMSE getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClassMSE)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificPartPackage.RELATION_MSE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMSE basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ClassMSE newSource) {
		ClassMSE oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMSE getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClassMSE)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificPartPackage.RELATION_MSE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMSE basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ClassMSE newTarget) {
		ClassMSE oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificPartPackage.RELATION_MSE__TYPE:
				return getType();
			case SpecificPartPackage.RELATION_MSE__STATE:
				return getState();
			case SpecificPartPackage.RELATION_MSE__ROLE_SOURCE:
				return getRoleSource();
			case SpecificPartPackage.RELATION_MSE__ROLE_TARGET:
				return getRoleTarget();
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_SOURCE:
				return getMultiplicitySource();
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_TARGET:
				return getMultiplicityTarget();
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_SOURCE:
				return isNavigabilitySource();
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_TARGET:
				return isNavigabilityTarget();
			case SpecificPartPackage.RELATION_MSE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SpecificPartPackage.RELATION_MSE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SpecificPartPackage.RELATION_MSE__PATH:
				return getPath();
			case SpecificPartPackage.RELATION_MSE__LOCATION:
				return getLocation();
			case SpecificPartPackage.RELATION_MSE__DOCUMENTATION:
				return getDocumentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecificPartPackage.RELATION_MSE__TYPE:
				setType((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__STATE:
				setState((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_SOURCE:
				setRoleSource((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_TARGET:
				setRoleTarget((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_SOURCE:
				setMultiplicitySource((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_TARGET:
				setMultiplicityTarget((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_SOURCE:
				setNavigabilitySource((Boolean)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_TARGET:
				setNavigabilityTarget((Boolean)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__SOURCE:
				setSource((ClassMSE)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__TARGET:
				setTarget((ClassMSE)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__PATH:
				setPath((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__LOCATION:
				setLocation((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case SpecificPartPackage.RELATION_MSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_SOURCE:
				setRoleSource(ROLE_SOURCE_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_TARGET:
				setRoleTarget(ROLE_TARGET_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_SOURCE:
				setMultiplicitySource(MULTIPLICITY_SOURCE_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_TARGET:
				setMultiplicityTarget(MULTIPLICITY_TARGET_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_SOURCE:
				setNavigabilitySource(NAVIGABILITY_SOURCE_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_TARGET:
				setNavigabilityTarget(NAVIGABILITY_TARGET_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__SOURCE:
				setSource((ClassMSE)null);
				return;
			case SpecificPartPackage.RELATION_MSE__TARGET:
				setTarget((ClassMSE)null);
				return;
			case SpecificPartPackage.RELATION_MSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
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
			case SpecificPartPackage.RELATION_MSE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SpecificPartPackage.RELATION_MSE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case SpecificPartPackage.RELATION_MSE__ROLE_SOURCE:
				return ROLE_SOURCE_EDEFAULT == null ? roleSource != null : !ROLE_SOURCE_EDEFAULT.equals(roleSource);
			case SpecificPartPackage.RELATION_MSE__ROLE_TARGET:
				return ROLE_TARGET_EDEFAULT == null ? roleTarget != null : !ROLE_TARGET_EDEFAULT.equals(roleTarget);
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_SOURCE:
				return MULTIPLICITY_SOURCE_EDEFAULT == null ? multiplicitySource != null : !MULTIPLICITY_SOURCE_EDEFAULT.equals(multiplicitySource);
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_TARGET:
				return MULTIPLICITY_TARGET_EDEFAULT == null ? multiplicityTarget != null : !MULTIPLICITY_TARGET_EDEFAULT.equals(multiplicityTarget);
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_SOURCE:
				return navigabilitySource != NAVIGABILITY_SOURCE_EDEFAULT;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_TARGET:
				return navigabilityTarget != NAVIGABILITY_TARGET_EDEFAULT;
			case SpecificPartPackage.RELATION_MSE__SOURCE:
				return source != null;
			case SpecificPartPackage.RELATION_MSE__TARGET:
				return target != null;
			case SpecificPartPackage.RELATION_MSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SpecificPartPackage.RELATION_MSE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case SpecificPartPackage.RELATION_MSE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
		result.append(", state: ");
		result.append(state);
		result.append(", roleSource: ");
		result.append(roleSource);
		result.append(", roleTarget: ");
		result.append(roleTarget);
		result.append(", multiplicitySource: ");
		result.append(multiplicitySource);
		result.append(", multiplicityTarget: ");
		result.append(multiplicityTarget);
		result.append(", navigabilitySource: ");
		result.append(navigabilitySource);
		result.append(", navigabilityTarget: ");
		result.append(navigabilityTarget);
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //RelationMSEImpl
