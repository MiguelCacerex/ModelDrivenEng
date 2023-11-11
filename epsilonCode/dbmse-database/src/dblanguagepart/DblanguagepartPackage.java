/**
 */
package dblanguagepart;

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
 * @see dblanguagepart.DblanguagepartFactory
 * @model kind="package"
 * @generated
 */
public interface DblanguagepartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dblanguagepart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dblanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dblanguagepart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DblanguagepartPackage eINSTANCE = dblanguagepart.impl.DblanguagepartPackageImpl.init();

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.ModelFactoryRelationalModelImpl <em>Model Factory Relational Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.ModelFactoryRelationalModelImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getModelFactoryRelationalModel()
	 * @generated
	 */
	int MODEL_FACTORY_RELATIONAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Relational Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_RELATIONAL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.SchemaImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Lst Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LST_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.TableImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Lst Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Primary Key Constrains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY_CONSTRAINS = 2;

	/**
	 * The feature id for the '<em><b>Lst Unique Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_UNIQUE_CONSTRAINS = 3;

	/**
	 * The feature id for the '<em><b>Lst Index Constrains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_INDEX_CONSTRAINS = 4;

	/**
	 * The feature id for the '<em><b>Lst Foreign Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_FOREIGN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Lst Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LST_TRIGGERS = 6;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.ForeignConstraintImpl <em>Foreign Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.ForeignConstraintImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getForeignConstraint()
	 * @generated
	 */
	int FOREIGN_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_CONSTRAINT__NAME_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Source Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_CONSTRAINT__SOURCE_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Source Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_CONSTRAINT__SOURCE_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME = 3;

	/**
	 * The number of structural features of the '<em>Foreign Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.ColumnImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Is Desuso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_DESUSO = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.PrimaryKeyConstraintImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getPrimaryKeyConstraint()
	 * @generated
	 */
	int PRIMARY_KEY_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Column Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.UniqueConstraintImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Column Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.IndexConstraintImpl <em>Index Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.IndexConstraintImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getIndexConstraint()
	 * @generated
	 */
	int INDEX_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__NAME_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__IS_UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>Is Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__IS_GENERATE = 2;

	/**
	 * The feature id for the '<em><b>Is Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__IS_SPECIAL = 3;

	/**
	 * The feature id for the '<em><b>Is Desuso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__IS_DESUSO = 4;

	/**
	 * The feature id for the '<em><b>Is Realizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__IS_REALIZABLE = 5;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__COLUMN_INDEX = 6;

	/**
	 * The number of structural features of the '<em>Index Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dblanguagepart.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dblanguagepart.impl.TriggerImpl
	 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Name Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME_TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link dblanguagepart.ModelFactoryRelationalModel <em>Model Factory Relational Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Relational Model</em>'.
	 * @see dblanguagepart.ModelFactoryRelationalModel
	 * @generated
	 */
	EClass getModelFactoryRelationalModel();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.ModelFactoryRelationalModel#getNameFactory <em>Name Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Factory</em>'.
	 * @see dblanguagepart.ModelFactoryRelationalModel#getNameFactory()
	 * @see #getModelFactoryRelationalModel()
	 * @generated
	 */
	EAttribute getModelFactoryRelationalModel_NameFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.ModelFactoryRelationalModel#getLstSchemas <em>Lst Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Schemas</em>'.
	 * @see dblanguagepart.ModelFactoryRelationalModel#getLstSchemas()
	 * @see #getModelFactoryRelationalModel()
	 * @generated
	 */
	EReference getModelFactoryRelationalModel_LstSchemas();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see dblanguagepart.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Schema#getNameSchema <em>Name Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Schema</em>'.
	 * @see dblanguagepart.Schema#getNameSchema()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_NameSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Schema#getLstTable <em>Lst Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Table</em>'.
	 * @see dblanguagepart.Schema#getLstTable()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_LstTable();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see dblanguagepart.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Table#getNameTable <em>Name Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Table</em>'.
	 * @see dblanguagepart.Table#getNameTable()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NameTable();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Table#getLstColumns <em>Lst Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Columns</em>'.
	 * @see dblanguagepart.Table#getLstColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstColumns();

	/**
	 * Returns the meta object for the containment reference '{@link dblanguagepart.Table#getPrimaryKeyConstrains <em>Primary Key Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Constrains</em>'.
	 * @see dblanguagepart.Table#getPrimaryKeyConstrains()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKeyConstrains();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Table#getLstUniqueConstrains <em>Lst Unique Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Unique Constrains</em>'.
	 * @see dblanguagepart.Table#getLstUniqueConstrains()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstUniqueConstrains();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Table#getLstIndexConstrains <em>Lst Index Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Index Constrains</em>'.
	 * @see dblanguagepart.Table#getLstIndexConstrains()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstIndexConstrains();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Table#getLstForeignConstraint <em>Lst Foreign Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Foreign Constraint</em>'.
	 * @see dblanguagepart.Table#getLstForeignConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstForeignConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link dblanguagepart.Table#getLstTriggers <em>Lst Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Triggers</em>'.
	 * @see dblanguagepart.Table#getLstTriggers()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LstTriggers();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.ForeignConstraint <em>Foreign Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Constraint</em>'.
	 * @see dblanguagepart.ForeignConstraint
	 * @generated
	 */
	EClass getForeignConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.ForeignConstraint#getNameConstraint <em>Name Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Constraint</em>'.
	 * @see dblanguagepart.ForeignConstraint#getNameConstraint()
	 * @see #getForeignConstraint()
	 * @generated
	 */
	EAttribute getForeignConstraint_NameConstraint();

	/**
	 * Returns the meta object for the reference '{@link dblanguagepart.ForeignConstraint#getSourceTable <em>Source Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Table</em>'.
	 * @see dblanguagepart.ForeignConstraint#getSourceTable()
	 * @see #getForeignConstraint()
	 * @generated
	 */
	EReference getForeignConstraint_SourceTable();

	/**
	 * Returns the meta object for the reference '{@link dblanguagepart.ForeignConstraint#getSourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Column</em>'.
	 * @see dblanguagepart.ForeignConstraint#getSourceColumn()
	 * @see #getForeignConstraint()
	 * @generated
	 */
	EReference getForeignConstraint_SourceColumn();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.ForeignConstraint#getTargetColumnName <em>Target Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Column Name</em>'.
	 * @see dblanguagepart.ForeignConstraint#getTargetColumnName()
	 * @see #getForeignConstraint()
	 * @generated
	 */
	EAttribute getForeignConstraint_TargetColumnName();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see dblanguagepart.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dblanguagepart.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see dblanguagepart.Column#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DataType();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Column#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dblanguagepart.Column#getSize()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Size();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Column#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see dblanguagepart.Column#isIsMandatory()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Column#isIsDesuso <em>Is Desuso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Desuso</em>'.
	 * @see dblanguagepart.Column#isIsDesuso()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsDesuso();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.PrimaryKeyConstraint <em>Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Constraint</em>'.
	 * @see dblanguagepart.PrimaryKeyConstraint
	 * @generated
	 */
	EClass getPrimaryKeyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.PrimaryKeyConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dblanguagepart.PrimaryKeyConstraint#getType()
	 * @see #getPrimaryKeyConstraint()
	 * @generated
	 */
	EAttribute getPrimaryKeyConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.PrimaryKeyConstraint#getNameConstraint <em>Name Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Constraint</em>'.
	 * @see dblanguagepart.PrimaryKeyConstraint#getNameConstraint()
	 * @see #getPrimaryKeyConstraint()
	 * @generated
	 */
	EAttribute getPrimaryKeyConstraint_NameConstraint();

	/**
	 * Returns the meta object for the reference list '{@link dblanguagepart.PrimaryKeyConstraint#getColumnConstraint <em>Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Constraint</em>'.
	 * @see dblanguagepart.PrimaryKeyConstraint#getColumnConstraint()
	 * @see #getPrimaryKeyConstraint()
	 * @generated
	 */
	EReference getPrimaryKeyConstraint_ColumnConstraint();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see dblanguagepart.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.UniqueConstraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dblanguagepart.UniqueConstraint#getType()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.UniqueConstraint#getNameConstraint <em>Name Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Constraint</em>'.
	 * @see dblanguagepart.UniqueConstraint#getNameConstraint()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_NameConstraint();

	/**
	 * Returns the meta object for the reference list '{@link dblanguagepart.UniqueConstraint#getColumnConstraint <em>Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Constraint</em>'.
	 * @see dblanguagepart.UniqueConstraint#getColumnConstraint()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EReference getUniqueConstraint_ColumnConstraint();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.IndexConstraint <em>Index Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Constraint</em>'.
	 * @see dblanguagepart.IndexConstraint
	 * @generated
	 */
	EClass getIndexConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#getNameIndex <em>Name Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Index</em>'.
	 * @see dblanguagepart.IndexConstraint#getNameIndex()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_NameIndex();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see dblanguagepart.IndexConstraint#isIsUnique()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#isIsGenerate <em>Is Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Generate</em>'.
	 * @see dblanguagepart.IndexConstraint#isIsGenerate()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_IsGenerate();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#isIsSpecial <em>Is Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Special</em>'.
	 * @see dblanguagepart.IndexConstraint#isIsSpecial()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_IsSpecial();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#isIsDesuso <em>Is Desuso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Desuso</em>'.
	 * @see dblanguagepart.IndexConstraint#isIsDesuso()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_IsDesuso();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.IndexConstraint#isIsRealizable <em>Is Realizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Realizable</em>'.
	 * @see dblanguagepart.IndexConstraint#isIsRealizable()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EAttribute getIndexConstraint_IsRealizable();

	/**
	 * Returns the meta object for the reference list '{@link dblanguagepart.IndexConstraint#getColumnIndex <em>Column Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Index</em>'.
	 * @see dblanguagepart.IndexConstraint#getColumnIndex()
	 * @see #getIndexConstraint()
	 * @generated
	 */
	EReference getIndexConstraint_ColumnIndex();

	/**
	 * Returns the meta object for class '{@link dblanguagepart.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see dblanguagepart.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link dblanguagepart.Trigger#getNameTrigger <em>Name Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Trigger</em>'.
	 * @see dblanguagepart.Trigger#getNameTrigger()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_NameTrigger();

	/**
	 * Returns the meta object for the reference list '{@link dblanguagepart.Trigger#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see dblanguagepart.Trigger#getColumns()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Columns();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DblanguagepartFactory getDblanguagepartFactory();

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
		 * The meta object literal for the '{@link dblanguagepart.impl.ModelFactoryRelationalModelImpl <em>Model Factory Relational Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.ModelFactoryRelationalModelImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getModelFactoryRelationalModel()
		 * @generated
		 */
		EClass MODEL_FACTORY_RELATIONAL_MODEL = eINSTANCE.getModelFactoryRelationalModel();

		/**
		 * The meta object literal for the '<em><b>Name Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_RELATIONAL_MODEL__NAME_FACTORY = eINSTANCE.getModelFactoryRelationalModel_NameFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_RELATIONAL_MODEL__LST_SCHEMAS = eINSTANCE.getModelFactoryRelationalModel_LstSchemas();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.SchemaImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME_SCHEMA = eINSTANCE.getSchema_NameSchema();

		/**
		 * The meta object literal for the '<em><b>Lst Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LST_TABLE = eINSTANCE.getSchema_LstTable();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.TableImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME_TABLE = eINSTANCE.getTable_NameTable();

		/**
		 * The meta object literal for the '<em><b>Lst Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_COLUMNS = eINSTANCE.getTable_LstColumns();

		/**
		 * The meta object literal for the '<em><b>Primary Key Constrains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY_CONSTRAINS = eINSTANCE.getTable_PrimaryKeyConstrains();

		/**
		 * The meta object literal for the '<em><b>Lst Unique Constrains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_UNIQUE_CONSTRAINS = eINSTANCE.getTable_LstUniqueConstrains();

		/**
		 * The meta object literal for the '<em><b>Lst Index Constrains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_INDEX_CONSTRAINS = eINSTANCE.getTable_LstIndexConstrains();

		/**
		 * The meta object literal for the '<em><b>Lst Foreign Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_FOREIGN_CONSTRAINT = eINSTANCE.getTable_LstForeignConstraint();

		/**
		 * The meta object literal for the '<em><b>Lst Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LST_TRIGGERS = eINSTANCE.getTable_LstTriggers();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.ForeignConstraintImpl <em>Foreign Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.ForeignConstraintImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getForeignConstraint()
		 * @generated
		 */
		EClass FOREIGN_CONSTRAINT = eINSTANCE.getForeignConstraint();

		/**
		 * The meta object literal for the '<em><b>Name Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_CONSTRAINT__NAME_CONSTRAINT = eINSTANCE.getForeignConstraint_NameConstraint();

		/**
		 * The meta object literal for the '<em><b>Source Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_CONSTRAINT__SOURCE_TABLE = eINSTANCE.getForeignConstraint_SourceTable();

		/**
		 * The meta object literal for the '<em><b>Source Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_CONSTRAINT__SOURCE_COLUMN = eINSTANCE.getForeignConstraint_SourceColumn();

		/**
		 * The meta object literal for the '<em><b>Target Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_CONSTRAINT__TARGET_COLUMN_NAME = eINSTANCE.getForeignConstraint_TargetColumnName();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.ColumnImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SIZE = eINSTANCE.getColumn_Size();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_MANDATORY = eINSTANCE.getColumn_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Desuso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_DESUSO = eINSTANCE.getColumn_IsDesuso();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.PrimaryKeyConstraintImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getPrimaryKeyConstraint()
		 * @generated
		 */
		EClass PRIMARY_KEY_CONSTRAINT = eINSTANCE.getPrimaryKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_CONSTRAINT__TYPE = eINSTANCE.getPrimaryKeyConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Name Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_CONSTRAINT__NAME_CONSTRAINT = eINSTANCE.getPrimaryKeyConstraint_NameConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY_CONSTRAINT__COLUMN_CONSTRAINT = eINSTANCE.getPrimaryKeyConstraint_ColumnConstraint();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.UniqueConstraintImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_CONSTRAINT__TYPE = eINSTANCE.getUniqueConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Name Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_CONSTRAINT__NAME_CONSTRAINT = eINSTANCE.getUniqueConstraint_NameConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_CONSTRAINT__COLUMN_CONSTRAINT = eINSTANCE.getUniqueConstraint_ColumnConstraint();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.IndexConstraintImpl <em>Index Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.IndexConstraintImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getIndexConstraint()
		 * @generated
		 */
		EClass INDEX_CONSTRAINT = eINSTANCE.getIndexConstraint();

		/**
		 * The meta object literal for the '<em><b>Name Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__NAME_INDEX = eINSTANCE.getIndexConstraint_NameIndex();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__IS_UNIQUE = eINSTANCE.getIndexConstraint_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__IS_GENERATE = eINSTANCE.getIndexConstraint_IsGenerate();

		/**
		 * The meta object literal for the '<em><b>Is Special</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__IS_SPECIAL = eINSTANCE.getIndexConstraint_IsSpecial();

		/**
		 * The meta object literal for the '<em><b>Is Desuso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__IS_DESUSO = eINSTANCE.getIndexConstraint_IsDesuso();

		/**
		 * The meta object literal for the '<em><b>Is Realizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_CONSTRAINT__IS_REALIZABLE = eINSTANCE.getIndexConstraint_IsRealizable();

		/**
		 * The meta object literal for the '<em><b>Column Index</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_CONSTRAINT__COLUMN_INDEX = eINSTANCE.getIndexConstraint_ColumnIndex();

		/**
		 * The meta object literal for the '{@link dblanguagepart.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dblanguagepart.impl.TriggerImpl
		 * @see dblanguagepart.impl.DblanguagepartPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME_TRIGGER = eINSTANCE.getTrigger_NameTrigger();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__COLUMNS = eINSTANCE.getTrigger_Columns();

	}

} //DblanguagepartPackage
