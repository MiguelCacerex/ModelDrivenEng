/**
 */
package dblanguagepart.impl;

import dblanguagepart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DblanguagepartFactoryImpl extends EFactoryImpl implements DblanguagepartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DblanguagepartFactory init() {
		try {
			DblanguagepartFactory theDblanguagepartFactory = (DblanguagepartFactory)EPackage.Registry.INSTANCE.getEFactory(DblanguagepartPackage.eNS_URI);
			if (theDblanguagepartFactory != null) {
				return theDblanguagepartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DblanguagepartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblanguagepartFactoryImpl() {
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
			case DblanguagepartPackage.MODEL_FACTORY_RELATIONAL_MODEL: return createModelFactoryRelationalModel();
			case DblanguagepartPackage.SCHEMA: return createSchema();
			case DblanguagepartPackage.TABLE: return createTable();
			case DblanguagepartPackage.FOREIGN_CONSTRAINT: return createForeignConstraint();
			case DblanguagepartPackage.COLUMN: return createColumn();
			case DblanguagepartPackage.PRIMARY_KEY_CONSTRAINT: return createPrimaryKeyConstraint();
			case DblanguagepartPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
			case DblanguagepartPackage.INDEX_CONSTRAINT: return createIndexConstraint();
			case DblanguagepartPackage.TRIGGER: return createTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryRelationalModel createModelFactoryRelationalModel() {
		ModelFactoryRelationalModelImpl modelFactoryRelationalModel = new ModelFactoryRelationalModelImpl();
		return modelFactoryRelationalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignConstraint createForeignConstraint() {
		ForeignConstraintImpl foreignConstraint = new ForeignConstraintImpl();
		return foreignConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyConstraint createPrimaryKeyConstraint() {
		PrimaryKeyConstraintImpl primaryKeyConstraint = new PrimaryKeyConstraintImpl();
		return primaryKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint createUniqueConstraint() {
		UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
		return uniqueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexConstraint createIndexConstraint() {
		IndexConstraintImpl indexConstraint = new IndexConstraintImpl();
		return indexConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DblanguagepartPackage getDblanguagepartPackage() {
		return (DblanguagepartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DblanguagepartPackage getPackage() {
		return DblanguagepartPackage.eINSTANCE;
	}

} //DblanguagepartFactoryImpl
