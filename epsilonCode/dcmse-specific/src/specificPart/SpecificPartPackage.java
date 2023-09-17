/**
 */
package specificPart;

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
 * @see specificPart.SpecificPartFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificPartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specificPart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "specificPart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specificPart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificPartPackage eINSTANCE = specificPart.impl.SpecificPartPackageImpl.init();

	/**
	 * The meta object id for the '{@link specificPart.impl.ModelFactorySpecificImpl <em>Model Factory Specific</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.ModelFactorySpecificImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getModelFactorySpecific()
	 * @generated
	 */
	int MODEL_FACTORY_SPECIFIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_SPECIFIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_SPECIFIC__LST_PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Specific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_SPECIFIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link specificPart.impl.ClassDiagramMSEImpl <em>Class Diagram MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.ClassDiagramMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getClassDiagramMSE()
	 * @generated
	 */
	int CLASS_DIAGRAM_MSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Lst Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LST_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Lst Inheritances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LST_INHERITANCES = 6;

	/**
	 * The feature id for the '<em><b>Lst Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LST_RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LST_PACKAGES = 8;

	/**
	 * The number of structural features of the '<em>Class Diagram MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link specificPart.impl.PackageMSEImpl <em>Package MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.PackageMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getPackageMSE()
	 * @generated
	 */
	int PACKAGE_MSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Lst Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LST_DIAGRAMS = 5;

	/**
	 * The number of structural features of the '<em>Package MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link specificPart.impl.ClassMSEImpl <em>Class MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.ClassMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getClassMSE()
	 * @generated
	 */
	int CLASS_MSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__MODIFIER = 3;

	/**
	 * The feature id for the '<em><b>Absrtact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__ABSRTACT = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__PATH = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__DOCUMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Lst Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LST_ATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Lst Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LST_METHODS = 9;

	/**
	 * The number of structural features of the '<em>Class MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link specificPart.impl.RelationMSEImpl <em>Relation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.RelationMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getRelationMSE()
	 * @generated
	 */
	int RELATION_MSE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__ROLE_A = 2;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__ROLE_B = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__MULTIPLICITY_A = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__MULTIPLICITY_B = 5;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__NAVIGABILITY_A = 6;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__NAVIGABILITY_B = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__TARGET = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__PATH = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__LOCATION = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__DOCUMENTATION = 12;

	/**
	 * The number of structural features of the '<em>Relation MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link specificPart.impl.InheritanceMSEImpl <em>Inheritance MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.InheritanceMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getInheritanceMSE()
	 * @generated
	 */
	int INHERITANCE_MSE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__PATH = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__DOCUMENTATION = 6;

	/**
	 * The number of structural features of the '<em>Inheritance MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link specificPart.impl.ContainmentMSEImpl <em>Containment MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.ContainmentMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getContainmentMSE()
	 * @generated
	 */
	int CONTAINMENT_MSE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__ROLE_A = RELATION_MSE__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__ROLE_B = RELATION_MSE__ROLE_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__MULTIPLICITY_A = RELATION_MSE__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__MULTIPLICITY_B = RELATION_MSE__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__NAVIGABILITY_A = RELATION_MSE__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__NAVIGABILITY_B = RELATION_MSE__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__SOURCE = RELATION_MSE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__TARGET = RELATION_MSE__TARGET;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__PATH = RELATION_MSE__PATH;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__LOCATION = RELATION_MSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__DOCUMENTATION = RELATION_MSE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Containment MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE_FEATURE_COUNT = RELATION_MSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specificPart.impl.AgregationMSEImpl <em>Agregation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.AgregationMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getAgregationMSE()
	 * @generated
	 */
	int AGREGATION_MSE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__ROLE_A = RELATION_MSE__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__ROLE_B = RELATION_MSE__ROLE_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__MULTIPLICITY_A = RELATION_MSE__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__MULTIPLICITY_B = RELATION_MSE__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__NAVIGABILITY_A = RELATION_MSE__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__NAVIGABILITY_B = RELATION_MSE__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__SOURCE = RELATION_MSE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__TARGET = RELATION_MSE__TARGET;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__PATH = RELATION_MSE__PATH;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__LOCATION = RELATION_MSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__DOCUMENTATION = RELATION_MSE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Agregation MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE_FEATURE_COUNT = RELATION_MSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specificPart.impl.AssociationMSEImpl <em>Association MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.AssociationMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getAssociationMSE()
	 * @generated
	 */
	int ASSOCIATION_MSE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__ROLE_A = RELATION_MSE__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__ROLE_B = RELATION_MSE__ROLE_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__MULTIPLICITY_A = RELATION_MSE__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__MULTIPLICITY_B = RELATION_MSE__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__NAVIGABILITY_A = RELATION_MSE__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__NAVIGABILITY_B = RELATION_MSE__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__SOURCE = RELATION_MSE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__TARGET = RELATION_MSE__TARGET;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__PATH = RELATION_MSE__PATH;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__LOCATION = RELATION_MSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__DOCUMENTATION = RELATION_MSE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Association MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE_FEATURE_COUNT = RELATION_MSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specificPart.impl.ImplementationMSEImpl <em>Implementation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.ImplementationMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getImplementationMSE()
	 * @generated
	 */
	int IMPLEMENTATION_MSE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Role A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__ROLE_A = RELATION_MSE__ROLE_A;

	/**
	 * The feature id for the '<em><b>Role B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__ROLE_B = RELATION_MSE__ROLE_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__MULTIPLICITY_A = RELATION_MSE__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__MULTIPLICITY_B = RELATION_MSE__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__NAVIGABILITY_A = RELATION_MSE__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__NAVIGABILITY_B = RELATION_MSE__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__SOURCE = RELATION_MSE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__TARGET = RELATION_MSE__TARGET;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__PATH = RELATION_MSE__PATH;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__LOCATION = RELATION_MSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__DOCUMENTATION = RELATION_MSE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Implementation MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE_FEATURE_COUNT = RELATION_MSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link specificPart.impl.MethodMSEImpl <em>Method MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.MethodMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getMethodMSE()
	 * @generated
	 */
	int METHOD_MSE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__BODY = 2;

	/**
	 * The feature id for the '<em><b>Type Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__TYPE_RETURN = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__STATE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__PATH = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__DOCUMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Lst Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__LST_ARGUMENTS = 8;

	/**
	 * The number of structural features of the '<em>Method MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link specificPart.impl.AttributeMSEImpl <em>Attribute MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specificPart.impl.AttributeMSEImpl
	 * @see specificPart.impl.SpecificPartPackageImpl#getAttributeMSE()
	 * @generated
	 */
	int ATTRIBUTE_MSE = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__INITIAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__PATH = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__DOCUMENTATION = 7;

	/**
	 * The number of structural features of the '<em>Attribute MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link specificPart.ModelFactorySpecific <em>Model Factory Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Specific</em>'.
	 * @see specificPart.ModelFactorySpecific
	 * @generated
	 */
	EClass getModelFactorySpecific();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ModelFactorySpecific#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.ModelFactorySpecific#getName()
	 * @see #getModelFactorySpecific()
	 * @generated
	 */
	EAttribute getModelFactorySpecific_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ModelFactorySpecific#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see specificPart.ModelFactorySpecific#getLstPackages()
	 * @see #getModelFactorySpecific()
	 * @generated
	 */
	EReference getModelFactorySpecific_LstPackages();

	/**
	 * Returns the meta object for class '{@link specificPart.ClassDiagramMSE <em>Class Diagram MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram MSE</em>'.
	 * @see specificPart.ClassDiagramMSE
	 * @generated
	 */
	EClass getClassDiagramMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassDiagramMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.ClassDiagramMSE#getName()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassDiagramMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.ClassDiagramMSE#getState()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassDiagramMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.ClassDiagramMSE#getPath()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassDiagramMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.ClassDiagramMSE#getLocation()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassDiagramMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.ClassDiagramMSE#getDocumentation()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassDiagramMSE#getLstClass <em>Lst Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class</em>'.
	 * @see specificPart.ClassDiagramMSE#getLstClass()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EReference getClassDiagramMSE_LstClass();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassDiagramMSE#getLstRelations <em>Lst Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Relations</em>'.
	 * @see specificPart.ClassDiagramMSE#getLstRelations()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EReference getClassDiagramMSE_LstRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassDiagramMSE#getLstInheritances <em>Lst Inheritances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Inheritances</em>'.
	 * @see specificPart.ClassDiagramMSE#getLstInheritances()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EReference getClassDiagramMSE_LstInheritances();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassDiagramMSE#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see specificPart.ClassDiagramMSE#getLstPackages()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EReference getClassDiagramMSE_LstPackages();

	/**
	 * Returns the meta object for class '{@link specificPart.PackageMSE <em>Package MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package MSE</em>'.
	 * @see specificPart.PackageMSE
	 * @generated
	 */
	EClass getPackageMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.PackageMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.PackageMSE#getName()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.PackageMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.PackageMSE#getState()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.PackageMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.PackageMSE#getPath()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.PackageMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.PackageMSE#getLocation()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.PackageMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.PackageMSE#getDocumentation()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.PackageMSE#getLstDiagrams <em>Lst Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Diagrams</em>'.
	 * @see specificPart.PackageMSE#getLstDiagrams()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EReference getPackageMSE_LstDiagrams();

	/**
	 * Returns the meta object for class '{@link specificPart.ClassMSE <em>Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class MSE</em>'.
	 * @see specificPart.ClassMSE
	 * @generated
	 */
	EClass getClassMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.ClassMSE#getName()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.ClassMSE#getState()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specificPart.ClassMSE#getType()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see specificPart.ClassMSE#getModifier()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#isAbsrtact <em>Absrtact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absrtact</em>'.
	 * @see specificPart.ClassMSE#isAbsrtact()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Absrtact();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.ClassMSE#getPath()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.ClassMSE#getLocation()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.ClassMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.ClassMSE#getDocumentation()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassMSE#getLstAttributes <em>Lst Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributes</em>'.
	 * @see specificPart.ClassMSE#getLstAttributes()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_LstAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.ClassMSE#getLstMethods <em>Lst Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Methods</em>'.
	 * @see specificPart.ClassMSE#getLstMethods()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_LstMethods();

	/**
	 * Returns the meta object for class '{@link specificPart.RelationMSE <em>Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation MSE</em>'.
	 * @see specificPart.RelationMSE
	 * @generated
	 */
	EClass getRelationMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specificPart.RelationMSE#getType()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.RelationMSE#getState()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getRoleA <em>Role A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role A</em>'.
	 * @see specificPart.RelationMSE#getRoleA()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_RoleA();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getRoleB <em>Role B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role B</em>'.
	 * @see specificPart.RelationMSE#getRoleB()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_RoleB();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getMultiplicityA <em>Multiplicity A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity A</em>'.
	 * @see specificPart.RelationMSE#getMultiplicityA()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_MultiplicityA();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getMultiplicityB <em>Multiplicity B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity B</em>'.
	 * @see specificPart.RelationMSE#getMultiplicityB()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_MultiplicityB();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#isNavigabilityA <em>Navigability A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability A</em>'.
	 * @see specificPart.RelationMSE#isNavigabilityA()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_NavigabilityA();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#isNavigabilityB <em>Navigability B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability B</em>'.
	 * @see specificPart.RelationMSE#isNavigabilityB()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_NavigabilityB();

	/**
	 * Returns the meta object for the reference '{@link specificPart.RelationMSE#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see specificPart.RelationMSE#getSource()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EReference getRelationMSE_Source();

	/**
	 * Returns the meta object for the reference '{@link specificPart.RelationMSE#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see specificPart.RelationMSE#getTarget()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EReference getRelationMSE_Target();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.RelationMSE#getPath()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.RelationMSE#getLocation()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.RelationMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.RelationMSE#getDocumentation()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Documentation();

	/**
	 * Returns the meta object for class '{@link specificPart.InheritanceMSE <em>Inheritance MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance MSE</em>'.
	 * @see specificPart.InheritanceMSE
	 * @generated
	 */
	EClass getInheritanceMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.InheritanceMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specificPart.InheritanceMSE#getType()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.InheritanceMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.InheritanceMSE#getState()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_State();

	/**
	 * Returns the meta object for the reference '{@link specificPart.InheritanceMSE#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see specificPart.InheritanceMSE#getSource()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EReference getInheritanceMSE_Source();

	/**
	 * Returns the meta object for the reference '{@link specificPart.InheritanceMSE#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see specificPart.InheritanceMSE#getTarget()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EReference getInheritanceMSE_Target();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.InheritanceMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.InheritanceMSE#getPath()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.InheritanceMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.InheritanceMSE#getLocation()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.InheritanceMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.InheritanceMSE#getDocumentation()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Documentation();

	/**
	 * Returns the meta object for class '{@link specificPart.ContainmentMSE <em>Containment MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment MSE</em>'.
	 * @see specificPart.ContainmentMSE
	 * @generated
	 */
	EClass getContainmentMSE();

	/**
	 * Returns the meta object for class '{@link specificPart.AgregationMSE <em>Agregation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregation MSE</em>'.
	 * @see specificPart.AgregationMSE
	 * @generated
	 */
	EClass getAgregationMSE();

	/**
	 * Returns the meta object for class '{@link specificPart.AssociationMSE <em>Association MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association MSE</em>'.
	 * @see specificPart.AssociationMSE
	 * @generated
	 */
	EClass getAssociationMSE();

	/**
	 * Returns the meta object for class '{@link specificPart.ImplementationMSE <em>Implementation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation MSE</em>'.
	 * @see specificPart.ImplementationMSE
	 * @generated
	 */
	EClass getImplementationMSE();

	/**
	 * Returns the meta object for class '{@link specificPart.MethodMSE <em>Method MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method MSE</em>'.
	 * @see specificPart.MethodMSE
	 * @generated
	 */
	EClass getMethodMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.MethodMSE#getName()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see specificPart.MethodMSE#getModifier()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see specificPart.MethodMSE#getBody()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Body();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getTypeReturn <em>Type Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Return</em>'.
	 * @see specificPart.MethodMSE#getTypeReturn()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_TypeReturn();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.MethodMSE#getState()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.MethodMSE#getPath()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.MethodMSE#getLocation()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.MethodMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.MethodMSE#getDocumentation()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link specificPart.MethodMSE#getLstArguments <em>Lst Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Arguments</em>'.
	 * @see specificPart.MethodMSE#getLstArguments()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EReference getMethodMSE_LstArguments();

	/**
	 * Returns the meta object for class '{@link specificPart.AttributeMSE <em>Attribute MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute MSE</em>'.
	 * @see specificPart.AttributeMSE
	 * @generated
	 */
	EClass getAttributeMSE();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see specificPart.AttributeMSE#getState()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see specificPart.AttributeMSE#getModifier()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see specificPart.AttributeMSE#getName()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see specificPart.AttributeMSE#getType()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see specificPart.AttributeMSE#getInitialValue()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see specificPart.AttributeMSE#getPath()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see specificPart.AttributeMSE#getLocation()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link specificPart.AttributeMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see specificPart.AttributeMSE#getDocumentation()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Documentation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecificPartFactory getSpecificPartFactory();

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
		 * The meta object literal for the '{@link specificPart.impl.ModelFactorySpecificImpl <em>Model Factory Specific</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.ModelFactorySpecificImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getModelFactorySpecific()
		 * @generated
		 */
		EClass MODEL_FACTORY_SPECIFIC = eINSTANCE.getModelFactorySpecific();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_SPECIFIC__NAME = eINSTANCE.getModelFactorySpecific_Name();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_SPECIFIC__LST_PACKAGES = eINSTANCE.getModelFactorySpecific_LstPackages();

		/**
		 * The meta object literal for the '{@link specificPart.impl.ClassDiagramMSEImpl <em>Class Diagram MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.ClassDiagramMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getClassDiagramMSE()
		 * @generated
		 */
		EClass CLASS_DIAGRAM_MSE = eINSTANCE.getClassDiagramMSE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__NAME = eINSTANCE.getClassDiagramMSE_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__STATE = eINSTANCE.getClassDiagramMSE_State();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__PATH = eINSTANCE.getClassDiagramMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__LOCATION = eINSTANCE.getClassDiagramMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__DOCUMENTATION = eINSTANCE.getClassDiagramMSE_Documentation();

		/**
		 * The meta object literal for the '<em><b>Lst Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_MSE__LST_CLASS = eINSTANCE.getClassDiagramMSE_LstClass();

		/**
		 * The meta object literal for the '<em><b>Lst Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_MSE__LST_RELATIONS = eINSTANCE.getClassDiagramMSE_LstRelations();

		/**
		 * The meta object literal for the '<em><b>Lst Inheritances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_MSE__LST_INHERITANCES = eINSTANCE.getClassDiagramMSE_LstInheritances();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_MSE__LST_PACKAGES = eINSTANCE.getClassDiagramMSE_LstPackages();

		/**
		 * The meta object literal for the '{@link specificPart.impl.PackageMSEImpl <em>Package MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.PackageMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getPackageMSE()
		 * @generated
		 */
		EClass PACKAGE_MSE = eINSTANCE.getPackageMSE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__NAME = eINSTANCE.getPackageMSE_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__STATE = eINSTANCE.getPackageMSE_State();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__PATH = eINSTANCE.getPackageMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__LOCATION = eINSTANCE.getPackageMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__DOCUMENTATION = eINSTANCE.getPackageMSE_Documentation();

		/**
		 * The meta object literal for the '<em><b>Lst Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSE__LST_DIAGRAMS = eINSTANCE.getPackageMSE_LstDiagrams();

		/**
		 * The meta object literal for the '{@link specificPart.impl.ClassMSEImpl <em>Class MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.ClassMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getClassMSE()
		 * @generated
		 */
		EClass CLASS_MSE = eINSTANCE.getClassMSE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__NAME = eINSTANCE.getClassMSE_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__STATE = eINSTANCE.getClassMSE_State();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__TYPE = eINSTANCE.getClassMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__MODIFIER = eINSTANCE.getClassMSE_Modifier();

		/**
		 * The meta object literal for the '<em><b>Absrtact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__ABSRTACT = eINSTANCE.getClassMSE_Absrtact();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__PATH = eINSTANCE.getClassMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__LOCATION = eINSTANCE.getClassMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__DOCUMENTATION = eINSTANCE.getClassMSE_Documentation();

		/**
		 * The meta object literal for the '<em><b>Lst Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__LST_ATTRIBUTES = eINSTANCE.getClassMSE_LstAttributes();

		/**
		 * The meta object literal for the '<em><b>Lst Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__LST_METHODS = eINSTANCE.getClassMSE_LstMethods();

		/**
		 * The meta object literal for the '{@link specificPart.impl.RelationMSEImpl <em>Relation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.RelationMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getRelationMSE()
		 * @generated
		 */
		EClass RELATION_MSE = eINSTANCE.getRelationMSE();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__TYPE = eINSTANCE.getRelationMSE_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__STATE = eINSTANCE.getRelationMSE_State();

		/**
		 * The meta object literal for the '<em><b>Role A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__ROLE_A = eINSTANCE.getRelationMSE_RoleA();

		/**
		 * The meta object literal for the '<em><b>Role B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__ROLE_B = eINSTANCE.getRelationMSE_RoleB();

		/**
		 * The meta object literal for the '<em><b>Multiplicity A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__MULTIPLICITY_A = eINSTANCE.getRelationMSE_MultiplicityA();

		/**
		 * The meta object literal for the '<em><b>Multiplicity B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__MULTIPLICITY_B = eINSTANCE.getRelationMSE_MultiplicityB();

		/**
		 * The meta object literal for the '<em><b>Navigability A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__NAVIGABILITY_A = eINSTANCE.getRelationMSE_NavigabilityA();

		/**
		 * The meta object literal for the '<em><b>Navigability B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__NAVIGABILITY_B = eINSTANCE.getRelationMSE_NavigabilityB();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MSE__SOURCE = eINSTANCE.getRelationMSE_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_MSE__TARGET = eINSTANCE.getRelationMSE_Target();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__PATH = eINSTANCE.getRelationMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__LOCATION = eINSTANCE.getRelationMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__DOCUMENTATION = eINSTANCE.getRelationMSE_Documentation();

		/**
		 * The meta object literal for the '{@link specificPart.impl.InheritanceMSEImpl <em>Inheritance MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.InheritanceMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getInheritanceMSE()
		 * @generated
		 */
		EClass INHERITANCE_MSE = eINSTANCE.getInheritanceMSE();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__TYPE = eINSTANCE.getInheritanceMSE_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__STATE = eINSTANCE.getInheritanceMSE_State();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_MSE__SOURCE = eINSTANCE.getInheritanceMSE_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_MSE__TARGET = eINSTANCE.getInheritanceMSE_Target();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__PATH = eINSTANCE.getInheritanceMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__LOCATION = eINSTANCE.getInheritanceMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__DOCUMENTATION = eINSTANCE.getInheritanceMSE_Documentation();

		/**
		 * The meta object literal for the '{@link specificPart.impl.ContainmentMSEImpl <em>Containment MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.ContainmentMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getContainmentMSE()
		 * @generated
		 */
		EClass CONTAINMENT_MSE = eINSTANCE.getContainmentMSE();

		/**
		 * The meta object literal for the '{@link specificPart.impl.AgregationMSEImpl <em>Agregation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.AgregationMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getAgregationMSE()
		 * @generated
		 */
		EClass AGREGATION_MSE = eINSTANCE.getAgregationMSE();

		/**
		 * The meta object literal for the '{@link specificPart.impl.AssociationMSEImpl <em>Association MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.AssociationMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getAssociationMSE()
		 * @generated
		 */
		EClass ASSOCIATION_MSE = eINSTANCE.getAssociationMSE();

		/**
		 * The meta object literal for the '{@link specificPart.impl.ImplementationMSEImpl <em>Implementation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.ImplementationMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getImplementationMSE()
		 * @generated
		 */
		EClass IMPLEMENTATION_MSE = eINSTANCE.getImplementationMSE();

		/**
		 * The meta object literal for the '{@link specificPart.impl.MethodMSEImpl <em>Method MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.MethodMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getMethodMSE()
		 * @generated
		 */
		EClass METHOD_MSE = eINSTANCE.getMethodMSE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__NAME = eINSTANCE.getMethodMSE_Name();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__MODIFIER = eINSTANCE.getMethodMSE_Modifier();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__BODY = eINSTANCE.getMethodMSE_Body();

		/**
		 * The meta object literal for the '<em><b>Type Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__TYPE_RETURN = eINSTANCE.getMethodMSE_TypeReturn();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__STATE = eINSTANCE.getMethodMSE_State();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__PATH = eINSTANCE.getMethodMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__LOCATION = eINSTANCE.getMethodMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__DOCUMENTATION = eINSTANCE.getMethodMSE_Documentation();

		/**
		 * The meta object literal for the '<em><b>Lst Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_MSE__LST_ARGUMENTS = eINSTANCE.getMethodMSE_LstArguments();

		/**
		 * The meta object literal for the '{@link specificPart.impl.AttributeMSEImpl <em>Attribute MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specificPart.impl.AttributeMSEImpl
		 * @see specificPart.impl.SpecificPartPackageImpl#getAttributeMSE()
		 * @generated
		 */
		EClass ATTRIBUTE_MSE = eINSTANCE.getAttributeMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__STATE = eINSTANCE.getAttributeMSE_State();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__MODIFIER = eINSTANCE.getAttributeMSE_Modifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__NAME = eINSTANCE.getAttributeMSE_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__TYPE = eINSTANCE.getAttributeMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__INITIAL_VALUE = eINSTANCE.getAttributeMSE_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__PATH = eINSTANCE.getAttributeMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__LOCATION = eINSTANCE.getAttributeMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__DOCUMENTATION = eINSTANCE.getAttributeMSE_Documentation();

	}

} //SpecificPartPackage
