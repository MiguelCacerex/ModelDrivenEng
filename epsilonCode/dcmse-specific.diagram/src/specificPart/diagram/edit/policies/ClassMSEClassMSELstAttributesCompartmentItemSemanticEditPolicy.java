/*
* 
*/
package specificPart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassMSEClassMSELstAttributesCompartmentItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassMSEClassMSELstAttributesCompartmentItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.AttributeMSECreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
