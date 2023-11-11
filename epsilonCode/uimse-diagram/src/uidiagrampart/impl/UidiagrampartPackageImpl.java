/**
 */
package uidiagrampart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uidiagrampart.Button;
import uidiagrampart.CheckBox;
import uidiagrampart.ComboBox;
import uidiagrampart.Frame;
import uidiagrampart.GraphicElement;
import uidiagrampart.Group;
import uidiagrampart.Image;
import uidiagrampart.Label;
import uidiagrampart.ModelFactoryUIdiagram;
import uidiagrampart.ProjectBoard;
import uidiagrampart.PropertiesElement;
import uidiagrampart.Switch;
import uidiagrampart.TableColumn;
import uidiagrampart.TableView;
import uidiagrampart.TextField;
import uidiagrampart.UidiagrampartFactory;
import uidiagrampart.UidiagrampartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagrampartPackageImpl extends EPackageImpl implements UidiagrampartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryUIdiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uidiagrampart.UidiagrampartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UidiagrampartPackageImpl() {
		super(eNS_URI, UidiagrampartFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UidiagrampartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UidiagrampartPackage init() {
		if (isInited) return (UidiagrampartPackage)EPackage.Registry.INSTANCE.getEPackage(UidiagrampartPackage.eNS_URI);

		// Obtain or create and register package
		UidiagrampartPackageImpl theUidiagrampartPackage = (UidiagrampartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UidiagrampartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UidiagrampartPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUidiagrampartPackage.createPackageContents();

		// Initialize created meta-data
		theUidiagrampartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUidiagrampartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UidiagrampartPackage.eNS_URI, theUidiagrampartPackage);
		return theUidiagrampartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryUIdiagram() {
		return modelFactoryUIdiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactoryUIdiagram_State() {
		return (EAttribute)modelFactoryUIdiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactoryUIdiagram_Name() {
		return (EAttribute)modelFactoryUIdiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryUIdiagram_LstProjectBoard() {
		return (EReference)modelFactoryUIdiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectBoard() {
		return projectBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectBoard_State() {
		return (EAttribute)projectBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectBoard_Name() {
		return (EAttribute)projectBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectBoard_Description() {
		return (EAttribute)projectBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectBoard_LstFrames() {
		return (EReference)projectBoardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrame_UniqueID() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_LstGraphicElement() {
		return (EReference)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicElement() {
		return graphicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicElement_UniqueID() {
		return (EAttribute)graphicElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_LstGraphicElement() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableView() {
		return tableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableView_LstColumns() {
		return (EReference)tableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableColumn_UniqueID() {
		return (EAttribute)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesElement() {
		return propertiesElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_State() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Name() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Radius() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_PositionX() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_PositionY() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Width() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Height() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Stroke() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Opacity() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesElement_Background() {
		return (EAttribute)propertiesElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagrampartFactory getUidiagrampartFactory() {
		return (UidiagrampartFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryUIdiagramEClass = createEClass(MODEL_FACTORY_UIDIAGRAM);
		createEAttribute(modelFactoryUIdiagramEClass, MODEL_FACTORY_UIDIAGRAM__STATE);
		createEAttribute(modelFactoryUIdiagramEClass, MODEL_FACTORY_UIDIAGRAM__NAME);
		createEReference(modelFactoryUIdiagramEClass, MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD);

		projectBoardEClass = createEClass(PROJECT_BOARD);
		createEAttribute(projectBoardEClass, PROJECT_BOARD__STATE);
		createEAttribute(projectBoardEClass, PROJECT_BOARD__NAME);
		createEAttribute(projectBoardEClass, PROJECT_BOARD__DESCRIPTION);
		createEReference(projectBoardEClass, PROJECT_BOARD__LST_FRAMES);

		frameEClass = createEClass(FRAME);
		createEAttribute(frameEClass, FRAME__UNIQUE_ID);
		createEReference(frameEClass, FRAME__LST_GRAPHIC_ELEMENT);

		graphicElementEClass = createEClass(GRAPHIC_ELEMENT);
		createEAttribute(graphicElementEClass, GRAPHIC_ELEMENT__UNIQUE_ID);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__LST_GRAPHIC_ELEMENT);

		buttonEClass = createEClass(BUTTON);

		imageEClass = createEClass(IMAGE);

		checkBoxEClass = createEClass(CHECK_BOX);

		switchEClass = createEClass(SWITCH);

		comboBoxEClass = createEClass(COMBO_BOX);

		labelEClass = createEClass(LABEL);

		textFieldEClass = createEClass(TEXT_FIELD);

		tableViewEClass = createEClass(TABLE_VIEW);
		createEReference(tableViewEClass, TABLE_VIEW__LST_COLUMNS);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEAttribute(tableColumnEClass, TABLE_COLUMN__UNIQUE_ID);

		propertiesElementEClass = createEClass(PROPERTIES_ELEMENT);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__STATE);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__NAME);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__RADIUS);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__POSITION_X);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__POSITION_Y);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__WIDTH);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__HEIGHT);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__STROKE);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__OPACITY);
		createEAttribute(propertiesElementEClass, PROPERTIES_ELEMENT__BACKGROUND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		frameEClass.getESuperTypes().add(this.getPropertiesElement());
		graphicElementEClass.getESuperTypes().add(this.getPropertiesElement());
		groupEClass.getESuperTypes().add(this.getGraphicElement());
		buttonEClass.getESuperTypes().add(this.getGraphicElement());
		imageEClass.getESuperTypes().add(this.getGraphicElement());
		checkBoxEClass.getESuperTypes().add(this.getGraphicElement());
		switchEClass.getESuperTypes().add(this.getGraphicElement());
		comboBoxEClass.getESuperTypes().add(this.getGraphicElement());
		labelEClass.getESuperTypes().add(this.getGraphicElement());
		textFieldEClass.getESuperTypes().add(this.getGraphicElement());
		tableViewEClass.getESuperTypes().add(this.getGraphicElement());
		tableColumnEClass.getESuperTypes().add(this.getPropertiesElement());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryUIdiagramEClass, ModelFactoryUIdiagram.class, "ModelFactoryUIdiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactoryUIdiagram_State(), ecorePackage.getEString(), "state", null, 0, 1, ModelFactoryUIdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactoryUIdiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelFactoryUIdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryUIdiagram_LstProjectBoard(), this.getProjectBoard(), null, "lstProjectBoard", null, 0, -1, ModelFactoryUIdiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectBoardEClass, ProjectBoard.class, "ProjectBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectBoard_State(), ecorePackage.getEString(), "state", null, 0, 1, ProjectBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectBoard_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectBoard_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProjectBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectBoard_LstFrames(), this.getFrame(), null, "lstFrames", null, 0, -1, ProjectBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrame_UniqueID(), ecorePackage.getEString(), "uniqueID", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_LstGraphicElement(), this.getGraphicElement(), null, "lstGraphicElement", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicElementEClass, GraphicElement.class, "GraphicElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicElement_UniqueID(), ecorePackage.getEString(), "uniqueID", null, 0, 1, GraphicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_LstGraphicElement(), this.getGraphicElement(), null, "lstGraphicElement", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableViewEClass, TableView.class, "TableView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableView_LstColumns(), this.getTableColumn(), null, "lstColumns", null, 0, -1, TableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnEClass, TableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumn_UniqueID(), ecorePackage.getEString(), "uniqueID", null, 0, 1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesElementEClass, PropertiesElement.class, "PropertiesElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesElement_State(), ecorePackage.getEString(), "state", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Radius(), ecorePackage.getEString(), "radius", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_PositionX(), ecorePackage.getEString(), "positionX", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_PositionY(), ecorePackage.getEString(), "positionY", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Width(), ecorePackage.getEString(), "width", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Height(), ecorePackage.getEString(), "height", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Stroke(), ecorePackage.getEString(), "stroke", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Opacity(), ecorePackage.getEString(), "opacity", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesElement_Background(), ecorePackage.getEString(), "background", null, 0, 1, PropertiesElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (projectBoardEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (frameEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "color", "191,201,202"
		   });	
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/uimse-diagram.diagram/icons/imgUI.svg"
		   });	
		addAnnotation
		  (checkBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.placement", "external",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.placement", "external",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (comboBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (labelEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "255,255,255",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (textFieldEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "label.text", "TextField"
		   });	
		addAnnotation
		  (tableViewEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false"
		   });	
		addAnnotation
		  (tableColumnEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getFrame_LstGraphicElement(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getGroup_LstGraphicElement(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getTableView_LstColumns(), 
		   source, 
		   new String[] {
			 "collapsible", "false",
			 "layout", "list"
		   });
	}

} //UidiagrampartPackageImpl
