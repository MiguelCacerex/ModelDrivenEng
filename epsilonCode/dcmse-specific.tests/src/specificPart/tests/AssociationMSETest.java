/**
 */
package specificPart.tests;

import junit.textui.TestRunner;

import specificPart.AssociationMSE;
import specificPart.SpecificPartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association MSE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationMSETest extends RelationMSETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationMSETest.class);
	}

	/**
	 * Constructs a new Association MSE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationMSETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociationMSE getFixture() {
		return (AssociationMSE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpecificPartFactory.eINSTANCE.createAssociationMSE());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssociationMSETest
