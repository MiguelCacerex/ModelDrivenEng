/**
 */
package specificPart.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import specificPart.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see specificPart.SpecificPartPackage
 * @generated
 */
public class SpecificPartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecificPartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpecificPartPackage.eINSTANCE;
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
	protected SpecificPartSwitch<Adapter> modelSwitch =
		new SpecificPartSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactorySpecific(ModelFactorySpecific object) {
				return createModelFactorySpecificAdapter();
			}
			@Override
			public Adapter caseClassDiagramMSE(ClassDiagramMSE object) {
				return createClassDiagramMSEAdapter();
			}
			@Override
			public Adapter casePackageMSE(PackageMSE object) {
				return createPackageMSEAdapter();
			}
			@Override
			public Adapter caseClassMSE(ClassMSE object) {
				return createClassMSEAdapter();
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
			public Adapter caseMethodMSE(MethodMSE object) {
				return createMethodMSEAdapter();
			}
			@Override
			public Adapter caseAttributeMSE(AttributeMSE object) {
				return createAttributeMSEAdapter();
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
	 * Creates a new adapter for an object of class '{@link specificPart.ModelFactorySpecific <em>Model Factory Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.ModelFactorySpecific
	 * @generated
	 */
	public Adapter createModelFactorySpecificAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.ClassDiagramMSE <em>Class Diagram MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.ClassDiagramMSE
	 * @generated
	 */
	public Adapter createClassDiagramMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.PackageMSE <em>Package MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.PackageMSE
	 * @generated
	 */
	public Adapter createPackageMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.ClassMSE <em>Class MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.ClassMSE
	 * @generated
	 */
	public Adapter createClassMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.RelationMSE <em>Relation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.RelationMSE
	 * @generated
	 */
	public Adapter createRelationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.InheritanceMSE <em>Inheritance MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.InheritanceMSE
	 * @generated
	 */
	public Adapter createInheritanceMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.ContainmentMSE <em>Containment MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.ContainmentMSE
	 * @generated
	 */
	public Adapter createContainmentMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.AgregationMSE <em>Agregation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.AgregationMSE
	 * @generated
	 */
	public Adapter createAgregationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.AssociationMSE <em>Association MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.AssociationMSE
	 * @generated
	 */
	public Adapter createAssociationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.ImplementationMSE <em>Implementation MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.ImplementationMSE
	 * @generated
	 */
	public Adapter createImplementationMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.MethodMSE <em>Method MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.MethodMSE
	 * @generated
	 */
	public Adapter createMethodMSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link specificPart.AttributeMSE <em>Attribute MSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see specificPart.AttributeMSE
	 * @generated
	 */
	public Adapter createAttributeMSEAdapter() {
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

} //SpecificPartAdapterFactory
