/**
 */
package fr.l127.schemaTableAlgo.impl;

import fr.l127.schemaTableAlgo.Algorithme;
import fr.l127.schemaTableAlgo.Catalogue;
import fr.l127.schemaTableAlgo.Colonne;
import fr.l127.schemaTableAlgo.ColonneNormal;
import fr.l127.schemaTableAlgo.ColonneSpeciale;
import fr.l127.schemaTableAlgo.Contrainte;
import fr.l127.schemaTableAlgo.SchemaTable;
import fr.l127.schemaTableAlgo.SchemaTableAlgoFactory;
import fr.l127.schemaTableAlgo.SchemaTableAlgoPackage;
import fr.l127.schemaTableAlgo.Table;
import fr.l127.schemaTableAlgo.TypeColonne;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTableAlgoPackageImpl extends EPackageImpl implements SchemaTableAlgoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneSpecialeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneNormalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeColonneEEnum = null;

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
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaTableAlgoPackageImpl() {
		super(eNS_URI, SchemaTableAlgoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchemaTableAlgoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaTableAlgoPackage init() {
		if (isInited)
			return (SchemaTableAlgoPackage) EPackage.Registry.INSTANCE.getEPackage(SchemaTableAlgoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaTableAlgoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaTableAlgoPackageImpl theSchemaTableAlgoPackage = registeredSchemaTableAlgoPackage instanceof SchemaTableAlgoPackageImpl
				? (SchemaTableAlgoPackageImpl) registeredSchemaTableAlgoPackage
				: new SchemaTableAlgoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSchemaTableAlgoPackage.createPackageContents();

		// Initialize created meta-data
		theSchemaTableAlgoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaTableAlgoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaTableAlgoPackage.eNS_URI, theSchemaTableAlgoPackage);
		return theSchemaTableAlgoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaTable() {
		return schemaTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaTable_Table() {
		return (EReference) schemaTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaTable_Catalogue() {
		return (EReference) schemaTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Id() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Colonne() {
		return (EReference) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Id() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_TypeColonne() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonne_Contrainte() {
		return (EReference) colonneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneSpeciale() {
		return colonneSpecialeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneNormal() {
		return colonneNormalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContrainte() {
		return contrainteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContrainte_Nom() {
		return (EAttribute) contrainteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContrainte_Args() {
		return (EAttribute) contrainteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogue_Nom() {
		return (EAttribute) catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Algorithme() {
		return (EReference) catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithme() {
		return algorithmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Entrees() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Sorties() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Chemin() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeColonne() {
		return typeColonneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableAlgoFactory getSchemaTableAlgoFactory() {
		return (SchemaTableAlgoFactory) getEFactoryInstance();
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
		schemaTableEClass = createEClass(SCHEMA_TABLE);
		createEReference(schemaTableEClass, SCHEMA_TABLE__TABLE);
		createEReference(schemaTableEClass, SCHEMA_TABLE__CATALOGUE);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__ID);
		createEReference(tableEClass, TABLE__COLONNE);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__ID);
		createEAttribute(colonneEClass, COLONNE__TYPE_COLONNE);
		createEReference(colonneEClass, COLONNE__CONTRAINTE);

		colonneSpecialeEClass = createEClass(COLONNE_SPECIALE);

		colonneNormalEClass = createEClass(COLONNE_NORMAL);

		contrainteEClass = createEClass(CONTRAINTE);
		createEAttribute(contrainteEClass, CONTRAINTE__NOM);
		createEAttribute(contrainteEClass, CONTRAINTE__ARGS);

		catalogueEClass = createEClass(CATALOGUE);
		createEAttribute(catalogueEClass, CATALOGUE__NOM);
		createEReference(catalogueEClass, CATALOGUE__ALGORITHME);

		algorithmeEClass = createEClass(ALGORITHME);
		createEAttribute(algorithmeEClass, ALGORITHME__ENTREES);
		createEAttribute(algorithmeEClass, ALGORITHME__SORTIES);
		createEAttribute(algorithmeEClass, ALGORITHME__CHEMIN);

		// Create enums
		typeColonneEEnum = createEEnum(TYPE_COLONNE);
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
		colonneSpecialeEClass.getESuperTypes().add(this.getColonne());
		colonneNormalEClass.getESuperTypes().add(this.getColonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(schemaTableEClass, SchemaTable.class, "SchemaTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaTable_Table(), this.getTable(), null, "table", null, 0, -1, SchemaTable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaTable_Catalogue(), this.getCatalogue(), null, "catalogue", null, 0, -1,
				SchemaTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Colonne(), this.getColonne(), null, "colonne", null, 0, -1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonne_TypeColonne(), this.getTypeColonne(), "typeColonne", null, 0, 1, Colonne.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColonne_Contrainte(), this.getContrainte(), null, "contrainte", null, 0, 1, Colonne.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneSpecialeEClass, ColonneSpeciale.class, "ColonneSpeciale", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(colonneNormalEClass, ColonneNormal.class, "ColonneNormal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(contrainteEClass, Contrainte.class, "Contrainte", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContrainte_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Contrainte.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContrainte_Args(), ecorePackage.getEString(), "args", null, 0, -1, Contrainte.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogue_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Catalogue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Algorithme(), this.getAlgorithme(), null, "algorithme", null, 0, -1,
				Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algorithmeEClass, Algorithme.class, "Algorithme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithme_Entrees(), ecorePackage.getEInt(), "entrees", null, 0, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Sorties(), ecorePackage.getEInt(), "sorties", null, 0, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeColonneEEnum, TypeColonne.class, "TypeColonne");
		addEEnumLiteral(typeColonneEEnum, TypeColonne.CHAINE_CARACTERES);
		addEEnumLiteral(typeColonneEEnum, TypeColonne.NOMBRE);

		// Create resource
		createResource(eNS_URI);
	}

} //SchemaTableAlgoPackageImpl
