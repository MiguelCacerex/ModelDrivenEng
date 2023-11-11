/**
 */
package uidiagrampart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uidiagrampart.UidiagrampartFactory
 * @model kind="package"
 * @generated
 */
public interface UidiagrampartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uidiagrampart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uidiagrampart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uidiagrampart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagrampartPackage eINSTANCE = uidiagrampart.impl.UidiagrampartPackageImpl.init();

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.ModelFactoryUIdiagramImpl <em>Model Factory UIdiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.ModelFactoryUIdiagramImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getModelFactoryUIdiagram()
	 * @generated
	 */
	int MODEL_FACTORY_UIDIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UIDIAGRAM__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UIDIAGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Lst Project Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD = 2;

	/**
	 * The number of structural features of the '<em>Model Factory UIdiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_UIDIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.ProjectBoardImpl <em>Project Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.ProjectBoardImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getProjectBoard()
	 * @generated
	 */
	int PROJECT_BOARD = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_BOARD__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_BOARD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_BOARD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Lst Frames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_BOARD__LST_FRAMES = 3;

	/**
	 * The number of structural features of the '<em>Project Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_BOARD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.PropertiesElementImpl <em>Properties Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.PropertiesElementImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getPropertiesElement()
	 * @generated
	 */
	int PROPERTIES_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__RADIUS = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__POSITION_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__STROKE = 7;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__OPACITY = 8;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT__BACKGROUND = 9;

	/**
	 * The number of structural features of the '<em>Properties Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_ELEMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.FrameImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__STATE = PROPERTIES_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = PROPERTIES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__RADIUS = PROPERTIES_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__POSITION_X = PROPERTIES_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__POSITION_Y = PROPERTIES_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__WIDTH = PROPERTIES_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__HEIGHT = PROPERTIES_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__STROKE = PROPERTIES_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__OPACITY = PROPERTIES_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BACKGROUND = PROPERTIES_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__UNIQUE_ID = PROPERTIES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lst Graphic Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__LST_GRAPHIC_ELEMENT = PROPERTIES_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = PROPERTIES_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.GraphicElementImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getGraphicElement()
	 * @generated
	 */
	int GRAPHIC_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__STATE = PROPERTIES_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__NAME = PROPERTIES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__RADIUS = PROPERTIES_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__POSITION_X = PROPERTIES_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__POSITION_Y = PROPERTIES_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__WIDTH = PROPERTIES_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__HEIGHT = PROPERTIES_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__STROKE = PROPERTIES_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__OPACITY = PROPERTIES_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__BACKGROUND = PROPERTIES_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT__UNIQUE_ID = PROPERTIES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_ELEMENT_FEATURE_COUNT = PROPERTIES_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.GroupImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Lst Graphic Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LST_GRAPHIC_ELEMENT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.ButtonImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.ImageImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.CheckBoxImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.SwitchImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.ComboBoxImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.LabelImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.TextFieldImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.TableViewImpl <em>Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.TableViewImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTableView()
	 * @generated
	 */
	int TABLE_VIEW = 12;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__STATE = GRAPHIC_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__NAME = GRAPHIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__RADIUS = GRAPHIC_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__POSITION_X = GRAPHIC_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__POSITION_Y = GRAPHIC_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__WIDTH = GRAPHIC_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__HEIGHT = GRAPHIC_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__STROKE = GRAPHIC_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__OPACITY = GRAPHIC_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__BACKGROUND = GRAPHIC_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__UNIQUE_ID = GRAPHIC_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Lst Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW__LST_COLUMNS = GRAPHIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FEATURE_COUNT = GRAPHIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagrampart.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagrampart.impl.TableColumnImpl
	 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 13;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__STATE = PROPERTIES_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__NAME = PROPERTIES_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__RADIUS = PROPERTIES_ELEMENT__RADIUS;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__POSITION_X = PROPERTIES_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__POSITION_Y = PROPERTIES_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__WIDTH = PROPERTIES_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__HEIGHT = PROPERTIES_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__STROKE = PROPERTIES_ELEMENT__STROKE;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__OPACITY = PROPERTIES_ELEMENT__OPACITY;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__BACKGROUND = PROPERTIES_ELEMENT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__UNIQUE_ID = PROPERTIES_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = PROPERTIES_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link uidiagrampart.ModelFactoryUIdiagram <em>Model Factory UIdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory UIdiagram</em>'.
	 * @see uidiagrampart.ModelFactoryUIdiagram
	 * @generated
	 */
	EClass getModelFactoryUIdiagram();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.ModelFactoryUIdiagram#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see uidiagrampart.ModelFactoryUIdiagram#getState()
	 * @see #getModelFactoryUIdiagram()
	 * @generated
	 */
	EAttribute getModelFactoryUIdiagram_State();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.ModelFactoryUIdiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagrampart.ModelFactoryUIdiagram#getName()
	 * @see #getModelFactoryUIdiagram()
	 * @generated
	 */
	EAttribute getModelFactoryUIdiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagrampart.ModelFactoryUIdiagram#getLstProjectBoard <em>Lst Project Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Project Board</em>'.
	 * @see uidiagrampart.ModelFactoryUIdiagram#getLstProjectBoard()
	 * @see #getModelFactoryUIdiagram()
	 * @generated
	 */
	EReference getModelFactoryUIdiagram_LstProjectBoard();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.ProjectBoard <em>Project Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Board</em>'.
	 * @see uidiagrampart.ProjectBoard
	 * @generated
	 */
	EClass getProjectBoard();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.ProjectBoard#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see uidiagrampart.ProjectBoard#getState()
	 * @see #getProjectBoard()
	 * @generated
	 */
	EAttribute getProjectBoard_State();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.ProjectBoard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagrampart.ProjectBoard#getName()
	 * @see #getProjectBoard()
	 * @generated
	 */
	EAttribute getProjectBoard_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.ProjectBoard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uidiagrampart.ProjectBoard#getDescription()
	 * @see #getProjectBoard()
	 * @generated
	 */
	EAttribute getProjectBoard_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagrampart.ProjectBoard#getLstFrames <em>Lst Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Frames</em>'.
	 * @see uidiagrampart.ProjectBoard#getLstFrames()
	 * @see #getProjectBoard()
	 * @generated
	 */
	EReference getProjectBoard_LstFrames();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see uidiagrampart.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.Frame#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see uidiagrampart.Frame#getUniqueID()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_UniqueID();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagrampart.Frame#getLstGraphicElement <em>Lst Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Graphic Element</em>'.
	 * @see uidiagrampart.Frame#getLstGraphicElement()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_LstGraphicElement();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.GraphicElement <em>Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Element</em>'.
	 * @see uidiagrampart.GraphicElement
	 * @generated
	 */
	EClass getGraphicElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.GraphicElement#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see uidiagrampart.GraphicElement#getUniqueID()
	 * @see #getGraphicElement()
	 * @generated
	 */
	EAttribute getGraphicElement_UniqueID();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see uidiagrampart.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagrampart.Group#getLstGraphicElement <em>Lst Graphic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Graphic Element</em>'.
	 * @see uidiagrampart.Group#getLstGraphicElement()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_LstGraphicElement();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uidiagrampart.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see uidiagrampart.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see uidiagrampart.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see uidiagrampart.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see uidiagrampart.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uidiagrampart.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see uidiagrampart.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.TableView <em>Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table View</em>'.
	 * @see uidiagrampart.TableView
	 * @generated
	 */
	EClass getTableView();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagrampart.TableView#getLstColumns <em>Lst Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Columns</em>'.
	 * @see uidiagrampart.TableView#getLstColumns()
	 * @see #getTableView()
	 * @generated
	 */
	EReference getTableView_LstColumns();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see uidiagrampart.TableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.TableColumn#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see uidiagrampart.TableColumn#getUniqueID()
	 * @see #getTableColumn()
	 * @generated
	 */
	EAttribute getTableColumn_UniqueID();

	/**
	 * Returns the meta object for class '{@link uidiagrampart.PropertiesElement <em>Properties Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Element</em>'.
	 * @see uidiagrampart.PropertiesElement
	 * @generated
	 */
	EClass getPropertiesElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see uidiagrampart.PropertiesElement#getState()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_State();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagrampart.PropertiesElement#getName()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see uidiagrampart.PropertiesElement#getRadius()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Radius();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagrampart.PropertiesElement#getPositionX()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagrampart.PropertiesElement#getPositionY()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagrampart.PropertiesElement#getWidth()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uidiagrampart.PropertiesElement#getHeight()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see uidiagrampart.PropertiesElement#getStroke()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see uidiagrampart.PropertiesElement#getOpacity()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link uidiagrampart.PropertiesElement#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see uidiagrampart.PropertiesElement#getBackground()
	 * @see #getPropertiesElement()
	 * @generated
	 */
	EAttribute getPropertiesElement_Background();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidiagrampartFactory getUidiagrampartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.ModelFactoryUIdiagramImpl <em>Model Factory UIdiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.ModelFactoryUIdiagramImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getModelFactoryUIdiagram()
		 * @generated
		 */
		EClass MODEL_FACTORY_UIDIAGRAM = eINSTANCE.getModelFactoryUIdiagram();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_UIDIAGRAM__STATE = eINSTANCE.getModelFactoryUIdiagram_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_UIDIAGRAM__NAME = eINSTANCE.getModelFactoryUIdiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Project Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_UIDIAGRAM__LST_PROJECT_BOARD = eINSTANCE.getModelFactoryUIdiagram_LstProjectBoard();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.ProjectBoardImpl <em>Project Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.ProjectBoardImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getProjectBoard()
		 * @generated
		 */
		EClass PROJECT_BOARD = eINSTANCE.getProjectBoard();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_BOARD__STATE = eINSTANCE.getProjectBoard_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_BOARD__NAME = eINSTANCE.getProjectBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_BOARD__DESCRIPTION = eINSTANCE.getProjectBoard_Description();

		/**
		 * The meta object literal for the '<em><b>Lst Frames</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_BOARD__LST_FRAMES = eINSTANCE.getProjectBoard_LstFrames();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.FrameImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__UNIQUE_ID = eINSTANCE.getFrame_UniqueID();

		/**
		 * The meta object literal for the '<em><b>Lst Graphic Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__LST_GRAPHIC_ELEMENT = eINSTANCE.getFrame_LstGraphicElement();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.GraphicElementImpl <em>Graphic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.GraphicElementImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getGraphicElement()
		 * @generated
		 */
		EClass GRAPHIC_ELEMENT = eINSTANCE.getGraphicElement();

		/**
		 * The meta object literal for the '<em><b>Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_ELEMENT__UNIQUE_ID = eINSTANCE.getGraphicElement_UniqueID();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.GroupImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Lst Graphic Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__LST_GRAPHIC_ELEMENT = eINSTANCE.getGroup_LstGraphicElement();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.ButtonImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.ImageImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.CheckBoxImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.SwitchImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.ComboBoxImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.LabelImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.TextFieldImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.TableViewImpl <em>Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.TableViewImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTableView()
		 * @generated
		 */
		EClass TABLE_VIEW = eINSTANCE.getTableView();

		/**
		 * The meta object literal for the '<em><b>Lst Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW__LST_COLUMNS = eINSTANCE.getTableView_LstColumns();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.TableColumnImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();

		/**
		 * The meta object literal for the '<em><b>Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN__UNIQUE_ID = eINSTANCE.getTableColumn_UniqueID();

		/**
		 * The meta object literal for the '{@link uidiagrampart.impl.PropertiesElementImpl <em>Properties Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagrampart.impl.PropertiesElementImpl
		 * @see uidiagrampart.impl.UidiagrampartPackageImpl#getPropertiesElement()
		 * @generated
		 */
		EClass PROPERTIES_ELEMENT = eINSTANCE.getPropertiesElement();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__STATE = eINSTANCE.getPropertiesElement_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__NAME = eINSTANCE.getPropertiesElement_Name();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__RADIUS = eINSTANCE.getPropertiesElement_Radius();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__POSITION_X = eINSTANCE.getPropertiesElement_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__POSITION_Y = eINSTANCE.getPropertiesElement_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__WIDTH = eINSTANCE.getPropertiesElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__HEIGHT = eINSTANCE.getPropertiesElement_Height();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__STROKE = eINSTANCE.getPropertiesElement_Stroke();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__OPACITY = eINSTANCE.getPropertiesElement_Opacity();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_ELEMENT__BACKGROUND = eINSTANCE.getPropertiesElement_Background();

	}

} //UidiagrampartPackage
