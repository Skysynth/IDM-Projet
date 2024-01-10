/**
 */
package fr.l127.schemaTable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.l127.schemaTable.SchemaTablePackage
 * @generated
 */
public interface SchemaTableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTableFactory eINSTANCE = fr.l127.schemaTable.impl.SchemaTableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schema Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Table</em>'.
	 * @generated
	 */
	SchemaTable createSchemaTable();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Colonne Speciale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Speciale</em>'.
	 * @generated
	 */
	ColonneSpeciale createColonneSpeciale();

	/**
	 * Returns a new object of class '<em>Colonne Normal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne Normal</em>'.
	 * @generated
	 */
	ColonneNormal createColonneNormal();

	/**
	 * Returns a new object of class '<em>Contrainte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte</em>'.
	 * @generated
	 */
	Contrainte createContrainte();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchemaTablePackage getSchemaTablePackage();

} //SchemaTableFactory
