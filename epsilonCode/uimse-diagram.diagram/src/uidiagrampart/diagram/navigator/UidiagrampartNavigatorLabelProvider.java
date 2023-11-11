/*
* 
*/
package uidiagrampart.diagram.navigator;

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

import uidiagrampart.ProjectBoard;
import uidiagrampart.diagram.edit.parts.Button2EditPart;
import uidiagrampart.diagram.edit.parts.ButtonEditPart;
import uidiagrampart.diagram.edit.parts.ButtonName2EditPart;
import uidiagrampart.diagram.edit.parts.ButtonNameEditPart;
import uidiagrampart.diagram.edit.parts.CheckBox2EditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxEditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagrampart.diagram.edit.parts.ComboBox2EditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxEditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagrampart.diagram.edit.parts.FrameEditPart;
import uidiagrampart.diagram.edit.parts.FrameNameEditPart;
import uidiagrampart.diagram.edit.parts.Group2EditPart;
import uidiagrampart.diagram.edit.parts.GroupEditPart;
import uidiagrampart.diagram.edit.parts.GroupName2EditPart;
import uidiagrampart.diagram.edit.parts.GroupNameEditPart;
import uidiagrampart.diagram.edit.parts.Image2EditPart;
import uidiagrampart.diagram.edit.parts.ImageEditPart;
import uidiagrampart.diagram.edit.parts.Label2EditPart;
import uidiagrampart.diagram.edit.parts.LabelEditPart;
import uidiagrampart.diagram.edit.parts.LabelName2EditPart;
import uidiagrampart.diagram.edit.parts.LabelNameEditPart;
import uidiagrampart.diagram.edit.parts.ProjectBoardEditPart;
import uidiagrampart.diagram.edit.parts.Switch2EditPart;
import uidiagrampart.diagram.edit.parts.SwitchEditPart;
import uidiagrampart.diagram.edit.parts.SwitchName2EditPart;
import uidiagrampart.diagram.edit.parts.SwitchNameEditPart;
import uidiagrampart.diagram.edit.parts.TableColumnEditPart;
import uidiagrampart.diagram.edit.parts.TableColumnNameEditPart;
import uidiagrampart.diagram.edit.parts.TableView2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewEditPart;
import uidiagrampart.diagram.edit.parts.TableViewName2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewNameEditPart;
import uidiagrampart.diagram.edit.parts.TextField2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldEditPart;
import uidiagrampart.diagram.edit.parts.TextFieldName2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldNameEditPart;
import uidiagrampart.diagram.part.UidiagrampartDiagramEditorPlugin;
import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;
import uidiagrampart.diagram.providers.UidiagrampartElementTypes;
import uidiagrampart.diagram.providers.UidiagrampartParserProvider;

/**
 * @generated
 */
public class UidiagrampartNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagrampartDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagrampartDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagrampartNavigatorItem
				&& !isOwnView(((UidiagrampartNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagrampartNavigatorGroup) {
			UidiagrampartNavigatorGroup group = (UidiagrampartNavigatorGroup) element;
			return UidiagrampartDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagrampartNavigatorItem) {
			UidiagrampartNavigatorItem navigatorItem = (UidiagrampartNavigatorItem) element;
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
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case ProjectBoardEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?uidiagrampart?ProjectBoard", //$NON-NLS-1$
					UidiagrampartElementTypes.ProjectBoard_1000);
		case FrameEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?uidiagrampart?Frame", UidiagrampartElementTypes.Frame_2001); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Group", UidiagrampartElementTypes.Group_3001); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Group", UidiagrampartElementTypes.Group_3002); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Button", UidiagrampartElementTypes.Button_3003); //$NON-NLS-1$
		case ImageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Image", UidiagrampartElementTypes.Image_3004); //$NON-NLS-1$
		case CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?CheckBox", UidiagrampartElementTypes.CheckBox_3005); //$NON-NLS-1$
		case SwitchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Switch", UidiagrampartElementTypes.Switch_3006); //$NON-NLS-1$
		case ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?ComboBox", UidiagrampartElementTypes.ComboBox_3007); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Label", UidiagrampartElementTypes.Label_3008); //$NON-NLS-1$
		case TextFieldEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?TextField", UidiagrampartElementTypes.TextField_3009); //$NON-NLS-1$
		case TableViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?TableView", UidiagrampartElementTypes.TableView_3010); //$NON-NLS-1$
		case TableColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?TableColumn", UidiagrampartElementTypes.TableColumn_3011); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Button", UidiagrampartElementTypes.Button_3012); //$NON-NLS-1$
		case Image2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Image", UidiagrampartElementTypes.Image_3013); //$NON-NLS-1$
		case CheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?CheckBox", UidiagrampartElementTypes.CheckBox_3014); //$NON-NLS-1$
		case Switch2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Switch", UidiagrampartElementTypes.Switch_3015); //$NON-NLS-1$
		case ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?ComboBox", UidiagrampartElementTypes.ComboBox_3016); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?Label", UidiagrampartElementTypes.Label_3017); //$NON-NLS-1$
		case TextField2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?TextField", UidiagrampartElementTypes.TextField_3018); //$NON-NLS-1$
		case TableView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagrampart?TableView", UidiagrampartElementTypes.TableView_3019); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagrampartDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagrampartElementTypes.isKnownElementType(elementType)) {
			image = UidiagrampartElementTypes.getImage(elementType);
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
		if (element instanceof UidiagrampartNavigatorGroup) {
			UidiagrampartNavigatorGroup group = (UidiagrampartNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagrampartNavigatorItem) {
			UidiagrampartNavigatorItem navigatorItem = (UidiagrampartNavigatorItem) element;
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
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case ProjectBoardEditPart.VISUAL_ID:
			return getProjectBoard_1000Text(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_2001Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003Text(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004Text(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005Text(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3006Text(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3007Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3008Text(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_3009Text(view);
		case TableViewEditPart.VISUAL_ID:
			return getTableView_3010Text(view);
		case TableColumnEditPart.VISUAL_ID:
			return getTableColumn_3011Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3012Text(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3013Text(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3014Text(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3015Text(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3016Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017Text(view);
		case TextField2EditPart.VISUAL_ID:
			return getTextField_3018Text(view);
		case TableView2EditPart.VISUAL_ID:
			return getTableView_3019Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getProjectBoard_1000Text(View view) {
		ProjectBoard domainModelElement = (ProjectBoard) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFrame_2001Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Frame_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(FrameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3001Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Group_3001,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3003Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Button_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3004Text(View view) {
		uidiagrampart.Image domainModelElement = (uidiagrampart.Image) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3005Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.CheckBox_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(CheckBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3006Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Switch_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(SwitchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3007Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.ComboBox_3007,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(ComboBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3008Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Label_3008,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextField_3009Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.TextField_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(TextFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableView_3010Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.TableView_3010,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(TableViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableColumn_3011Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.TableColumn_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(TableColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3012Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Button_3012,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(ButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3013Text(View view) {
		uidiagrampart.Image domainModelElement = (uidiagrampart.Image) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3014Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.CheckBox_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(CheckBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3015Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Switch_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(SwitchName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3016Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.ComboBox_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(ComboBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3017Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.Label_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(LabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextField_3018Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.TextField_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(TextFieldName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTableView_3019Text(View view) {
		IParser parser = UidiagrampartParserProvider.getParser(UidiagrampartElementTypes.TableView_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagrampartVisualIDRegistry.getType(TableViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagrampartDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
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
		return ProjectBoardEditPart.MODEL_ID.equals(UidiagrampartVisualIDRegistry.getModelID(view));
	}

}
