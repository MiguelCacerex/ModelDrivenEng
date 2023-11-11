/*
* 
*/
package uidiagrampart.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uidiagrampart.Frame;
import uidiagrampart.GraphicElement;
import uidiagrampart.Group;
import uidiagrampart.ProjectBoard;
import uidiagrampart.TableColumn;
import uidiagrampart.TableView;
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

/**
 * @generated
 */
public class UidiagrampartDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getSemanticChildren(View view) {
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case ProjectBoardEditPart.VISUAL_ID:
			return getProjectBoard_1000SemanticChildren(view);
		case FrameFrameLstGraphicElementCompartmentEditPart.VISUAL_ID:
			return getFrameFrameLstGraphicElementCompartment_7001SemanticChildren(view);
		case GroupGroupLstGraphicElementCompartmentEditPart.VISUAL_ID:
			return getGroupGroupLstGraphicElementCompartment_7002SemanticChildren(view);
		case GroupGroupLstGraphicElementCompartment2EditPart.VISUAL_ID:
			return getGroupGroupLstGraphicElementCompartment_7003SemanticChildren(view);
		case TableViewTableViewLstColumnsCompartmentEditPart.VISUAL_ID:
			return getTableViewTableViewLstColumnsCompartment_7004SemanticChildren(view);
		case TableViewTableViewLstColumnsCompartment2EditPart.VISUAL_ID:
			return getTableViewTableViewLstColumnsCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getProjectBoard_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProjectBoard modelElement = (ProjectBoard) view.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstFrames().iterator(); it.hasNext();) {
			Frame childElement = (Frame) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FrameEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getFrameFrameLstGraphicElementCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Frame modelElement = (Frame) containerView.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstGraphicElement().iterator(); it.hasNext();) {
			GraphicElement childElement = (GraphicElement) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextField2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableView2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getGroupGroupLstGraphicElementCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstGraphicElement().iterator(); it.hasNext();) {
			GraphicElement childElement = (GraphicElement) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextFieldEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableViewEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getGroupGroupLstGraphicElementCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstGraphicElement().iterator(); it.hasNext();) {
			GraphicElement childElement = (GraphicElement) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextFieldEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableViewEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getTableViewTableViewLstColumnsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TableView modelElement = (TableView) containerView.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstColumns().iterator(); it.hasNext();) {
			TableColumn childElement = (TableColumn) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableColumnEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartNodeDescriptor> getTableViewTableViewLstColumnsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TableView modelElement = (TableView) containerView.getElement();
		LinkedList<UidiagrampartNodeDescriptor> result = new LinkedList<UidiagrampartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstColumns().iterator(); it.hasNext();) {
			TableColumn childElement = (TableColumn) it.next();
			int visualID = UidiagrampartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TableColumnEditPart.VISUAL_ID) {
				result.add(new UidiagrampartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartLinkDescriptor> getContainedLinks(View view) {
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case ProjectBoardEditPart.VISUAL_ID:
			return getProjectBoard_1000ContainedLinks(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_2001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003ContainedLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004ContainedLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005ContainedLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3006ContainedLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3007ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3008ContainedLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_3009ContainedLinks(view);
		case TableViewEditPart.VISUAL_ID:
			return getTableView_3010ContainedLinks(view);
		case TableColumnEditPart.VISUAL_ID:
			return getTableColumn_3011ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3012ContainedLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3013ContainedLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3014ContainedLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3015ContainedLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3016ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017ContainedLinks(view);
		case TextField2EditPart.VISUAL_ID:
			return getTextField_3018ContainedLinks(view);
		case TableView2EditPart.VISUAL_ID:
			return getTableView_3019ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartLinkDescriptor> getIncomingLinks(View view) {
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case FrameEditPart.VISUAL_ID:
			return getFrame_2001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003IncomingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004IncomingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005IncomingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3006IncomingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3007IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3008IncomingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_3009IncomingLinks(view);
		case TableViewEditPart.VISUAL_ID:
			return getTableView_3010IncomingLinks(view);
		case TableColumnEditPart.VISUAL_ID:
			return getTableColumn_3011IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3012IncomingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3013IncomingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3014IncomingLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3015IncomingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3016IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017IncomingLinks(view);
		case TextField2EditPart.VISUAL_ID:
			return getTextField_3018IncomingLinks(view);
		case TableView2EditPart.VISUAL_ID:
			return getTableView_3019IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagrampartLinkDescriptor> getOutgoingLinks(View view) {
		switch (UidiagrampartVisualIDRegistry.getVisualID(view)) {
		case FrameEditPart.VISUAL_ID:
			return getFrame_2001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003OutgoingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004OutgoingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005OutgoingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3006OutgoingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3007OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3008OutgoingLinks(view);
		case TextFieldEditPart.VISUAL_ID:
			return getTextField_3009OutgoingLinks(view);
		case TableViewEditPart.VISUAL_ID:
			return getTableView_3010OutgoingLinks(view);
		case TableColumnEditPart.VISUAL_ID:
			return getTableColumn_3011OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3012OutgoingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3013OutgoingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3014OutgoingLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3015OutgoingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3016OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3017OutgoingLinks(view);
		case TextField2EditPart.VISUAL_ID:
			return getTextField_3018OutgoingLinks(view);
		case TableView2EditPart.VISUAL_ID:
			return getTableView_3019OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getProjectBoard_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getFrame_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableColumn_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getFrame_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableColumn_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getFrame_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableColumn_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getButton_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getImage_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getCheckBox_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getSwitch_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getComboBox_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getLabel_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTextField_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagrampartLinkDescriptor> getTableView_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UidiagrampartNodeDescriptor> getSemanticChildren(View view) {
			return UidiagrampartDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagrampartLinkDescriptor> getContainedLinks(View view) {
			return UidiagrampartDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagrampartLinkDescriptor> getIncomingLinks(View view) {
			return UidiagrampartDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagrampartLinkDescriptor> getOutgoingLinks(View view) {
			return UidiagrampartDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
