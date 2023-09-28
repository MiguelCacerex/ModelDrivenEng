/**
 */
package abstractPart.tests;

import abstractPart.AbstractPartFactory;
import abstractPart.AssociationsMSE;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Associations MSE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationsMSETest extends TestCase {

	/**
	 * The fixture for this Associations MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationsMSE fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationsMSETest.class);
	}

	/**
	 * Constructs a new Associations MSE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationsMSETest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Associations MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AssociationsMSE fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Associations MSE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationsMSE getFixture() {
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
		setFixture(AbstractPartFactory.eINSTANCE.createAssociationsMSE());
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

} //AssociationsMSETest
