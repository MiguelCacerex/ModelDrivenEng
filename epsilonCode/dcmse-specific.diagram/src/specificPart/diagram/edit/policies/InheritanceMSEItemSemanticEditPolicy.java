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
public class InheritanceMSEItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InheritanceMSEItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
