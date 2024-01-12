/**
 */
package fr.l127.schemaTableAlgo.impl;

import fr.l127.schemaTableAlgo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SchemaTableAlgoFactoryImpl extends EFactoryImpl implements SchemaTableAlgoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchemaTableAlgoFactory init() {
		try {
			SchemaTableAlgoFactory theSchemaTableAlgoFactory = (SchemaTableAlgoFactory) EPackage.Registry.INSTANCE
					.getEFactory(SchemaTableAlgoPackage.eNS_URI);
			if (theSchemaTableAlgoFactory != null) {
				return theSchemaTableAlgoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchemaTableAlgoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableAlgoFactoryImpl() {
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
		case SchemaTableAlgoPackage.SCHEMA_TABLE:
			return createSchemaTable();
		case SchemaTableAlgoPackage.TABLE:
			return createTable();
		case SchemaTableAlgoPackage.COLONNE_SPECIALE:
			return createColonneSpeciale();
		case SchemaTableAlgoPackage.COLONNE_NORMAL:
			return createColonneNormal();
		case SchemaTableAlgoPackage.CONTRAINTE:
			return createContrainte();
		case SchemaTableAlgoPackage.CATALOGUE:
			return createCatalogue();
		case SchemaTableAlgoPackage.ALGORITHME:
			return createAlgorithme();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SchemaTableAlgoPackage.TYPE_COLONNE:
			return createTypeColonneFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SchemaTableAlgoPackage.TYPE_COLONNE:
			return convertTypeColonneToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTable createSchemaTable() {
		SchemaTableImpl schemaTable = new SchemaTableImpl();
		return schemaTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneSpeciale createColonneSpeciale() {
		ColonneSpecialeImpl colonneSpeciale = new ColonneSpecialeImpl();
		return colonneSpeciale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneNormal createColonneNormal() {
		ColonneNormalImpl colonneNormal = new ColonneNormalImpl();
		return colonneNormal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte createContrainte() {
		ContrainteImpl contrainte = new ContrainteImpl();
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme createAlgorithme() {
		AlgorithmeImpl algorithme = new AlgorithmeImpl();
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeColonne createTypeColonneFromString(EDataType eDataType, String initialValue) {
		TypeColonne result = TypeColonne.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeColonneToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableAlgoPackage getSchemaTableAlgoPackage() {
		return (SchemaTableAlgoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchemaTableAlgoPackage getPackage() {
		return SchemaTableAlgoPackage.eINSTANCE;
	}

} //SchemaTableAlgoFactoryImpl
