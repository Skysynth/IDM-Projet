/**
 */
package fr.l127.schemaTableAlgo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.Table#getId <em>Id</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.Table#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getTable_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTableAlgo.Table#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' containment reference list.
	 * The list contents are of type {@link fr.l127.schemaTableAlgo.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' containment reference list.
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getTable_Colonne()
	 * @model containment="true"
	 * @generated
	 */
	EList<Colonne> getColonne();

} // Table
