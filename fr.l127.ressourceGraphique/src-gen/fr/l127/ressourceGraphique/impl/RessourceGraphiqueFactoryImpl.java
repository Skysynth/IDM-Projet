/**
 */
package fr.l127.RessourceGraphique.impl;

import fr.l127.RessourceGraphique.*;

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
		case RessourceGraphiquePackage.RESULTAT:
			return createResultat();
		case RessourceGraphiquePackage.SINUS:
			return createSinus();
		case RessourceGraphiquePackage.MULTIPLICATION:
			return createMultiplication();
		case RessourceGraphiquePackage.FICHIER_UNAIRE:
			return createFichierUnaire();
		case RessourceGraphiquePackage.ADDITION:
			return createAddition();
		case RessourceGraphiquePackage.MINIMUN:
			return createMinimun();
		case RessourceGraphiquePackage.MAXIMUN:
			return createMaximun();
		case RessourceGraphiquePackage.COSINUS:
			return createCosinus();
		case RessourceGraphiquePackage.RACINE_CARREE:
			return createRacineCarree();
		case RessourceGraphiquePackage.SOUSTRACTION:
			return createSoustraction();
		case RessourceGraphiquePackage.DIVISION:
			return createDivision();
		case RessourceGraphiquePackage.NEGATION:
			return createNegation();
		case RessourceGraphiquePackage.INVERSE:
			return createInverse();
		case RessourceGraphiquePackage.FICHIER_BINAIRE:
			return createFichierBinaire();
		case RessourceGraphiquePackage.REF_COLONNE:
			return createRefColonne();
		case RessourceGraphiquePackage.CONSTANTE:
			return createConstante();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RessourceGraphique createRessourceGraphique() {
		RessourceGraphiqueImpl ressourceGraphique = new RessourceGraphiqueImpl();
		return ressourceGraphique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resultat createResultat() {
		ResultatImpl resultat = new ResultatImpl();
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sinus createSinus() {
		SinusImpl sinus = new SinusImpl();
		return sinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constante createConstante() {
		ConstanteImpl constante = new ConstanteImpl();
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FichierUnaire createFichierUnaire() {
		FichierUnaireImpl fichierUnaire = new FichierUnaireImpl();
		return fichierUnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minimun createMinimun() {
		MinimunImpl minimun = new MinimunImpl();
		return minimun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Maximun createMaximun() {
		MaximunImpl maximun = new MaximunImpl();
		return maximun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cosinus createCosinus() {
		CosinusImpl cosinus = new CosinusImpl();
		return cosinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RacineCarree createRacineCarree() {
		RacineCarreeImpl racineCarree = new RacineCarreeImpl();
		return racineCarree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Soustraction createSoustraction() {
		SoustractionImpl soustraction = new SoustractionImpl();
		return soustraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inverse createInverse() {
		InverseImpl inverse = new InverseImpl();
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FichierBinaire createFichierBinaire() {
		FichierBinaireImpl fichierBinaire = new FichierBinaireImpl();
		return fichierBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefColonne createRefColonne() {
		RefColonneImpl refColonne = new RefColonneImpl();
		return refColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
