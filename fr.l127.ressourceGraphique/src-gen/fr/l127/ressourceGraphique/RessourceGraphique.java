/**
 */
package fr.l127.RessourceGraphique;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Graphique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.RessourceGraphique#getBloc <em>Bloc</em>}</li>
 * </ul>
 *
 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getRessourceGraphique()
 * @model
 * @generated
 */
public interface RessourceGraphique extends EObject {

	/**
	 * Returns the value of the '<em><b>Bloc</b></em>' containment reference list.
	 * The list contents are of type {@link fr.l127.RessourceGraphique.Bloc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloc</em>' containment reference list.
	 * @see fr.l127.RessourceGraphique.RessourceGraphiquePackage#getRessourceGraphique_Bloc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bloc> getBloc();

} // RessourceGraphique
