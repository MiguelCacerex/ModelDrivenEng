/**
 */
package dblanguagepart.tests;

import dblanguagepart.DblanguagepartFactory;
import dblanguagepart.PrimaryKeyConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primary Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimaryKeyConstraintTest extends TestCase {

	/**
	 * The fixture for this Primary Key Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimaryKeyConstraintTest.class);
	}

	/**
	 * Constructs a new Primary Key Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Primary Key Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PrimaryKeyConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Primary Key Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyConstraint getFixture() {
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
		setFixture(DblanguagepartFactory.eINSTANCE.createPrimaryKeyConstraint());
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

} //PrimaryKeyConstraintTest
