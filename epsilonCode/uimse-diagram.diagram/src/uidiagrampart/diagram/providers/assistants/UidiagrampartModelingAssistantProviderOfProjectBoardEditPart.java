/*
 * 
 */
package uidiagrampart.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uidiagrampart.diagram.providers.UidiagrampartElementTypes;
import uidiagrampart.diagram.providers.UidiagrampartModelingAssistantProvider;

/**
 * @generated
 */
public class UidiagrampartModelingAssistantProviderOfProjectBoardEditPart
		extends UidiagrampartModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UidiagrampartElementTypes.Frame_2001);
		return types;
	}

}
