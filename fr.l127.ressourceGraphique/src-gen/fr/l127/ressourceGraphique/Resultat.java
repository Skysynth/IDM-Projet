/**
 */
package fr.l127.ressourceGraphique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.ressourceGraphique.Resultat#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage#getResultat()
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
	 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage#getResultat_Entree()
	 * @model required="true"
	 * @generated
	 */
	Bloc getEntree();

	/**
	 * Sets the value of the '{@link fr.l127.ressourceGraphique.Resultat#getEntree <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Bloc value);

} // Resultat
