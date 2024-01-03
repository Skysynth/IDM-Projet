/**
 */
package fr.l127.ressourceGraphique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.ressourceGraphique.BlocBinaire#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage#getBlocBinaire()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BlocBinaire extends BlocIntermediaire {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference list.
	 * The list contents are of type {@link fr.l127.ressourceGraphique.Bloc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference list.
	 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage#getBlocBinaire_Entree()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Bloc> getEntree();

} // BlocBinaire
