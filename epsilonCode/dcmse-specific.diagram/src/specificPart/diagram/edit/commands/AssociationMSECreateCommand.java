/*
 * 
 */
package specificPart.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class AssociationMSECreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	private final specificPart.ClassDiagramMSE container;

	/**
	* @generated
	*/
	public AssociationMSECreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof specificPart.ClassMSE) {
			return false;
		}
		if (target != null && false == target instanceof specificPart.ClassMSE) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return specificPart.diagram.edit.policies.SpecificPartBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateAssociationMSE_4003(getContainer(), getSource(), getTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		specificPart.AssociationMSE newElement = specificPart.SpecificPartFactory.eINSTANCE.createAssociationMSE();
		getContainer().getLstRelations().add(newElement);
		newElement.setSource(getSource());
		newElement.setTarget(getTarget());
		newElement.setMultiplicitySource("*");
		newElement.setRoleSource("lst"+getSource().getName());
		newElement.setMultiplicityTarget("*");
		newElement.setType("association");
		newElement.setRoleTarget("lst"+getTarget().getName());
		newElement.setDocumentation("Esta es la relacion de asociacion que conecta "+getSource()+" con "+getTarget());
		newElement.setNavigabilitySource(true);
		newElement.setNavigabilityTarget(true);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated
	*/
	protected void doConfigure(specificPart.AssociationMSE newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getSource() {
		return (specificPart.ClassMSE) source;
	}

	/**
	* @generated
	*/
	protected specificPart.ClassMSE getTarget() {
		return (specificPart.ClassMSE) target;
	}

	/**
	* @generated
	*/
	public specificPart.ClassDiagramMSE getContainer() {
		return container;
	}

	/**
	* Default approach is to traverse ancestors of the source to find instance of container.
	* Modify with appropriate logic.
	* @generated
	*/
	private static specificPart.ClassDiagramMSE deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				return (specificPart.ClassDiagramMSE) element;
			}
		}
		return null;
	}

}
