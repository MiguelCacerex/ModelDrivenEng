/*
* 
*/
package specificPart.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class SpecificPartNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof specificPart.diagram.navigator.SpecificPartNavigatorItem
				&& !isOwnView(((specificPart.diagram.navigator.SpecificPartNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof specificPart.diagram.navigator.SpecificPartNavigatorGroup) {
			specificPart.diagram.navigator.SpecificPartNavigatorGroup group = (specificPart.diagram.navigator.SpecificPartNavigatorGroup) element;
			return specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof specificPart.diagram.navigator.SpecificPartNavigatorItem) {
			specificPart.diagram.navigator.SpecificPartNavigatorItem navigatorItem = (specificPart.diagram.navigator.SpecificPartNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?specificPart?ClassDiagramMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.ClassDiagramMSE_1000);
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?specificPart?ClassMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?specificPart?PackageMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.PackageMSE_2002);
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Node?specificPart?AttributeMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001);
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Node?specificPart?MethodMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002);
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Link?specificPart?ContainmentMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001);
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Link?specificPart?AgregationMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002);
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Link?specificPart?AssociationMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003);
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Link?specificPart?ImplementationMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004);
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getImage("Navigator?Link?specificPart?InheritanceMSE", //$NON-NLS-1$
					specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& specificPart.diagram.providers.SpecificPartElementTypes.isKnownElementType(elementType)) {
			image = specificPart.diagram.providers.SpecificPartElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof specificPart.diagram.navigator.SpecificPartNavigatorGroup) {
			specificPart.diagram.navigator.SpecificPartNavigatorGroup group = (specificPart.diagram.navigator.SpecificPartNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof specificPart.diagram.navigator.SpecificPartNavigatorItem) {
			specificPart.diagram.navigator.SpecificPartNavigatorItem navigatorItem = (specificPart.diagram.navigator.SpecificPartNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return getClassDiagramMSE_1000Text(view);
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return getClassMSE_2001Text(view);
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return getPackageMSE_2002Text(view);
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return getAttributeMSE_3001Text(view);
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return getMethodMSE_3002Text(view);
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getContainmentMSE_4001Text(view);
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getAgregationMSE_4002Text(view);
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getAssociationMSE_4003Text(view);
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getImplementationMSE_4004Text(view);
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getInheritanceMSE_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getClassDiagramMSE_1000Text(View view) {
		specificPart.ClassDiagramMSE domainModelElement = (specificPart.ClassDiagramMSE) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassMSE_2001Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.ClassMSENameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageMSE_2002Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.PackageMSE_2002,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.PackageMSENameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeMSE_3001Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.AttributeMSENameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethodMSE_3002Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.MethodMSENameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainmentMSE_4001Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.ContainmentMSERoleSourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgregationMSE_4002Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.AgregationMSERoleSourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationMSE_4003Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.AssociationMSERoleSourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImplementationMSE_4004Text(View view) {
		IParser parser = specificPart.diagram.providers.SpecificPartParserProvider.getParser(
				specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004,
				view.getElement() != null ? view.getElement() : view,
				specificPart.diagram.part.SpecificPartVisualIDRegistry
						.getType(specificPart.diagram.edit.parts.ImplementationMSERoleSourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInheritanceMSE_4005Text(View view) {
		specificPart.InheritanceMSE domainModelElement = (specificPart.InheritanceMSE) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getType();
		} else {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID
				.equals(specificPart.diagram.part.SpecificPartVisualIDRegistry.getModelID(view));
	}

}
