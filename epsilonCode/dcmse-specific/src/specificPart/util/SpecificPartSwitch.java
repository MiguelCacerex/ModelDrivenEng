/**
 */
package specificPart.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import specificPart.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see specificPart.SpecificPartPackage
 * @generated
 */
public class SpecificPartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecificPartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPartSwitch() {
		if (modelPackage == null) {
			modelPackage = SpecificPartPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpecificPartPackage.MODEL_FACTORY_SPECIFIC: {
				ModelFactorySpecific modelFactorySpecific = (ModelFactorySpecific)theEObject;
				T result = caseModelFactorySpecific(modelFactorySpecific);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.CLASS_DIAGRAM_MSE: {
				ClassDiagramMSE classDiagramMSE = (ClassDiagramMSE)theEObject;
				T result = caseClassDiagramMSE(classDiagramMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.PACKAGE_MSE: {
				PackageMSE packageMSE = (PackageMSE)theEObject;
				T result = casePackageMSE(packageMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.CLASS_MSE: {
				ClassMSE classMSE = (ClassMSE)theEObject;
				T result = caseClassMSE(classMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.RELATION_MSE: {
				RelationMSE relationMSE = (RelationMSE)theEObject;
				T result = caseRelationMSE(relationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.INHERITANCE_MSE: {
				InheritanceMSE inheritanceMSE = (InheritanceMSE)theEObject;
				T result = caseInheritanceMSE(inheritanceMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.CONTAINMENT_MSE: {
				ContainmentMSE containmentMSE = (ContainmentMSE)theEObject;
				T result = caseContainmentMSE(containmentMSE);
				if (result == null) result = caseRelationMSE(containmentMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.AGREGATION_MSE: {
				AgregationMSE agregationMSE = (AgregationMSE)theEObject;
				T result = caseAgregationMSE(agregationMSE);
				if (result == null) result = caseRelationMSE(agregationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.ASSOCIATION_MSE: {
				AssociationMSE associationMSE = (AssociationMSE)theEObject;
				T result = caseAssociationMSE(associationMSE);
				if (result == null) result = caseRelationMSE(associationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.IMPLEMENTATION_MSE: {
				ImplementationMSE implementationMSE = (ImplementationMSE)theEObject;
				T result = caseImplementationMSE(implementationMSE);
				if (result == null) result = caseRelationMSE(implementationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.METHOD_MSE: {
				MethodMSE methodMSE = (MethodMSE)theEObject;
				T result = caseMethodMSE(methodMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpecificPartPackage.ATTRIBUTE_MSE: {
				AttributeMSE attributeMSE = (AttributeMSE)theEObject;
				T result = caseAttributeMSE(attributeMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Specific</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Specific</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactorySpecific(ModelFactorySpecific object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagramMSE(ClassDiagramMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMSE(PackageMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMSE(ClassMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationMSE(RelationMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritanceMSE(InheritanceMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentMSE(ContainmentMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agregation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agregation MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgregationMSE(AgregationMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationMSE(AssociationMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationMSE(ImplementationMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodMSE(MethodMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMSE(AttributeMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SpecificPartSwitch
