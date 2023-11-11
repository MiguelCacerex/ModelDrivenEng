/*
 * 
 */
package uidiagrampart.diagram.providers;

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

import uidiagrampart.UidiagrampartPackage;
import uidiagrampart.diagram.edit.parts.ButtonName2EditPart;
import uidiagrampart.diagram.edit.parts.ButtonNameEditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagrampart.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagrampart.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagrampart.diagram.edit.parts.FrameNameEditPart;
import uidiagrampart.diagram.edit.parts.GroupName2EditPart;
import uidiagrampart.diagram.edit.parts.GroupNameEditPart;
import uidiagrampart.diagram.edit.parts.LabelName2EditPart;
import uidiagrampart.diagram.edit.parts.LabelNameEditPart;
import uidiagrampart.diagram.edit.parts.SwitchName2EditPart;
import uidiagrampart.diagram.edit.parts.SwitchNameEditPart;
import uidiagrampart.diagram.edit.parts.TableColumnNameEditPart;
import uidiagrampart.diagram.edit.parts.TableViewName2EditPart;
import uidiagrampart.diagram.edit.parts.TableViewNameEditPart;
import uidiagrampart.diagram.edit.parts.TextFieldName2EditPart;
import uidiagrampart.diagram.edit.parts.TextFieldNameEditPart;
import uidiagrampart.diagram.parsers.MessageFormatParser;
import uidiagrampart.diagram.part.UidiagrampartVisualIDRegistry;

/**
 * @generated
 */
public class UidiagrampartParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser frameName_5018Parser;

	/**
	* @generated
	*/
	private IParser getFrameName_5018Parser() {
		if (frameName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			frameName_5018Parser = parser;
		}
		return frameName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5010Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5010Parser() {
		if (groupName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5010Parser = parser;
		}
		return groupName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5009Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5009Parser() {
		if (groupName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5009Parser = parser;
		}
		return groupName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5001Parser() {
		if (buttonName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5001Parser = parser;
		}
		return buttonName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5002Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5002Parser() {
		if (checkBoxName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5002Parser = parser;
		}
		return checkBoxName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5003Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5003Parser() {
		if (switchName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5003Parser = parser;
		}
		return switchName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5004Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5004Parser() {
		if (comboBoxName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5004Parser = parser;
		}
		return comboBoxName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5005Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5005Parser() {
		if (labelName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5005Parser = parser;
		}
		return labelName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser textFieldName_5006Parser;

	/**
	* @generated
	*/
	private IParser getTextFieldName_5006Parser() {
		if (textFieldName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textFieldName_5006Parser = parser;
		}
		return textFieldName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser tableViewName_5008Parser;

	/**
	* @generated
	*/
	private IParser getTableViewName_5008Parser() {
		if (tableViewName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableViewName_5008Parser = parser;
		}
		return tableViewName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser tableColumnName_5007Parser;

	/**
	* @generated
	*/
	private IParser getTableColumnName_5007Parser() {
		if (tableColumnName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableColumnName_5007Parser = parser;
		}
		return tableColumnName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5011Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5011Parser() {
		if (buttonName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5011Parser = parser;
		}
		return buttonName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5012Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5012Parser() {
		if (checkBoxName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5012Parser = parser;
		}
		return checkBoxName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5013Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5013Parser() {
		if (switchName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5013Parser = parser;
		}
		return switchName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5014Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5014Parser() {
		if (comboBoxName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5014Parser = parser;
		}
		return comboBoxName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5015Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5015Parser() {
		if (labelName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5015Parser = parser;
		}
		return labelName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser textFieldName_5016Parser;

	/**
	* @generated
	*/
	private IParser getTextFieldName_5016Parser() {
		if (textFieldName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textFieldName_5016Parser = parser;
		}
		return textFieldName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser tableViewName_5017Parser;

	/**
	* @generated
	*/
	private IParser getTableViewName_5017Parser() {
		if (tableViewName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagrampartPackage.eINSTANCE.getPropertiesElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableViewName_5017Parser = parser;
		}
		return tableViewName_5017Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FrameNameEditPart.VISUAL_ID:
			return getFrameName_5018Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5010Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5009Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5001Parser();
		case CheckBoxNameEditPart.VISUAL_ID:
			return getCheckBoxName_5002Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5003Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5004Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5005Parser();
		case TextFieldNameEditPart.VISUAL_ID:
			return getTextFieldName_5006Parser();
		case TableViewNameEditPart.VISUAL_ID:
			return getTableViewName_5008Parser();
		case TableColumnNameEditPart.VISUAL_ID:
			return getTableColumnName_5007Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5011Parser();
		case CheckBoxName2EditPart.VISUAL_ID:
			return getCheckBoxName_5012Parser();
		case SwitchName2EditPart.VISUAL_ID:
			return getSwitchName_5013Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5014Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5015Parser();
		case TextFieldName2EditPart.VISUAL_ID:
			return getTextFieldName_5016Parser();
		case TableViewName2EditPart.VISUAL_ID:
			return getTableViewName_5017Parser();
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
			return getParser(UidiagrampartVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagrampartVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagrampartElementTypes.getElement(hint) == null) {
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
