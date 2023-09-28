/*
 * 
 */
package specificPart.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SpecificPartParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser classMSEName_5003Parser;

	/**
	* @generated
	*/
	private IParser getClassMSEName_5003Parser() {
		if (classMSEName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { specificPart.SpecificPartPackage.eINSTANCE.getClassMSE_Name() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			classMSEName_5003Parser = parser;
		}
		return classMSEName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser packageMSEName_5004Parser;

	/**
	* @generated
	*/
	private IParser getPackageMSEName_5004Parser() {
		if (packageMSEName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getPackageMSE_Name() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			packageMSEName_5004Parser = parser;
		}
		return packageMSEName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeMSENameType_5001Parser;

	/**
	* @generated
	*/
	private IParser getAttributeMSENameType_5001Parser() {
		if (attributeMSENameType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getAttributeMSE_Name(),
					specificPart.SpecificPartPackage.eINSTANCE.getAttributeMSE_Type() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			parser.setEditPattern("{0}  [ {1} ]"); //$NON-NLS-1$
			attributeMSENameType_5001Parser = parser;
		}
		return attributeMSENameType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodMSEName_5002Parser;

	/**
	* @generated
	*/
	private IParser getMethodMSEName_5002Parser() {
		if (methodMSEName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { specificPart.SpecificPartPackage.eINSTANCE.getMethodMSE_Name() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			methodMSEName_5002Parser = parser;
		}
		return methodMSEName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMSERoleSource_6009Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMSERoleSource_6009Parser() {
		if (containmentMSERoleSource_6009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleSource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			containmentMSERoleSource_6009Parser = parser;
		}
		return containmentMSERoleSource_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMSEMultiplicitySource_6010Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMSEMultiplicitySource_6010Parser() {
		if (containmentMSEMultiplicitySource_6010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicitySource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			containmentMSEMultiplicitySource_6010Parser = parser;
		}
		return containmentMSEMultiplicitySource_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMSERoleTarget_6011Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMSERoleTarget_6011Parser() {
		if (containmentMSERoleTarget_6011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			containmentMSERoleTarget_6011Parser = parser;
		}
		return containmentMSERoleTarget_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentMSEMultiplicityTarget_6012Parser;

	/**
	* @generated
	*/
	private IParser getContainmentMSEMultiplicityTarget_6012Parser() {
		if (containmentMSEMultiplicityTarget_6012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicityTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			containmentMSEMultiplicityTarget_6012Parser = parser;
		}
		return containmentMSEMultiplicityTarget_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationMSERoleSource_6013Parser;

	/**
	* @generated
	*/
	private IParser getAgregationMSERoleSource_6013Parser() {
		if (agregationMSERoleSource_6013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleSource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			agregationMSERoleSource_6013Parser = parser;
		}
		return agregationMSERoleSource_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationMSEMultiplicitySource_6014Parser;

	/**
	* @generated
	*/
	private IParser getAgregationMSEMultiplicitySource_6014Parser() {
		if (agregationMSEMultiplicitySource_6014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicitySource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			agregationMSEMultiplicitySource_6014Parser = parser;
		}
		return agregationMSEMultiplicitySource_6014Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationMSERoleTarget_6015Parser;

	/**
	* @generated
	*/
	private IParser getAgregationMSERoleTarget_6015Parser() {
		if (agregationMSERoleTarget_6015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			agregationMSERoleTarget_6015Parser = parser;
		}
		return agregationMSERoleTarget_6015Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationMSEMultiplicityTarget_6016Parser;

	/**
	* @generated
	*/
	private IParser getAgregationMSEMultiplicityTarget_6016Parser() {
		if (agregationMSEMultiplicityTarget_6016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicityTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			agregationMSEMultiplicityTarget_6016Parser = parser;
		}
		return agregationMSEMultiplicityTarget_6016Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMSERoleSource_6005Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMSERoleSource_6005Parser() {
		if (associationMSERoleSource_6005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleSource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			associationMSERoleSource_6005Parser = parser;
		}
		return associationMSERoleSource_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMSEMultiplicitySource_6006Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMSEMultiplicitySource_6006Parser() {
		if (associationMSEMultiplicitySource_6006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicitySource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			associationMSEMultiplicitySource_6006Parser = parser;
		}
		return associationMSEMultiplicitySource_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMSERoleTarget_6007Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMSERoleTarget_6007Parser() {
		if (associationMSERoleTarget_6007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			associationMSERoleTarget_6007Parser = parser;
		}
		return associationMSERoleTarget_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser associationMSEMultiplicityTarget_6008Parser;

	/**
	* @generated
	*/
	private IParser getAssociationMSEMultiplicityTarget_6008Parser() {
		if (associationMSEMultiplicityTarget_6008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicityTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			associationMSEMultiplicityTarget_6008Parser = parser;
		}
		return associationMSEMultiplicityTarget_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser implementationMSERoleSource_6017Parser;

	/**
	* @generated
	*/
	private IParser getImplementationMSERoleSource_6017Parser() {
		if (implementationMSERoleSource_6017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleSource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			implementationMSERoleSource_6017Parser = parser;
		}
		return implementationMSERoleSource_6017Parser;
	}

	/**
	* @generated
	*/
	private IParser implementationMSEMultiplicitySource_6018Parser;

	/**
	* @generated
	*/
	private IParser getImplementationMSEMultiplicitySource_6018Parser() {
		if (implementationMSEMultiplicitySource_6018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicitySource() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			implementationMSEMultiplicitySource_6018Parser = parser;
		}
		return implementationMSEMultiplicitySource_6018Parser;
	}

	/**
	* @generated
	*/
	private IParser implementationMSERoleTarget_6019Parser;

	/**
	* @generated
	*/
	private IParser getImplementationMSERoleTarget_6019Parser() {
		if (implementationMSERoleTarget_6019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_RoleTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			implementationMSERoleTarget_6019Parser = parser;
		}
		return implementationMSERoleTarget_6019Parser;
	}

	/**
	* @generated
	*/
	private IParser implementationMSEMultiplicityTarget_6020Parser;

	/**
	* @generated
	*/
	private IParser getImplementationMSEMultiplicityTarget_6020Parser() {
		if (implementationMSEMultiplicityTarget_6020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					specificPart.SpecificPartPackage.eINSTANCE.getRelationMSE_MultiplicityTarget() };
			specificPart.diagram.parsers.MessageFormatParser parser = new specificPart.diagram.parsers.MessageFormatParser(
					features);
			implementationMSEMultiplicityTarget_6020Parser = parser;
		}
		return implementationMSEMultiplicityTarget_6020Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case specificPart.diagram.edit.parts.ClassMSENameEditPart.VISUAL_ID:
			return getClassMSEName_5003Parser();
		case specificPart.diagram.edit.parts.PackageMSENameEditPart.VISUAL_ID:
			return getPackageMSEName_5004Parser();
		case specificPart.diagram.edit.parts.AttributeMSENameTypeEditPart.VISUAL_ID:
			return getAttributeMSENameType_5001Parser();
		case specificPart.diagram.edit.parts.MethodMSENameEditPart.VISUAL_ID:
			return getMethodMSEName_5002Parser();
		case specificPart.diagram.edit.parts.ContainmentMSERoleSourceEditPart.VISUAL_ID:
			return getContainmentMSERoleSource_6009Parser();
		case specificPart.diagram.edit.parts.ContainmentMSEMultiplicitySourceEditPart.VISUAL_ID:
			return getContainmentMSEMultiplicitySource_6010Parser();
		case specificPart.diagram.edit.parts.ContainmentMSERoleTargetEditPart.VISUAL_ID:
			return getContainmentMSERoleTarget_6011Parser();
		case specificPart.diagram.edit.parts.ContainmentMSEMultiplicityTargetEditPart.VISUAL_ID:
			return getContainmentMSEMultiplicityTarget_6012Parser();
		case specificPart.diagram.edit.parts.AgregationMSERoleSourceEditPart.VISUAL_ID:
			return getAgregationMSERoleSource_6013Parser();
		case specificPart.diagram.edit.parts.AgregationMSEMultiplicitySourceEditPart.VISUAL_ID:
			return getAgregationMSEMultiplicitySource_6014Parser();
		case specificPart.diagram.edit.parts.AgregationMSERoleTargetEditPart.VISUAL_ID:
			return getAgregationMSERoleTarget_6015Parser();
		case specificPart.diagram.edit.parts.AgregationMSEMultiplicityTargetEditPart.VISUAL_ID:
			return getAgregationMSEMultiplicityTarget_6016Parser();
		case specificPart.diagram.edit.parts.AssociationMSERoleSourceEditPart.VISUAL_ID:
			return getAssociationMSERoleSource_6005Parser();
		case specificPart.diagram.edit.parts.AssociationMSEMultiplicitySourceEditPart.VISUAL_ID:
			return getAssociationMSEMultiplicitySource_6006Parser();
		case specificPart.diagram.edit.parts.AssociationMSERoleTargetEditPart.VISUAL_ID:
			return getAssociationMSERoleTarget_6007Parser();
		case specificPart.diagram.edit.parts.AssociationMSEMultiplicityTargetEditPart.VISUAL_ID:
			return getAssociationMSEMultiplicityTarget_6008Parser();
		case specificPart.diagram.edit.parts.ImplementationMSERoleSourceEditPart.VISUAL_ID:
			return getImplementationMSERoleSource_6017Parser();
		case specificPart.diagram.edit.parts.ImplementationMSEMultiplicitySourceEditPart.VISUAL_ID:
			return getImplementationMSEMultiplicitySource_6018Parser();
		case specificPart.diagram.edit.parts.ImplementationMSERoleTargetEditPart.VISUAL_ID:
			return getImplementationMSERoleTarget_6019Parser();
		case specificPart.diagram.edit.parts.ImplementationMSEMultiplicityTargetEditPart.VISUAL_ID:
			return getImplementationMSEMultiplicityTarget_6020Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(specificPart.diagram.part.SpecificPartVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (specificPart.diagram.providers.SpecificPartElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
