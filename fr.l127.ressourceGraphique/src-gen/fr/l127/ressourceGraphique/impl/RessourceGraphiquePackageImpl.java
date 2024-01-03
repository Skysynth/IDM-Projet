/**
 */
package fr.l127.RessourceGraphique.impl;

import fr.l127.RessourceGraphique.Addition;
import fr.l127.RessourceGraphique.Bloc;
import fr.l127.RessourceGraphique.BlocBinaire;
import fr.l127.RessourceGraphique.BlocIntermediaire;
import fr.l127.RessourceGraphique.BlocUnaire;
import fr.l127.RessourceGraphique.Constante;
import fr.l127.RessourceGraphique.Cosinus;
import fr.l127.RessourceGraphique.Division;
import fr.l127.RessourceGraphique.Entree;
import fr.l127.RessourceGraphique.FichierBinaire;
import fr.l127.RessourceGraphique.FichierUnaire;
import fr.l127.RessourceGraphique.FonctionBinaire;
import fr.l127.RessourceGraphique.FonctionUnaire;
import fr.l127.RessourceGraphique.Inverse;
import fr.l127.RessourceGraphique.Maximun;
import fr.l127.RessourceGraphique.Minimun;
import fr.l127.RessourceGraphique.Multiplication;
import fr.l127.RessourceGraphique.Negation;
import fr.l127.RessourceGraphique.OperateurBinaire;
import fr.l127.RessourceGraphique.OperateurUnaire;
import fr.l127.RessourceGraphique.RacineCarree;
import fr.l127.RessourceGraphique.RefColonne;
import fr.l127.RessourceGraphique.RessourceGraphique;
import fr.l127.RessourceGraphique.RessourceGraphiqueFactory;
import fr.l127.RessourceGraphique.RessourceGraphiquePackage;
import fr.l127.RessourceGraphique.Resultat;
import fr.l127.RessourceGraphique.Sinus;
import fr.l127.RessourceGraphique.Soustraction;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourceGraphiquePackageImpl extends EPackageImpl implements RessourceGraphiquePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceGraphiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocIntermediaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fonctionUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operateurBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichierUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fonctionBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cosinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass racineCarreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soustractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operateurUnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichierBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refColonneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RessourceGraphiquePackageImpl() {
		super(eNS_URI, RessourceGraphiqueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RessourceGraphiquePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RessourceGraphiquePackage init() {
		if (isInited)
			return (RessourceGraphiquePackage) EPackage.Registry.INSTANCE
					.getEPackage(RessourceGraphiquePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRessourceGraphiquePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RessourceGraphiquePackageImpl theRessourceGraphiquePackage = registeredRessourceGraphiquePackage instanceof RessourceGraphiquePackageImpl
				? (RessourceGraphiquePackageImpl) registeredRessourceGraphiquePackage
				: new RessourceGraphiquePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRessourceGraphiquePackage.createPackageContents();

		// Initialize created meta-data
		theRessourceGraphiquePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRessourceGraphiquePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RessourceGraphiquePackage.eNS_URI, theRessourceGraphiquePackage);
		return theRessourceGraphiquePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRessourceGraphique() {
		return ressourceGraphiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRessourceGraphique_Bloc() {
		return (EReference) ressourceGraphiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloc() {
		return blocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlocIntermediaire() {
		return blocIntermediaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultat() {
		return resultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultat_Entree() {
		return (EReference) resultatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlocUnaire() {
		return blocUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlocUnaire_Entree() {
		return (EReference) blocUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlocBinaire() {
		return blocBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlocBinaire_Entree() {
		return (EReference) blocBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFonctionUnaire() {
		return fonctionUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSinus() {
		return sinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperateurBinaire() {
		return operateurBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstante_Valeur() {
		return (EAttribute) constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFichierUnaire() {
		return fichierUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFichierUnaire_Chemin() {
		return (EAttribute) fichierUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFonctionBinaire() {
		return fonctionBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinimun() {
		return minimunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximun() {
		return maximunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCosinus() {
		return cosinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRacineCarree() {
		return racineCarreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoustraction() {
		return soustractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperateurUnaire() {
		return operateurUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInverse() {
		return inverseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFichierBinaire() {
		return fichierBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFichierBinaire_Chemin() {
		return (EAttribute) fichierBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefColonne() {
		return refColonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefColonne_IdColonne() {
		return (EAttribute) refColonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RessourceGraphiqueFactory getRessourceGraphiqueFactory() {
		return (RessourceGraphiqueFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ressourceGraphiqueEClass = createEClass(RESSOURCE_GRAPHIQUE);
		createEReference(ressourceGraphiqueEClass, RESSOURCE_GRAPHIQUE__BLOC);

		blocEClass = createEClass(BLOC);

		blocIntermediaireEClass = createEClass(BLOC_INTERMEDIAIRE);

		resultatEClass = createEClass(RESULTAT);
		createEReference(resultatEClass, RESULTAT__ENTREE);

		entreeEClass = createEClass(ENTREE);

		blocUnaireEClass = createEClass(BLOC_UNAIRE);
		createEReference(blocUnaireEClass, BLOC_UNAIRE__ENTREE);

		blocBinaireEClass = createEClass(BLOC_BINAIRE);
		createEReference(blocBinaireEClass, BLOC_BINAIRE__ENTREE);

		fonctionUnaireEClass = createEClass(FONCTION_UNAIRE);

		sinusEClass = createEClass(SINUS);

		operateurBinaireEClass = createEClass(OPERATEUR_BINAIRE);

		multiplicationEClass = createEClass(MULTIPLICATION);

		fichierUnaireEClass = createEClass(FICHIER_UNAIRE);
		createEAttribute(fichierUnaireEClass, FICHIER_UNAIRE__CHEMIN);

		additionEClass = createEClass(ADDITION);

		fonctionBinaireEClass = createEClass(FONCTION_BINAIRE);

		minimunEClass = createEClass(MINIMUN);

		maximunEClass = createEClass(MAXIMUN);

		cosinusEClass = createEClass(COSINUS);

		racineCarreeEClass = createEClass(RACINE_CARREE);

		soustractionEClass = createEClass(SOUSTRACTION);

		divisionEClass = createEClass(DIVISION);

		operateurUnaireEClass = createEClass(OPERATEUR_UNAIRE);

		negationEClass = createEClass(NEGATION);

		inverseEClass = createEClass(INVERSE);

		fichierBinaireEClass = createEClass(FICHIER_BINAIRE);
		createEAttribute(fichierBinaireEClass, FICHIER_BINAIRE__CHEMIN);

		refColonneEClass = createEClass(REF_COLONNE);
		createEAttribute(refColonneEClass, REF_COLONNE__ID_COLONNE);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALEUR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blocIntermediaireEClass.getESuperTypes().add(this.getBloc());
		resultatEClass.getESuperTypes().add(this.getBloc());
		entreeEClass.getESuperTypes().add(this.getBloc());
		blocUnaireEClass.getESuperTypes().add(this.getBlocIntermediaire());
		blocBinaireEClass.getESuperTypes().add(this.getBlocIntermediaire());
		fonctionUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		sinusEClass.getESuperTypes().add(this.getFonctionUnaire());
		operateurBinaireEClass.getESuperTypes().add(this.getBlocBinaire());
		multiplicationEClass.getESuperTypes().add(this.getOperateurBinaire());
		fichierUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		additionEClass.getESuperTypes().add(this.getOperateurBinaire());
		fonctionBinaireEClass.getESuperTypes().add(this.getBlocBinaire());
		minimunEClass.getESuperTypes().add(this.getFonctionBinaire());
		maximunEClass.getESuperTypes().add(this.getFonctionBinaire());
		cosinusEClass.getESuperTypes().add(this.getFonctionUnaire());
		racineCarreeEClass.getESuperTypes().add(this.getFonctionUnaire());
		soustractionEClass.getESuperTypes().add(this.getOperateurBinaire());
		divisionEClass.getESuperTypes().add(this.getOperateurBinaire());
		operateurUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		negationEClass.getESuperTypes().add(this.getOperateurUnaire());
		inverseEClass.getESuperTypes().add(this.getOperateurUnaire());
		fichierBinaireEClass.getESuperTypes().add(this.getBlocBinaire());
		refColonneEClass.getESuperTypes().add(this.getEntree());
		constanteEClass.getESuperTypes().add(this.getEntree());

		// Initialize classes, features, and operations; add parameters
		initEClass(ressourceGraphiqueEClass, RessourceGraphique.class, "RessourceGraphique", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRessourceGraphique_Bloc(), this.getBloc(), null, "bloc", null, 0, -1,
				RessourceGraphique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocEClass, Bloc.class, "Bloc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blocIntermediaireEClass, BlocIntermediaire.class, "BlocIntermediaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultatEClass, Resultat.class, "Resultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultat_Entree(), this.getBloc(), null, "entree", null, 1, 1, Resultat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blocUnaireEClass, BlocUnaire.class, "BlocUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlocUnaire_Entree(), this.getBloc(), null, "entree", null, 1, 1, BlocUnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocBinaireEClass, BlocBinaire.class, "BlocBinaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlocBinaire_Entree(), this.getBloc(), null, "entree", null, 2, 2, BlocBinaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fonctionUnaireEClass, FonctionUnaire.class, "FonctionUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinusEClass, Sinus.class, "Sinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operateurBinaireEClass, OperateurBinaire.class, "OperateurBinaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fichierUnaireEClass, FichierUnaire.class, "FichierUnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichierUnaire_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, FichierUnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fonctionBinaireEClass, FonctionBinaire.class, "FonctionBinaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimunEClass, Minimun.class, "Minimun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maximunEClass, Maximun.class, "Maximun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cosinusEClass, Cosinus.class, "Cosinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(racineCarreeEClass, RacineCarree.class, "RacineCarree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(soustractionEClass, Soustraction.class, "Soustraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operateurUnaireEClass, OperateurUnaire.class, "OperateurUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseEClass, Inverse.class, "Inverse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fichierBinaireEClass, FichierBinaire.class, "FichierBinaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichierBinaire_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1,
				FichierBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(refColonneEClass, RefColonne.class, "RefColonne", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefColonne_IdColonne(), ecorePackage.getEInt(), "idColonne", null, 0, 1, RefColonne.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Valeur(), ecorePackage.getEInt(), "valeur", null, 0, 1, Constante.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RessourceGraphiquePackageImpl
