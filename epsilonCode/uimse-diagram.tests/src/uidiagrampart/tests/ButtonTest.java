/**
 */
package uidiagrampart.tests;

import junit.textui.TestRunner;

import uidiagrampart.Button;
import uidiagrampart.UidiagrampartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonTest extends GraphicElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ButtonTest.class);
	}

	/**
	 * Constructs a new Button test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Button getFixture() {
		return (Button)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagrampartFactory.eINSTANCE.createButton());
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

} //ButtonTest
