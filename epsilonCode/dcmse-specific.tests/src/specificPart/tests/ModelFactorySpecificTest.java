/**
 */
package specificPart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import specificPart.ModelFactorySpecific;
import specificPart.SpecificPartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Specific</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactorySpecificTest extends TestCase {

	/**
	 * The fixture for this Model Factory Specific test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactorySpecific fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactorySpecificTest.class);
	}

	/**
	 * Constructs a new Model Factory Specific test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactorySpecificTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Specific test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactorySpecific fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Specific test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactorySpecific getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpecificPartFactory.eINSTANCE.createModelFactorySpecific());
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

} //ModelFactorySpecificTest
