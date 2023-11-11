/**
 */
package uidiagrampart.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagrampart.PropertiesElement;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getState <em>State</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link uidiagrampart.impl.PropertiesElementImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesElementImpl extends EObjectImpl implements PropertiesElement {
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
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected String radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected String positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected String positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected String stroke = STROKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected String opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagrampartPackage.Literals.PROPERTIES_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(String newRadius) {
		String oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(String newPositionX) {
		String oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(String newPositionY) {
		String oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(String newStroke) {
		String oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		String oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.PROPERTIES_ELEMENT__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STATE:
				return getState();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__NAME:
				return getName();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__RADIUS:
				return getRadius();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_X:
				return getPositionX();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_Y:
				return getPositionY();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__WIDTH:
				return getWidth();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__HEIGHT:
				return getHeight();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STROKE:
				return getStroke();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__OPACITY:
				return getOpacity();
			case UidiagrampartPackage.PROPERTIES_ELEMENT__BACKGROUND:
				return getBackground();
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
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STATE:
				setState((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__RADIUS:
				setRadius((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_X:
				setPositionX((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_Y:
				setPositionY((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__WIDTH:
				setWidth((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__HEIGHT:
				setHeight((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STROKE:
				setStroke((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__OPACITY:
				setOpacity((String)newValue);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__BACKGROUND:
				setBackground((String)newValue);
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
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case UidiagrampartPackage.PROPERTIES_ELEMENT__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__RADIUS:
				return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_X:
				return POSITION_X_EDEFAULT == null ? positionX != null : !POSITION_X_EDEFAULT.equals(positionX);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__POSITION_Y:
				return POSITION_Y_EDEFAULT == null ? positionY != null : !POSITION_Y_EDEFAULT.equals(positionY);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__STROKE:
				return STROKE_EDEFAULT == null ? stroke != null : !STROKE_EDEFAULT.equals(stroke);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__OPACITY:
				return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
			case UidiagrampartPackage.PROPERTIES_ELEMENT__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
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
		result.append(", radius: ");
		result.append(radius);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", background: ");
		result.append(background);
		result.append(')');
		return result.toString();
	}

} //PropertiesElementImpl
