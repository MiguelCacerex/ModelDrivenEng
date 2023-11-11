/**
 */
package uidiagrampart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagrampart.GraphicElement;
import uidiagrampart.Group;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagrampart.impl.GroupImpl#getLstGraphicElement <em>Lst Graphic Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends GraphicElementImpl implements Group {
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
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagrampartPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicElement> getLstGraphicElement() {
		if (lstGraphicElement == null) {
			lstGraphicElement = new EObjectContainmentEList<GraphicElement>(GraphicElement.class, this, UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT);
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
			case UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT:
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
			case UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT:
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
			case UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT:
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
			case UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT:
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
			case UidiagrampartPackage.GROUP__LST_GRAPHIC_ELEMENT:
				return lstGraphicElement != null && !lstGraphicElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
