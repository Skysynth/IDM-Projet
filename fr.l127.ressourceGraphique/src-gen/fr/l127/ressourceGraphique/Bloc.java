/**
 */
package fr.l127.RessourceGraphique;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.Bloc#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getBloc()
 * @model abstract="true"
 * @generated
 */
public interface Bloc extends EObject {

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getBloc_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.l127.RessourceGraphique.Bloc#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Bloc
