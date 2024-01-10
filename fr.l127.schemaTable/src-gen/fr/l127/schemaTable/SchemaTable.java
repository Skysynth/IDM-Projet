/**
 */
package fr.l127.schemaTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTable.SchemaTable#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTable.SchemaTablePackage#getSchemaTable()
 * @model
 * @generated
 */
public interface SchemaTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link fr.l127.schemaTable.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see fr.l127.schemaTable.SchemaTablePackage#getSchemaTable_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // SchemaTable
