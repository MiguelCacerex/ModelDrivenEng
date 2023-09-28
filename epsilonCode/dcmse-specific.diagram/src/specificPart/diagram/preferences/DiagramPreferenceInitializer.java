/*
 * 
 */
package specificPart.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		specificPart.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		specificPart.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		specificPart.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		specificPart.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		specificPart.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
