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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagrampart.Frame;
import uidiagrampart.GraphicElement;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.impl.FrameImpl#getUniqueID <em>Unique ID</em>}</li>
 *   <li>{@link uidiagrampart.impl.FrameImpl#getLstGraphicElement <em>Lst Graphic Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends PropertiesElementImpl implements Frame {
	/**
	 * The default value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String uniqueID = UNIQUE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstGraphicElement() <em>Lst Graphic Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstGraphicElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicElement> lstGraphicElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagrampartPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueID() {
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueID(String newUniqueID) {
		String oldUniqueID = uniqueID;
		uniqueID = newUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagrampartPackage.FRAME__UNIQUE_ID, oldUniqueID, uniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicElement> getLstGraphicElement() {
		if (lstGraphicElement == null) {
			lstGraphicElement = new EObjectContainmentEList<GraphicElement>(GraphicElement.class, this, UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT);
		}
		return lstGraphicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				return ((InternalEList<?>)getLstGraphicElement()).basicRemove(otherEnd, msgs);
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
			case UidiagrampartPackage.FRAME__UNIQUE_ID:
				return getUniqueID();
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				return getLstGraphicElement();
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
			case UidiagrampartPackage.FRAME__UNIQUE_ID:
				setUniqueID((String)newValue);
				return;
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				getLstGraphicElement().clear();
				getLstGraphicElement().addAll((Collection<? extends GraphicElement>)newValue);
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
			case UidiagrampartPackage.FRAME__UNIQUE_ID:
				setUniqueID(UNIQUE_ID_EDEFAULT);
				return;
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				getLstGraphicElement().clear();
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
			case UidiagrampartPackage.FRAME__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueID != null : !UNIQUE_ID_EDEFAULT.equals(uniqueID);
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				return lstGraphicElement != null && !lstGraphicElement.isEmpty();
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
		result.append(" (uniqueID: ");
		result.append(uniqueID);
		result.append(')');
		return result.toString();
	}

} //FrameImpl
