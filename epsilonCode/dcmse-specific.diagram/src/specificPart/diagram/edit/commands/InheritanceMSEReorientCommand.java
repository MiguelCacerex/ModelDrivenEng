/*
 * 
 */
package specificPart.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class InheritanceMSEReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public InheritanceMSEReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof specificPart.InheritanceMSE) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof specificPart.ClassMSE && newEnd instanceof specificPart.ClassMSE)) {
			return false;
		}
		specificPart.ClassMSE target = getLink().getParent();
		if (!(getLink().eContainer() instanceof specificPart.ClassDiagramMSE)) {
			return false;
		}
		specificPart.ClassDiagramMSE container = (specificPart.ClassDiagramMSE) getLink().eContainer();
		return specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInheritanceMSE_4005(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof specificPart.ClassMSE && newEnd instanceof specificPart.ClassMSE)) {
			return false;
		}
		specificPart.ClassMSE source = getLink().getChild();
		if (!(getLink().eContainer() instanceof specificPart.ClassDiagramMSE)) {
			return false;
		}
		specificPart.ClassDiagramMSE container = (specificPart.ClassDiagramMSE) getLink().eContainer();
		return specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInheritanceMSE_4005(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setChild(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setParent(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected specificPart.InheritanceMSE getLink() {
		return (specificPart.InheritanceMSE) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getOldSource() {
		return (specificPart.ClassMSE) oldEnd;
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getNewSource() {
		return (specificPart.ClassMSE) newEnd;
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getOldTarget() {
		return (specificPart.ClassMSE) oldEnd;
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getNewTarget() {
		return (specificPart.ClassMSE) newEnd;
	}
}
