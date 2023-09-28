/**
 */
package abstractPart.tests;

import abstractPart.AbstractPartFactory;
import abstractPart.ContainmentMSE;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Containment MSE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentMSETest extends RelationMSETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainmentMSETest.class);
	}

	/**
	 * Constructs a new Containment MSE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentMSETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Containment MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainmentMSE getFixture() {
		return (ContainmentMSE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractPartFactory.eINSTANCE.createContainmentMSE());
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

} //ContainmentMSETest
