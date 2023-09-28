/**
 */
package specificPart.tests;

import junit.textui.TestRunner;

import specificPart.AgregationMSE;
import specificPart.SpecificPartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agregation MSE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgregationMSETest extends RelationMSETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgregationMSETest.class);
	}

	/**
	 * Constructs a new Agregation MSE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationMSETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agregation MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgregationMSE getFixture() {
		return (AgregationMSE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpecificPartFactory.eINSTANCE.createAgregationMSE());
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

} //AgregationMSETest
