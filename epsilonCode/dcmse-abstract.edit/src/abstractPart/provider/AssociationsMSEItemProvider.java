/**
 */
package abstractPart.provider;


import abstractPart.AbstractPartFactory;
import abstractPart.AbstractPartPackage;
import abstractPart.AssociationsMSE;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link abstractPart.AssociationsMSE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationsMSEItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationsMSEItemProvider(AdapterFactory adapterFactory) {
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

			addStatePropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationsMSE_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationsMSE_state_feature", "_UI_AssociationsMSE_type"),
				 AbstractPartPackage.Literals.ASSOCIATIONS_MSE__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationsMSE_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationsMSE_path_feature", "_UI_AssociationsMSE_type"),
				 AbstractPartPackage.Literals.ASSOCIATIONS_MSE__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssociationsMSE_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssociationsMSE_location_feature", "_UI_AssociationsMSE_type"),
				 AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LOCATION,
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
			childrenFeatures.add(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_CONTAINMENTS);
			childrenFeatures.add(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_AGREGATIONS);
			childrenFeatures.add(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_ASSOCIATIONS);
			childrenFeatures.add(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS);
			childrenFeatures.add(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_INHERITANCE);
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
	 * This returns AssociationsMSE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationsMSE"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssociationsMSE)object).getState();
		return label == null || label.length() == 0 ?
			getString("_UI_AssociationsMSE_type") :
			getString("_UI_AssociationsMSE_type") + " " + label;
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

		switch (notification.getFeatureID(AssociationsMSE.class)) {
			case AbstractPartPackage.ASSOCIATIONS_MSE__STATE:
			case AbstractPartPackage.ASSOCIATIONS_MSE__PATH:
			case AbstractPartPackage.ASSOCIATIONS_MSE__LOCATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_CONTAINMENTS:
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_AGREGATIONS:
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_ASSOCIATIONS:
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS:
			case AbstractPartPackage.ASSOCIATIONS_MSE__LST_INHERITANCE:
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
				(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_CONTAINMENTS,
				 AbstractPartFactory.eINSTANCE.createContainmentMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_AGREGATIONS,
				 AbstractPartFactory.eINSTANCE.createAgregationMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_ASSOCIATIONS,
				 AbstractPartFactory.eINSTANCE.createAssociationMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS,
				 AbstractPartFactory.eINSTANCE.createImplementationMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.ASSOCIATIONS_MSE__LST_INHERITANCE,
				 AbstractPartFactory.eINSTANCE.createInheritanceMSE()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractPartEditPlugin.INSTANCE;
	}

}
