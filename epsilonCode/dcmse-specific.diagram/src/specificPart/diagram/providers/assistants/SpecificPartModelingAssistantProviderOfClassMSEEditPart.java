/*
 * 
 */
package specificPart.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SpecificPartModelingAssistantProviderOfClassMSEEditPart
		extends specificPart.diagram.providers.SpecificPartModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((specificPart.diagram.edit.parts.ClassMSEEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(specificPart.diagram.edit.parts.ClassMSEEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((specificPart.diagram.edit.parts.ClassMSEEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(specificPart.diagram.edit.parts.ClassMSEEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof specificPart.diagram.edit.parts.ClassMSEEditPart) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001);
		}
		if (targetEditPart instanceof specificPart.diagram.edit.parts.ClassMSEEditPart) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002);
		}
		if (targetEditPart instanceof specificPart.diagram.edit.parts.ClassMSEEditPart) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003);
		}
		if (targetEditPart instanceof specificPart.diagram.edit.parts.ClassMSEEditPart) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004);
		}
		if (targetEditPart instanceof specificPart.diagram.edit.parts.ClassMSEEditPart) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((specificPart.diagram.edit.parts.ClassMSEEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(specificPart.diagram.edit.parts.ClassMSEEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((specificPart.diagram.edit.parts.ClassMSEEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(specificPart.diagram.edit.parts.ClassMSEEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((specificPart.diagram.edit.parts.ClassMSEEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(specificPart.diagram.edit.parts.ClassMSEEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		} else if (relationshipType == specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005) {
			types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		}
		return types;
	}

}
