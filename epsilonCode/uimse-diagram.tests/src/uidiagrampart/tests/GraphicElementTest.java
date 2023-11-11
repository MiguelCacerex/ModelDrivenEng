/**
 */
package uidiagrampart.tests;

import junit.textui.TestRunner;

import uidiagrampart.GraphicElement;
import uidiagrampart.UidiagrampartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graphic Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicElementTest extends PropertiesElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphicElementTest.class);
	}

	/**
	 * Constructs a new Graphic Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Graphic Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GraphicElement getFixture() {
		return (GraphicElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagrampartFactory.eINSTANCE.createGraphicElement());
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

} //GraphicElementTest
