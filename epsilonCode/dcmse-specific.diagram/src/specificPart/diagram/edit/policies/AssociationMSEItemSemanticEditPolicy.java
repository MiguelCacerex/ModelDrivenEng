/*
* 
*/
package specificPart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AssociationMSEItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssociationMSEItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
