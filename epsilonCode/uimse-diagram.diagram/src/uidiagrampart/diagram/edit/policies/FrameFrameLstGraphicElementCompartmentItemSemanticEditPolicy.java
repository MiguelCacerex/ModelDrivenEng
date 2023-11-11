/*
* 
*/
package uidiagrampart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagrampart.diagram.edit.commands.Button2CreateCommand;
import uidiagrampart.diagram.edit.commands.CheckBox2CreateCommand;
import uidiagrampart.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagrampart.diagram.edit.commands.GroupCreateCommand;
import uidiagrampart.diagram.edit.commands.Image2CreateCommand;
import uidiagrampart.diagram.edit.commands.Label2CreateCommand;
import uidiagrampart.diagram.edit.commands.Switch2CreateCommand;
import uidiagrampart.diagram.edit.commands.TableView2CreateCommand;
import uidiagrampart.diagram.edit.commands.TextField2CreateCommand;
import uidiagrampart.diagram.providers.UidiagrampartElementTypes;

/**
 * @generated
 */
public class FrameFrameLstGraphicElementCompartmentItemSemanticEditPolicy
		extends UidiagrampartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FrameFrameLstGraphicElementCompartmentItemSemanticEditPolicy() {
		super(UidiagrampartElementTypes.Frame_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagrampartElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (UidiagrampartElementTypes.Button_3012 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.Image_3013 == req.getElementType()) {
			return getGEFWrapper(new Image2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.CheckBox_3014 == req.getElementType()) {
			return getGEFWrapper(new CheckBox2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.Switch_3015 == req.getElementType()) {
			return getGEFWrapper(new Switch2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.ComboBox_3016 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.Label_3017 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.TextField_3018 == req.getElementType()) {
			return getGEFWrapper(new TextField2CreateCommand(req));
		}
		if (UidiagrampartElementTypes.TableView_3019 == req.getElementType()) {
			return getGEFWrapper(new TableView2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
