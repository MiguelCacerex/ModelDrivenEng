/*
* 
*/
package uidiagrampart.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagrampart.ProjectBoard;
import uidiagrampart.UidiagrampartPackage;
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
import uidiagrampart.diagram.edit.parts.FrameFrameLstGraphicElementCompartmentEditPart;
import uidiagrampart.diagram.edit.parts.FrameNameEditPart;
import uidiagrampart.diagram.edit.parts.Group2EditPart;
import uidiagrampart.diagram.edit.parts.GroupEditPart;
import uidiagrampart.diagram.edit.parts.GroupGroupLstGraphicElementCompartment2EditPart;
import uidiagrampart.diagram.edit.parts.GroupGroupLstGraphicElementCompartmentEditPart;
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
import uidiagrampart.diagram.edit.parts.TableViewTableViewLstColumnsCompartment2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewTableViewLstColumnsCompartmentEditPart;
import uidiagrampart.diagram.edit.parts.TextField2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldEditPart;
import uidiagrampart.diagram.edit.parts.TextFieldName2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagrampartVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uimse-diagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProjectBoardEditPart.MODEL_ID.equals(view.getType())) {
				return ProjectBoardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagrampartDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagrampartPackage.eINSTANCE.getProjectBoard().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ProjectBoard) domainElement)) {
			return ProjectBoardEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getModelID(containerView);
		if (!ProjectBoardEditPart.MODEL_ID.equals(containerModelID) && !"uidiagrampart".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ProjectBoardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectBoardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProjectBoardEditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getFrame().isSuperTypeOf(domainElement.eClass())) {
				return FrameEditPart.VISUAL_ID;
			}
			break;
		case FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTextField().isSuperTypeOf(domainElement.eClass())) {
				return TextField2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTableView().isSuperTypeOf(domainElement.eClass())) {
				return TableView2EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTextField().isSuperTypeOf(domainElement.eClass())) {
				return TextFieldEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTableView().isSuperTypeOf(domainElement.eClass())) {
				return TableViewEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTextField().isSuperTypeOf(domainElement.eClass())) {
				return TextFieldEditPart.VISUAL_ID;
			}
			if (UidiagrampartPackage.eINSTANCE.getTableView().isSuperTypeOf(domainElement.eClass())) {
				return TableViewEditPart.VISUAL_ID;
			}
			break;
		case TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getTableColumn().isSuperTypeOf(domainElement.eClass())) {
				return TableColumnEditPart.VISUAL_ID;
			}
			break;
		case TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID:
			if (UidiagrampartPackage.eINSTANCE.getTableColumn().isSuperTypeOf(domainElement.eClass())) {
				return TableColumnEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getModelID(containerView);
		if (!ProjectBoardEditPart.MODEL_ID.equals(containerModelID) && !"uidiagrampart".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ProjectBoardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectBoardEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProjectBoardEditPart.VISUAL_ID:
			if (FrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FrameEditPart.VISUAL_ID:
			if (FrameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBoxEditPart.VISUAL_ID:
			if (CheckBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchEditPart.VISUAL_ID:
			if (SwitchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBoxEditPart.VISUAL_ID:
			if (ComboBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextFieldEditPart.VISUAL_ID:
			if (TextFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableViewEditPart.VISUAL_ID:
			if (TableViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableColumnEditPart.VISUAL_ID:
			if (TableColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBox2EditPart.VISUAL_ID:
			if (CheckBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Switch2EditPart.VISUAL_ID:
			if (SwitchName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox2EditPart.VISUAL_ID:
			if (ComboBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextField2EditPart.VISUAL_ID:
			if (TextFieldName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableView2EditPart.VISUAL_ID:
			if (TableViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID:
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextField2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID:
			if (TableColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID:
			if (TableColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ProjectBoard element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID:
		case GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID:
		case GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID:
		case TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID:
		case TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProjectBoardEditPart.VISUAL_ID:
			return false;
		case ButtonEditPart.VISUAL_ID:
		case ImageEditPart.VISUAL_ID:
		case CheckBoxEditPart.VISUAL_ID:
		case SwitchEditPart.VISUAL_ID:
		case ComboBoxEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case TextFieldEditPart.VISUAL_ID:
		case TableColumnEditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case Image2EditPart.VISUAL_ID:
		case CheckBox2EditPart.VISUAL_ID:
		case Switch2EditPart.VISUAL_ID:
		case ComboBox2EditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case TextField2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
