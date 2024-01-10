/**
 */
package fr.l127.schemaTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.l127.schemaTable.SchemaTableFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schemaTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/schemaTable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schemaTable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTablePackage eINSTANCE = fr.l127.schemaTable.impl.SchemaTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.SchemaTableImpl <em>Schema Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.SchemaTableImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getSchemaTable()
	 * @generated
	 */
	int SCHEMA_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TABLE__TABLE = 0;

	/**
	 * The number of structural features of the '<em>Schema Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schema Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.TableImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNE = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.ColonneImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TYPE_COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__CONTRAINTE = 2;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.ColonneSpecialeImpl <em>Colonne Speciale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.ColonneSpecialeImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonneSpeciale()
	 * @generated
	 */
	int COLONNE_SPECIALE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_SPECIALE__ID = COLONNE__ID;

	/**
	 * The feature id for the '<em><b>Type Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_SPECIALE__TYPE_COLONNE = COLONNE__TYPE_COLONNE;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_SPECIALE__CONTRAINTE = COLONNE__CONTRAINTE;

	/**
	 * The number of structural features of the '<em>Colonne Speciale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_SPECIALE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne Speciale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_SPECIALE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.ColonneNormalImpl <em>Colonne Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.ColonneNormalImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonneNormal()
	 * @generated
	 */
	int COLONNE_NORMAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_NORMAL__ID = COLONNE__ID;

	/**
	 * The feature id for the '<em><b>Type Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_NORMAL__TYPE_COLONNE = COLONNE__TYPE_COLONNE;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_NORMAL__CONTRAINTE = COLONNE__CONTRAINTE;

	/**
	 * The number of structural features of the '<em>Colonne Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_NORMAL_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_NORMAL_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.impl.ContrainteImpl
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__ARGS = 1;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.schemaTable.TypeColonne <em>Type Colonne</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.schemaTable.TypeColonne
	 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getTypeColonne()
	 * @generated
	 */
	int TYPE_COLONNE = 6;

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.SchemaTable <em>Schema Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Table</em>'.
	 * @see fr.l127.schemaTable.SchemaTable
	 * @generated
	 */
	EClass getSchemaTable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.l127.schemaTable.SchemaTable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see fr.l127.schemaTable.SchemaTable#getTable()
	 * @see #getSchemaTable()
	 * @generated
	 */
	EReference getSchemaTable_Table();

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see fr.l127.schemaTable.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.schemaTable.Table#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.l127.schemaTable.Table#getId()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.l127.schemaTable.Table#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonne</em>'.
	 * @see fr.l127.schemaTable.Table#getColonne()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colonne();

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see fr.l127.schemaTable.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.schemaTable.Colonne#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.l127.schemaTable.Colonne#getId()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.schemaTable.Colonne#getTypeColonne <em>Type Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Colonne</em>'.
	 * @see fr.l127.schemaTable.Colonne#getTypeColonne()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_TypeColonne();

	/**
	 * Returns the meta object for the containment reference '{@link fr.l127.schemaTable.Colonne#getContrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contrainte</em>'.
	 * @see fr.l127.schemaTable.Colonne#getContrainte()
	 * @see #getColonne()
	 * @generated
	 */
	EReference getColonne_Contrainte();

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.ColonneSpeciale <em>Colonne Speciale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Speciale</em>'.
	 * @see fr.l127.schemaTable.ColonneSpeciale
	 * @generated
	 */
	EClass getColonneSpeciale();

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.ColonneNormal <em>Colonne Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Normal</em>'.
	 * @see fr.l127.schemaTable.ColonneNormal
	 * @generated
	 */
	EClass getColonneNormal();

	/**
	 * Returns the meta object for class '{@link fr.l127.schemaTable.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see fr.l127.schemaTable.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.schemaTable.Contrainte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.l127.schemaTable.Contrainte#getNom()
	 * @see #getContrainte()
	 * @generated
	 */
	EAttribute getContrainte_Nom();

	/**
	 * Returns the meta object for the attribute list '{@link fr.l127.schemaTable.Contrainte#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see fr.l127.schemaTable.Contrainte#getArgs()
	 * @see #getContrainte()
	 * @generated
	 */
	EAttribute getContrainte_Args();

	/**
	 * Returns the meta object for enum '{@link fr.l127.schemaTable.TypeColonne <em>Type Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Colonne</em>'.
	 * @see fr.l127.schemaTable.TypeColonne
	 * @generated
	 */
	EEnum getTypeColonne();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaTableFactory getSchemaTableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.SchemaTableImpl <em>Schema Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.SchemaTableImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getSchemaTable()
		 * @generated
		 */
		EClass SCHEMA_TABLE = eINSTANCE.getSchemaTable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_TABLE__TABLE = eINSTANCE.getSchemaTable_Table();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.TableImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ID = eINSTANCE.getTable_Id();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNE = eINSTANCE.getTable_Colonne();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.ColonneImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__ID = eINSTANCE.getColonne_Id();

		/**
		 * The meta object literal for the '<em><b>Type Colonne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__TYPE_COLONNE = eINSTANCE.getColonne_TypeColonne();

		/**
		 * The meta object literal for the '<em><b>Contrainte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE__CONTRAINTE = eINSTANCE.getColonne_Contrainte();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.ColonneSpecialeImpl <em>Colonne Speciale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.ColonneSpecialeImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonneSpeciale()
		 * @generated
		 */
		EClass COLONNE_SPECIALE = eINSTANCE.getColonneSpeciale();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.ColonneNormalImpl <em>Colonne Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.ColonneNormalImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getColonneNormal()
		 * @generated
		 */
		EClass COLONNE_NORMAL = eINSTANCE.getColonneNormal();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.impl.ContrainteImpl
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAINTE__NOM = eINSTANCE.getContrainte_Nom();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAINTE__ARGS = eINSTANCE.getContrainte_Args();

		/**
		 * The meta object literal for the '{@link fr.l127.schemaTable.TypeColonne <em>Type Colonne</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.schemaTable.TypeColonne
		 * @see fr.l127.schemaTable.impl.SchemaTablePackageImpl#getTypeColonne()
		 * @generated
		 */
		EEnum TYPE_COLONNE = eINSTANCE.getTypeColonne();

	}

} //SchemaTablePackage
