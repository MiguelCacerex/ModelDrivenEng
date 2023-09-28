/*
* 
*/
package specificPart.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class SpecificPartDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartNodeDescriptor> getSemanticChildren(View view) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return getClassDiagramMSE_1000SemanticChildren(view);
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstAttributesCompartmentEditPart.VISUAL_ID:
			return getClassMSEClassMSELstAttributesCompartment_7001SemanticChildren(view);
		case specificPart.diagram.edit.parts.ClassMSEClassMSELstMethodsCompartmentEditPart.VISUAL_ID:
			return getClassMSEClassMSELstMethodsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartNodeDescriptor> getClassDiagramMSE_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		specificPart.ClassDiagramMSE modelElement = (specificPart.ClassDiagramMSE) view.getElement();
		LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstClass().iterator(); it.hasNext();) {
			specificPart.ClassMSE childElement = (specificPart.ClassMSE) it.next();
			int visualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID) {
				result.add(new specificPart.diagram.part.SpecificPartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLstPackages().iterator(); it.hasNext();) {
			specificPart.PackageMSE childElement = (specificPart.PackageMSE) it.next();
			int visualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID) {
				result.add(new specificPart.diagram.part.SpecificPartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartNodeDescriptor> getClassMSEClassMSELstAttributesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		specificPart.ClassMSE modelElement = (specificPart.ClassMSE) containerView.getElement();
		LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstAttributes().iterator(); it.hasNext();) {
			specificPart.AttributeMSE childElement = (specificPart.AttributeMSE) it.next();
			int visualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID) {
				result.add(new specificPart.diagram.part.SpecificPartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartNodeDescriptor> getClassMSEClassMSELstMethodsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		specificPart.ClassMSE modelElement = (specificPart.ClassMSE) containerView.getElement();
		LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMethods().iterator(); it.hasNext();) {
			specificPart.MethodMSE childElement = (specificPart.MethodMSE) it.next();
			int visualID = specificPart.diagram.part.SpecificPartVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID) {
				result.add(new specificPart.diagram.part.SpecificPartNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedLinks(View view) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return getClassDiagramMSE_1000ContainedLinks(view);
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return getClassMSE_2001ContainedLinks(view);
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return getPackageMSE_2002ContainedLinks(view);
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return getAttributeMSE_3001ContainedLinks(view);
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return getMethodMSE_3002ContainedLinks(view);
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getContainmentMSE_4001ContainedLinks(view);
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getAgregationMSE_4002ContainedLinks(view);
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getAssociationMSE_4003ContainedLinks(view);
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getImplementationMSE_4004ContainedLinks(view);
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getInheritanceMSE_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingLinks(View view) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return getClassMSE_2001IncomingLinks(view);
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return getPackageMSE_2002IncomingLinks(view);
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return getAttributeMSE_3001IncomingLinks(view);
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return getMethodMSE_3002IncomingLinks(view);
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getContainmentMSE_4001IncomingLinks(view);
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getAgregationMSE_4002IncomingLinks(view);
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getAssociationMSE_4003IncomingLinks(view);
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getImplementationMSE_4004IncomingLinks(view);
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getInheritanceMSE_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingLinks(View view) {
		switch (specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view)) {
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return getClassMSE_2001OutgoingLinks(view);
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return getPackageMSE_2002OutgoingLinks(view);
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return getAttributeMSE_3001OutgoingLinks(view);
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return getMethodMSE_3002OutgoingLinks(view);
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return getContainmentMSE_4001OutgoingLinks(view);
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return getAgregationMSE_4002OutgoingLinks(view);
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return getAssociationMSE_4003OutgoingLinks(view);
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return getImplementationMSE_4004OutgoingLinks(view);
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return getInheritanceMSE_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getClassDiagramMSE_1000ContainedLinks(
			View view) {
		specificPart.ClassDiagramMSE modelElement = (specificPart.ClassDiagramMSE) view.getElement();
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ContainmentMSE_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AgregationMSE_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationMSE_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplementationMSE_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InheritanceMSE_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getClassMSE_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getPackageMSE_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAttributeMSE_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getMethodMSE_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainmentMSE_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAgregationMSE_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAssociationMSE_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getImplementationMSE_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getInheritanceMSE_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getClassMSE_2001IncomingLinks(View view) {
		specificPart.ClassMSE modelElement = (specificPart.ClassMSE) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentMSE_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AgregationMSE_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationMSE_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplementationMSE_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InheritanceMSE_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getPackageMSE_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAttributeMSE_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getMethodMSE_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainmentMSE_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAgregationMSE_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAssociationMSE_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getImplementationMSE_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getInheritanceMSE_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getClassMSE_2001OutgoingLinks(View view) {
		specificPart.ClassMSE modelElement = (specificPart.ClassMSE) view.getElement();
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ContainmentMSE_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AgregationMSE_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssociationMSE_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplementationMSE_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InheritanceMSE_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getPackageMSE_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAttributeMSE_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getMethodMSE_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainmentMSE_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAgregationMSE_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getAssociationMSE_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getImplementationMSE_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<specificPart.diagram.part.SpecificPartLinkDescriptor> getInheritanceMSE_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedTypeModelFacetLinks_ContainmentMSE_4001(
			specificPart.ClassDiagramMSE container) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.ContainmentMSE) {
				continue;
			}
			specificPart.ContainmentMSE link = (specificPart.ContainmentMSE) linkObject;
			if (specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001,
					specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedTypeModelFacetLinks_AgregationMSE_4002(
			specificPart.ClassDiagramMSE container) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.AgregationMSE) {
				continue;
			}
			specificPart.AgregationMSE link = (specificPart.AgregationMSE) linkObject;
			if (specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002,
					specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedTypeModelFacetLinks_AssociationMSE_4003(
			specificPart.ClassDiagramMSE container) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.AssociationMSE) {
				continue;
			}
			specificPart.AssociationMSE link = (specificPart.AssociationMSE) linkObject;
			if (specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003,
					specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedTypeModelFacetLinks_ImplementationMSE_4004(
			specificPart.ClassDiagramMSE container) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.ImplementationMSE) {
				continue;
			}
			specificPart.ImplementationMSE link = (specificPart.ImplementationMSE) linkObject;
			if (specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004,
					specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedTypeModelFacetLinks_InheritanceMSE_4005(
			specificPart.ClassDiagramMSE container) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstInheritances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.InheritanceMSE) {
				continue;
			}
			specificPart.InheritanceMSE link = (specificPart.InheritanceMSE) linkObject;
			if (specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getParent();
			specificPart.ClassMSE src = link.getChild();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005,
					specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingTypeModelFacetLinks_ContainmentMSE_4001(
			specificPart.ClassMSE target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_Target()
					|| false == setting.getEObject() instanceof specificPart.ContainmentMSE) {
				continue;
			}
			specificPart.ContainmentMSE link = (specificPart.ContainmentMSE) setting.getEObject();
			if (specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, target, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001,
					specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingTypeModelFacetLinks_AgregationMSE_4002(
			specificPart.ClassMSE target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_Target()
					|| false == setting.getEObject() instanceof specificPart.AgregationMSE) {
				continue;
			}
			specificPart.AgregationMSE link = (specificPart.AgregationMSE) setting.getEObject();
			if (specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, target, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002,
					specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationMSE_4003(
			specificPart.ClassMSE target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_Target()
					|| false == setting.getEObject() instanceof specificPart.AssociationMSE) {
				continue;
			}
			specificPart.AssociationMSE link = (specificPart.AssociationMSE) setting.getEObject();
			if (specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, target, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003,
					specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingTypeModelFacetLinks_ImplementationMSE_4004(
			specificPart.ClassMSE target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_Target()
					|| false == setting.getEObject() instanceof specificPart.ImplementationMSE) {
				continue;
			}
			specificPart.ImplementationMSE link = (specificPart.ImplementationMSE) setting.getEObject();
			if (specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE src = link.getSource();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, target, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004,
					specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingTypeModelFacetLinks_InheritanceMSE_4005(
			specificPart.ClassMSE target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != specificPart.SpecificPartPackage.eINSTANCE.getInheritanceMSE_Parent()
					|| false == setting.getEObject() instanceof specificPart.InheritanceMSE) {
				continue;
			}
			specificPart.InheritanceMSE link = (specificPart.InheritanceMSE) setting.getEObject();
			if (specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE src = link.getChild();
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, target, link,
					specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005,
					specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainmentMSE_4001(
			specificPart.ClassMSE source) {
		specificPart.ClassDiagramMSE container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				container = (specificPart.ClassDiagramMSE) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.ContainmentMSE) {
				continue;
			}
			specificPart.ContainmentMSE link = (specificPart.ContainmentMSE) linkObject;
			if (specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001,
					specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingTypeModelFacetLinks_AgregationMSE_4002(
			specificPart.ClassMSE source) {
		specificPart.ClassDiagramMSE container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				container = (specificPart.ClassDiagramMSE) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.AgregationMSE) {
				continue;
			}
			specificPart.AgregationMSE link = (specificPart.AgregationMSE) linkObject;
			if (specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002,
					specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingTypeModelFacetLinks_AssociationMSE_4003(
			specificPart.ClassMSE source) {
		specificPart.ClassDiagramMSE container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				container = (specificPart.ClassDiagramMSE) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.AssociationMSE) {
				continue;
			}
			specificPart.AssociationMSE link = (specificPart.AssociationMSE) linkObject;
			if (specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003,
					specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingTypeModelFacetLinks_ImplementationMSE_4004(
			specificPart.ClassMSE source) {
		specificPart.ClassDiagramMSE container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				container = (specificPart.ClassDiagramMSE) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.ImplementationMSE) {
				continue;
			}
			specificPart.ImplementationMSE link = (specificPart.ImplementationMSE) linkObject;
			if (specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getTarget();
			specificPart.ClassMSE src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004,
					specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingTypeModelFacetLinks_InheritanceMSE_4005(
			specificPart.ClassMSE source) {
		specificPart.ClassDiagramMSE container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof specificPart.ClassDiagramMSE) {
				container = (specificPart.ClassDiagramMSE) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor> result = new LinkedList<specificPart.diagram.part.SpecificPartLinkDescriptor>();
		for (Iterator<?> links = container.getLstInheritances().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof specificPart.InheritanceMSE) {
				continue;
			}
			specificPart.InheritanceMSE link = (specificPart.InheritanceMSE) linkObject;
			if (specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID != specificPart.diagram.part.SpecificPartVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			specificPart.ClassMSE dst = link.getParent();
			specificPart.ClassMSE src = link.getChild();
			if (src != source) {
				continue;
			}
			result.add(new specificPart.diagram.part.SpecificPartLinkDescriptor(src, dst, link,
					specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005,
					specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<specificPart.diagram.part.SpecificPartNodeDescriptor> getSemanticChildren(View view) {
			return SpecificPartDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<specificPart.diagram.part.SpecificPartLinkDescriptor> getContainedLinks(View view) {
			return SpecificPartDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<specificPart.diagram.part.SpecificPartLinkDescriptor> getIncomingLinks(View view) {
			return SpecificPartDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<specificPart.diagram.part.SpecificPartLinkDescriptor> getOutgoingLinks(View view) {
			return SpecificPartDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
