/*
* 
*/
package uidiagrampart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagrampart.diagram.edit.commands.ButtonCreateCommand;
import uidiagrampart.diagram.edit.commands.CheckBoxCreateCommand;
import uidiagrampart.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagrampart.diagram.edit.commands.Group2CreateCommand;
import uidiagrampart.diagram.edit.commands.ImageCreateCommand;
import uidiagrampart.diagram.edit.commands.LabelCreateCommand;
import uidiagrampart.diagram.edit.commands.SwitchCreateCommand;
import uidiagrampart.diagram.edit.commands.TableViewCreateCommand;
import uidiagrampart.diagram.edit.commands.TextFieldCreateCommand;
import uidiagrampart.diagram.providers.UidiagrampartElementTypes;

/**
 * @generated
 */
public class GroupGroupLstGraphicElementCompartmentItemSemanticEditPolicy
		extends UidiagrampartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstGraphicElementCompartmentItemSemanticEditPolicy() {
		super(UidiagrampartElementTypes.Group_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagrampartElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagrampartElementTypes.Image_3004 == req.getElementType()) {
			return getGEFWrapper(new ImageCreateCommand(req));
		}
		if (UidiagrampartElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (UidiagrampartElementTypes.Switch_3006 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		if (UidiagrampartElementTypes.ComboBox_3007 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagrampartElementTypes.Label_3008 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagrampartElementTypes.TextField_3009 == req.getElementType()) {
			return getGEFWrapper(new TextFieldCreateCommand(req));
		}
		if (UidiagrampartElementTypes.TableView_3010 == req.getElementType()) {
			return getGEFWrapper(new TableViewCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
