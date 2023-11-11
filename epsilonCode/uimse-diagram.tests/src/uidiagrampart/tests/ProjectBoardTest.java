/**
 */
package uidiagrampart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uidiagrampart.ProjectBoard;
import uidiagrampart.UidiagrampartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Board</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectBoardTest extends TestCase {

	/**
	 * The fixture for this Project Board test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectBoard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectBoardTest.class);
	}

	/**
	 * Constructs a new Project Board test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectBoardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project Board test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectBoard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project Board test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectBoard getFixture() {
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
		setFixture(UidiagrampartFactory.eINSTANCE.createProjectBoard());
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

} //ProjectBoardTest
