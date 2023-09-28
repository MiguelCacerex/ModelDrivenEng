/*
 * 
 */
package specificPart.diagram.providers;

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

/**
 * @generated
 */
public class SpecificPartElementTypes {

	/**
	* @generated
	*/
	private SpecificPartElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			specificPart.diagram.part.SpecificPartDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ClassDiagramMSE_1000 = getElementType(
			"dcmse-specific.diagram.ClassDiagramMSE_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClassMSE_2001 = getElementType("dcmse-specific.diagram.ClassMSE_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PackageMSE_2002 = getElementType("dcmse-specific.diagram.PackageMSE_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeMSE_3001 = getElementType("dcmse-specific.diagram.AttributeMSE_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodMSE_3002 = getElementType("dcmse-specific.diagram.MethodMSE_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainmentMSE_4001 = getElementType("dcmse-specific.diagram.ContainmentMSE_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AgregationMSE_4002 = getElementType("dcmse-specific.diagram.AgregationMSE_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssociationMSE_4003 = getElementType("dcmse-specific.diagram.AssociationMSE_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImplementationMSE_4004 = getElementType(
			"dcmse-specific.diagram.ImplementationMSE_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InheritanceMSE_4005 = getElementType("dcmse-specific.diagram.InheritanceMSE_4005"); //$NON-NLS-1$

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

			elements.put(ClassDiagramMSE_1000, specificPart.SpecificPartPackage.eINSTANCE.getClassDiagramMSE());

			elements.put(ClassMSE_2001, specificPart.SpecificPartPackage.eINSTANCE.getClassMSE());

			elements.put(PackageMSE_2002, specificPart.SpecificPartPackage.eINSTANCE.getPackageMSE());

			elements.put(AttributeMSE_3001, specificPart.SpecificPartPackage.eINSTANCE.getAttributeMSE());

			elements.put(MethodMSE_3002, specificPart.SpecificPartPackage.eINSTANCE.getMethodMSE());

			elements.put(ContainmentMSE_4001, specificPart.SpecificPartPackage.eINSTANCE.getContainmentMSE());

			elements.put(AgregationMSE_4002, specificPart.SpecificPartPackage.eINSTANCE.getAgregationMSE());

			elements.put(AssociationMSE_4003, specificPart.SpecificPartPackage.eINSTANCE.getAssociationMSE());

			elements.put(ImplementationMSE_4004, specificPart.SpecificPartPackage.eINSTANCE.getImplementationMSE());

			elements.put(InheritanceMSE_4005, specificPart.SpecificPartPackage.eINSTANCE.getInheritanceMSE());
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
			KNOWN_ELEMENT_TYPES.add(ClassDiagramMSE_1000);
			KNOWN_ELEMENT_TYPES.add(ClassMSE_2001);
			KNOWN_ELEMENT_TYPES.add(PackageMSE_2002);
			KNOWN_ELEMENT_TYPES.add(AttributeMSE_3001);
			KNOWN_ELEMENT_TYPES.add(MethodMSE_3002);
			KNOWN_ELEMENT_TYPES.add(ContainmentMSE_4001);
			KNOWN_ELEMENT_TYPES.add(AgregationMSE_4002);
			KNOWN_ELEMENT_TYPES.add(AssociationMSE_4003);
			KNOWN_ELEMENT_TYPES.add(ImplementationMSE_4004);
			KNOWN_ELEMENT_TYPES.add(InheritanceMSE_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case specificPart.diagram.edit.parts.ClassDiagramMSEEditPart.VISUAL_ID:
			return ClassDiagramMSE_1000;
		case specificPart.diagram.edit.parts.ClassMSEEditPart.VISUAL_ID:
			return ClassMSE_2001;
		case specificPart.diagram.edit.parts.PackageMSEEditPart.VISUAL_ID:
			return PackageMSE_2002;
		case specificPart.diagram.edit.parts.AttributeMSEEditPart.VISUAL_ID:
			return AttributeMSE_3001;
		case specificPart.diagram.edit.parts.MethodMSEEditPart.VISUAL_ID:
			return MethodMSE_3002;
		case specificPart.diagram.edit.parts.ContainmentMSEEditPart.VISUAL_ID:
			return ContainmentMSE_4001;
		case specificPart.diagram.edit.parts.AgregationMSEEditPart.VISUAL_ID:
			return AgregationMSE_4002;
		case specificPart.diagram.edit.parts.AssociationMSEEditPart.VISUAL_ID:
			return AssociationMSE_4003;
		case specificPart.diagram.edit.parts.ImplementationMSEEditPart.VISUAL_ID:
			return ImplementationMSE_4004;
		case specificPart.diagram.edit.parts.InheritanceMSEEditPart.VISUAL_ID:
			return InheritanceMSE_4005;
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
			return specificPart.diagram.providers.SpecificPartElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return specificPart.diagram.providers.SpecificPartElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return specificPart.diagram.providers.SpecificPartElementTypes.getElement(elementTypeAdapter);
		}
	};

}
