/*
* 
*/
package uidiagrampart.diagram.navigator;

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

import uidiagrampart.diagram.edit.parts.Button2EditPart;
import uidiagrampart.diagram.edit.parts.ButtonEditPart;
import uidiagrampart.diagram.edit.parts.CheckBox2EditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxEditPart;
import uidiagrampart.diagram.edit.parts.ComboBox2EditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxEditPart;
import uidiagrampart.diagram.edit.parts.FrameEditPart;
import uidiagrampart.diagram.edit.parts.FrameFrameLstGraphicElementCompartmentEditPart;
import uidiagrampart.diagram.edit.parts.Group2EditPart;
import uidiagrampart.diagram.edit.parts.GroupEditPart;
import uidiagrampart.diagram.edit.parts.GroupGroupLstGraphicElementCompartment2EditPart;
import uidiagrampart.diagram.edit.parts.GroupGroupLstGraphicElementCompartmentEditPart;
import uidiagrampart.diagram.edit.parts.Image2EditPart;
import uidiagrampart.diagram.edit.parts.ImageEditPart;
import uidiagrampart.diagram.edit.parts.Label2EditPart;
import uidiagrampart.diagram.edit.parts.LabelEditPart;
import uidiagrampart.diagram.edit.parts.ProjectBoardEditPart;
import uidiagrampart.diagram.edit.parts.Switch2EditPart;
import uidiagrampart.diagram.edit.parts.SwitchEditPart;
import uidiagrampart.diagram.edit.parts.TableColumnEditPart;
import uidiagrampart.diagram.edit.parts.TableView2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewEditPart;
import uidiagrampart.diagram.edit.parts.TableViewTableViewLstColumnsCompartment2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewTableViewLstColumnsCompartmentEditPart;
import uidiagrampart.diagram.edit.parts.TextField2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldEditPart;
import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class UidiagrampartNavigatorContentProvider implements ICommonContentProvider {

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
	public UidiagrampartNavigatorContentProvider() {
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
			ArrayList<UidiagrampartNavigatorItem> result = new ArrayList<UidiagrampartNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, ProjectBoardEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof UidiagrampartNavigatorGroup) {
			UidiagrampartNavigatorGroup group = (UidiagrampartNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UidiagrampartNavigatorItem) {
			UidiagrampartNavigatorItem navigatorItem = (UidiagrampartNavigatorItem) parentElement;
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
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {

		case ProjectBoardEditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FrameEditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(CheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TextField2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TableView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupEditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TextFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TableViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Group2EditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TextFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TableViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TableViewEditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TableColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TableView2EditPart.VISUAL_ID: {
			LinkedList<UidiagrampartAbstractNavigatorItem> result = new LinkedList<UidiagrampartAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagrampartVisualIDRegistry.getType(TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagrampartVisualIDRegistry.getType(TableColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
		return ProjectBoardEditPart.MODEL_ID.equals(UidiagrampartVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<UidiagrampartNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<UidiagrampartNavigatorItem> result = new ArrayList<UidiagrampartNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new UidiagrampartNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<UidiagrampartNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
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
		if (element instanceof UidiagrampartAbstractNavigatorItem) {
			UidiagrampartAbstractNavigatorItem abstractNavigatorItem = (UidiagrampartAbstractNavigatorItem) element;
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
