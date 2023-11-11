/**
 */
package uidiagrampart.tests;

import junit.textui.TestRunner;

import uidiagrampart.TableView;
import uidiagrampart.UidiagrampartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Table View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableViewTest extends GraphicElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableViewTest.class);
	}

	/**
	 * Constructs a new Table View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Table View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TableView getFixture() {
		return (TableView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagrampartFactory.eINSTANCE.createTableView());
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

} //TableViewTest
