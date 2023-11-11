package uidiagrampart.diagram.edit.parts;

import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.*;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import uidiagrampart.Button;
import uidiagrampart.CheckBox;
import uidiagrampart.ComboBox;
import uidiagrampart.Frame;
import uidiagrampart.GraphicElement;
import uidiagrampart.Group;
import uidiagrampart.Image;
import uidiagrampart.PropertiesElement;
import uidiagrampart.Switch;
import uidiagrampart.TableView;
import uidiagrampart.TextField;
import uidiagrampart.diagram.edit.parts.Button2EditPart;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PropertiesUserInterface extends Dialog {


	private TransactionalEditingDomain domain;
	private Text txtName;
	private Text txtWidth;
	private Text txtPositionX;	
	private Text txtPositionY;
	private Text txtHeight;
	private NodeImpl node;
	private BoundsImpl layout;
	private ShapeImpl shape;
	private Button button;
	private Frame frame;
	private CheckBox checkBox;
	private ComboBox comboBox;
	private Group group;
	private uidiagrampart.Label labelAux;
	private Switch switchAux;
	private Image image;
	private TableView table;
	private TextField textField;
	private String labelFillColorAux;
	private String labelTextColorAux;
	private PropertiesElement elemet;

	
	public PropertiesUserInterface(Shell parentShell, PropertiesElement model, TransactionalEditingDomain domain,
			NodeImpl node, BoundsImpl layout) {
		super(parentShell);
		this.domain = domain;
		this.node = node;
		this.layout = layout;
		this.elemet =  model;
		//this.shape = shape;
	}
	
	
	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(null);
		Label labelTitle = new Label(container, SWT.NONE);
		labelTitle.setBounds(151, 6, 267, 35);
		labelTitle.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		labelTitle.setText("Propiedades del Widget");

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setBounds(36, 67, 48, 20);
		lblNewLabel.setText("Name:");

		txtName = new Text(container, SWT.BORDER);
		txtName.setBounds(90, 64, 154, 26);

		Label labelState = new Label(container, SWT.NONE);
		labelState.setBounds(321, 64, 37, 20);
		labelState.setText("State:");

		Combo comboState = new Combo(container, SWT.NONE);
		comboState.setBounds(377, 61, 152, 28);

		Label labelWidth = new Label(container, SWT.NONE);
		labelWidth.setBounds(10, 222, 74, 20);
		labelWidth.setText("Position X:");

		txtWidth = new Text(container, SWT.BORDER);
		txtWidth.setBounds(90, 117, 154, 26);

		Label labelHeight = new Label(container, SWT.NONE);
		labelHeight.setBounds(310, 117, 48, 20);
		labelHeight.setText("Height:");

		txtHeight = new Text(container, SWT.BORDER);
		txtHeight.setBounds(375, 114, 154, 26);

		Label labelTextColor = new Label(container, SWT.NONE);
		labelTextColor.setBounds(292, 167, 70, 20);
		labelTextColor.setText("Text Color:");

		txtPositionX = new Text(container, SWT.BORDER);
		txtPositionX.setBounds(90, 219, 154, 26);

		Label labelPositionY = new Label(container, SWT.NONE);
		labelPositionY.setBounds(291, 219, 67, 20);
		labelPositionY.setText("Position Y:");

		txtPositionY = new Text(container, SWT.BORDER);
		txtPositionY.setBounds(375, 216, 154, 26);

		

		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 47, 544, 2);

		Label labelWidth_1 = new Label(container, SWT.NONE);
		labelWidth_1.setText("Width:");
		labelWidth_1.setBounds(36, 120, 43, 20);

		Label labelFillColor = new Label(container, SWT.NONE);
		labelFillColor.setText("Fill Color:");
		labelFillColor.setBounds(15, 170, 69, 20);

		Label labelExampleFillColor = new Label(container, SWT.NONE);
		labelExampleFillColor.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		labelExampleFillColor.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		labelExampleFillColor.setBounds(90, 167, 26, 26);

		Label labelExampleTextColor = new Label(container, SWT.NONE);
		labelExampleTextColor.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		labelExampleTextColor.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		labelExampleTextColor.setBounds(379, 167, 26, 26);

		org.eclipse.swt.widgets.Button btnSelectColorFill = new org.eclipse.swt.widgets.Button(container, SWT.NONE);
		btnSelectColorFill.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);

				org.eclipse.swt.graphics.Color colorFill = new org.eclipse.swt.graphics.Color(null,color.getRed(),color.getGreen(),color.getBlue());
				
				labelExampleFillColor.setBackground(colorFill);
				labelFillColorAux = color.getRed()+","+color.getGreen()+","+color.getBlue();
			}
		});
		btnSelectColorFill.setText("select color");
		btnSelectColorFill.setBounds(126, 165, 118, 30);

		org.eclipse.swt.widgets.Button btnSelectColorText = new org.eclipse.swt.widgets.Button(container, SWT.NONE);
		btnSelectColorText.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);

				org.eclipse.swt.graphics.Color colorFill = new org.eclipse.swt.graphics.Color(null,color.getRed(),color.getGreen(),color.getBlue());
				
				labelExampleTextColor.setBackground(colorFill);
				labelTextColorAux = color.getRed()+","+color.getGreen()+","+color.getBlue();
			}
		});
		btnSelectColorText.setText("select color");
		btnSelectColorText.setBounds(411, 162, 118, 30);
		
		if (elemet != null) {
			txtName.setText(elemet.getName() != null ? elemet.getName() : "");
			txtWidth.setText(elemet.getWidth() != null ? elemet.getWidth() : "");
			txtHeight.setText(elemet.getHeight() != null ? elemet.getHeight() : "");
			txtPositionY.setText(elemet.getPositionY() != null ? elemet.getPositionY() : "");
			txtPositionX.setText(elemet.getPositionX() != null ? elemet.getPositionX() : "");
			
			 String[] rgb = elemet.getBackground().split(",");
			 String[] rgb2 = elemet.getStroke().split(",");
			
			org.eclipse.swt.graphics.Color colorFill = new org.eclipse.swt.graphics.Color(null,Integer.parseInt(rgb[0]),Integer.parseInt(rgb[1]),Integer.parseInt(rgb[2]));
			org.eclipse.swt.graphics.Color colorText = new org.eclipse.swt.graphics.Color(null,Integer.parseInt(rgb2[0]),Integer.parseInt(rgb2[1]),Integer.parseInt(rgb2[2]));

			labelExampleFillColor.setBackground(colorFill);
			labelExampleTextColor.setBackground(colorText);
			
			labelFillColorAux = colorFill.getRed()+","+colorFill.getGreen()+","+colorFill.getBlue();
			labelTextColorAux = colorText.getRed()+","+colorText.getGreen()+","+colorText.getBlue();

		}
		
		
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		org.eclipse.swt.widgets.Button button_1 = createButton(parent, IDialogConstants.OK_ID, "btnOK", true);
		button_1.setText("Save");
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);

	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(570, 367);
	}

	@Override
	protected void okPressed() {

		if (txtName.getText().equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Algunos cambios estan vacios");
		} else {
			ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain, "1",layout,shape,elemet);
			domain.getCommandStack().execute((Command) command);
			close();
		}
	}

	public class ChangeOPerationDialogCommand extends RecordingCommand {

		private PropertiesElement modelElementWidget;
		String evento = new String();
		TransactionalEditingDomain transactionalEditingDomain2;
		BoundsImpl layout;
		ShapeImpl shape;

		public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain, String event, BoundsImpl layout, ShapeImpl shape, PropertiesElement elemet) {
			super(transactionalEditingDomain);
			this.evento = event;
			this.transactionalEditingDomain2 = transactionalEditingDomain;
			this.modelElementWidget =  elemet;
			this.layout = layout;
		}

		@Override
		protected void doExecute() {
			
			//Properties
			
			modelElementWidget.setName(txtName.getText());
			modelElementWidget.setWidth(txtWidth.getText());
			modelElementWidget.setHeight(txtHeight.getText());
			modelElementWidget.setPositionX(txtPositionX.getText());
			modelElementWidget.setPositionY(txtPositionY.getText());
			modelElementWidget.setBackground(labelFillColorAux);
			modelElementWidget.setStroke(labelTextColorAux);
			
			//Bounds
			
			layout.setX(Integer.parseInt(txtPositionX.getText()));
			layout.setY(Integer.parseInt(txtPositionY.getText()));
			layout.setHeight(Integer.parseInt(txtHeight.getText()));
			layout.setWidth(Integer.parseInt(txtWidth.getText()));

			//Shape
			
		}
	}

}
