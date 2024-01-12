/**
 */
package fr.l127.schemaTableAlgo.util;

import fr.l127.schemaTableAlgo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage
 * @generated
 */
public class SchemaTableAlgoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchemaTableAlgoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableAlgoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchemaTableAlgoPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTableAlgoSwitch<Adapter> modelSwitch = new SchemaTableAlgoSwitch<Adapter>() {
		@Override
		public Adapter caseSchemaTable(SchemaTable object) {
			return createSchemaTableAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseColonne(Colonne object) {
			return createColonneAdapter();
		}

		@Override
		public Adapter caseColonneSpeciale(ColonneSpeciale object) {
			return createColonneSpecialeAdapter();
		}

		@Override
		public Adapter caseColonneNormal(ColonneNormal object) {
			return createColonneNormalAdapter();
		}

		@Override
		public Adapter caseContrainte(Contrainte object) {
			return createContrainteAdapter();
		}

		@Override
		public Adapter caseCatalogue(Catalogue object) {
			return createCatalogueAdapter();
		}

		@Override
		public Adapter caseAlgorithme(Algorithme object) {
			return createAlgorithmeAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.SchemaTable <em>Schema Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.SchemaTable
	 * @generated
	 */
	public Adapter createSchemaTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.Colonne
	 * @generated
	 */
	public Adapter createColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.ColonneSpeciale <em>Colonne Speciale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.ColonneSpeciale
	 * @generated
	 */
	public Adapter createColonneSpecialeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.ColonneNormal <em>Colonne Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.ColonneNormal
	 * @generated
	 */
	public Adapter createColonneNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.Contrainte
	 * @generated
	 */
	public Adapter createContrainteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.Catalogue
	 * @generated
	 */
	public Adapter createCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.schemaTableAlgo.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.schemaTableAlgo.Algorithme
	 * @generated
	 */
	public Adapter createAlgorithmeAdapter() {
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

} //SchemaTableAlgoAdapterFactory
