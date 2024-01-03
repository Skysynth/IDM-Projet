/**
 */
package fr.l127.ressourceGraphique.impl;

import fr.l127.ressourceGraphique.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourceGraphiqueFactoryImpl extends EFactoryImpl implements RessourceGraphiqueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RessourceGraphiqueFactory init() {
		try {
			RessourceGraphiqueFactory theRessourceGraphiqueFactory = (RessourceGraphiqueFactory) EPackage.Registry.INSTANCE
					.getEFactory(RessourceGraphiquePackage.eNS_URI);
			if (theRessourceGraphiqueFactory != null) {
				return theRessourceGraphiqueFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RessourceGraphiqueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceGraphiqueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE:
			return createRessourceGraphique();
		case RessourceGraphiquePackage.BLOC:
			return createBloc();
		case RessourceGraphiquePackage.FICHIER_BINAIRE:
			return createFichierBinaire();
		case RessourceGraphiquePackage.CONSTANTE:
			return createConstante();
		case RessourceGraphiquePackage.REF_COLONNE:
			return createRefColonne();
		case RessourceGraphiquePackage.NEGATION:
			return createNegation();
		case RessourceGraphiquePackage.SINUS:
			return createSinus();
		case RessourceGraphiquePackage.ADDITION:
			return createAddition();
		case RessourceGraphiquePackage.MULTIPLICATION:
			return createMultiplication();
		case RessourceGraphiquePackage.FICHIER_UNAIRE:
			return createFichierUnaire();
		case RessourceGraphiquePackage.RESULTAT:
			return createResultat();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceGraphique createRessourceGraphique() {
		RessourceGraphiqueImpl ressourceGraphique = new RessourceGraphiqueImpl();
		return ressourceGraphique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc createBloc() {
		BlocImpl bloc = new BlocImpl();
		return bloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichierBinaire createFichierBinaire() {
		FichierBinaireImpl fichierBinaire = new FichierBinaireImpl();
		return fichierBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constante createConstante() {
		ConstanteImpl constante = new ConstanteImpl();
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefColonne createRefColonne() {
		RefColonneImpl refColonne = new RefColonneImpl();
		return refColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sinus createSinus() {
		SinusImpl sinus = new SinusImpl();
		return sinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichierUnaire createFichierUnaire() {
		FichierUnaireImpl fichierUnaire = new FichierUnaireImpl();
		return fichierUnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultat createResultat() {
		ResultatImpl resultat = new ResultatImpl();
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceGraphiquePackage getRessourceGraphiquePackage() {
		return (RessourceGraphiquePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RessourceGraphiquePackage getPackage() {
		return RessourceGraphiquePackage.eINSTANCE;
	}

} //RessourceGraphiqueFactoryImpl
