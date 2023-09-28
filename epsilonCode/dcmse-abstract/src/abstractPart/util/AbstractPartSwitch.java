/**
 */
package abstractPart.util;

import abstractPart.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see abstractPart.AbstractPartPackage
 * @generated
 */
public class AbstractPartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractPartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPartSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractPartPackage.eINSTANCE;
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
			case AbstractPartPackage.MODEL_FACTORY_ABSTRACT: {
				ModelFactoryAbstract modelFactoryAbstract = (ModelFactoryAbstract)theEObject;
				T result = caseModelFactoryAbstract(modelFactoryAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.PACKAGE_MSE: {
				PackageMSE packageMSE = (PackageMSE)theEObject;
				T result = casePackageMSE(packageMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.CLASS_DIAGRAM_MSE: {
				ClassDiagramMSE classDiagramMSE = (ClassDiagramMSE)theEObject;
				T result = caseClassDiagramMSE(classDiagramMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.CLASS_MSE: {
				ClassMSE classMSE = (ClassMSE)theEObject;
				T result = caseClassMSE(classMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.METHOD_MSE: {
				MethodMSE methodMSE = (MethodMSE)theEObject;
				T result = caseMethodMSE(methodMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.ATTRIBUTE_MSE: {
				AttributeMSE attributeMSE = (AttributeMSE)theEObject;
				T result = caseAttributeMSE(attributeMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.ATTRIBUTE_RELATION_MSE: {
				AttributeRelationMSE attributeRelationMSE = (AttributeRelationMSE)theEObject;
				T result = caseAttributeRelationMSE(attributeRelationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.HASH_CODE_CLASS_MSE: {
				HashCodeClassMSE hashCodeClassMSE = (HashCodeClassMSE)theEObject;
				T result = caseHashCodeClassMSE(hashCodeClassMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.ASSOCIATIONS_MSE: {
				AssociationsMSE associationsMSE = (AssociationsMSE)theEObject;
				T result = caseAssociationsMSE(associationsMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.RELATION_MSE: {
				RelationMSE relationMSE = (RelationMSE)theEObject;
				T result = caseRelationMSE(relationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.INHERITANCE_MSE: {
				InheritanceMSE inheritanceMSE = (InheritanceMSE)theEObject;
				T result = caseInheritanceMSE(inheritanceMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.CONTAINMENT_MSE: {
				ContainmentMSE containmentMSE = (ContainmentMSE)theEObject;
				T result = caseContainmentMSE(containmentMSE);
				if (result == null) result = caseRelationMSE(containmentMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.AGREGATION_MSE: {
				AgregationMSE agregationMSE = (AgregationMSE)theEObject;
				T result = caseAgregationMSE(agregationMSE);
				if (result == null) result = caseRelationMSE(agregationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.ASSOCIATION_MSE: {
				AssociationMSE associationMSE = (AssociationMSE)theEObject;
				T result = caseAssociationMSE(associationMSE);
				if (result == null) result = caseRelationMSE(associationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractPartPackage.IMPLEMENTATION_MSE: {
				ImplementationMSE implementationMSE = (ImplementationMSE)theEObject;
				T result = caseImplementationMSE(implementationMSE);
				if (result == null) result = caseRelationMSE(implementationMSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryAbstract(ModelFactoryAbstract object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Relation MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Relation MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRelationMSE(AttributeRelationMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash Code Class MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash Code Class MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashCodeClassMSE(HashCodeClassMSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associations MSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associations MSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationsMSE(AssociationsMSE object) {
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

} //AbstractPartSwitch
