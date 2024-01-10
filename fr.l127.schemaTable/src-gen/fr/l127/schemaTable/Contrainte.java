/**
 */
package fr.l127.schemaTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTable.Contrainte#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.l127.schemaTable.Contrainte#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTable.SchemaTablePackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.l127.schemaTable.SchemaTablePackage#getContrainte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTable.Contrainte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see fr.l127.schemaTable.SchemaTablePackage#getContrainte_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

} // Contrainte
