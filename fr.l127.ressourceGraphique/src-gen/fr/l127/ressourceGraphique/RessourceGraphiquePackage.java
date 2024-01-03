/**
 */
package fr.l127.ressourceGraphique;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.l127.ressourceGraphique.RessourceGraphiqueFactory
 * @model kind="package"
 * @generated
 */
public interface RessourceGraphiquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ressourceGraphique";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ressourceGraphique";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ressourceGraphique";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RessourceGraphiquePackage eINSTANCE = fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.RessourceGraphiqueImpl <em>Ressource Graphique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiqueImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getRessourceGraphique()
	 * @generated
	 */
	int RESSOURCE_GRAPHIQUE = 0;

	/**
	 * The feature id for the '<em><b>Bloc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE__BLOC = 0;

	/**
	 * The number of structural features of the '<em>Ressource Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ressource Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.BlocImpl <em>Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.BlocImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBloc()
	 * @generated
	 */
	int BLOC = 1;

	/**
	 * The number of structural features of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.BlocIntermediaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocIntermediaire()
	 * @generated
	 */
	int BLOC_INTERMEDIAIRE = 15;

	/**
	 * The number of structural features of the '<em>Bloc Intermediaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_INTERMEDIAIRE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bloc Intermediaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_INTERMEDIAIRE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.BlocUnaire <em>Bloc Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.BlocUnaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocUnaire()
	 * @generated
	 */
	int BLOC_UNAIRE = 9;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE__ENTREE = BLOC_INTERMEDIAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_FEATURE_COUNT = BLOC_INTERMEDIAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_UNAIRE_OPERATION_COUNT = BLOC_INTERMEDIAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.FonctionUnaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionUnaire()
	 * @generated
	 */
	int FONCTION_UNAIRE = 2;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE__ENTREE = BLOC_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fonction Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_UNAIRE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.BlocBinaire <em>Bloc Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.BlocBinaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocBinaire()
	 * @generated
	 */
	int BLOC_BINAIRE = 11;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE__ENTREE = BLOC_INTERMEDIAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_FEATURE_COUNT = BLOC_INTERMEDIAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bloc Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOC_BINAIRE_OPERATION_COUNT = BLOC_INTERMEDIAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.FichierBinaireImpl <em>Fichier Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.FichierBinaireImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierBinaire()
	 * @generated
	 */
	int FICHIER_BINAIRE = 3;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_BINAIRE__ENTREE = BLOC_BINAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_BINAIRE__CHEMIN = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fichier Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_BINAIRE_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fichier Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_BINAIRE_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.ConstanteImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 4;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__ENTREE = BLOC_UNAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.RefColonneImpl <em>Ref Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.RefColonneImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getRefColonne()
	 * @generated
	 */
	int REF_COLONNE = 5;

	/**
	 * The number of structural features of the '<em>Ref Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_COLONNE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ref Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_COLONNE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.OperateurUnaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurUnaire()
	 * @generated
	 */
	int OPERATEUR_UNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_UNAIRE__ENTREE = BLOC_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Operateur Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_UNAIRE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operateur Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_UNAIRE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.NegationImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 7;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__ENTREE = OPERATEUR_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = OPERATEUR_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_OPERATION_COUNT = OPERATEUR_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.SinusImpl <em>Sinus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.SinusImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getSinus()
	 * @generated
	 */
	int SINUS = 8;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS__ENTREE = FONCTION_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Sinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINUS_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.OperateurBinaire
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurBinaire()
	 * @generated
	 */
	int OPERATEUR_BINAIRE = 10;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE__ENTREE = BLOC_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Operateur Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operateur Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_BINAIRE_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.AdditionImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 12;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ENTREE = OPERATEUR_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = OPERATEUR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.MultiplicationImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 13;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION__ENTREE = OPERATEUR_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_OPERATION_COUNT = OPERATEUR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.FichierUnaireImpl <em>Fichier Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.FichierUnaireImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierUnaire()
	 * @generated
	 */
	int FICHIER_UNAIRE = 14;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_UNAIRE__ENTREE = BLOC_UNAIRE__ENTREE;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_UNAIRE__CHEMIN = BLOC_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fichier Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_UNAIRE_FEATURE_COUNT = BLOC_UNAIRE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fichier Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_UNAIRE_OPERATION_COUNT = BLOC_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.ressourceGraphique.impl.ResultatImpl <em>Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.ressourceGraphique.impl.ResultatImpl
	 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getResultat()
	 * @generated
	 */
	int RESULTAT = 16;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__ENTREE = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_FEATURE_COUNT = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.RessourceGraphique <em>Ressource Graphique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Graphique</em>'.
	 * @see fr.l127.ressourceGraphique.RessourceGraphique
	 * @generated
	 */
	EClass getRessourceGraphique();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.l127.ressourceGraphique.RessourceGraphique#getBloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bloc</em>'.
	 * @see fr.l127.ressourceGraphique.RessourceGraphique#getBloc()
	 * @see #getRessourceGraphique()
	 * @generated
	 */
	EReference getRessourceGraphique_Bloc();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc</em>'.
	 * @see fr.l127.ressourceGraphique.Bloc
	 * @generated
	 */
	EClass getBloc();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Unaire</em>'.
	 * @see fr.l127.ressourceGraphique.FonctionUnaire
	 * @generated
	 */
	EClass getFonctionUnaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.FichierBinaire <em>Fichier Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier Binaire</em>'.
	 * @see fr.l127.ressourceGraphique.FichierBinaire
	 * @generated
	 */
	EClass getFichierBinaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.ressourceGraphique.FichierBinaire#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see fr.l127.ressourceGraphique.FichierBinaire#getChemin()
	 * @see #getFichierBinaire()
	 * @generated
	 */
	EAttribute getFichierBinaire_Chemin();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see fr.l127.ressourceGraphique.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.ressourceGraphique.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see fr.l127.ressourceGraphique.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.RefColonne <em>Ref Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Colonne</em>'.
	 * @see fr.l127.ressourceGraphique.RefColonne
	 * @generated
	 */
	EClass getRefColonne();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Unaire</em>'.
	 * @see fr.l127.ressourceGraphique.OperateurUnaire
	 * @generated
	 */
	EClass getOperateurUnaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see fr.l127.ressourceGraphique.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Sinus <em>Sinus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sinus</em>'.
	 * @see fr.l127.ressourceGraphique.Sinus
	 * @generated
	 */
	EClass getSinus();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.BlocUnaire <em>Bloc Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Unaire</em>'.
	 * @see fr.l127.ressourceGraphique.BlocUnaire
	 * @generated
	 */
	EClass getBlocUnaire();

	/**
	 * Returns the meta object for the reference '{@link fr.l127.ressourceGraphique.BlocUnaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entree</em>'.
	 * @see fr.l127.ressourceGraphique.BlocUnaire#getEntree()
	 * @see #getBlocUnaire()
	 * @generated
	 */
	EReference getBlocUnaire_Entree();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Binaire</em>'.
	 * @see fr.l127.ressourceGraphique.OperateurBinaire
	 * @generated
	 */
	EClass getOperateurBinaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.BlocBinaire <em>Bloc Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Binaire</em>'.
	 * @see fr.l127.ressourceGraphique.BlocBinaire
	 * @generated
	 */
	EClass getBlocBinaire();

	/**
	 * Returns the meta object for the reference list '{@link fr.l127.ressourceGraphique.BlocBinaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see fr.l127.ressourceGraphique.BlocBinaire#getEntree()
	 * @see #getBlocBinaire()
	 * @generated
	 */
	EReference getBlocBinaire_Entree();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.l127.ressourceGraphique.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.l127.ressourceGraphique.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.FichierUnaire <em>Fichier Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier Unaire</em>'.
	 * @see fr.l127.ressourceGraphique.FichierUnaire
	 * @generated
	 */
	EClass getFichierUnaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.ressourceGraphique.FichierUnaire#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see fr.l127.ressourceGraphique.FichierUnaire#getChemin()
	 * @see #getFichierUnaire()
	 * @generated
	 */
	EAttribute getFichierUnaire_Chemin();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Intermediaire</em>'.
	 * @see fr.l127.ressourceGraphique.BlocIntermediaire
	 * @generated
	 */
	EClass getBlocIntermediaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.ressourceGraphique.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultat</em>'.
	 * @see fr.l127.ressourceGraphique.Resultat
	 * @generated
	 */
	EClass getResultat();

	/**
	 * Returns the meta object for the reference '{@link fr.l127.ressourceGraphique.Resultat#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entree</em>'.
	 * @see fr.l127.ressourceGraphique.Resultat#getEntree()
	 * @see #getResultat()
	 * @generated
	 */
	EReference getResultat_Entree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RessourceGraphiqueFactory getRessourceGraphiqueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.RessourceGraphiqueImpl <em>Ressource Graphique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiqueImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getRessourceGraphique()
		 * @generated
		 */
		EClass RESSOURCE_GRAPHIQUE = eINSTANCE.getRessourceGraphique();

		/**
		 * The meta object literal for the '<em><b>Bloc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE_GRAPHIQUE__BLOC = eINSTANCE.getRessourceGraphique_Bloc();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.BlocImpl <em>Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.BlocImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBloc()
		 * @generated
		 */
		EClass BLOC = eINSTANCE.getBloc();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.FonctionUnaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionUnaire()
		 * @generated
		 */
		EClass FONCTION_UNAIRE = eINSTANCE.getFonctionUnaire();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.FichierBinaireImpl <em>Fichier Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.FichierBinaireImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierBinaire()
		 * @generated
		 */
		EClass FICHIER_BINAIRE = eINSTANCE.getFichierBinaire();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER_BINAIRE__CHEMIN = eINSTANCE.getFichierBinaire_Chemin();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.ConstanteImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALEUR = eINSTANCE.getConstante_Valeur();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.RefColonneImpl <em>Ref Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.RefColonneImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getRefColonne()
		 * @generated
		 */
		EClass REF_COLONNE = eINSTANCE.getRefColonne();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.OperateurUnaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurUnaire()
		 * @generated
		 */
		EClass OPERATEUR_UNAIRE = eINSTANCE.getOperateurUnaire();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.NegationImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.SinusImpl <em>Sinus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.SinusImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getSinus()
		 * @generated
		 */
		EClass SINUS = eINSTANCE.getSinus();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.BlocUnaire <em>Bloc Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.BlocUnaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocUnaire()
		 * @generated
		 */
		EClass BLOC_UNAIRE = eINSTANCE.getBlocUnaire();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_UNAIRE__ENTREE = eINSTANCE.getBlocUnaire_Entree();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.OperateurBinaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurBinaire()
		 * @generated
		 */
		EClass OPERATEUR_BINAIRE = eINSTANCE.getOperateurBinaire();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.BlocBinaire <em>Bloc Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.BlocBinaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocBinaire()
		 * @generated
		 */
		EClass BLOC_BINAIRE = eINSTANCE.getBlocBinaire();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOC_BINAIRE__ENTREE = eINSTANCE.getBlocBinaire_Entree();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.AdditionImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.MultiplicationImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.FichierUnaireImpl <em>Fichier Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.FichierUnaireImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierUnaire()
		 * @generated
		 */
		EClass FICHIER_UNAIRE = eINSTANCE.getFichierUnaire();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER_UNAIRE__CHEMIN = eINSTANCE.getFichierUnaire_Chemin();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.BlocIntermediaire
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocIntermediaire()
		 * @generated
		 */
		EClass BLOC_INTERMEDIAIRE = eINSTANCE.getBlocIntermediaire();

		/**
		 * The meta object literal for the '{@link fr.l127.ressourceGraphique.impl.ResultatImpl <em>Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.ressourceGraphique.impl.ResultatImpl
		 * @see fr.l127.ressourceGraphique.impl.RessourceGraphiquePackageImpl#getResultat()
		 * @generated
		 */
		EClass RESULTAT = eINSTANCE.getResultat();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTAT__ENTREE = eINSTANCE.getResultat_Entree();

	}

} //RessourceGraphiquePackage
