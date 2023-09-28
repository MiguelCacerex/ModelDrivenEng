
/*
 * 
 */
package specificPart.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class SpecificPartPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(specificPart.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createClassMSE2CreationTool());
		paletteContainer.add(createAttributeMSE1CreationTool());
		paletteContainer.add(createMethodMSE3CreationTool());
		paletteContainer.add(createPackageMSE4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(specificPart.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociationMSE2CreationTool());
		paletteContainer.add(createContainmentMSE3CreationTool());
		paletteContainer.add(createAgregationMSE1CreationTool());
		paletteContainer.add(createImplementationMSE4CreationTool());
		paletteContainer.add(createInheritanceMSE5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttributeMSE1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				specificPart.diagram.part.Messages.AttributeMSE1CreationTool_title,
				specificPart.diagram.part.Messages.AttributeMSE1CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001));
		entry.setId("createAttributeMSE1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.AttributeMSE_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassMSE2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				specificPart.diagram.part.Messages.ClassMSE2CreationTool_title,
				specificPart.diagram.part.Messages.ClassMSE2CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001));
		entry.setId("createClassMSE2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.ClassMSE_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMethodMSE3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				specificPart.diagram.part.Messages.MethodMSE3CreationTool_title,
				specificPart.diagram.part.Messages.MethodMSE3CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002));
		entry.setId("createMethodMSE3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.MethodMSE_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackageMSE4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				specificPart.diagram.part.Messages.PackageMSE4CreationTool_title,
				specificPart.diagram.part.Messages.PackageMSE4CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.PackageMSE_2002));
		entry.setId("createPackageMSE4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.PackageMSE_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgregationMSE1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				specificPart.diagram.part.Messages.AgregationMSE1CreationTool_title,
				specificPart.diagram.part.Messages.AgregationMSE1CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002));
		entry.setId("createAgregationMSE1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.AgregationMSE_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociationMSE2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				specificPart.diagram.part.Messages.AssociationMSE2CreationTool_title,
				specificPart.diagram.part.Messages.AssociationMSE2CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003));
		entry.setId("createAssociationMSE2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.AssociationMSE_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainmentMSE3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				specificPart.diagram.part.Messages.ContainmentMSE3CreationTool_title,
				specificPart.diagram.part.Messages.ContainmentMSE3CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001));
		entry.setId("createContainmentMSE3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.ContainmentMSE_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImplementationMSE4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				specificPart.diagram.part.Messages.ImplementationMSE4CreationTool_title,
				specificPart.diagram.part.Messages.ImplementationMSE4CreationTool_desc, Collections
						.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004));
		entry.setId("createImplementationMSE4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.ImplementationMSE_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInheritanceMSE5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				specificPart.diagram.part.Messages.InheritanceMSE5CreationTool_title,
				specificPart.diagram.part.Messages.InheritanceMSE5CreationTool_desc,
				Collections.singletonList(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005));
		entry.setId("createInheritanceMSE5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(specificPart.diagram.providers.SpecificPartElementTypes
				.getImageDescriptor(specificPart.diagram.providers.SpecificPartElementTypes.InheritanceMSE_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
