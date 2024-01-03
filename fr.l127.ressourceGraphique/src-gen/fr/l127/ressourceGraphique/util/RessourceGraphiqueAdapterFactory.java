/**
 */
package fr.l127.ressourceGraphique.util;

import fr.l127.ressourceGraphique.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage
 * @generated
 */
public class RessourceGraphiqueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RessourceGraphiquePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceGraphiqueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RessourceGraphiquePackage.eINSTANCE;
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
	protected RessourceGraphiqueSwitch<Adapter> modelSwitch = new RessourceGraphiqueSwitch<Adapter>() {
		@Override
		public Adapter caseRessourceGraphique(RessourceGraphique object) {
			return createRessourceGraphiqueAdapter();
		}

		@Override
		public Adapter caseBloc(Bloc object) {
			return createBlocAdapter();
		}

		@Override
		public Adapter caseFonctionUnaire(FonctionUnaire object) {
			return createFonctionUnaireAdapter();
		}

		@Override
		public Adapter caseFichierBinaire(FichierBinaire object) {
			return createFichierBinaireAdapter();
		}

		@Override
		public Adapter caseConstante(Constante object) {
			return createConstanteAdapter();
		}

		@Override
		public Adapter caseRefColonne(RefColonne object) {
			return createRefColonneAdapter();
		}

		@Override
		public Adapter caseOperateurUnaire(OperateurUnaire object) {
			return createOperateurUnaireAdapter();
		}

		@Override
		public Adapter caseNegation(Negation object) {
			return createNegationAdapter();
		}

		@Override
		public Adapter caseSinus(Sinus object) {
			return createSinusAdapter();
		}

		@Override
		public Adapter caseBlocUnaire(BlocUnaire object) {
			return createBlocUnaireAdapter();
		}

		@Override
		public Adapter caseOperateurBinaire(OperateurBinaire object) {
			return createOperateurBinaireAdapter();
		}

		@Override
		public Adapter caseBlocBinaire(BlocBinaire object) {
			return createBlocBinaireAdapter();
		}

		@Override
		public Adapter caseAddition(Addition object) {
			return createAdditionAdapter();
		}

		@Override
		public Adapter caseMultiplication(Multiplication object) {
			return createMultiplicationAdapter();
		}

		@Override
		public Adapter caseFichierUnaire(FichierUnaire object) {
			return createFichierUnaireAdapter();
		}

		@Override
		public Adapter caseBlocIntermediaire(BlocIntermediaire object) {
			return createBlocIntermediaireAdapter();
		}

		@Override
		public Adapter caseResultat(Resultat object) {
			return createResultatAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.RessourceGraphique <em>Ressource Graphique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.RessourceGraphique
	 * @generated
	 */
	public Adapter createRessourceGraphiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Bloc
	 * @generated
	 */
	public Adapter createBlocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.FonctionUnaire
	 * @generated
	 */
	public Adapter createFonctionUnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.FichierBinaire <em>Fichier Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.FichierBinaire
	 * @generated
	 */
	public Adapter createFichierBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Constante
	 * @generated
	 */
	public Adapter createConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.RefColonne <em>Ref Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.RefColonne
	 * @generated
	 */
	public Adapter createRefColonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.OperateurUnaire
	 * @generated
	 */
	public Adapter createOperateurUnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Sinus <em>Sinus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Sinus
	 * @generated
	 */
	public Adapter createSinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.BlocUnaire <em>Bloc Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.BlocUnaire
	 * @generated
	 */
	public Adapter createBlocUnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.OperateurBinaire
	 * @generated
	 */
	public Adapter createOperateurBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.BlocBinaire <em>Bloc Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.BlocBinaire
	 * @generated
	 */
	public Adapter createBlocBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.FichierUnaire <em>Fichier Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.FichierUnaire
	 * @generated
	 */
	public Adapter createFichierUnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.BlocIntermediaire
	 * @generated
	 */
	public Adapter createBlocIntermediaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.l127.ressourceGraphique.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.l127.ressourceGraphique.Resultat
	 * @generated
	 */
	public Adapter createResultatAdapter() {
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

} //RessourceGraphiqueAdapterFactory
