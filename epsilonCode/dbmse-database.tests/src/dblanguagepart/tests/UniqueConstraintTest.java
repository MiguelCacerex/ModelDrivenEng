/**
 */
package dblanguagepart.tests;

import dblanguagepart.DblanguagepartFactory;
import dblanguagepart.UniqueConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniqueConstraintTest extends TestCase {

	/**
	 * The fixture for this Unique Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniqueConstraintTest.class);
	}

	/**
	 * Constructs a new Unique Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unique Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UniqueConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unique Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueConstraint getFixture() {
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
		setFixture(DblanguagepartFactory.eINSTANCE.createUniqueConstraint());
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

} //UniqueConstraintTest
