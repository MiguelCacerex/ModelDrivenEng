/*
 * 
 */
package specificPart.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class SpecificPartEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {

			case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ClassDiagramMSEEditPart(view);

			case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ClassMSEEditPart(view);

			case specificPart.diagram.edit.parts.ClassMSENameEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ClassMSENameEditPart(view);

			case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.PackageMSEEditPart(view);

			case specificPart.diagram.edit.parts.PackageMSENameEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.PackageMSENameEditPart(view);

			case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AttributeMSEEditPart(view);

			case specificPart.diagram.edit.parts.AttributeMSENameTypeEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AttributeMSENameTypeEditPart(view);

			case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.MethodMSEEditPart(view);

			case specificPart.diagram.edit.parts.MethodMSENameEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.MethodMSENameEditPart(view);

			case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart(view);

			case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart(view);

			case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ContainmentMSEEditPart(view);

			case specificPart.diagram.edit.parts.ContainmentMSERoleSourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ContainmentMSERoleSourceEditPart(view);

			case specificPart.diagram.edit.parts.ContainmentMSEMultiplicitySourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ContainmentMSEMultiplicitySourceEditPart(view);

			case specificPart.diagram.edit.parts.ContainmentMSERoleTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ContainmentMSERoleTargetEditPart(view);

			case specificPart.diagram.edit.parts.ContainmentMSEMultiplicityTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ContainmentMSEMultiplicityTargetEditPart(view);

			case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AgregationMSEEditPart(view);

			case specificPart.diagram.edit.parts.AgregationMSERoleSourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AgregationMSERoleSourceEditPart(view);

			case specificPart.diagram.edit.parts.AgregationMSEMultiplicitySourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AgregationMSEMultiplicitySourceEditPart(view);

			case specificPart.diagram.edit.parts.AgregationMSERoleTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AgregationMSERoleTargetEditPart(view);

			case specificPart.diagram.edit.parts.AgregationMSEMultiplicityTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AgregationMSEMultiplicityTargetEditPart(view);

			case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AssociationMSEEditPart(view);

			case specificPart.diagram.edit.parts.AssociationMSERoleSourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AssociationMSERoleSourceEditPart(view);

			case specificPart.diagram.edit.parts.AssociationMSEMultiplicitySourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AssociationMSEMultiplicitySourceEditPart(view);

			case specificPart.diagram.edit.parts.AssociationMSERoleTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AssociationMSERoleTargetEditPart(view);

			case specificPart.diagram.edit.parts.AssociationMSEMultiplicityTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.AssociationMSEMultiplicityTargetEditPart(view);

			case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ImplementationMSEEditPart(view);

			case specificPart.diagram.edit.parts.ImplementationMSERoleSourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ImplementationMSERoleSourceEditPart(view);

			case specificPart.diagram.edit.parts.ImplementationMSEMultiplicitySourceEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ImplementationMSEMultiplicitySourceEditPart(view);

			case specificPart.diagram.edit.parts.ImplementationMSERoleTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ImplementationMSERoleTargetEditPart(view);

			case specificPart.diagram.edit.parts.ImplementationMSEMultiplicityTargetEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.ImplementationMSEMultiplicityTargetEditPart(view);

			case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
				return new specificPart.diagram.edit.parts.InheritanceMSEEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
