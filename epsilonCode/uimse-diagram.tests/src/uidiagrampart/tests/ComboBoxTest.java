/**
 */
package uidiagrampart.tests;

import junit.textui.TestRunner;

import uidiagrampart.ComboBox;
import uidiagrampart.UidiagrampartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComboBoxTest extends GraphicElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComboBoxTest.class);
	}

	/**
	 * Constructs a new Combo Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Combo Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComboBox getFixture() {
		return (ComboBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagrampartFactory.eINSTANCE.createComboBox());
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

} //ComboBoxTest
