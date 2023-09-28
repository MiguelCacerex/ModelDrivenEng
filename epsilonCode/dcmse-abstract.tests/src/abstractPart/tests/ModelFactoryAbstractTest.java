/**
 */
package abstractPart.tests;

import abstractPart.AbstractPartFactory;
import abstractPart.ModelFactoryAbstract;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Abstract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryAbstractTest extends TestCase {

	/**
	 * The fixture for this Model Factory Abstract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstract fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryAbstractTest.class);
	}

	/**
	 * Constructs a new Model Factory Abstract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryAbstractTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Abstract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryAbstract fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Abstract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstract getFixture() {
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
		setFixture(AbstractPartFactory.eINSTANCE.createModelFactoryAbstract());
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

} //ModelFactoryAbstractTest
