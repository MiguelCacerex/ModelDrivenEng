/*
 * 
 */
package specificPart.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SpecificPartModelingAssistantProviderOfClassDiagramMSEEditPart
		extends specificPart.diagram.providers.SpecificPartModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001);
		types.add(specificPart.diagram.providers.SpecificPartElementTypes.PackageMSE_2002);
		return types;
	}

}
