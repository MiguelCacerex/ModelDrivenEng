package uidiagrampart.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Shell;
import uidiagrampart.Button;
import uidiagrampart.CheckBox;
import uidiagrampart.ComboBox;
import uidiagrampart.Frame;
import uidiagrampart.GraphicElement;
import uidiagrampart.Group;
import uidiagrampart.Image;
import uidiagrampart.Label;
import uidiagrampart.PropertiesElement;
import uidiagrampart.Switch;
import uidiagrampart.TextField;


/**
 * ESte evento se jecuta cuando da doble clic en el diagrama
 * @author Acer
 *
 */
public class MyOpenEditPolicyPropertiesEdit extends OpenEditPolicy {

	   protected Command getOpenCommand(Request request) {
	        return new Command("Test double-click") {
	            public void execute() {
	            	
	            	EditPart editpart = getHost();
	            	
	            	//ButtonPart
	            	
	            	if(editpart instanceof ButtonName2EditPart) {
	                    if(editpart.getParent() instanceof Button2EditPart) {
	                    	Button2EditPart buttonEditPart = (Button2EditPart) editpart.getParent();
	                        editpart = buttonEditPart;
	                    }
	                }
	                if(editpart instanceof Button2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    Button2EditPart button2EditPart = (Button2EditPart) editpart;
	                    IFigure primaryShape = ((Button2EditPart) editpart).primaryShape;
	                    primaryShape.setBackgroundColor(new Color(null, 5, 100, 200));
	                    primaryShape.repaint();
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    
	                    ShapeImpl shape = (ShapeImpl)  getHost().getModel(); 
	                    System.out.println(shape);
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();
	                }
	       
	                
	                //CheckBox
	                
	                if(editpart instanceof CheckBoxName2EditPart) {
	                    if(editpart.getParent() instanceof CheckBox2EditPart) {
	                    	CheckBox2EditPart checkBoxEditPart = (CheckBox2EditPart) editpart.getParent();
	                        editpart = checkBoxEditPart;
	                    }
	                }
	                if(editpart instanceof CheckBox2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();
	                }
	                
	                //ComboBox
	                
	                if(editpart instanceof ComboBoxName2EditPart) {
	                    if(editpart.getParent() instanceof ComboBox2EditPart) {
	                    	ComboBox2EditPart comboBox = (ComboBox2EditPart) editpart.getParent();
	                        editpart = comboBox;
	                    }
	                }
	                if(editpart instanceof ComboBox2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();
	                }
	                
	                //Frame
	                
	                if(editpart instanceof FrameNameEditPart) {
	                    if(editpart.getParent() instanceof FrameEditPart) {
	                    	FrameEditPart frame = (FrameEditPart) editpart.getParent();
	                        editpart = frame;
	                    }
	                }
	                if(editpart instanceof FrameEditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();

	                }
	                
	                //Group
	                
	                if(editpart instanceof GroupName2EditPart) {
	                    if(editpart.getParent() instanceof Group2EditPart) {
	                    	Group2EditPart group = (Group2EditPart) editpart.getParent();
	                        editpart = group;
	                    }
	                }
	                if(editpart instanceof Group2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();

	                }
	                
	                //Image
	                
	                if(editpart instanceof Image2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();
	                }
	                
	                //Label
	                
	                if(editpart instanceof LabelName2EditPart) {
	                    if(editpart.getParent() instanceof Label2EditPart) {
	                    	Label2EditPart label = (Label2EditPart) editpart.getParent();
	                        editpart = label;
	                    }
	                }
	                if(editpart instanceof Label2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();

	                }
	                
	                //Switch
	                
	                if(editpart instanceof SwitchName2EditPart) {
	                    if(editpart.getParent() instanceof Switch2EditPart) {
	                    	Switch2EditPart switchNode = (Switch2EditPart) editpart.getParent();
	                        editpart = switchNode;
	                    }
	                }
	                if(editpart instanceof Switch2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();

	                }
	                
	                //TextField
	                
	                if(editpart instanceof TextFieldName2EditPart) {
	                    if(editpart.getParent() instanceof TextField2EditPart) {
	                    	TextField2EditPart textField = (TextField2EditPart) editpart.getParent();
	                        editpart = textField;
	                    }
	                }
	                if(editpart instanceof TextField2EditPart ) {
	                	PropertiesElement model = (PropertiesElement) ((GraphicalEditPart) editpart).resolveSemanticElement();
	                	TransactionalEditingDomain domain = ((GraphicalEditPart) editpart).getEditingDomain();
	                    Shell parentShell = new Shell();
	                    
	                    NodeImpl node = (NodeImpl) getHost().getModel(); 
	                    //ShapeImpl shape = (ShapeImpl)  node.; 
	                    BoundsImpl layout = (BoundsImpl) node.getLayoutConstraint();
	                    PropertiesUserInterface dialogClass = new PropertiesUserInterface(parentShell,model,domain,node,layout);

	                    dialogClass.open();
	                }
	            }
	        };
	    }
}