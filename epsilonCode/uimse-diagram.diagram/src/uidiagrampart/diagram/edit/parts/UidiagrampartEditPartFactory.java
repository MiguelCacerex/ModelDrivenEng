/*
 * 
 */
package uidiagrampart.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class UidiagrampartEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {

			case ProjectBoardEditPart.VISUAL_ID:
				return new ProjectBoardEditPart(view);

			case FrameEditPart.VISUAL_ID:
				return new FrameEditPart(view);

			case FrameNameEditPart.VISUAL_ID:
				return new FrameNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case ImageEditPart.VISUAL_ID:
				return new ImageEditPart(view);

			case CheckBoxEditPart.VISUAL_ID:
				return new CheckBoxEditPart(view);

			case CheckBoxNameEditPart.VISUAL_ID:
				return new CheckBoxNameEditPart(view);

			case SwitchEditPart.VISUAL_ID:
				return new SwitchEditPart(view);

			case SwitchNameEditPart.VISUAL_ID:
				return new SwitchNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case TextFieldEditPart.VISUAL_ID:
				return new TextFieldEditPart(view);

			case TextFieldNameEditPart.VISUAL_ID:
				return new TextFieldNameEditPart(view);

			case TableViewEditPart.VISUAL_ID:
				return new TableViewEditPart(view);

			case TableViewNameEditPart.VISUAL_ID:
				return new TableViewNameEditPart(view);

			case TableColumnEditPart.VISUAL_ID:
				return new TableColumnEditPart(view);

			case TableColumnNameEditPart.VISUAL_ID:
				return new TableColumnNameEditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonName2EditPart.VISUAL_ID:
				return new ButtonName2EditPart(view);

			case Image2EditPart.VISUAL_ID:
				return new Image2EditPart(view);

			case CheckBox2EditPart.VISUAL_ID:
				return new CheckBox2EditPart(view);

			case CheckBoxName2EditPart.VISUAL_ID:
				return new CheckBoxName2EditPart(view);

			case Switch2EditPart.VISUAL_ID:
				return new Switch2EditPart(view);

			case SwitchName2EditPart.VISUAL_ID:
				return new SwitchName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelName2EditPart.VISUAL_ID:
				return new LabelName2EditPart(view);

			case TextField2EditPart.VISUAL_ID:
				return new TextField2EditPart(view);

			case TextFieldName2EditPart.VISUAL_ID:
				return new TextFieldName2EditPart(view);

			case TableView2EditPart.VISUAL_ID:
				return new TableView2EditPart(view);

			case TableViewName2EditPart.VISUAL_ID:
				return new TableViewName2EditPart(view);

			case FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID:
				return new FrameFrameLstGraphicElementCompartmentEditPart(view);

			case GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID:
				return new GroupGroupLstGraphicElementCompartmentEditPart(view);

			case GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID:
				return new GroupGroupLstGraphicElementCompartment2EditPart(view);

			case TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID:
				return new TableViewTableViewLstColumnsCompartmentEditPart(view);

			case TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID:
				return new TableViewTableViewLstColumnsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
