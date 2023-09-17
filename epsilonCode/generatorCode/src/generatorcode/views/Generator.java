package generatorcode.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class Generator extends ViewPart {
	public Generator() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "generatorcode.views.Generator";

	

	@Override
	public void createPartControl(Composite parent) {
		
		Group grpGeneratorCode = new Group(parent, SWT.NONE);
		grpGeneratorCode.setText("Generator Code");
		
		Button btnNewButton = new Button(grpGeneratorCode, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
			}
		});
		btnNewButton.setBounds(149, 43, 266, 64);
		btnNewButton.setText("Transformation M2M");
		
		Button btnTransformationMt = new Button(grpGeneratorCode, SWT.NONE);
		btnTransformationMt.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		btnTransformationMt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnTransformationMt.setText("Transformation M2T");
		btnTransformationMt.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		btnTransformationMt.setBounds(149, 144, 266, 64);
	
		
	}

	@Override
	public void setFocus() {

	}
}
