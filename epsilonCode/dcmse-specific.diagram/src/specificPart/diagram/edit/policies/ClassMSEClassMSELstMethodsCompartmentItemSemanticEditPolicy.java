/*
* 
*/
package specificPart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassMSEClassMSELstMethodsCompartmentItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassMSEClassMSELstMethodsCompartmentItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.MethodMSECreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
