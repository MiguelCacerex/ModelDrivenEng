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
 *   <li>{@link specificPart.impl.RelationMSEImpl#getRoleA <em>Role A</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getRoleB <em>Role B</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#isNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link specificPart.impl.RelationMSEImpl#isNavigabilityB <em>Navigability B</em>}</li>
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
	 * The default value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleA() <em>Role A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleA()
	 * @generated
	 * @ordered
	 */
	protected String roleA = ROLE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleB() <em>Role B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleB()
	 * @generated
	 * @ordered
	 */
	protected String roleB = ROLE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityA = MULTIPLICITY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityB = MULTIPLICITY_B_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigabilityA() <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABILITY_A_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigabilityA() <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityA()
	 * @generated
	 * @ordered
	 */
	protected boolean navigabilityA = NAVIGABILITY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigabilityB() <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityB()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABILITY_B_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigabilityB() <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigabilityB()
	 * @generated
	 * @ordered
	 */
	protected boolean navigabilityB = NAVIGABILITY_B_EDEFAULT;

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
	public String getRoleA() {
		return roleA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleA(String newRoleA) {
		String oldRoleA = roleA;
		roleA = newRoleA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__ROLE_A, oldRoleA, roleA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleB() {
		return roleB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleB(String newRoleB) {
		String oldRoleB = roleB;
		roleB = newRoleB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__ROLE_B, oldRoleB, roleB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicityA() {
		return multiplicityA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityA(String newMultiplicityA) {
		String oldMultiplicityA = multiplicityA;
		multiplicityA = newMultiplicityA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__MULTIPLICITY_A, oldMultiplicityA, multiplicityA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicityB() {
		return multiplicityB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityB(String newMultiplicityB) {
		String oldMultiplicityB = multiplicityB;
		multiplicityB = newMultiplicityB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__MULTIPLICITY_B, oldMultiplicityB, multiplicityB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigabilityA() {
		return navigabilityA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigabilityA(boolean newNavigabilityA) {
		boolean oldNavigabilityA = navigabilityA;
		navigabilityA = newNavigabilityA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__NAVIGABILITY_A, oldNavigabilityA, navigabilityA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigabilityB() {
		return navigabilityB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigabilityB(boolean newNavigabilityB) {
		boolean oldNavigabilityB = navigabilityB;
		navigabilityB = newNavigabilityB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificPartPackage.RELATION_MSE__NAVIGABILITY_B, oldNavigabilityB, navigabilityB));
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
			case SpecificPartPackage.RELATION_MSE__ROLE_A:
				return getRoleA();
			case SpecificPartPackage.RELATION_MSE__ROLE_B:
				return getRoleB();
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_A:
				return getMultiplicityA();
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_B:
				return getMultiplicityB();
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_A:
				return isNavigabilityA();
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_B:
				return isNavigabilityB();
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
			case SpecificPartPackage.RELATION_MSE__ROLE_A:
				setRoleA((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_B:
				setRoleB((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_A:
				setMultiplicityA((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_B:
				setMultiplicityB((String)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_A:
				setNavigabilityA((Boolean)newValue);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_B:
				setNavigabilityB((Boolean)newValue);
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
			case SpecificPartPackage.RELATION_MSE__ROLE_A:
				setRoleA(ROLE_A_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__ROLE_B:
				setRoleB(ROLE_B_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_A:
				setMultiplicityA(MULTIPLICITY_A_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_B:
				setMultiplicityB(MULTIPLICITY_B_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_A:
				setNavigabilityA(NAVIGABILITY_A_EDEFAULT);
				return;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_B:
				setNavigabilityB(NAVIGABILITY_B_EDEFAULT);
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
			case SpecificPartPackage.RELATION_MSE__ROLE_A:
				return ROLE_A_EDEFAULT == null ? roleA != null : !ROLE_A_EDEFAULT.equals(roleA);
			case SpecificPartPackage.RELATION_MSE__ROLE_B:
				return ROLE_B_EDEFAULT == null ? roleB != null : !ROLE_B_EDEFAULT.equals(roleB);
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_A:
				return MULTIPLICITY_A_EDEFAULT == null ? multiplicityA != null : !MULTIPLICITY_A_EDEFAULT.equals(multiplicityA);
			case SpecificPartPackage.RELATION_MSE__MULTIPLICITY_B:
				return MULTIPLICITY_B_EDEFAULT == null ? multiplicityB != null : !MULTIPLICITY_B_EDEFAULT.equals(multiplicityB);
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_A:
				return navigabilityA != NAVIGABILITY_A_EDEFAULT;
			case SpecificPartPackage.RELATION_MSE__NAVIGABILITY_B:
				return navigabilityB != NAVIGABILITY_B_EDEFAULT;
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
		result.append(", roleA: ");
		result.append(roleA);
		result.append(", roleB: ");
		result.append(roleB);
		result.append(", multiplicityA: ");
		result.append(multiplicityA);
		result.append(", multiplicityB: ");
		result.append(multiplicityB);
		result.append(", navigabilityA: ");
		result.append(navigabilityA);
		result.append(", navigabilityB: ");
		result.append(navigabilityB);
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
