/**
 */
package abstractPart;

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
 * @see abstractPart.AbstractPartFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractPartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractPart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstractPart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractPart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractPartPackage eINSTANCE = abstractPart.impl.AbstractPartPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstractPart.impl.ModelFactoryAbstractImpl <em>Model Factory Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.ModelFactoryAbstractImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getModelFactoryAbstract()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__STATE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__PATH = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT__LST_PACKAGES = 5;

	/**
	 * The number of structural features of the '<em>Model Factory Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstractPart.impl.PackageMSEImpl <em>Package MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.PackageMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getPackageMSE()
	 * @generated
	 */
	int PACKAGE_MSE = 1;

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
	 * The feature id for the '<em><b>Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__ASSOCIATIONS = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__PATH = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Lst Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LST_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LST_PACKAGES = 7;

	/**
	 * The feature id for the '<em><b>Lst Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE__LST_DIAGRAMS = 8;

	/**
	 * The number of structural features of the '<em>Package MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MSE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link abstractPart.impl.ClassDiagramMSEImpl <em>Class Diagram MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.ClassDiagramMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getClassDiagramMSE()
	 * @generated
	 */
	int CLASS_DIAGRAM_MSE = 2;

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
	 * The feature id for the '<em><b>Lst Identifier Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE__LST_IDENTIFIER_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Class Diagram MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_MSE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstractPart.impl.ClassMSEImpl <em>Class MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.ClassMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getClassMSE()
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
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__DOCUMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Lst Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LST_METHODS = 9;

	/**
	 * The feature id for the '<em><b>Lst Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LST_ATTRIBUTES = 10;

	/**
	 * The feature id for the '<em><b>Lst Attributes Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE__LST_ATTRIBUTES_RELATIONS = 11;

	/**
	 * The number of structural features of the '<em>Class MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MSE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link abstractPart.impl.MethodMSEImpl <em>Method MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.MethodMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getMethodMSE()
	 * @generated
	 */
	int METHOD_MSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Type Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_MSE__TYPE_RETURN = 4;

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
	 * The meta object id for the '{@link abstractPart.impl.AttributeMSEImpl <em>Attribute MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.AttributeMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getAttributeMSE()
	 * @generated
	 */
	int ATTRIBUTE_MSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__MODIFIER = 2;

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
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE__LOCATION = 7;

	/**
	 * The number of structural features of the '<em>Attribute MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MSE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractPart.impl.AttributeRelationMSEImpl <em>Attribute Relation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.AttributeRelationMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getAttributeRelationMSE()
	 * @generated
	 */
	int ATTRIBUTE_RELATION_MSE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__INITIAL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Type Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE__TYPE_PARENT = 8;

	/**
	 * The number of structural features of the '<em>Attribute Relation MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_MSE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link abstractPart.impl.HashCodeClassMSEImpl <em>Hash Code Class MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.HashCodeClassMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getHashCodeClassMSE()
	 * @generated
	 */
	int HASH_CODE_CLASS_MSE = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_CLASS_MSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_CLASS_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_CLASS_MSE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_CLASS_MSE__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Hash Code Class MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_CODE_CLASS_MSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstractPart.impl.AssociationsMSEImpl <em>Associations MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.AssociationsMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getAssociationsMSE()
	 * @generated
	 */
	int ASSOCIATIONS_MSE = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Lst Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LST_CONTAINMENTS = 3;

	/**
	 * The feature id for the '<em><b>Lst Agregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LST_AGREGATIONS = 4;

	/**
	 * The feature id for the '<em><b>Lst Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LST_ASSOCIATIONS = 5;

	/**
	 * The feature id for the '<em><b>Lst Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS = 6;

	/**
	 * The feature id for the '<em><b>Lst Inheritance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE__LST_INHERITANCE = 7;

	/**
	 * The number of structural features of the '<em>Associations MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIONS_MSE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractPart.impl.RelationMSEImpl <em>Relation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.RelationMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getRelationMSE()
	 * @generated
	 */
	int RELATION_MSE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__ROLE_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__ROLE_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__MULTIPLICITY_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__MULTIPLICITY_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__NAVIGABILITY_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__NAVIGABILITY_TARGET = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__SOURCE = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__TARGET = 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__PATH = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE__DOCUMENTATION = 13;

	/**
	 * The number of structural features of the '<em>Relation MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MSE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link abstractPart.impl.InheritanceMSEImpl <em>Inheritance MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.InheritanceMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getInheritanceMSE()
	 * @generated
	 */
	int INHERITANCE_MSE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__CHILD = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__PATH = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE__DOCUMENTATION = 7;

	/**
	 * The number of structural features of the '<em>Inheritance MSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_MSE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractPart.impl.ContainmentMSEImpl <em>Containment MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.ContainmentMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getContainmentMSE()
	 * @generated
	 */
	int CONTAINMENT_MSE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__NAME = RELATION_MSE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__ROLE_SOURCE = RELATION_MSE__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__ROLE_TARGET = RELATION_MSE__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__MULTIPLICITY_SOURCE = RELATION_MSE__MULTIPLICITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__MULTIPLICITY_TARGET = RELATION_MSE__MULTIPLICITY_TARGET;

	/**
	 * The feature id for the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__NAVIGABILITY_SOURCE = RELATION_MSE__NAVIGABILITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_MSE__NAVIGABILITY_TARGET = RELATION_MSE__NAVIGABILITY_TARGET;

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
	 * The meta object id for the '{@link abstractPart.impl.AgregationMSEImpl <em>Agregation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.AgregationMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getAgregationMSE()
	 * @generated
	 */
	int AGREGATION_MSE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__NAME = RELATION_MSE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__ROLE_SOURCE = RELATION_MSE__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__ROLE_TARGET = RELATION_MSE__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__MULTIPLICITY_SOURCE = RELATION_MSE__MULTIPLICITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__MULTIPLICITY_TARGET = RELATION_MSE__MULTIPLICITY_TARGET;

	/**
	 * The feature id for the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__NAVIGABILITY_SOURCE = RELATION_MSE__NAVIGABILITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_MSE__NAVIGABILITY_TARGET = RELATION_MSE__NAVIGABILITY_TARGET;

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
	 * The meta object id for the '{@link abstractPart.impl.AssociationMSEImpl <em>Association MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.AssociationMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getAssociationMSE()
	 * @generated
	 */
	int ASSOCIATION_MSE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__NAME = RELATION_MSE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__ROLE_SOURCE = RELATION_MSE__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__ROLE_TARGET = RELATION_MSE__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__MULTIPLICITY_SOURCE = RELATION_MSE__MULTIPLICITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__MULTIPLICITY_TARGET = RELATION_MSE__MULTIPLICITY_TARGET;

	/**
	 * The feature id for the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__NAVIGABILITY_SOURCE = RELATION_MSE__NAVIGABILITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MSE__NAVIGABILITY_TARGET = RELATION_MSE__NAVIGABILITY_TARGET;

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
	 * The meta object id for the '{@link abstractPart.impl.ImplementationMSEImpl <em>Implementation MSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractPart.impl.ImplementationMSEImpl
	 * @see abstractPart.impl.AbstractPartPackageImpl#getImplementationMSE()
	 * @generated
	 */
	int IMPLEMENTATION_MSE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__NAME = RELATION_MSE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__STATE = RELATION_MSE__STATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__TYPE = RELATION_MSE__TYPE;

	/**
	 * The feature id for the '<em><b>Role Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__ROLE_SOURCE = RELATION_MSE__ROLE_SOURCE;

	/**
	 * The feature id for the '<em><b>Role Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__ROLE_TARGET = RELATION_MSE__ROLE_TARGET;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__MULTIPLICITY_SOURCE = RELATION_MSE__MULTIPLICITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__MULTIPLICITY_TARGET = RELATION_MSE__MULTIPLICITY_TARGET;

	/**
	 * The feature id for the '<em><b>Navigability Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__NAVIGABILITY_SOURCE = RELATION_MSE__NAVIGABILITY_SOURCE;

	/**
	 * The feature id for the '<em><b>Navigability Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_MSE__NAVIGABILITY_TARGET = RELATION_MSE__NAVIGABILITY_TARGET;

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
	 * Returns the meta object for class '{@link abstractPart.ModelFactoryAbstract <em>Model Factory Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstract</em>'.
	 * @see abstractPart.ModelFactoryAbstract
	 * @generated
	 */
	EClass getModelFactoryAbstract();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ModelFactoryAbstract#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getState()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EAttribute getModelFactoryAbstract_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ModelFactoryAbstract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getName()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EAttribute getModelFactoryAbstract_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ModelFactoryAbstract#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getPath()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EAttribute getModelFactoryAbstract_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ModelFactoryAbstract#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getLocation()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EAttribute getModelFactoryAbstract_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ModelFactoryAbstract#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getDocumentation()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EAttribute getModelFactoryAbstract_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.ModelFactoryAbstract#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see abstractPart.ModelFactoryAbstract#getLstPackages()
	 * @see #getModelFactoryAbstract()
	 * @generated
	 */
	EReference getModelFactoryAbstract_LstPackages();

	/**
	 * Returns the meta object for class '{@link abstractPart.PackageMSE <em>Package MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package MSE</em>'.
	 * @see abstractPart.PackageMSE
	 * @generated
	 */
	EClass getPackageMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.PackageMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.PackageMSE#getState()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.PackageMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.PackageMSE#getName()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Name();

	/**
	 * Returns the meta object for the containment reference '{@link abstractPart.PackageMSE#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Associations</em>'.
	 * @see abstractPart.PackageMSE#getAssociations()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EReference getPackageMSE_Associations();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.PackageMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.PackageMSE#getPath()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.PackageMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.PackageMSE#getLocation()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.PackageMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.PackageMSE#getDocumentation()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EAttribute getPackageMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.PackageMSE#getLstClass <em>Lst Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Class</em>'.
	 * @see abstractPart.PackageMSE#getLstClass()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EReference getPackageMSE_LstClass();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.PackageMSE#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see abstractPart.PackageMSE#getLstPackages()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EReference getPackageMSE_LstPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.PackageMSE#getLstDiagrams <em>Lst Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Diagrams</em>'.
	 * @see abstractPart.PackageMSE#getLstDiagrams()
	 * @see #getPackageMSE()
	 * @generated
	 */
	EReference getPackageMSE_LstDiagrams();

	/**
	 * Returns the meta object for class '{@link abstractPart.ClassDiagramMSE <em>Class Diagram MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram MSE</em>'.
	 * @see abstractPart.ClassDiagramMSE
	 * @generated
	 */
	EClass getClassDiagramMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassDiagramMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.ClassDiagramMSE#getState()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassDiagramMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.ClassDiagramMSE#getName()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassDiagramMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.ClassDiagramMSE#getPath()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassDiagramMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.ClassDiagramMSE#getLocation()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassDiagramMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.ClassDiagramMSE#getDocumentation()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EAttribute getClassDiagramMSE_Documentation();

	/**
	 * Returns the meta object for the reference list '{@link abstractPart.ClassDiagramMSE#getLstIdentifierClass <em>Lst Identifier Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Identifier Class</em>'.
	 * @see abstractPart.ClassDiagramMSE#getLstIdentifierClass()
	 * @see #getClassDiagramMSE()
	 * @generated
	 */
	EReference getClassDiagramMSE_LstIdentifierClass();

	/**
	 * Returns the meta object for class '{@link abstractPart.ClassMSE <em>Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class MSE</em>'.
	 * @see abstractPart.ClassMSE
	 * @generated
	 */
	EClass getClassMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.ClassMSE#getState()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.ClassMSE#getName()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractPart.ClassMSE#getType()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see abstractPart.ClassMSE#getModifier()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#isAbsrtact <em>Absrtact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absrtact</em>'.
	 * @see abstractPart.ClassMSE#isAbsrtact()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Absrtact();

	/**
	 * Returns the meta object for the containment reference '{@link abstractPart.ClassMSE#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see abstractPart.ClassMSE#getIdentifier()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.ClassMSE#getPath()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.ClassMSE#getLocation()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.ClassMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.ClassMSE#getDocumentation()
	 * @see #getClassMSE()
	 * @generated
	 */
	EAttribute getClassMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.ClassMSE#getLstMethods <em>Lst Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Methods</em>'.
	 * @see abstractPart.ClassMSE#getLstMethods()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_LstMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.ClassMSE#getLstAttributes <em>Lst Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributes</em>'.
	 * @see abstractPart.ClassMSE#getLstAttributes()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_LstAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.ClassMSE#getLstAttributesRelations <em>Lst Attributes Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributes Relations</em>'.
	 * @see abstractPart.ClassMSE#getLstAttributesRelations()
	 * @see #getClassMSE()
	 * @generated
	 */
	EReference getClassMSE_LstAttributesRelations();

	/**
	 * Returns the meta object for class '{@link abstractPart.MethodMSE <em>Method MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method MSE</em>'.
	 * @see abstractPart.MethodMSE
	 * @generated
	 */
	EClass getMethodMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.MethodMSE#getState()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see abstractPart.MethodMSE#getModifier()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.MethodMSE#getName()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see abstractPart.MethodMSE#getBody()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Body();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getTypeReturn <em>Type Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Return</em>'.
	 * @see abstractPart.MethodMSE#getTypeReturn()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_TypeReturn();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.MethodMSE#getPath()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.MethodMSE#getLocation()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.MethodMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.MethodMSE#getDocumentation()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EAttribute getMethodMSE_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.MethodMSE#getLstArguments <em>Lst Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Arguments</em>'.
	 * @see abstractPart.MethodMSE#getLstArguments()
	 * @see #getMethodMSE()
	 * @generated
	 */
	EReference getMethodMSE_LstArguments();

	/**
	 * Returns the meta object for class '{@link abstractPart.AttributeMSE <em>Attribute MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute MSE</em>'.
	 * @see abstractPart.AttributeMSE
	 * @generated
	 */
	EClass getAttributeMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.AttributeMSE#getState()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see abstractPart.AttributeMSE#getModifier()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractPart.AttributeMSE#getType()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.AttributeMSE#getName()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see abstractPart.AttributeMSE#getInitialValue()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.AttributeMSE#getDocumentation()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.AttributeMSE#getPath()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.AttributeMSE#getLocation()
	 * @see #getAttributeMSE()
	 * @generated
	 */
	EAttribute getAttributeMSE_Location();

	/**
	 * Returns the meta object for class '{@link abstractPart.AttributeRelationMSE <em>Attribute Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Relation MSE</em>'.
	 * @see abstractPart.AttributeRelationMSE
	 * @generated
	 */
	EClass getAttributeRelationMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.AttributeRelationMSE#getName()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.AttributeRelationMSE#getState()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see abstractPart.AttributeRelationMSE#getModifier()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractPart.AttributeRelationMSE#getType()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see abstractPart.AttributeRelationMSE#getInitialValue()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.AttributeRelationMSE#getDocumentation()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.AttributeRelationMSE#getPath()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.AttributeRelationMSE#getLocation()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AttributeRelationMSE#getTypeParent <em>Type Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Parent</em>'.
	 * @see abstractPart.AttributeRelationMSE#getTypeParent()
	 * @see #getAttributeRelationMSE()
	 * @generated
	 */
	EAttribute getAttributeRelationMSE_TypeParent();

	/**
	 * Returns the meta object for class '{@link abstractPart.HashCodeClassMSE <em>Hash Code Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Code Class MSE</em>'.
	 * @see abstractPart.HashCodeClassMSE
	 * @generated
	 */
	EClass getHashCodeClassMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.HashCodeClassMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.HashCodeClassMSE#getState()
	 * @see #getHashCodeClassMSE()
	 * @generated
	 */
	EAttribute getHashCodeClassMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.HashCodeClassMSE#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see abstractPart.HashCodeClassMSE#getCode()
	 * @see #getHashCodeClassMSE()
	 * @generated
	 */
	EAttribute getHashCodeClassMSE_Code();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.HashCodeClassMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.HashCodeClassMSE#getPath()
	 * @see #getHashCodeClassMSE()
	 * @generated
	 */
	EAttribute getHashCodeClassMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.HashCodeClassMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.HashCodeClassMSE#getLocation()
	 * @see #getHashCodeClassMSE()
	 * @generated
	 */
	EAttribute getHashCodeClassMSE_Location();

	/**
	 * Returns the meta object for class '{@link abstractPart.AssociationsMSE <em>Associations MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associations MSE</em>'.
	 * @see abstractPart.AssociationsMSE
	 * @generated
	 */
	EClass getAssociationsMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AssociationsMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.AssociationsMSE#getState()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EAttribute getAssociationsMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AssociationsMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.AssociationsMSE#getPath()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EAttribute getAssociationsMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.AssociationsMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.AssociationsMSE#getLocation()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EAttribute getAssociationsMSE_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.AssociationsMSE#getLstContainments <em>Lst Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Containments</em>'.
	 * @see abstractPart.AssociationsMSE#getLstContainments()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EReference getAssociationsMSE_LstContainments();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.AssociationsMSE#getLstAgregations <em>Lst Agregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Agregations</em>'.
	 * @see abstractPart.AssociationsMSE#getLstAgregations()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EReference getAssociationsMSE_LstAgregations();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.AssociationsMSE#getLstAssociations <em>Lst Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Associations</em>'.
	 * @see abstractPart.AssociationsMSE#getLstAssociations()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EReference getAssociationsMSE_LstAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.AssociationsMSE#getLstImplementations <em>Lst Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Implementations</em>'.
	 * @see abstractPart.AssociationsMSE#getLstImplementations()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EReference getAssociationsMSE_LstImplementations();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractPart.AssociationsMSE#getLstInheritance <em>Lst Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Inheritance</em>'.
	 * @see abstractPart.AssociationsMSE#getLstInheritance()
	 * @see #getAssociationsMSE()
	 * @generated
	 */
	EReference getAssociationsMSE_LstInheritance();

	/**
	 * Returns the meta object for class '{@link abstractPart.RelationMSE <em>Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation MSE</em>'.
	 * @see abstractPart.RelationMSE
	 * @generated
	 */
	EClass getRelationMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.RelationMSE#getState()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.RelationMSE#getName()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractPart.RelationMSE#getType()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getRoleSource <em>Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Source</em>'.
	 * @see abstractPart.RelationMSE#getRoleSource()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_RoleSource();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getRoleTarget <em>Role Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Target</em>'.
	 * @see abstractPart.RelationMSE#getRoleTarget()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_RoleTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see abstractPart.RelationMSE#getMultiplicitySource()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see abstractPart.RelationMSE#getMultiplicityTarget()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#isNavigabilitySource <em>Navigability Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability Source</em>'.
	 * @see abstractPart.RelationMSE#isNavigabilitySource()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_NavigabilitySource();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#isNavigabilityTarget <em>Navigability Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability Target</em>'.
	 * @see abstractPart.RelationMSE#isNavigabilityTarget()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_NavigabilityTarget();

	/**
	 * Returns the meta object for the reference '{@link abstractPart.RelationMSE#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstractPart.RelationMSE#getSource()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EReference getRelationMSE_Source();

	/**
	 * Returns the meta object for the reference '{@link abstractPart.RelationMSE#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstractPart.RelationMSE#getTarget()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EReference getRelationMSE_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.RelationMSE#getPath()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.RelationMSE#getLocation()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.RelationMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.RelationMSE#getDocumentation()
	 * @see #getRelationMSE()
	 * @generated
	 */
	EAttribute getRelationMSE_Documentation();

	/**
	 * Returns the meta object for class '{@link abstractPart.InheritanceMSE <em>Inheritance MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance MSE</em>'.
	 * @see abstractPart.InheritanceMSE
	 * @generated
	 */
	EClass getInheritanceMSE();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see abstractPart.InheritanceMSE#getState()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_State();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractPart.InheritanceMSE#getType()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Type();

	/**
	 * Returns the meta object for the reference '{@link abstractPart.InheritanceMSE#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see abstractPart.InheritanceMSE#getChild()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EReference getInheritanceMSE_Child();

	/**
	 * Returns the meta object for the reference '{@link abstractPart.InheritanceMSE#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see abstractPart.InheritanceMSE#getParent()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EReference getInheritanceMSE_Parent();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractPart.InheritanceMSE#getName()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstractPart.InheritanceMSE#getPath()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Path();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see abstractPart.InheritanceMSE#getLocation()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Location();

	/**
	 * Returns the meta object for the attribute '{@link abstractPart.InheritanceMSE#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see abstractPart.InheritanceMSE#getDocumentation()
	 * @see #getInheritanceMSE()
	 * @generated
	 */
	EAttribute getInheritanceMSE_Documentation();

	/**
	 * Returns the meta object for class '{@link abstractPart.ContainmentMSE <em>Containment MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment MSE</em>'.
	 * @see abstractPart.ContainmentMSE
	 * @generated
	 */
	EClass getContainmentMSE();

	/**
	 * Returns the meta object for class '{@link abstractPart.AgregationMSE <em>Agregation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregation MSE</em>'.
	 * @see abstractPart.AgregationMSE
	 * @generated
	 */
	EClass getAgregationMSE();

	/**
	 * Returns the meta object for class '{@link abstractPart.AssociationMSE <em>Association MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association MSE</em>'.
	 * @see abstractPart.AssociationMSE
	 * @generated
	 */
	EClass getAssociationMSE();

	/**
	 * Returns the meta object for class '{@link abstractPart.ImplementationMSE <em>Implementation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation MSE</em>'.
	 * @see abstractPart.ImplementationMSE
	 * @generated
	 */
	EClass getImplementationMSE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractPartFactory getAbstractPartFactory();

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
		 * The meta object literal for the '{@link abstractPart.impl.ModelFactoryAbstractImpl <em>Model Factory Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.ModelFactoryAbstractImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getModelFactoryAbstract()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACT = eINSTANCE.getModelFactoryAbstract();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT__STATE = eINSTANCE.getModelFactoryAbstract_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT__NAME = eINSTANCE.getModelFactoryAbstract_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT__PATH = eINSTANCE.getModelFactoryAbstract_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT__LOCATION = eINSTANCE.getModelFactoryAbstract_Location();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT__DOCUMENTATION = eINSTANCE.getModelFactoryAbstract_Documentation();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACT__LST_PACKAGES = eINSTANCE.getModelFactoryAbstract_LstPackages();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.PackageMSEImpl <em>Package MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.PackageMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getPackageMSE()
		 * @generated
		 */
		EClass PACKAGE_MSE = eINSTANCE.getPackageMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__STATE = eINSTANCE.getPackageMSE_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_MSE__NAME = eINSTANCE.getPackageMSE_Name();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSE__ASSOCIATIONS = eINSTANCE.getPackageMSE_Associations();

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
		 * The meta object literal for the '<em><b>Lst Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSE__LST_CLASS = eINSTANCE.getPackageMSE_LstClass();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSE__LST_PACKAGES = eINSTANCE.getPackageMSE_LstPackages();

		/**
		 * The meta object literal for the '<em><b>Lst Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MSE__LST_DIAGRAMS = eINSTANCE.getPackageMSE_LstDiagrams();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.ClassDiagramMSEImpl <em>Class Diagram MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.ClassDiagramMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getClassDiagramMSE()
		 * @generated
		 */
		EClass CLASS_DIAGRAM_MSE = eINSTANCE.getClassDiagramMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__STATE = eINSTANCE.getClassDiagramMSE_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DIAGRAM_MSE__NAME = eINSTANCE.getClassDiagramMSE_Name();

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
		 * The meta object literal for the '<em><b>Lst Identifier Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_MSE__LST_IDENTIFIER_CLASS = eINSTANCE.getClassDiagramMSE_LstIdentifierClass();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.ClassMSEImpl <em>Class MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.ClassMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getClassMSE()
		 * @generated
		 */
		EClass CLASS_MSE = eINSTANCE.getClassMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__STATE = eINSTANCE.getClassMSE_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_MSE__NAME = eINSTANCE.getClassMSE_Name();

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
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__IDENTIFIER = eINSTANCE.getClassMSE_Identifier();

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
		 * The meta object literal for the '<em><b>Lst Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__LST_METHODS = eINSTANCE.getClassMSE_LstMethods();

		/**
		 * The meta object literal for the '<em><b>Lst Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__LST_ATTRIBUTES = eINSTANCE.getClassMSE_LstAttributes();

		/**
		 * The meta object literal for the '<em><b>Lst Attributes Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MSE__LST_ATTRIBUTES_RELATIONS = eINSTANCE.getClassMSE_LstAttributesRelations();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.MethodMSEImpl <em>Method MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.MethodMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getMethodMSE()
		 * @generated
		 */
		EClass METHOD_MSE = eINSTANCE.getMethodMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__STATE = eINSTANCE.getMethodMSE_State();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__MODIFIER = eINSTANCE.getMethodMSE_Modifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_MSE__NAME = eINSTANCE.getMethodMSE_Name();

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
		 * The meta object literal for the '{@link abstractPart.impl.AttributeMSEImpl <em>Attribute MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.AttributeMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getAttributeMSE()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__TYPE = eINSTANCE.getAttributeMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__NAME = eINSTANCE.getAttributeMSE_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__INITIAL_VALUE = eINSTANCE.getAttributeMSE_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_MSE__DOCUMENTATION = eINSTANCE.getAttributeMSE_Documentation();

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
		 * The meta object literal for the '{@link abstractPart.impl.AttributeRelationMSEImpl <em>Attribute Relation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.AttributeRelationMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getAttributeRelationMSE()
		 * @generated
		 */
		EClass ATTRIBUTE_RELATION_MSE = eINSTANCE.getAttributeRelationMSE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__NAME = eINSTANCE.getAttributeRelationMSE_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__STATE = eINSTANCE.getAttributeRelationMSE_State();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__MODIFIER = eINSTANCE.getAttributeRelationMSE_Modifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__TYPE = eINSTANCE.getAttributeRelationMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__INITIAL_VALUE = eINSTANCE.getAttributeRelationMSE_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__DOCUMENTATION = eINSTANCE.getAttributeRelationMSE_Documentation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__PATH = eINSTANCE.getAttributeRelationMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__LOCATION = eINSTANCE.getAttributeRelationMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Type Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_RELATION_MSE__TYPE_PARENT = eINSTANCE.getAttributeRelationMSE_TypeParent();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.HashCodeClassMSEImpl <em>Hash Code Class MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.HashCodeClassMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getHashCodeClassMSE()
		 * @generated
		 */
		EClass HASH_CODE_CLASS_MSE = eINSTANCE.getHashCodeClassMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_CODE_CLASS_MSE__STATE = eINSTANCE.getHashCodeClassMSE_State();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_CODE_CLASS_MSE__CODE = eINSTANCE.getHashCodeClassMSE_Code();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_CODE_CLASS_MSE__PATH = eINSTANCE.getHashCodeClassMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_CODE_CLASS_MSE__LOCATION = eINSTANCE.getHashCodeClassMSE_Location();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.AssociationsMSEImpl <em>Associations MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.AssociationsMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getAssociationsMSE()
		 * @generated
		 */
		EClass ASSOCIATIONS_MSE = eINSTANCE.getAssociationsMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATIONS_MSE__STATE = eINSTANCE.getAssociationsMSE_State();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATIONS_MSE__PATH = eINSTANCE.getAssociationsMSE_Path();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATIONS_MSE__LOCATION = eINSTANCE.getAssociationsMSE_Location();

		/**
		 * The meta object literal for the '<em><b>Lst Containments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIONS_MSE__LST_CONTAINMENTS = eINSTANCE.getAssociationsMSE_LstContainments();

		/**
		 * The meta object literal for the '<em><b>Lst Agregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIONS_MSE__LST_AGREGATIONS = eINSTANCE.getAssociationsMSE_LstAgregations();

		/**
		 * The meta object literal for the '<em><b>Lst Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIONS_MSE__LST_ASSOCIATIONS = eINSTANCE.getAssociationsMSE_LstAssociations();

		/**
		 * The meta object literal for the '<em><b>Lst Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIONS_MSE__LST_IMPLEMENTATIONS = eINSTANCE.getAssociationsMSE_LstImplementations();

		/**
		 * The meta object literal for the '<em><b>Lst Inheritance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIONS_MSE__LST_INHERITANCE = eINSTANCE.getAssociationsMSE_LstInheritance();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.RelationMSEImpl <em>Relation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.RelationMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getRelationMSE()
		 * @generated
		 */
		EClass RELATION_MSE = eINSTANCE.getRelationMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__STATE = eINSTANCE.getRelationMSE_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__NAME = eINSTANCE.getRelationMSE_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__TYPE = eINSTANCE.getRelationMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Role Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__ROLE_SOURCE = eINSTANCE.getRelationMSE_RoleSource();

		/**
		 * The meta object literal for the '<em><b>Role Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__ROLE_TARGET = eINSTANCE.getRelationMSE_RoleTarget();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__MULTIPLICITY_SOURCE = eINSTANCE.getRelationMSE_MultiplicitySource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__MULTIPLICITY_TARGET = eINSTANCE.getRelationMSE_MultiplicityTarget();

		/**
		 * The meta object literal for the '<em><b>Navigability Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__NAVIGABILITY_SOURCE = eINSTANCE.getRelationMSE_NavigabilitySource();

		/**
		 * The meta object literal for the '<em><b>Navigability Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_MSE__NAVIGABILITY_TARGET = eINSTANCE.getRelationMSE_NavigabilityTarget();

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
		 * The meta object literal for the '{@link abstractPart.impl.InheritanceMSEImpl <em>Inheritance MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.InheritanceMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getInheritanceMSE()
		 * @generated
		 */
		EClass INHERITANCE_MSE = eINSTANCE.getInheritanceMSE();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__STATE = eINSTANCE.getInheritanceMSE_State();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__TYPE = eINSTANCE.getInheritanceMSE_Type();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_MSE__CHILD = eINSTANCE.getInheritanceMSE_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_MSE__PARENT = eINSTANCE.getInheritanceMSE_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE_MSE__NAME = eINSTANCE.getInheritanceMSE_Name();

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
		 * The meta object literal for the '{@link abstractPart.impl.ContainmentMSEImpl <em>Containment MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.ContainmentMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getContainmentMSE()
		 * @generated
		 */
		EClass CONTAINMENT_MSE = eINSTANCE.getContainmentMSE();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.AgregationMSEImpl <em>Agregation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.AgregationMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getAgregationMSE()
		 * @generated
		 */
		EClass AGREGATION_MSE = eINSTANCE.getAgregationMSE();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.AssociationMSEImpl <em>Association MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.AssociationMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getAssociationMSE()
		 * @generated
		 */
		EClass ASSOCIATION_MSE = eINSTANCE.getAssociationMSE();

		/**
		 * The meta object literal for the '{@link abstractPart.impl.ImplementationMSEImpl <em>Implementation MSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractPart.impl.ImplementationMSEImpl
		 * @see abstractPart.impl.AbstractPartPackageImpl#getImplementationMSE()
		 * @generated
		 */
		EClass IMPLEMENTATION_MSE = eINSTANCE.getImplementationMSE();

	}

} //AbstractPartPackage
