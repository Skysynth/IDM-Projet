/**
 */
package fr.l127.RessourceGraphique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.Resultat#getEntree <em>Entree</em>}</li>
 *   <li>{@link fr.l127.RessourceGraphique.Resultat#getIdColonne <em>Id Colonne</em>}</li>
 * </ul>
 *
 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getResultat()
 * @model
 * @generated
 */
public interface Resultat extends Bloc {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference.
	 * @see #setEntree(Bloc)
	 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getResultat_Entree()
	 * @model required="true"
	 * @generated
	 */
	Bloc getEntree();

	/**
	 * Sets the value of the '{@link fr.l127.RessourceGraphique.Resultat#getEntree <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Bloc value);

	/**
	 * Returns the value of the '<em><b>Id Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Colonne</em>' attribute.
	 * @see #setIdColonne(int)
	 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getResultat_IdColonne()
	 * @model
	 * @generated
	 */
	int getIdColonne();

	/**
	 * Sets the value of the '{@link fr.l127.RessourceGraphique.Resultat#getIdColonne <em>Id Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Colonne</em>' attribute.
	 * @see #getIdColonne()
	 * @generated
	 */
	void setIdColonne(int value);

} // Resultat
