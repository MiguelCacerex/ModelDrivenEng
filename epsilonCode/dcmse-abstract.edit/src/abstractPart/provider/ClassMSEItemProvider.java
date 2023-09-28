/**
 */
package abstractPart.provider;


import abstractPart.AbstractPartFactory;
import abstractPart.AbstractPartPackage;
import abstractPart.ClassMSE;

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
 * This is the item provider adapter for a {@link abstractPart.ClassMSE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassMSEItemProvider 
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
	public ClassMSEItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addModifierPropertyDescriptor(object);
			addAbsrtactPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
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
				 getString("_UI_ClassMSE_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_state_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassMSE_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_name_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassMSE_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_type_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassMSE_modifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_modifier_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__MODIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Absrtact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsrtactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassMSE_absrtact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_absrtact_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__ABSRTACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ClassMSE_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_path_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__PATH,
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
				 getString("_UI_ClassMSE_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_location_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassMSE_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassMSE_documentation_feature", "_UI_ClassMSE_type"),
				 AbstractPartPackage.Literals.CLASS_MSE__DOCUMENTATION,
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
			childrenFeatures.add(AbstractPartPackage.Literals.CLASS_MSE__IDENTIFIER);
			childrenFeatures.add(AbstractPartPackage.Literals.CLASS_MSE__LST_METHODS);
			childrenFeatures.add(AbstractPartPackage.Literals.CLASS_MSE__LST_ATTRIBUTES);
			childrenFeatures.add(AbstractPartPackage.Literals.CLASS_MSE__LST_ATTRIBUTES_RELATIONS);
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
	 * This returns ClassMSE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassMSE"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassMSE)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassMSE_type") :
			getString("_UI_ClassMSE_type") + " " + label;
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

		switch (notification.getFeatureID(ClassMSE.class)) {
			case AbstractPartPackage.CLASS_MSE__NAME:
			case AbstractPartPackage.CLASS_MSE__STATE:
			case AbstractPartPackage.CLASS_MSE__TYPE:
			case AbstractPartPackage.CLASS_MSE__MODIFIER:
			case AbstractPartPackage.CLASS_MSE__ABSRTACT:
			case AbstractPartPackage.CLASS_MSE__PATH:
			case AbstractPartPackage.CLASS_MSE__LOCATION:
			case AbstractPartPackage.CLASS_MSE__DOCUMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractPartPackage.CLASS_MSE__IDENTIFIER:
			case AbstractPartPackage.CLASS_MSE__LST_METHODS:
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES:
			case AbstractPartPackage.CLASS_MSE__LST_ATTRIBUTES_RELATIONS:
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
				(AbstractPartPackage.Literals.CLASS_MSE__IDENTIFIER,
				 AbstractPartFactory.eINSTANCE.createHashCodeClassMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.CLASS_MSE__LST_METHODS,
				 AbstractPartFactory.eINSTANCE.createMethodMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.CLASS_MSE__LST_ATTRIBUTES,
				 AbstractPartFactory.eINSTANCE.createAttributeMSE()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractPartPackage.Literals.CLASS_MSE__LST_ATTRIBUTES_RELATIONS,
				 AbstractPartFactory.eINSTANCE.createAttributeRelationMSE()));
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
