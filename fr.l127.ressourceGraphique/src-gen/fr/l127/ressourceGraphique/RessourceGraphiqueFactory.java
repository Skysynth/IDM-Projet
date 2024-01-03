/**
 */
package fr.l127.ressourceGraphique;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.l127.ressourceGraphique.RessourceGraphiquePackage
 * @generated
 */
public interface RessourceGraphiqueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RessourceGraphiqueFactory eINSTANCE = fr.l127.ressourceGraphique.impl.RessourceGraphiqueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ressource Graphique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressource Graphique</em>'.
	 * @generated
	 */
	RessourceGraphique createRessourceGraphique();

	/**
	 * Returns a new object of class '<em>Bloc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bloc</em>'.
	 * @generated
	 */
	Bloc createBloc();

	/**
	 * Returns a new object of class '<em>Fichier Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier Binaire</em>'.
	 * @generated
	 */
	FichierBinaire createFichierBinaire();

	/**
	 * Returns a new object of class '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constante</em>'.
	 * @generated
	 */
	Constante createConstante();

	/**
	 * Returns a new object of class '<em>Ref Colonne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Colonne</em>'.
	 * @generated
	 */
	RefColonne createRefColonne();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	Negation createNegation();

	/**
	 * Returns a new object of class '<em>Sinus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sinus</em>'.
	 * @generated
	 */
	Sinus createSinus();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>Fichier Unaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier Unaire</em>'.
	 * @generated
	 */
	FichierUnaire createFichierUnaire();

	/**
	 * Returns a new object of class '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resultat</em>'.
	 * @generated
	 */
	Resultat createResultat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RessourceGraphiquePackage getRessourceGraphiquePackage();

} //RessourceGraphiqueFactory
