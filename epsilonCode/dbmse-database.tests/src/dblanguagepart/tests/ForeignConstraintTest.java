/**
 */
package dblanguagepart.tests;

import dblanguagepart.DblanguagepartFactory;
import dblanguagepart.ForeignConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Foreign Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForeignConstraintTest extends TestCase {

	/**
	 * The fixture for this Foreign Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForeignConstraintTest.class);
	}

	/**
	 * Constructs a new Foreign Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Foreign Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ForeignConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Foreign Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignConstraint getFixture() {
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
		setFixture(DblanguagepartFactory.eINSTANCE.createForeignConstraint());
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

} //ForeignConstraintTest
