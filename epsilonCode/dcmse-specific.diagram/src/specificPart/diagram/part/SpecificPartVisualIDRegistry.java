/*
* 
*/
package specificPart.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SpecificPartVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dcmse-specific.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID.equals(view.getType())) {
				return specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getClassDiagramMSE().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((specificPart.ClassDiagramMSE) domainElement)) {
			return specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getModelID(containerView);
		if (!specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID.equals(containerModelID)
				&& !"specificPart".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			if (specificPart.SpecificPartPackage.eINSTANCE.getClassMSE().isSuperTypeOf(domainElement.eClass())) {
				return specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID;
			}
			if (specificPart.SpecificPartPackage.eINSTANCE.getPackageMSE().isSuperTypeOf(domainElement.eClass())) {
				return specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID;
			}
			break;
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
			if (specificPart.SpecificPartPackage.eINSTANCE.getAttributeMSE().isSuperTypeOf(domainElement.eClass())) {
				return specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID;
			}
			break;
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
			if (specificPart.SpecificPartPackage.eINSTANCE.getMethodMSE().isSuperTypeOf(domainElement.eClass())) {
				return specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getModelID(containerView);
		if (!specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID.equals(containerModelID)
				&& !"specificPart".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.ClassMSENameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.PackageMSENameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.AttributeMSENameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.MethodMSENameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.ContainmentMSERoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ContainmentMSEMultiplicitySourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ContainmentMSERoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ContainmentMSEMultiplicityTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.AgregationMSERoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AgregationMSEMultiplicitySourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AgregationMSERoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AgregationMSEMultiplicityTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.AssociationMSERoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AssociationMSEMultiplicitySourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AssociationMSERoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.AssociationMSEMultiplicityTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			if (specificPart.diagram.edit.parts.ImplementationMSERoleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ImplementationMSEMultiplicitySourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ImplementationMSERoleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (specificPart.diagram.edit.parts.ImplementationMSEMultiplicityTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getContainmentMSE().isSuperTypeOf(domainElement.eClass())) {
			return specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getAgregationMSE().isSuperTypeOf(domainElement.eClass())) {
			return specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getAssociationMSE().isSuperTypeOf(domainElement.eClass())) {
			return specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getImplementationMSE().isSuperTypeOf(domainElement.eClass())) {
			return specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID;
		}
		if (specificPart.SpecificPartPackage.eINSTANCE.getInheritanceMSE().isSuperTypeOf(domainElement.eClass())) {
			return specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(specificPart.ClassDiagramMSE element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return false;
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return specificPart.diagram.part.SpecificPartVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
