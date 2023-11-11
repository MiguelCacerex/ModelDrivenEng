/*
* 
*/
package uidiagrampart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagrampart.diagram.edit.commands.TableColumnCreateCommand;
import uidiagrampart.diagram.providers.UidiagrampartElementTypes;

/**
 * @generated
 */
public class TableViewTableViewLstColumnsCompartmentItemSemanticEditPolicy
		extends UidiagrampartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableViewTableViewLstColumnsCompartmentItemSemanticEditPolicy() {
		super(UidiagrampartElementTypes.TableView_3010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagrampartElementTypes.TableColumn_3011 == req.getElementType()) {
			return getGEFWrapper(new TableColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
