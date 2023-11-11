/*
 * 
 */
package uidiagrampart.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uidiagrampart.diagram.edit.parts.ProjectBoardEditPart;
import uidiagrampart.diagram.edit.parts.UidiagrampartEditPartFactory;
import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class UidiagrampartEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UidiagrampartEditPartProvider() {
		super(new UidiagrampartEditPartFactory(), UidiagrampartVisualIDRegistry.TYPED_INSTANCE,
				ProjectBoardEditPart.MODEL_ID);
	}

}
