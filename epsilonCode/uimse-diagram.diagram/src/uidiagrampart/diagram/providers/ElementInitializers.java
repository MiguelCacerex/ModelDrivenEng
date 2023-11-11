/*
 * 
 */
package uidiagrampart.diagram.providers;

import uidiagrampart.diagram.part.UidiagrampartDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UidiagrampartDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UidiagrampartDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
