/**
 */
package abstractPart.util;

import abstractPart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstractPart.AbstractPartPackage
 * @generated
 */
public class AbstractPartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractPartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractPartPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPartSwitch<Adapter> modelSwitch =
		new AbstractPartSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryAbstract(ModelFactoryAbstract object) {
				return createModelFactoryAbstractAdapter();
			}
			@Override
			public Adapter casePackageMSE(PackageMSE object) {
				return createPackageMSEAdapter();
			}
			@Override
			public Adapter caseClassDiagramMSE(ClassDiagramMSE object) {
				return createClassDiagramMSEAdapter();
			}
			@Override
			public Adapter caseClassMSE(ClassMSE object) {
				return createClassMSEAdapter();
			}
			@Override
			public Adapter caseMethodMSE(MethodMSE object) {
				return createMethodMSEAdapter();
			}
			@Override
			public Adapter caseAttributeMSE(AttributeMSE object) {
				return createAttributeMSEAdapter();
			}
			@Override
			public Adapter caseAttributeRelationMSE(AttributeRelationMSE object) {
				return createAttributeRelationMSEAdapter();
			}
			@Override
			public Adapter caseHashCodeClassMSE(HashCodeClassMSE object) {
				return createHashCodeClassMSEAdapter();
			}
			@Override
			public Adapter caseAssociationsMSE(AssociationsMSE object) {
				return createAssociationsMSEAdapter();
			}
			@Override
			public Adapter caseRelationMSE(RelationMSE object) {
				return createRelationMSEAdapter();
			}
			@Override
			public Adapter caseInheritanceMSE(InheritanceMSE object) {
				return createInheritanceMSEAdapter();
			}
			@Override
			public Adapter caseContainmentMSE(ContainmentMSE object) {
				return createContainmentMSEAdapter();
			}
			@Override
			public Adapter caseAgregationMSE(AgregationMSE object) {
				return createAgregationMSEAdapter();
			}
			@Override
			public Adapter caseAssociationMSE(AssociationMSE object) {
				return createAssociationMSEAdapter();
			}
			@Override
			public Adapter caseImplementationMSE(ImplementationMSE object) {
				return createImplementationMSEAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.ModelFactoryAbstract <em>Model Factory Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.ModelFactoryAbstract
	 * @generated
	 */
	public Adapter createModelFactoryAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.PackageMSE <em>Package MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.PackageMSE
	 * @generated
	 */
	public Adapter createPackageMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.ClassDiagramMSE <em>Class Diagram MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.ClassDiagramMSE
	 * @generated
	 */
	public Adapter createClassDiagramMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.ClassMSE <em>Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.ClassMSE
	 * @generated
	 */
	public Adapter createClassMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.MethodMSE <em>Method MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.MethodMSE
	 * @generated
	 */
	public Adapter createMethodMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.AttributeMSE <em>Attribute MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.AttributeMSE
	 * @generated
	 */
	public Adapter createAttributeMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.AttributeRelationMSE <em>Attribute Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.AttributeRelationMSE
	 * @generated
	 */
	public Adapter createAttributeRelationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.HashCodeClassMSE <em>Hash Code Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.HashCodeClassMSE
	 * @generated
	 */
	public Adapter createHashCodeClassMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.AssociationsMSE <em>Associations MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.AssociationsMSE
	 * @generated
	 */
	public Adapter createAssociationsMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.RelationMSE <em>Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.RelationMSE
	 * @generated
	 */
	public Adapter createRelationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.InheritanceMSE <em>Inheritance MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.InheritanceMSE
	 * @generated
	 */
	public Adapter createInheritanceMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.ContainmentMSE <em>Containment MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.ContainmentMSE
	 * @generated
	 */
	public Adapter createContainmentMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.AgregationMSE <em>Agregation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.AgregationMSE
	 * @generated
	 */
	public Adapter createAgregationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.AssociationMSE <em>Association MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.AssociationMSE
	 * @generated
	 */
	public Adapter createAssociationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractPart.ImplementationMSE <em>Implementation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractPart.ImplementationMSE
	 * @generated
	 */
	public Adapter createImplementationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractPartAdapterFactory
