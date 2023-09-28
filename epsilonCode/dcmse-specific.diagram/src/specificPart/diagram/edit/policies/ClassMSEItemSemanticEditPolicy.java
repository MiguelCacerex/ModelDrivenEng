/*
* 
*/
package specificPart.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassMSEItemSemanticEditPolicy
		extends specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassMSEItemSemanticEditPolicy() {
		super(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(incomingLink) == specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(incomingLink) == specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(incomingLink) == specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(incomingLink) == specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(incomingLink) == specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(outgoingLink) == specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(outgoingLink) == specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(outgoingLink) == specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(outgoingLink) == specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getVisualID(outgoingLink) == specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(node)) {
			case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(cnode)) {
					case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(cnode)) {
					case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.ContainmentMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.AgregationMSECreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.AssociationMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.ImplementationMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.InheritanceMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.ContainmentMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.AgregationMSECreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.AssociationMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.ImplementationMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005 == req.getElementType()) {
			return getGEFWrapper(new specificPart.diagram.edit.commands.InheritanceMSECreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getGEFWrapper(new specificPart.diagram.edit.commands.ContainmentMSEReorientCommand(req));
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getGEFWrapper(new specificPart.diagram.edit.commands.AgregationMSEReorientCommand(req));
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getGEFWrapper(new specificPart.diagram.edit.commands.AssociationMSEReorientCommand(req));
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getGEFWrapper(new specificPart.diagram.edit.commands.ImplementationMSEReorientCommand(req));
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getGEFWrapper(new specificPart.diagram.edit.commands.InheritanceMSEReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
