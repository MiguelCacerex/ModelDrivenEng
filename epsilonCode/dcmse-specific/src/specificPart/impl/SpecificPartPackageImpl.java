/**
 */
package specificPart.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import specificPart.AgregationMSE;
import specificPart.AssociationMSE;
import specificPart.AttributeMSE;
import specificPart.ClassDiagramMSE;
import specificPart.ClassMSE;
import specificPart.ContainmentMSE;
import specificPart.ImplementationMSE;
import specificPart.InheritanceMSE;
import specificPart.MethodMSE;
import specificPart.ModelFactorySpecific;
import specificPart.PackageMSE;
import specificPart.RelationMSE;
import specificPart.SpecificPartFactory;
import specificPart.SpecificPartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificPartPackageImpl extends EPackageImpl implements SpecificPartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactorySpecificEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDiagramMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agregationMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodMSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMSEEClass = null;

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
	 * @see specificPart.SpecificPartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecificPartPackageImpl() {
		super(eNS_URI, SpecificPartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpecificPartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecificPartPackage init() {
		if (isInited) return (SpecificPartPackage)EPackage.Registry.INSTANCE.getEPackage(SpecificPartPackage.eNS_URI);

		// Obtain or create and register package
		SpecificPartPackageImpl theSpecificPartPackage = (SpecificPartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpecificPartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpecificPartPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpecificPartPackage.createPackageContents();

		// Initialize created meta-data
		theSpecificPartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpecificPartPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecificPartPackage.eNS_URI, theSpecificPartPackage);
		return theSpecificPartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactorySpecific() {
		return modelFactorySpecificEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactorySpecific_Name() {
		return (EAttribute)modelFactorySpecificEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactorySpecific_LstPackages() {
		return (EReference)modelFactorySpecificEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactorySpecific_LstDiagrams() {
		return (EReference)modelFactorySpecificEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDiagramMSE() {
		return classDiagramMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramMSE_Name() {
		return (EAttribute)classDiagramMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramMSE_State() {
		return (EAttribute)classDiagramMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramMSE_Path() {
		return (EAttribute)classDiagramMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramMSE_Location() {
		return (EAttribute)classDiagramMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDiagramMSE_Documentation() {
		return (EAttribute)classDiagramMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramMSE_LstClass() {
		return (EReference)classDiagramMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramMSE_LstInheritances() {
		return (EReference)classDiagramMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramMSE_LstRelations() {
		return (EReference)classDiagramMSEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDiagramMSE_LstPackages() {
		return (EReference)classDiagramMSEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMSE() {
		return packageMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMSE_Name() {
		return (EAttribute)packageMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMSE_State() {
		return (EAttribute)packageMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMSE_Path() {
		return (EAttribute)packageMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMSE_Location() {
		return (EAttribute)packageMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMSE_Documentation() {
		return (EAttribute)packageMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMSE_LstDiagrams() {
		return (EReference)packageMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMSE() {
		return classMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Name() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_State() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Type() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Modifier() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Absrtact() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Path() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Location() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassMSE_Documentation() {
		return (EAttribute)classMSEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMSE_LstAttributes() {
		return (EReference)classMSEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassMSE_LstMethods() {
		return (EReference)classMSEEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationMSE() {
		return relationMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_Type() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_State() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_RoleSource() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_RoleTarget() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_MultiplicitySource() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_MultiplicityTarget() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_NavigabilitySource() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_NavigabilityTarget() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationMSE_Source() {
		return (EReference)relationMSEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationMSE_Target() {
		return (EReference)relationMSEEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_Path() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_Location() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationMSE_Documentation() {
		return (EAttribute)relationMSEEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritanceMSE() {
		return inheritanceMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritanceMSE_Type() {
		return (EAttribute)inheritanceMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritanceMSE_State() {
		return (EAttribute)inheritanceMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritanceMSE_Child() {
		return (EReference)inheritanceMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritanceMSE_Parent() {
		return (EReference)inheritanceMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritanceMSE_Path() {
		return (EAttribute)inheritanceMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritanceMSE_Location() {
		return (EAttribute)inheritanceMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInheritanceMSE_Documentation() {
		return (EAttribute)inheritanceMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentMSE() {
		return containmentMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgregationMSE() {
		return agregationMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationMSE() {
		return associationMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationMSE() {
		return implementationMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodMSE() {
		return methodMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Name() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Modifier() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Body() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_TypeReturn() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_State() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Path() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Location() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodMSE_Documentation() {
		return (EAttribute)methodMSEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodMSE_LstArguments() {
		return (EReference)methodMSEEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMSE() {
		return attributeMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_State() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Modifier() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Name() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Type() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_InitialValue() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Path() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Location() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMSE_Documentation() {
		return (EAttribute)attributeMSEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPartFactory getSpecificPartFactory() {
		return (SpecificPartFactory)getEFactoryInstance();
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
		modelFactorySpecificEClass = createEClass(MODEL_FACTORY_SPECIFIC);
		createEAttribute(modelFactorySpecificEClass, MODEL_FACTORY_SPECIFIC__NAME);
		createEReference(modelFactorySpecificEClass, MODEL_FACTORY_SPECIFIC__LST_PACKAGES);
		createEReference(modelFactorySpecificEClass, MODEL_FACTORY_SPECIFIC__LST_DIAGRAMS);

		classDiagramMSEEClass = createEClass(CLASS_DIAGRAM_MSE);
		createEAttribute(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__NAME);
		createEAttribute(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__STATE);
		createEAttribute(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__PATH);
		createEAttribute(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__LOCATION);
		createEAttribute(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__DOCUMENTATION);
		createEReference(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__LST_CLASS);
		createEReference(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__LST_INHERITANCES);
		createEReference(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__LST_RELATIONS);
		createEReference(classDiagramMSEEClass, CLASS_DIAGRAM_MSE__LST_PACKAGES);

		packageMSEEClass = createEClass(PACKAGE_MSE);
		createEAttribute(packageMSEEClass, PACKAGE_MSE__NAME);
		createEAttribute(packageMSEEClass, PACKAGE_MSE__STATE);
		createEAttribute(packageMSEEClass, PACKAGE_MSE__PATH);
		createEAttribute(packageMSEEClass, PACKAGE_MSE__LOCATION);
		createEAttribute(packageMSEEClass, PACKAGE_MSE__DOCUMENTATION);
		createEReference(packageMSEEClass, PACKAGE_MSE__LST_DIAGRAMS);

		classMSEEClass = createEClass(CLASS_MSE);
		createEAttribute(classMSEEClass, CLASS_MSE__NAME);
		createEAttribute(classMSEEClass, CLASS_MSE__STATE);
		createEAttribute(classMSEEClass, CLASS_MSE__TYPE);
		createEAttribute(classMSEEClass, CLASS_MSE__MODIFIER);
		createEAttribute(classMSEEClass, CLASS_MSE__ABSRTACT);
		createEAttribute(classMSEEClass, CLASS_MSE__PATH);
		createEAttribute(classMSEEClass, CLASS_MSE__LOCATION);
		createEAttribute(classMSEEClass, CLASS_MSE__DOCUMENTATION);
		createEReference(classMSEEClass, CLASS_MSE__LST_ATTRIBUTES);
		createEReference(classMSEEClass, CLASS_MSE__LST_METHODS);

		relationMSEEClass = createEClass(RELATION_MSE);
		createEAttribute(relationMSEEClass, RELATION_MSE__TYPE);
		createEAttribute(relationMSEEClass, RELATION_MSE__STATE);
		createEAttribute(relationMSEEClass, RELATION_MSE__ROLE_SOURCE);
		createEAttribute(relationMSEEClass, RELATION_MSE__ROLE_TARGET);
		createEAttribute(relationMSEEClass, RELATION_MSE__MULTIPLICITY_SOURCE);
		createEAttribute(relationMSEEClass, RELATION_MSE__MULTIPLICITY_TARGET);
		createEAttribute(relationMSEEClass, RELATION_MSE__NAVIGABILITY_SOURCE);
		createEAttribute(relationMSEEClass, RELATION_MSE__NAVIGABILITY_TARGET);
		createEReference(relationMSEEClass, RELATION_MSE__SOURCE);
		createEReference(relationMSEEClass, RELATION_MSE__TARGET);
		createEAttribute(relationMSEEClass, RELATION_MSE__PATH);
		createEAttribute(relationMSEEClass, RELATION_MSE__LOCATION);
		createEAttribute(relationMSEEClass, RELATION_MSE__DOCUMENTATION);

		inheritanceMSEEClass = createEClass(INHERITANCE_MSE);
		createEAttribute(inheritanceMSEEClass, INHERITANCE_MSE__TYPE);
		createEAttribute(inheritanceMSEEClass, INHERITANCE_MSE__STATE);
		createEReference(inheritanceMSEEClass, INHERITANCE_MSE__CHILD);
		createEReference(inheritanceMSEEClass, INHERITANCE_MSE__PARENT);
		createEAttribute(inheritanceMSEEClass, INHERITANCE_MSE__PATH);
		createEAttribute(inheritanceMSEEClass, INHERITANCE_MSE__LOCATION);
		createEAttribute(inheritanceMSEEClass, INHERITANCE_MSE__DOCUMENTATION);

		containmentMSEEClass = createEClass(CONTAINMENT_MSE);

		agregationMSEEClass = createEClass(AGREGATION_MSE);

		associationMSEEClass = createEClass(ASSOCIATION_MSE);

		implementationMSEEClass = createEClass(IMPLEMENTATION_MSE);

		methodMSEEClass = createEClass(METHOD_MSE);
		createEAttribute(methodMSEEClass, METHOD_MSE__NAME);
		createEAttribute(methodMSEEClass, METHOD_MSE__MODIFIER);
		createEAttribute(methodMSEEClass, METHOD_MSE__BODY);
		createEAttribute(methodMSEEClass, METHOD_MSE__TYPE_RETURN);
		createEAttribute(methodMSEEClass, METHOD_MSE__STATE);
		createEAttribute(methodMSEEClass, METHOD_MSE__PATH);
		createEAttribute(methodMSEEClass, METHOD_MSE__LOCATION);
		createEAttribute(methodMSEEClass, METHOD_MSE__DOCUMENTATION);
		createEReference(methodMSEEClass, METHOD_MSE__LST_ARGUMENTS);

		attributeMSEEClass = createEClass(ATTRIBUTE_MSE);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__STATE);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__MODIFIER);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__NAME);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__TYPE);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__INITIAL_VALUE);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__PATH);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__LOCATION);
		createEAttribute(attributeMSEEClass, ATTRIBUTE_MSE__DOCUMENTATION);
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
		containmentMSEEClass.getESuperTypes().add(this.getRelationMSE());
		agregationMSEEClass.getESuperTypes().add(this.getRelationMSE());
		associationMSEEClass.getESuperTypes().add(this.getRelationMSE());
		implementationMSEEClass.getESuperTypes().add(this.getRelationMSE());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactorySpecificEClass, ModelFactorySpecific.class, "ModelFactorySpecific", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactorySpecific_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelFactorySpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactorySpecific_LstPackages(), this.getPackageMSE(), null, "lstPackages", null, 0, -1, ModelFactorySpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactorySpecific_LstDiagrams(), this.getClassDiagramMSE(), null, "lstDiagrams", null, 0, -1, ModelFactorySpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDiagramMSEEClass, ClassDiagramMSE.class, "ClassDiagramMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDiagramMSE_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagramMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagramMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagramMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDiagramMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramMSE_LstClass(), this.getClassMSE(), null, "lstClass", null, 0, -1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramMSE_LstInheritances(), this.getInheritanceMSE(), null, "lstInheritances", null, 0, -1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramMSE_LstRelations(), this.getRelationMSE(), null, "lstRelations", null, 0, -1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramMSE_LstPackages(), this.getPackageMSE(), null, "lstPackages", null, 0, -1, ClassDiagramMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageMSEEClass, PackageMSE.class, "PackageMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageMSE_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageMSE_LstDiagrams(), this.getClassDiagramMSE(), null, "lstDiagrams", null, 0, -1, PackageMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classMSEEClass, ClassMSE.class, "ClassMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassMSE_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Type(), ecorePackage.getEString(), "type", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Absrtact(), ecorePackage.getEBoolean(), "absrtact", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMSE_LstAttributes(), this.getAttributeMSE(), null, "lstAttributes", null, 0, -1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassMSE_LstMethods(), this.getMethodMSE(), null, "lstMethods", null, 0, -1, ClassMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationMSEEClass, RelationMSE.class, "RelationMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationMSE_Type(), ecorePackage.getEString(), "type", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_RoleSource(), ecorePackage.getEString(), "roleSource", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_RoleTarget(), ecorePackage.getEString(), "roleTarget", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_MultiplicitySource(), ecorePackage.getEString(), "multiplicitySource", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_MultiplicityTarget(), ecorePackage.getEString(), "multiplicityTarget", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_NavigabilitySource(), ecorePackage.getEBoolean(), "navigabilitySource", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_NavigabilityTarget(), ecorePackage.getEBoolean(), "navigabilityTarget", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationMSE_Source(), this.getClassMSE(), null, "source", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationMSE_Target(), this.getClassMSE(), null, "target", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, RelationMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceMSEEClass, InheritanceMSE.class, "InheritanceMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritanceMSE_Type(), ecorePackage.getEString(), "type", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInheritanceMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritanceMSE_Child(), this.getClassMSE(), null, "child", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritanceMSE_Parent(), this.getClassMSE(), null, "parent", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInheritanceMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInheritanceMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInheritanceMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, InheritanceMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentMSEEClass, ContainmentMSE.class, "ContainmentMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agregationMSEEClass, AgregationMSE.class, "AgregationMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationMSEEClass, AssociationMSE.class, "AssociationMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationMSEEClass, ImplementationMSE.class, "ImplementationMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodMSEEClass, MethodMSE.class, "MethodMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodMSE_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_Body(), ecorePackage.getEString(), "body", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_TypeReturn(), ecorePackage.getEString(), "typeReturn", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodMSE_LstArguments(), this.getAttributeMSE(), null, "lstArguments", null, 0, -1, MethodMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeMSEEClass, AttributeMSE.class, "AttributeMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMSE_State(), ecorePackage.getEString(), "state", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Type(), ecorePackage.getEString(), "type", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Path(), ecorePackage.getEString(), "path", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Location(), ecorePackage.getEString(), "location", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMSE_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, AttributeMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// gmf.link
		createGmf_4Annotations();
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
		  (classDiagramMSEEClass, 
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
		  (packageMSEEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "figure", "svg",
			 "size", "100,100",
			 "svg.uri", "platform:/plugin/dcmse-specific.diagram/icons/PackageMSEIcon.svg",
			 "label.placement", "internal",
			 "margin", "1"
		   });	
		addAnnotation
		  (classMSEEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "color", "252,243,207",
			 "border.color", "244,208,63",
			 "border.width", "2",
			 "size", "250,200"
		   });	
		addAnnotation
		  (methodMSEEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "border.color", "252,243,207",
			 "color", "252,243,207"
		   });	
		addAnnotation
		  (attributeMSEEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "border.color", "252,243,207",
			 "color", "252,243,207",
			 "label.pattern", "{0}  [ {1} ]"
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
		  (getClassMSE_LstAttributes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true",
			 "label.view.pattern", "true"
		   });	
		addAnnotation
		  (getClassMSE_LstMethods(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (inheritanceMSEEClass, 
		   source, 
		   new String[] {
			 "source", "child",
			 "target", "parent",
			 "target.decoration", "closedarrow",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (containmentMSEEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "filledrhomb",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (agregationMSEEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "rhomb",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (associationMSEEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "3"
		   });	
		addAnnotation
		  (implementationMSEEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "closedarrow",
			 "style", "dot",
			 "width", "3"
		   });
	}

} //SpecificPartPackageImpl
