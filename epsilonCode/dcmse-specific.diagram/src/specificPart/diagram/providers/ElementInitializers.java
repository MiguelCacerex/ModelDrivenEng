/*
 * 
 */
package specificPart.diagram.providers;

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
		ElementInitializers cached = specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
