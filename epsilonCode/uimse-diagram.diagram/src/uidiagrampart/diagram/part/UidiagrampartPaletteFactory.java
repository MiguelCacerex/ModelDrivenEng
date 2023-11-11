
/*
 * 
 */
package uidiagrampart.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagrampart.diagram.providers.UidiagrampartElementTypes;

/**
 * @generated
 */
public class UidiagrampartPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createComboBox3CreationTool());
		paletteContainer.add(createFrame4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createImage6CreationTool());
		paletteContainer.add(createLabel7CreationTool());
		paletteContainer.add(createSwitch8CreationTool());
		paletteContainer.add(createTableColumn9CreationTool());
		paletteContainer.add(createTableView10CreationTool());
		paletteContainer.add(createTextField11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.Button_3003);
		types.add(UidiagrampartElementTypes.Button_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Button_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.CheckBox_3005);
		types.add(UidiagrampartElementTypes.CheckBox_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.CheckBox_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.ComboBox_3007);
		types.add(UidiagrampartElementTypes.ComboBox_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox3CreationTool_title,
				Messages.ComboBox3CreationTool_desc, types);
		entry.setId("createComboBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.ComboBox_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFrame4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Frame4CreationTool_title,
				Messages.Frame4CreationTool_desc, Collections.singletonList(UidiagrampartElementTypes.Frame_2001));
		entry.setId("createFrame4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Frame_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.Group_3001);
		types.add(UidiagrampartElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group5CreationTool_title,
				Messages.Group5CreationTool_desc, types);
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.Image_3004);
		types.add(UidiagrampartElementTypes.Image_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Image6CreationTool_title,
				Messages.Image6CreationTool_desc, types);
		entry.setId("createImage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Image_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.Label_3008);
		types.add(UidiagrampartElementTypes.Label_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label7CreationTool_title,
				Messages.Label7CreationTool_desc, types);
		entry.setId("createLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Label_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSwitch8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.Switch_3006);
		types.add(UidiagrampartElementTypes.Switch_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Switch8CreationTool_title,
				Messages.Switch8CreationTool_desc, types);
		entry.setId("createSwitch8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.Switch_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTableColumn9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TableColumn9CreationTool_title,
				Messages.TableColumn9CreationTool_desc,
				Collections.singletonList(UidiagrampartElementTypes.TableColumn_3011));
		entry.setId("createTableColumn9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.TableColumn_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTableView10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.TableView_3010);
		types.add(UidiagrampartElementTypes.TableView_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TableView10CreationTool_title,
				Messages.TableView10CreationTool_desc, types);
		entry.setId("createTableView10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.TableView_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextField11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagrampartElementTypes.TextField_3009);
		types.add(UidiagrampartElementTypes.TextField_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextField11CreationTool_title,
				Messages.TextField11CreationTool_desc, types);
		entry.setId("createTextField11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagrampartElementTypes.getImageDescriptor(UidiagrampartElementTypes.TextField_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
