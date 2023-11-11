/*
 * 
 */
package uidiagrampart.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagrampart.UidiagrampartPackage;
import uidiagrampart.diagram.edit.parts.Button2EditPart;
import uidiagrampart.diagram.edit.parts.ButtonEditPart;
import uidiagrampart.diagram.edit.parts.CheckBox2EditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxEditPart;
import uidiagrampart.diagram.edit.parts.ComboBox2EditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxEditPart;
import uidiagrampart.diagram.edit.parts.FrameEditPart;
import uidiagrampart.diagram.edit.parts.Group2EditPart;
import uidiagrampart.diagram.edit.parts.GroupEditPart;
import uidiagrampart.diagram.edit.parts.Image2EditPart;
import uidiagrampart.diagram.edit.parts.ImageEditPart;
import uidiagrampart.diagram.edit.parts.Label2EditPart;
import uidiagrampart.diagram.edit.parts.LabelEditPart;
import uidiagrampart.diagram.edit.parts.ProjectBoardEditPart;
import uidiagrampart.diagram.edit.parts.Switch2EditPart;
import uidiagrampart.diagram.edit.parts.SwitchEditPart;
import uidiagrampart.diagram.edit.parts.TableColumnEditPart;
import uidiagrampart.diagram.edit.parts.TableView2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewEditPart;
import uidiagrampart.diagram.edit.parts.TextField2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldEditPart;
import uidiagrampart.diagram.part.UidiagrampartDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagrampartElementTypes {

	/**
	* @generated
	*/
	private UidiagrampartElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagrampartDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ProjectBoard_1000 = getElementType("uimse-diagram.diagram.ProjectBoard_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Frame_2001 = getElementType("uimse-diagram.diagram.Frame_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3001 = getElementType("uimse-diagram.diagram.Group_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3002 = getElementType("uimse-diagram.diagram.Group_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3003 = getElementType("uimse-diagram.diagram.Button_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Image_3004 = getElementType("uimse-diagram.diagram.Image_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3005 = getElementType("uimse-diagram.diagram.CheckBox_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3006 = getElementType("uimse-diagram.diagram.Switch_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3007 = getElementType("uimse-diagram.diagram.ComboBox_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3008 = getElementType("uimse-diagram.diagram.Label_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextField_3009 = getElementType("uimse-diagram.diagram.TextField_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableView_3010 = getElementType("uimse-diagram.diagram.TableView_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableColumn_3011 = getElementType("uimse-diagram.diagram.TableColumn_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3012 = getElementType("uimse-diagram.diagram.Button_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Image_3013 = getElementType("uimse-diagram.diagram.Image_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3014 = getElementType("uimse-diagram.diagram.CheckBox_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3015 = getElementType("uimse-diagram.diagram.Switch_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3016 = getElementType("uimse-diagram.diagram.ComboBox_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3017 = getElementType("uimse-diagram.diagram.Label_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextField_3018 = getElementType("uimse-diagram.diagram.TextField_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TableView_3019 = getElementType("uimse-diagram.diagram.TableView_3019"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ProjectBoard_1000, UidiagrampartPackage.eINSTANCE.getProjectBoard());

			elements.put(Frame_2001, UidiagrampartPackage.eINSTANCE.getFrame());

			elements.put(Group_3001, UidiagrampartPackage.eINSTANCE.getGroup());

			elements.put(Group_3002, UidiagrampartPackage.eINSTANCE.getGroup());

			elements.put(Button_3003, UidiagrampartPackage.eINSTANCE.getButton());

			elements.put(Image_3004, UidiagrampartPackage.eINSTANCE.getImage());

			elements.put(CheckBox_3005, UidiagrampartPackage.eINSTANCE.getCheckBox());

			elements.put(Switch_3006, UidiagrampartPackage.eINSTANCE.getSwitch());

			elements.put(ComboBox_3007, UidiagrampartPackage.eINSTANCE.getComboBox());

			elements.put(Label_3008, UidiagrampartPackage.eINSTANCE.getLabel());

			elements.put(TextField_3009, UidiagrampartPackage.eINSTANCE.getTextField());

			elements.put(TableView_3010, UidiagrampartPackage.eINSTANCE.getTableView());

			elements.put(TableColumn_3011, UidiagrampartPackage.eINSTANCE.getTableColumn());

			elements.put(Button_3012, UidiagrampartPackage.eINSTANCE.getButton());

			elements.put(Image_3013, UidiagrampartPackage.eINSTANCE.getImage());

			elements.put(CheckBox_3014, UidiagrampartPackage.eINSTANCE.getCheckBox());

			elements.put(Switch_3015, UidiagrampartPackage.eINSTANCE.getSwitch());

			elements.put(ComboBox_3016, UidiagrampartPackage.eINSTANCE.getComboBox());

			elements.put(Label_3017, UidiagrampartPackage.eINSTANCE.getLabel());

			elements.put(TextField_3018, UidiagrampartPackage.eINSTANCE.getTextField());

			elements.put(TableView_3019, UidiagrampartPackage.eINSTANCE.getTableView());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ProjectBoard_1000);
			KNOWN_ELEMENT_TYPES.add(Frame_2001);
			KNOWN_ELEMENT_TYPES.add(Group_3001);
			KNOWN_ELEMENT_TYPES.add(Group_3002);
			KNOWN_ELEMENT_TYPES.add(Button_3003);
			KNOWN_ELEMENT_TYPES.add(Image_3004);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3005);
			KNOWN_ELEMENT_TYPES.add(Switch_3006);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3007);
			KNOWN_ELEMENT_TYPES.add(Label_3008);
			KNOWN_ELEMENT_TYPES.add(TextField_3009);
			KNOWN_ELEMENT_TYPES.add(TableView_3010);
			KNOWN_ELEMENT_TYPES.add(TableColumn_3011);
			KNOWN_ELEMENT_TYPES.add(Button_3012);
			KNOWN_ELEMENT_TYPES.add(Image_3013);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3014);
			KNOWN_ELEMENT_TYPES.add(Switch_3015);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3016);
			KNOWN_ELEMENT_TYPES.add(Label_3017);
			KNOWN_ELEMENT_TYPES.add(TextField_3018);
			KNOWN_ELEMENT_TYPES.add(TableView_3019);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProjectBoardEditPart.VISUAL_ID:
			return ProjectBoard_1000;
		case FrameEditPart.VISUAL_ID:
			return Frame_2001;
		case GroupEditPart.VISUAL_ID:
			return Group_3001;
		case Group2EditPart.VISUAL_ID:
			return Group_3002;
		case ButtonEditPart.VISUAL_ID:
			return Button_3003;
		case ImageEditPart.VISUAL_ID:
			return Image_3004;
		case CheckBoxEditPart.VISUAL_ID:
			return CheckBox_3005;
		case SwitchEditPart.VISUAL_ID:
			return Switch_3006;
		case ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3007;
		case LabelEditPart.VISUAL_ID:
			return Label_3008;
		case TextFieldEditPart.VISUAL_ID:
			return TextField_3009;
		case TableViewEditPart.VISUAL_ID:
			return TableView_3010;
		case TableColumnEditPart.VISUAL_ID:
			return TableColumn_3011;
		case Button2EditPart.VISUAL_ID:
			return Button_3012;
		case Image2EditPart.VISUAL_ID:
			return Image_3013;
		case CheckBox2EditPart.VISUAL_ID:
			return CheckBox_3014;
		case Switch2EditPart.VISUAL_ID:
			return Switch_3015;
		case ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3016;
		case Label2EditPart.VISUAL_ID:
			return Label_3017;
		case TextField2EditPart.VISUAL_ID:
			return TextField_3018;
		case TableView2EditPart.VISUAL_ID:
			return TableView_3019;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagrampart.diagram.providers.UidiagrampartElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagrampart.diagram.providers.UidiagrampartElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagrampart.diagram.providers.UidiagrampartElementTypes.getElement(elementTypeAdapter);
		}
	};

}
