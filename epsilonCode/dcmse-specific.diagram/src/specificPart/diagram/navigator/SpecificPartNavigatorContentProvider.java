/*
* 
*/
package specificPart.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class SpecificPartNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SpecificPartNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<specificPart.diagram.navigator.SpecificPartNavigatorItem> result = new ArrayList<specificPart.diagram.navigator.SpecificPartNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof specificPart.diagram.navigator.SpecificPartNavigatorGroup) {
			specificPart.diagram.navigator.SpecificPartNavigatorGroup group = (specificPart.diagram.navigator.SpecificPartNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof specificPart.diagram.navigator.SpecificPartNavigatorItem) {
			specificPart.diagram.navigator.SpecificPartNavigatorItem navigatorItem = (specificPart.diagram.navigator.SpecificPartNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {

		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup links = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ClassDiagramMSE_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Node sv = (Node) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup incominglinks = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ClassMSE_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup outgoinglinks = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ClassMSE_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry.getType(
							specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getType(specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry.getType(
							specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getType(specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup target = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ContainmentMSE_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup source = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ContainmentMSE_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup target = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_AgregationMSE_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup source = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_AgregationMSE_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup target = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_AssociationMSE_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup source = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_AssociationMSE_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup target = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ImplementationMSE_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup source = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_ImplementationMSE_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID: {
			LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem> result = new LinkedList<specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			specificPart.diagram.navigator.SpecificPartNavigatorGroup target = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_InheritanceMSE_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			specificPart.diagram.navigator.SpecificPartNavigatorGroup source = new specificPart.diagram.navigator.SpecificPartNavigatorGroup(
					specificPart.diagram.part.Messages.NavigatorGroupName_InheritanceMSE_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					specificPart.diagram.part.SpecificPartVisualIDRegistry
							.getType(specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID
				.equals(specificPart.diagram.part.SpecificPartVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<specificPart.diagram.navigator.SpecificPartNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<specificPart.diagram.navigator.SpecificPartNavigatorItem> result = new ArrayList<specificPart.diagram.navigator.SpecificPartNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new specificPart.diagram.navigator.SpecificPartNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<specificPart.diagram.navigator.SpecificPartNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem) {
			specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem abstractNavigatorItem = (specificPart.diagram.navigator.SpecificPartAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
