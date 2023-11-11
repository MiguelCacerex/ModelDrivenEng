/**
 */
package uidiagrampart.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagrampart.Frame;
import uidiagrampart.UidiagrampartFactory;
import uidiagrampart.UidiagrampartPackage;

/**
 * This is the item provider adapter for a {@link uidiagrampart.Frame} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameItemProvider extends PropertiesElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUniqueIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unique ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frame_uniqueID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frame_uniqueID_feature", "_UI_Frame_type"),
				 UidiagrampartPackage.Literals.FRAME__UNIQUE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Frame.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Frame"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Frame)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Frame_type") :
			getString("_UI_Frame_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Frame.class)) {
			case UidiagrampartPackage.FRAME__UNIQUE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagrampartPackage.FRAME__LST_GRAPHIC_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createGraphicElement()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagrampartPackage.Literals.FRAME__LST_GRAPHIC_ELEMENT,
				 UidiagrampartFactory.eINSTANCE.createTableView()));
	}

}
