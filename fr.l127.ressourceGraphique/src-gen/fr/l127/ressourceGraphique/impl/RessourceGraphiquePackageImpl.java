/**
 */
package fr.l127.ressourceGraphique.impl;

import fr.l127.ressourceGraphique.Addition;
import fr.l127.ressourceGraphique.Bloc;
import fr.l127.ressourceGraphique.BlocBinaire;
import fr.l127.ressourceGraphique.BlocIntermediaire;
import fr.l127.ressourceGraphique.BlocUnaire;
import fr.l127.ressourceGraphique.Constante;
import fr.l127.ressourceGraphique.FichierBinaire;
import fr.l127.ressourceGraphique.FichierUnaire;
import fr.l127.ressourceGraphique.FonctionUnaire;
import fr.l127.ressourceGraphique.Multiplication;
import fr.l127.ressourceGraphique.Negation;
import fr.l127.ressourceGraphique.OperateurBinaire;
import fr.l127.ressourceGraphique.OperateurUnaire;
import fr.l127.ressourceGraphique.RefColonne;
import fr.l127.ressourceGraphique.RessourceGraphique;
import fr.l127.ressourceGraphique.RessourceGraphiqueFactory;
import fr.l127.ressourceGraphique.RessourceGraphiquePackage;
import fr.l127.ressourceGraphique.Resultat;
import fr.l127.ressourceGraphique.Sinus;

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
	private EClass fonctionUnaireEClass = null;

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
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refColonneEClass = null;

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
	private EClass sinusEClass = null;

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
	private EClass operateurBinaireEClass = null;

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
	private EClass additionEClass = null;

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
	private EClass fichierUnaireEClass = null;

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
	 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage#eNS_URI
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
	public EClass getRessourceGraphique() {
		return ressourceGraphiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRessourceGraphique_Bloc() {
		return (EReference) ressourceGraphiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloc() {
		return blocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFonctionUnaire() {
		return fonctionUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichierBinaire() {
		return fichierBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichierBinaire_Chemin() {
		return (EAttribute) fichierBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstante_Valeur() {
		return (EAttribute) constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefColonne() {
		return refColonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperateurUnaire() {
		return operateurUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinus() {
		return sinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlocUnaire() {
		return blocUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlocUnaire_Entree() {
		return (EReference) blocUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperateurBinaire() {
		return operateurBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlocBinaire() {
		return blocBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlocBinaire_Entree() {
		return (EReference) blocBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichierUnaire() {
		return fichierUnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichierUnaire_Chemin() {
		return (EAttribute) fichierUnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlocIntermediaire() {
		return blocIntermediaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultat() {
		return resultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultat_Entree() {
		return (EReference) resultatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

		fonctionUnaireEClass = createEClass(FONCTION_UNAIRE);

		fichierBinaireEClass = createEClass(FICHIER_BINAIRE);
		createEAttribute(fichierBinaireEClass, FICHIER_BINAIRE__CHEMIN);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALEUR);

		refColonneEClass = createEClass(REF_COLONNE);

		operateurUnaireEClass = createEClass(OPERATEUR_UNAIRE);

		negationEClass = createEClass(NEGATION);

		sinusEClass = createEClass(SINUS);

		blocUnaireEClass = createEClass(BLOC_UNAIRE);
		createEReference(blocUnaireEClass, BLOC_UNAIRE__ENTREE);

		operateurBinaireEClass = createEClass(OPERATEUR_BINAIRE);

		blocBinaireEClass = createEClass(BLOC_BINAIRE);
		createEReference(blocBinaireEClass, BLOC_BINAIRE__ENTREE);

		additionEClass = createEClass(ADDITION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		fichierUnaireEClass = createEClass(FICHIER_UNAIRE);
		createEAttribute(fichierUnaireEClass, FICHIER_UNAIRE__CHEMIN);

		blocIntermediaireEClass = createEClass(BLOC_INTERMEDIAIRE);

		resultatEClass = createEClass(RESULTAT);
		createEReference(resultatEClass, RESULTAT__ENTREE);
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
		fonctionUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		fichierBinaireEClass.getESuperTypes().add(this.getBlocBinaire());
		constanteEClass.getESuperTypes().add(this.getBlocUnaire());
		refColonneEClass.getESuperTypes().add(this.getBloc());
		operateurUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		negationEClass.getESuperTypes().add(this.getOperateurUnaire());
		sinusEClass.getESuperTypes().add(this.getFonctionUnaire());
		blocUnaireEClass.getESuperTypes().add(this.getBlocIntermediaire());
		operateurBinaireEClass.getESuperTypes().add(this.getBlocBinaire());
		blocBinaireEClass.getESuperTypes().add(this.getBlocIntermediaire());
		additionEClass.getESuperTypes().add(this.getOperateurBinaire());
		multiplicationEClass.getESuperTypes().add(this.getOperateurBinaire());
		fichierUnaireEClass.getESuperTypes().add(this.getBlocUnaire());
		blocIntermediaireEClass.getESuperTypes().add(this.getBloc());
		resultatEClass.getESuperTypes().add(this.getBloc());

		// Initialize classes, features, and operations; add parameters
		initEClass(ressourceGraphiqueEClass, RessourceGraphique.class, "RessourceGraphique", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRessourceGraphique_Bloc(), this.getBloc(), null, "bloc", null, 0, -1,
				RessourceGraphique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocEClass, Bloc.class, "Bloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fonctionUnaireEClass, FonctionUnaire.class, "FonctionUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fichierBinaireEClass, FichierBinaire.class, "FichierBinaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichierBinaire_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1,
				FichierBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Valeur(), ecorePackage.getEInt(), "valeur", null, 0, 1, Constante.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refColonneEClass, RefColonne.class, "RefColonne", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operateurUnaireEClass, OperateurUnaire.class, "OperateurUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinusEClass, Sinus.class, "Sinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blocUnaireEClass, BlocUnaire.class, "BlocUnaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlocUnaire_Entree(), this.getBloc(), null, "entree", null, 1, 1, BlocUnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operateurBinaireEClass, OperateurBinaire.class, "OperateurBinaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blocBinaireEClass, BlocBinaire.class, "BlocBinaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlocBinaire_Entree(), this.getBloc(), null, "entree", null, 2, 2, BlocBinaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fichierUnaireEClass, FichierUnaire.class, "FichierUnaire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichierUnaire_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, FichierUnaire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocIntermediaireEClass, BlocIntermediaire.class, "BlocIntermediaire", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultatEClass, Resultat.class, "Resultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultat_Entree(), this.getBloc(), null, "entree", null, 1, 1, Resultat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RessourceGraphiquePackageImpl
