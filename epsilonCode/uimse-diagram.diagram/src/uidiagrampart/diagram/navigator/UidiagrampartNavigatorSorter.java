/*
* 
*/
package uidiagrampart.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class UidiagrampartNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7007;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof UidiagrampartNavigatorItem) {
			UidiagrampartNavigatorItem item = (UidiagrampartNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UidiagrampartVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
