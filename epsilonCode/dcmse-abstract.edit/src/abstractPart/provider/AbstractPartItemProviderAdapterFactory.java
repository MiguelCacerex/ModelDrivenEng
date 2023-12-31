/**
 */
package abstractPart.provider;

import abstractPart.util.AbstractPartAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPartItemProviderAdapterFactory extends AbstractPartAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPartItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.ModelFactoryAbstract} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstractItemProvider modelFactoryAbstractItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.ModelFactoryAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelFactoryAbstractAdapter() {
		if (modelFactoryAbstractItemProvider == null) {
			modelFactoryAbstractItemProvider = new ModelFactoryAbstractItemProvider(this);
		}

		return modelFactoryAbstractItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.PackageMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMSEItemProvider packageMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.PackageMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageMSEAdapter() {
		if (packageMSEItemProvider == null) {
			packageMSEItemProvider = new PackageMSEItemProvider(this);
		}

		return packageMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.ClassDiagramMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramMSEItemProvider classDiagramMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.ClassDiagramMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassDiagramMSEAdapter() {
		if (classDiagramMSEItemProvider == null) {
			classDiagramMSEItemProvider = new ClassDiagramMSEItemProvider(this);
		}

		return classDiagramMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.ClassMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMSEItemProvider classMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.ClassMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassMSEAdapter() {
		if (classMSEItemProvider == null) {
			classMSEItemProvider = new ClassMSEItemProvider(this);
		}

		return classMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.MethodMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodMSEItemProvider methodMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.MethodMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodMSEAdapter() {
		if (methodMSEItemProvider == null) {
			methodMSEItemProvider = new MethodMSEItemProvider(this);
		}

		return methodMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.AttributeMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMSEItemProvider attributeMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.AttributeMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeMSEAdapter() {
		if (attributeMSEItemProvider == null) {
			attributeMSEItemProvider = new AttributeMSEItemProvider(this);
		}

		return attributeMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.AttributeRelationMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRelationMSEItemProvider attributeRelationMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.AttributeRelationMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeRelationMSEAdapter() {
		if (attributeRelationMSEItemProvider == null) {
			attributeRelationMSEItemProvider = new AttributeRelationMSEItemProvider(this);
		}

		return attributeRelationMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.HashCodeClassMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashCodeClassMSEItemProvider hashCodeClassMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.HashCodeClassMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHashCodeClassMSEAdapter() {
		if (hashCodeClassMSEItemProvider == null) {
			hashCodeClassMSEItemProvider = new HashCodeClassMSEItemProvider(this);
		}

		return hashCodeClassMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.AssociationsMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationsMSEItemProvider associationsMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.AssociationsMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationsMSEAdapter() {
		if (associationsMSEItemProvider == null) {
			associationsMSEItemProvider = new AssociationsMSEItemProvider(this);
		}

		return associationsMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.RelationMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMSEItemProvider relationMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.RelationMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationMSEAdapter() {
		if (relationMSEItemProvider == null) {
			relationMSEItemProvider = new RelationMSEItemProvider(this);
		}

		return relationMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.InheritanceMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceMSEItemProvider inheritanceMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.InheritanceMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInheritanceMSEAdapter() {
		if (inheritanceMSEItemProvider == null) {
			inheritanceMSEItemProvider = new InheritanceMSEItemProvider(this);
		}

		return inheritanceMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.ContainmentMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentMSEItemProvider containmentMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.ContainmentMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainmentMSEAdapter() {
		if (containmentMSEItemProvider == null) {
			containmentMSEItemProvider = new ContainmentMSEItemProvider(this);
		}

		return containmentMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.AgregationMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgregationMSEItemProvider agregationMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.AgregationMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgregationMSEAdapter() {
		if (agregationMSEItemProvider == null) {
			agregationMSEItemProvider = new AgregationMSEItemProvider(this);
		}

		return agregationMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.AssociationMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationMSEItemProvider associationMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.AssociationMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationMSEAdapter() {
		if (associationMSEItemProvider == null) {
			associationMSEItemProvider = new AssociationMSEItemProvider(this);
		}

		return associationMSEItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link abstractPart.ImplementationMSE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationMSEItemProvider implementationMSEItemProvider;

	/**
	 * This creates an adapter for a {@link abstractPart.ImplementationMSE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationMSEAdapter() {
		if (implementationMSEItemProvider == null) {
			implementationMSEItemProvider = new ImplementationMSEItemProvider(this);
		}

		return implementationMSEItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelFactoryAbstractItemProvider != null) modelFactoryAbstractItemProvider.dispose();
		if (packageMSEItemProvider != null) packageMSEItemProvider.dispose();
		if (classDiagramMSEItemProvider != null) classDiagramMSEItemProvider.dispose();
		if (classMSEItemProvider != null) classMSEItemProvider.dispose();
		if (methodMSEItemProvider != null) methodMSEItemProvider.dispose();
		if (attributeMSEItemProvider != null) attributeMSEItemProvider.dispose();
		if (attributeRelationMSEItemProvider != null) attributeRelationMSEItemProvider.dispose();
		if (hashCodeClassMSEItemProvider != null) hashCodeClassMSEItemProvider.dispose();
		if (associationsMSEItemProvider != null) associationsMSEItemProvider.dispose();
		if (relationMSEItemProvider != null) relationMSEItemProvider.dispose();
		if (inheritanceMSEItemProvider != null) inheritanceMSEItemProvider.dispose();
		if (containmentMSEItemProvider != null) containmentMSEItemProvider.dispose();
		if (agregationMSEItemProvider != null) agregationMSEItemProvider.dispose();
		if (associationMSEItemProvider != null) associationMSEItemProvider.dispose();
		if (implementationMSEItemProvider != null) implementationMSEItemProvider.dispose();
	}

}
