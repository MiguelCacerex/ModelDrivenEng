/**
 */
package abstractPart.tests;

import abstractPart.AbstractPartFactory;
import abstractPart.ImplementationMSE;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation MSE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationMSETest extends RelationMSETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplementationMSETest.class);
	}

	/**
	 * Constructs a new Implementation MSE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationMSETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implementation MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImplementationMSE getFixture() {
		return (ImplementationMSE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractPartFactory.eINSTANCE.createImplementationMSE());
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

} //ImplementationMSETest
