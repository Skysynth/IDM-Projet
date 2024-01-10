/**
 */
package fr.l127.schemaTable.impl;

import fr.l127.schemaTable.Colonne;
import fr.l127.schemaTable.ColonneNormal;
import fr.l127.schemaTable.ColonneSpeciale;
import fr.l127.schemaTable.Contrainte;
import fr.l127.schemaTable.SchemaTable;
import fr.l127.schemaTable.SchemaTableFactory;
import fr.l127.schemaTable.SchemaTablePackage;
import fr.l127.schemaTable.Table;
import fr.l127.schemaTable.TypeColonne;

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
public class SchemaTablePackageImpl extends EPackageImpl implements SchemaTablePackage {
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
	 * @see fr.l127.schemaTable.SchemaTablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaTablePackageImpl() {
		super(eNS_URI, SchemaTableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchemaTablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaTablePackage init() {
		if (isInited)
			return (SchemaTablePackage) EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = registeredSchemaTablePackage instanceof SchemaTablePackageImpl
				? (SchemaTablePackageImpl) registeredSchemaTablePackage
				: new SchemaTablePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSchemaTablePackage.createPackageContents();

		// Initialize created meta-data
		theSchemaTablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaTablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaTablePackage.eNS_URI, theSchemaTablePackage);
		return theSchemaTablePackage;
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
	public EEnum getTypeColonne() {
		return typeColonneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableFactory getSchemaTableFactory() {
		return (SchemaTableFactory) getEFactoryInstance();
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

		// Initialize enums and add enum literals
		initEEnum(typeColonneEEnum, TypeColonne.class, "TypeColonne");
		addEEnumLiteral(typeColonneEEnum, TypeColonne.CHAINE_CARACTERES);
		addEEnumLiteral(typeColonneEEnum, TypeColonne.NOMBRE);

		// Create resource
		createResource(eNS_URI);
	}

} //SchemaTablePackageImpl
