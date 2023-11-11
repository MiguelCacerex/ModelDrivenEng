/**
 */
package uidiagrampart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uidiagrampart.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagrampartFactoryImpl extends EFactoryImpl implements UidiagrampartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UidiagrampartFactory init() {
		try {
			UidiagrampartFactory theUidiagrampartFactory = (UidiagrampartFactory)EPackage.Registry.INSTANCE.getEFactory(UidiagrampartPackage.eNS_URI);
			if (theUidiagrampartFactory != null) {
				return theUidiagrampartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UidiagrampartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagrampartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UidiagrampartPackage.MODEL_FACTORY_UIDIAGRAM: return createModelFactoryUIdiagram();
			case UidiagrampartPackage.PROJECT_BOARD: return createProjectBoard();
			case UidiagrampartPackage.FRAME: return createFrame();
			case UidiagrampartPackage.GRAPHIC_ELEMENT: return createGraphicElement();
			case UidiagrampartPackage.GROUP: return createGroup();
			case UidiagrampartPackage.BUTTON: return createButton();
			case UidiagrampartPackage.IMAGE: return createImage();
			case UidiagrampartPackage.CHECK_BOX: return createCheckBox();
			case UidiagrampartPackage.SWITCH: return createSwitch();
			case UidiagrampartPackage.COMBO_BOX: return createComboBox();
			case UidiagrampartPackage.LABEL: return createLabel();
			case UidiagrampartPackage.TEXT_FIELD: return createTextField();
			case UidiagrampartPackage.TABLE_VIEW: return createTableView();
			case UidiagrampartPackage.TABLE_COLUMN: return createTableColumn();
			case UidiagrampartPackage.PROPERTIES_ELEMENT: return createPropertiesElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryUIdiagram createModelFactoryUIdiagram() {
		ModelFactoryUIdiagramImpl modelFactoryUIdiagram = new ModelFactoryUIdiagramImpl();
		return modelFactoryUIdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectBoard createProjectBoard() {
		ProjectBoardImpl projectBoard = new ProjectBoardImpl();
		return projectBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicElement createGraphicElement() {
		GraphicElementImpl graphicElement = new GraphicElementImpl();
		return graphicElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTableView() {
		TableViewImpl tableView = new TableViewImpl();
		return tableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn createTableColumn() {
		TableColumnImpl tableColumn = new TableColumnImpl();
		return tableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesElement createPropertiesElement() {
		PropertiesElementImpl propertiesElement = new PropertiesElementImpl();
		return propertiesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagrampartPackage getUidiagrampartPackage() {
		return (UidiagrampartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UidiagrampartPackage getPackage() {
		return UidiagrampartPackage.eINSTANCE;
	}

} //UidiagrampartFactoryImpl
