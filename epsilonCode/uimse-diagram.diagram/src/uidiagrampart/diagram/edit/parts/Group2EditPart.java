/*
 * 
 */
package uidiagrampart.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.graphics.Color;

import uidiagrampart.GraphicElement;
import uidiagrampart.diagram.edit.policies.Group2ItemSemanticEditPolicy;
import uidiagrampart.diagram.edit.policies.OpenDiagramEditPolicy;
import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class Group2EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3002;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public Group2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Group2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new MyOpenEditPolicyPropertiesEdit());
	}

protected void handleNotificationEvent(Notification arg0) {

	if (arg0.getEventType() == Notification.SET) {
        if (arg0.getNotifier() instanceof BoundsImpl) {
        	BoundsImpl bounds = (BoundsImpl) arg0.getNotifier(); 
            NodeImpl node = (NodeImpl) this.getModel();
          
            GraphicElement model = (GraphicElement) node.getElement();

            if (arg0.getFeature() instanceof EAttributeImpl) {
                if (bounds.getWidth() == -1) {
                	model.setWidth("50");
                	model.setHeight("30");
                } else {
                	   model.setWidth(""+bounds.getWidth());
                       model.setHeight(""+bounds.getHeight());
                }
                model.setPositionX(""+bounds.getX());
                model.setPositionY(""+bounds.getY());
                if(model.getBackground() == null) {
                	model.setBackground("255,255,255");
                }
                if(model.getStroke() == null || model.getStroke().isEmpty()) {
                	model.setStroke("255,255,255");
                }
            }
        }
    }
    super.handleNotificationEvent(arg0);
}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new GroupFigure();
	}

	/**
	* @generated
	*/
	public GroupFigure getPrimaryShape() {
		return (GroupFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GroupName2EditPart) {
			((GroupName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureGroupLabelFigure());
			return true;
		}
		if (childEditPart instanceof GroupGroupLstGraphicElementCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupLstGraphicElementCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((GroupGroupLstGraphicElementCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GroupName2EditPart) {
			return true;
		}
		if (childEditPart instanceof GroupGroupLstGraphicElementCompartment2EditPart) {
			IFigure pane = getPrimaryShape().getGroupLstGraphicElementCompartmentFigure();
			pane.remove(((GroupGroupLstGraphicElementCompartment2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof GroupGroupLstGraphicElementCompartment2EditPart) {
			return getPrimaryShape().getGroupLstGraphicElementCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UidiagrampartVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class GroupFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGroupLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fGroupLstGraphicElementCompartmentFigure;

		/**
		 * @generated
		 */
		public GroupFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureGroupLabelFigure = new WrappingLabel();

			fFigureGroupLabelFigure.setText("Group");
			fFigureGroupLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureGroupLabelFigure);

			fGroupLstGraphicElementCompartmentFigure = new RectangleFigure();

			fGroupLstGraphicElementCompartmentFigure.setOutline(false);

			this.add(fGroupLstGraphicElementCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGroupLabelFigure() {
			return fFigureGroupLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getGroupLstGraphicElementCompartmentFigure() {
			return fGroupLstGraphicElementCompartmentFigure;
		}

	}

}
