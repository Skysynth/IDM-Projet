/**
 */
package fr.l127.schemaTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTable.Colonne#getId <em>Id</em>}</li>
 *   <li>{@link fr.l127.schemaTable.Colonne#getTypeColonne <em>Type Colonne</em>}</li>
 *   <li>{@link fr.l127.schemaTable.Colonne#getContrainte <em>Contrainte</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTable.SchemaTablePackage#getColonne()
 * @model abstract="true"
 * @generated
 */
public interface Colonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.l127.schemaTable.SchemaTablePackage#getColonne_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTable.Colonne#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type Colonne</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.l127.schemaTable.TypeColonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Colonne</em>' attribute.
	 * @see fr.l127.schemaTable.TypeColonne
	 * @see #setTypeColonne(TypeColonne)
	 * @see fr.l127.schemaTable.SchemaTablePackage#getColonne_TypeColonne()
	 * @model
	 * @generated
	 */
	TypeColonne getTypeColonne();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTable.Colonne#getTypeColonne <em>Type Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Colonne</em>' attribute.
	 * @see fr.l127.schemaTable.TypeColonne
	 * @see #getTypeColonne()
	 * @generated
	 */
	void setTypeColonne(TypeColonne value);

	/**
	 * Returns the value of the '<em><b>Contrainte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte</em>' containment reference.
	 * @see #setContrainte(Contrainte)
	 * @see fr.l127.schemaTable.SchemaTablePackage#getColonne_Contrainte()
	 * @model containment="true"
	 * @generated
	 */
	Contrainte getContrainte();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTable.Colonne#getContrainte <em>Contrainte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrainte</em>' containment reference.
	 * @see #getContrainte()
	 * @generated
	 */
	void setContrainte(Contrainte value);

} // Colonne
