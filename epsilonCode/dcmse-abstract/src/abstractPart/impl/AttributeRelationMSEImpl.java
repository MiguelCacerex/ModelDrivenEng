/**
 */
package abstractPart.impl;

import abstractPart.AbstractPartPackage;
import abstractPart.AttributeRelationMSE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Relation MSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getState <em>State</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getPath <em>Path</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link abstractPart.impl.AttributeRelationMSEImpl#getTypeParent <em>Type Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRelationMSEImpl extends EObjectImpl implements AttributeRelationMSE {
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
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getTypeParent() <em>Type Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParent()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeParent() <em>Type Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParent()
	 * @generated
	 * @ordered
	 */
	protected String typeParent = TYPE_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRelationMSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractPartPackage.Literals.ATTRIBUTE_RELATION_MSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__INITIAL_VALUE, oldInitialValue, initialValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeParent() {
		return typeParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParent(String newTypeParent) {
		String oldTypeParent = typeParent;
		typeParent = newTypeParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE_PARENT, oldTypeParent, typeParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__NAME:
				return getName();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__STATE:
				return getState();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__MODIFIER:
				return getModifier();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE:
				return getType();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__INITIAL_VALUE:
				return getInitialValue();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__DOCUMENTATION:
				return getDocumentation();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__PATH:
				return getPath();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__LOCATION:
				return getLocation();
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE_PARENT:
				return getTypeParent();
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
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__NAME:
				setName((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__STATE:
				setState((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__MODIFIER:
				setModifier((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE:
				setType((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__PATH:
				setPath((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__LOCATION:
				setLocation((String)newValue);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE_PARENT:
				setTypeParent((String)newValue);
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
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE_PARENT:
				setTypeParent(TYPE_PARENT_EDEFAULT);
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
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE__TYPE_PARENT:
				return TYPE_PARENT_EDEFAULT == null ? typeParent != null : !TYPE_PARENT_EDEFAULT.equals(typeParent);
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
		result.append(", type: ");
		result.append(type);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", path: ");
		result.append(path);
		result.append(", location: ");
		result.append(location);
		result.append(", typeParent: ");
		result.append(typeParent);
		result.append(')');
		return result.toString();
	}

} //AttributeRelationMSEImpl
