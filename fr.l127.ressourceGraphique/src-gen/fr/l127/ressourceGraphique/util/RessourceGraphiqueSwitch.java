/**
 */
package fr.l127.RessourceGraphique.util;

import fr.l127.RessourceGraphique.*;

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
 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage
 * @generated
 */
public class RessourceGraphiqueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RessourceGraphiquePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceGraphiqueSwitch() {
		if (modelPackage == null) {
			modelPackage = RessourceGraphiquePackage.eINSTANCE;
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
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE: {
			RessourceGraphique ressourceGraphique = (RessourceGraphique) theEObject;
			T result = caseRessourceGraphique(ressourceGraphique);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.BLOC: {
			Bloc bloc = (Bloc) theEObject;
			T result = caseBloc(bloc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.BLOC_INTERMEDIAIRE: {
			BlocIntermediaire blocIntermediaire = (BlocIntermediaire) theEObject;
			T result = caseBlocIntermediaire(blocIntermediaire);
			if (result == null)
				result = caseBloc(blocIntermediaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.RESULTAT: {
			Resultat resultat = (Resultat) theEObject;
			T result = caseResultat(resultat);
			if (result == null)
				result = caseBloc(resultat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.ENTREE: {
			Entree entree = (Entree) theEObject;
			T result = caseEntree(entree);
			if (result == null)
				result = caseBloc(entree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.BLOC_UNAIRE: {
			BlocUnaire blocUnaire = (BlocUnaire) theEObject;
			T result = caseBlocUnaire(blocUnaire);
			if (result == null)
				result = caseBlocIntermediaire(blocUnaire);
			if (result == null)
				result = caseBloc(blocUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.BLOC_BINAIRE: {
			BlocBinaire blocBinaire = (BlocBinaire) theEObject;
			T result = caseBlocBinaire(blocBinaire);
			if (result == null)
				result = caseBlocIntermediaire(blocBinaire);
			if (result == null)
				result = caseBloc(blocBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.FONCTION_UNAIRE: {
			FonctionUnaire fonctionUnaire = (FonctionUnaire) theEObject;
			T result = caseFonctionUnaire(fonctionUnaire);
			if (result == null)
				result = caseBlocUnaire(fonctionUnaire);
			if (result == null)
				result = caseBlocIntermediaire(fonctionUnaire);
			if (result == null)
				result = caseBloc(fonctionUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.SINUS: {
			Sinus sinus = (Sinus) theEObject;
			T result = caseSinus(sinus);
			if (result == null)
				result = caseFonctionUnaire(sinus);
			if (result == null)
				result = caseBlocUnaire(sinus);
			if (result == null)
				result = caseBlocIntermediaire(sinus);
			if (result == null)
				result = caseBloc(sinus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.OPERATEUR_BINAIRE: {
			OperateurBinaire operateurBinaire = (OperateurBinaire) theEObject;
			T result = caseOperateurBinaire(operateurBinaire);
			if (result == null)
				result = caseBlocBinaire(operateurBinaire);
			if (result == null)
				result = caseBlocIntermediaire(operateurBinaire);
			if (result == null)
				result = caseBloc(operateurBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseOperateurBinaire(multiplication);
			if (result == null)
				result = caseBlocBinaire(multiplication);
			if (result == null)
				result = caseBlocIntermediaire(multiplication);
			if (result == null)
				result = caseBloc(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.FICHIER_UNAIRE: {
			FichierUnaire fichierUnaire = (FichierUnaire) theEObject;
			T result = caseFichierUnaire(fichierUnaire);
			if (result == null)
				result = caseBlocUnaire(fichierUnaire);
			if (result == null)
				result = caseBlocIntermediaire(fichierUnaire);
			if (result == null)
				result = caseBloc(fichierUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseOperateurBinaire(addition);
			if (result == null)
				result = caseBlocBinaire(addition);
			if (result == null)
				result = caseBlocIntermediaire(addition);
			if (result == null)
				result = caseBloc(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.FONCTION_BINAIRE: {
			FonctionBinaire fonctionBinaire = (FonctionBinaire) theEObject;
			T result = caseFonctionBinaire(fonctionBinaire);
			if (result == null)
				result = caseBlocBinaire(fonctionBinaire);
			if (result == null)
				result = caseBlocIntermediaire(fonctionBinaire);
			if (result == null)
				result = caseBloc(fonctionBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.MINIMUN: {
			Minimun minimun = (Minimun) theEObject;
			T result = caseMinimun(minimun);
			if (result == null)
				result = caseFonctionBinaire(minimun);
			if (result == null)
				result = caseBlocBinaire(minimun);
			if (result == null)
				result = caseBlocIntermediaire(minimun);
			if (result == null)
				result = caseBloc(minimun);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.MAXIMUN: {
			Maximun maximun = (Maximun) theEObject;
			T result = caseMaximun(maximun);
			if (result == null)
				result = caseFonctionBinaire(maximun);
			if (result == null)
				result = caseBlocBinaire(maximun);
			if (result == null)
				result = caseBlocIntermediaire(maximun);
			if (result == null)
				result = caseBloc(maximun);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.COSINUS: {
			Cosinus cosinus = (Cosinus) theEObject;
			T result = caseCosinus(cosinus);
			if (result == null)
				result = caseFonctionUnaire(cosinus);
			if (result == null)
				result = caseBlocUnaire(cosinus);
			if (result == null)
				result = caseBlocIntermediaire(cosinus);
			if (result == null)
				result = caseBloc(cosinus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.RACINE_CARREE: {
			RacineCarree racineCarree = (RacineCarree) theEObject;
			T result = caseRacineCarree(racineCarree);
			if (result == null)
				result = caseFonctionUnaire(racineCarree);
			if (result == null)
				result = caseBlocUnaire(racineCarree);
			if (result == null)
				result = caseBlocIntermediaire(racineCarree);
			if (result == null)
				result = caseBloc(racineCarree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.SOUSTRACTION: {
			Soustraction soustraction = (Soustraction) theEObject;
			T result = caseSoustraction(soustraction);
			if (result == null)
				result = caseOperateurBinaire(soustraction);
			if (result == null)
				result = caseBlocBinaire(soustraction);
			if (result == null)
				result = caseBlocIntermediaire(soustraction);
			if (result == null)
				result = caseBloc(soustraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.DIVISION: {
			Division division = (Division) theEObject;
			T result = caseDivision(division);
			if (result == null)
				result = caseOperateurBinaire(division);
			if (result == null)
				result = caseBlocBinaire(division);
			if (result == null)
				result = caseBlocIntermediaire(division);
			if (result == null)
				result = caseBloc(division);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.OPERATEUR_UNAIRE: {
			OperateurUnaire operateurUnaire = (OperateurUnaire) theEObject;
			T result = caseOperateurUnaire(operateurUnaire);
			if (result == null)
				result = caseBlocUnaire(operateurUnaire);
			if (result == null)
				result = caseBlocIntermediaire(operateurUnaire);
			if (result == null)
				result = caseBloc(operateurUnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.NEGATION: {
			Negation negation = (Negation) theEObject;
			T result = caseNegation(negation);
			if (result == null)
				result = caseOperateurUnaire(negation);
			if (result == null)
				result = caseBlocUnaire(negation);
			if (result == null)
				result = caseBlocIntermediaire(negation);
			if (result == null)
				result = caseBloc(negation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.INVERSE: {
			Inverse inverse = (Inverse) theEObject;
			T result = caseInverse(inverse);
			if (result == null)
				result = caseOperateurUnaire(inverse);
			if (result == null)
				result = caseBlocUnaire(inverse);
			if (result == null)
				result = caseBlocIntermediaire(inverse);
			if (result == null)
				result = caseBloc(inverse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.FICHIER_BINAIRE: {
			FichierBinaire fichierBinaire = (FichierBinaire) theEObject;
			T result = caseFichierBinaire(fichierBinaire);
			if (result == null)
				result = caseBlocBinaire(fichierBinaire);
			if (result == null)
				result = caseBlocIntermediaire(fichierBinaire);
			if (result == null)
				result = caseBloc(fichierBinaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.REF_COLONNE: {
			RefColonne refColonne = (RefColonne) theEObject;
			T result = caseRefColonne(refColonne);
			if (result == null)
				result = caseEntree(refColonne);
			if (result == null)
				result = caseBloc(refColonne);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RessourceGraphiquePackage.CONSTANTE: {
			Constante constante = (Constante) theEObject;
			T result = caseConstante(constante);
			if (result == null)
				result = caseEntree(constante);
			if (result == null)
				result = caseBloc(constante);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource Graphique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource Graphique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourceGraphique(RessourceGraphique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloc(Bloc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Intermediaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Intermediaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlocIntermediaire(BlocIntermediaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultat(Resultat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlocUnaire(BlocUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloc Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloc Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlocBinaire(BlocBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionUnaire(FonctionUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinus(Sinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operateur Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operateur Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperateurBinaire(OperateurBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fichier Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fichier Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFichierUnaire(FichierUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonctionBinaire(FonctionBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimun(Minimun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximun(Maximun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cosinus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCosinus(Cosinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Racine Carree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Racine Carree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRacineCarree(RacineCarree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soustraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoustraction(Soustraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operateur Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operateur Unaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperateurUnaire(OperateurUnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverse(Inverse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fichier Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fichier Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFichierBinaire(FichierBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Colonne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefColonne(RefColonne object) {
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

} //RessourceGraphiqueSwitch
