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
public class ImplementationMSEItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ImplementationMSEItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
