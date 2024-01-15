/**
 */
package fr.l127.RessourceGraphique;

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
 * @see fr.l127.RessourceGraphique.RessourceGraphiqueFactory
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
	String eNAME = "RessourceGraphique";

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
	RessourceGraphiquePackage eINSTANCE = fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.RessourceGraphiqueImpl <em>Ressource Graphique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiqueImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRessourceGraphique()
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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Ressource Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ressource Graphique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_GRAPHIQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.BlocImpl <em>Bloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.BlocImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBloc()
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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.BlocIntermediaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocIntermediaire()
	 * @generated
	 */
	int BLOC_INTERMEDIAIRE = 2;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.ResultatImpl <em>Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.ResultatImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getResultat()
	 * @generated
	 */
	int RESULTAT = 3;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__ENTREE = BLOC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__ID_COLONNE = BLOC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_FEATURE_COUNT = BLOC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.Entree <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.Entree
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 4;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = BLOC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = BLOC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.BlocUnaire <em>Bloc Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.BlocUnaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocUnaire()
	 * @generated
	 */
	int BLOC_UNAIRE = 5;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.BlocBinaire <em>Bloc Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.BlocBinaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocBinaire()
	 * @generated
	 */
	int BLOC_BINAIRE = 6;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.FonctionUnaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionUnaire()
	 * @generated
	 */
	int FONCTION_UNAIRE = 7;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.SinusImpl <em>Sinus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.SinusImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getSinus()
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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.OperateurBinaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurBinaire()
	 * @generated
	 */
	int OPERATEUR_BINAIRE = 9;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.MultiplicationImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 10;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.ConstanteImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 25;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.FichierUnaireImpl <em>Fichier Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.FichierUnaireImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierUnaire()
	 * @generated
	 */
	int FICHIER_UNAIRE = 11;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.AdditionImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getAddition()
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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.FonctionBinaire <em>Fonction Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.FonctionBinaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionBinaire()
	 * @generated
	 */
	int FONCTION_BINAIRE = 13;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE__ENTREE = BLOC_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Fonction Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE_FEATURE_COUNT = BLOC_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fonction Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_BINAIRE_OPERATION_COUNT = BLOC_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.MinimunImpl <em>Minimun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.MinimunImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMinimun()
	 * @generated
	 */
	int MINIMUN = 14;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN__ENTREE = FONCTION_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Minimun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minimun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUN_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.MaximunImpl <em>Maximun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.MaximunImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMaximun()
	 * @generated
	 */
	int MAXIMUN = 15;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN__ENTREE = FONCTION_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Maximun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_FEATURE_COUNT = FONCTION_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maximun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUN_OPERATION_COUNT = FONCTION_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.CosinusImpl <em>Cosinus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.CosinusImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getCosinus()
	 * @generated
	 */
	int COSINUS = 16;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS__ENTREE = FONCTION_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Cosinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cosinus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINUS_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.RacineCarreeImpl <em>Racine Carree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.RacineCarreeImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRacineCarree()
	 * @generated
	 */
	int RACINE_CARREE = 17;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_CARREE__ENTREE = FONCTION_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Racine Carree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_CARREE_FEATURE_COUNT = FONCTION_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Racine Carree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACINE_CARREE_OPERATION_COUNT = FONCTION_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.SoustractionImpl <em>Soustraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.SoustractionImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getSoustraction()
	 * @generated
	 */
	int SOUSTRACTION = 18;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__ENTREE = OPERATEUR_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_OPERATION_COUNT = OPERATEUR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.DivisionImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 19;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ENTREE = OPERATEUR_BINAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = OPERATEUR_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = OPERATEUR_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.OperateurUnaire
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurUnaire()
	 * @generated
	 */
	int OPERATEUR_UNAIRE = 20;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.NegationImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 21;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.InverseImpl <em>Inverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.InverseImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getInverse()
	 * @generated
	 */
	int INVERSE = 22;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__ENTREE = OPERATEUR_UNAIRE__ENTREE;

	/**
	 * The number of structural features of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FEATURE_COUNT = OPERATEUR_UNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OPERATION_COUNT = OPERATEUR_UNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.FichierBinaireImpl <em>Fichier Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.FichierBinaireImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierBinaire()
	 * @generated
	 */
	int FICHIER_BINAIRE = 23;

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
	 * The meta object id for the '{@link fr.l127.RessourceGraphique.impl.RefColonneImpl <em>Ref Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.l127.RessourceGraphique.impl.RefColonneImpl
	 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRefColonne()
	 * @generated
	 */
	int REF_COLONNE = 24;

	/**
	 * The feature id for the '<em><b>Id Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_COLONNE__ID_COLONNE = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_COLONNE_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_COLONNE_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = ENTREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = ENTREE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = ENTREE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.RessourceGraphique <em>Ressource Graphique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Graphique</em>'.
	 * @see fr.l127.RessourceGraphique.RessourceGraphique
	 * @generated
	 */
	EClass getRessourceGraphique();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.l127.RessourceGraphique.RessourceGraphique#getBloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bloc</em>'.
	 * @see fr.l127.RessourceGraphique.RessourceGraphique#getBloc()
	 * @see #getRessourceGraphique()
	 * @generated
	 */
	EReference getRessourceGraphique_Bloc();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.RessourceGraphique#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.l127.RessourceGraphique.RessourceGraphique#getNom()
	 * @see #getRessourceGraphique()
	 * @generated
	 */
	EAttribute getRessourceGraphique_Nom();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Bloc <em>Bloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc</em>'.
	 * @see fr.l127.RessourceGraphique.Bloc
	 * @generated
	 */
	EClass getBloc();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Intermediaire</em>'.
	 * @see fr.l127.RessourceGraphique.BlocIntermediaire
	 * @generated
	 */
	EClass getBlocIntermediaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultat</em>'.
	 * @see fr.l127.RessourceGraphique.Resultat
	 * @generated
	 */
	EClass getResultat();

	/**
	 * Returns the meta object for the reference '{@link fr.l127.RessourceGraphique.Resultat#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entree</em>'.
	 * @see fr.l127.RessourceGraphique.Resultat#getEntree()
	 * @see #getResultat()
	 * @generated
	 */
	EReference getResultat_Entree();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.Resultat#getIdColonne <em>Id Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Colonne</em>'.
	 * @see fr.l127.RessourceGraphique.Resultat#getIdColonne()
	 * @see #getResultat()
	 * @generated
	 */
	EAttribute getResultat_IdColonne();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see fr.l127.RessourceGraphique.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.BlocUnaire <em>Bloc Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Unaire</em>'.
	 * @see fr.l127.RessourceGraphique.BlocUnaire
	 * @generated
	 */
	EClass getBlocUnaire();

	/**
	 * Returns the meta object for the reference '{@link fr.l127.RessourceGraphique.BlocUnaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entree</em>'.
	 * @see fr.l127.RessourceGraphique.BlocUnaire#getEntree()
	 * @see #getBlocUnaire()
	 * @generated
	 */
	EReference getBlocUnaire_Entree();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.BlocBinaire <em>Bloc Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloc Binaire</em>'.
	 * @see fr.l127.RessourceGraphique.BlocBinaire
	 * @generated
	 */
	EClass getBlocBinaire();

	/**
	 * Returns the meta object for the reference list '{@link fr.l127.RessourceGraphique.BlocBinaire#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see fr.l127.RessourceGraphique.BlocBinaire#getEntree()
	 * @see #getBlocBinaire()
	 * @generated
	 */
	EReference getBlocBinaire_Entree();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Unaire</em>'.
	 * @see fr.l127.RessourceGraphique.FonctionUnaire
	 * @generated
	 */
	EClass getFonctionUnaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Sinus <em>Sinus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sinus</em>'.
	 * @see fr.l127.RessourceGraphique.Sinus
	 * @generated
	 */
	EClass getSinus();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Binaire</em>'.
	 * @see fr.l127.RessourceGraphique.OperateurBinaire
	 * @generated
	 */
	EClass getOperateurBinaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see fr.l127.RessourceGraphique.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see fr.l127.RessourceGraphique.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see fr.l127.RessourceGraphique.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.FichierUnaire <em>Fichier Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier Unaire</em>'.
	 * @see fr.l127.RessourceGraphique.FichierUnaire
	 * @generated
	 */
	EClass getFichierUnaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.FichierUnaire#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see fr.l127.RessourceGraphique.FichierUnaire#getChemin()
	 * @see #getFichierUnaire()
	 * @generated
	 */
	EAttribute getFichierUnaire_Chemin();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.l127.RessourceGraphique.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.FonctionBinaire <em>Fonction Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction Binaire</em>'.
	 * @see fr.l127.RessourceGraphique.FonctionBinaire
	 * @generated
	 */
	EClass getFonctionBinaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Minimun <em>Minimun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimun</em>'.
	 * @see fr.l127.RessourceGraphique.Minimun
	 * @generated
	 */
	EClass getMinimun();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Maximun <em>Maximun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximun</em>'.
	 * @see fr.l127.RessourceGraphique.Maximun
	 * @generated
	 */
	EClass getMaximun();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Cosinus <em>Cosinus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cosinus</em>'.
	 * @see fr.l127.RessourceGraphique.Cosinus
	 * @generated
	 */
	EClass getCosinus();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.RacineCarree <em>Racine Carree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Racine Carree</em>'.
	 * @see fr.l127.RessourceGraphique.RacineCarree
	 * @generated
	 */
	EClass getRacineCarree();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Soustraction <em>Soustraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soustraction</em>'.
	 * @see fr.l127.RessourceGraphique.Soustraction
	 * @generated
	 */
	EClass getSoustraction();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see fr.l127.RessourceGraphique.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur Unaire</em>'.
	 * @see fr.l127.RessourceGraphique.OperateurUnaire
	 * @generated
	 */
	EClass getOperateurUnaire();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see fr.l127.RessourceGraphique.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse</em>'.
	 * @see fr.l127.RessourceGraphique.Inverse
	 * @generated
	 */
	EClass getInverse();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.FichierBinaire <em>Fichier Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier Binaire</em>'.
	 * @see fr.l127.RessourceGraphique.FichierBinaire
	 * @generated
	 */
	EClass getFichierBinaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.FichierBinaire#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see fr.l127.RessourceGraphique.FichierBinaire#getChemin()
	 * @see #getFichierBinaire()
	 * @generated
	 */
	EAttribute getFichierBinaire_Chemin();

	/**
	 * Returns the meta object for class '{@link fr.l127.RessourceGraphique.RefColonne <em>Ref Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Colonne</em>'.
	 * @see fr.l127.RessourceGraphique.RefColonne
	 * @generated
	 */
	EClass getRefColonne();

	/**
	 * Returns the meta object for the attribute '{@link fr.l127.RessourceGraphique.RefColonne#getIdColonne <em>Id Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Colonne</em>'.
	 * @see fr.l127.RessourceGraphique.RefColonne#getIdColonne()
	 * @see #getRefColonne()
	 * @generated
	 */
	EAttribute getRefColonne_IdColonne();

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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.RessourceGraphiqueImpl <em>Ressource Graphique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiqueImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRessourceGraphique()
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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE_GRAPHIQUE__NOM = eINSTANCE.getRessourceGraphique_Nom();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.BlocImpl <em>Bloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.BlocImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBloc()
		 * @generated
		 */
		EClass BLOC = eINSTANCE.getBloc();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.BlocIntermediaire <em>Bloc Intermediaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.BlocIntermediaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocIntermediaire()
		 * @generated
		 */
		EClass BLOC_INTERMEDIAIRE = eINSTANCE.getBlocIntermediaire();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.ResultatImpl <em>Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.ResultatImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getResultat()
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

		/**
		 * The meta object literal for the '<em><b>Id Colonne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTAT__ID_COLONNE = eINSTANCE.getResultat_IdColonne();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.Entree <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.Entree
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.BlocUnaire <em>Bloc Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.BlocUnaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocUnaire()
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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.BlocBinaire <em>Bloc Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.BlocBinaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getBlocBinaire()
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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.FonctionUnaire <em>Fonction Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.FonctionUnaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionUnaire()
		 * @generated
		 */
		EClass FONCTION_UNAIRE = eINSTANCE.getFonctionUnaire();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.SinusImpl <em>Sinus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.SinusImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getSinus()
		 * @generated
		 */
		EClass SINUS = eINSTANCE.getSinus();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.OperateurBinaire <em>Operateur Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.OperateurBinaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurBinaire()
		 * @generated
		 */
		EClass OPERATEUR_BINAIRE = eINSTANCE.getOperateurBinaire();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.MultiplicationImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.ConstanteImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getConstante()
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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.FichierUnaireImpl <em>Fichier Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.FichierUnaireImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierUnaire()
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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.AdditionImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.FonctionBinaire <em>Fonction Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.FonctionBinaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFonctionBinaire()
		 * @generated
		 */
		EClass FONCTION_BINAIRE = eINSTANCE.getFonctionBinaire();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.MinimunImpl <em>Minimun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.MinimunImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMinimun()
		 * @generated
		 */
		EClass MINIMUN = eINSTANCE.getMinimun();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.MaximunImpl <em>Maximun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.MaximunImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getMaximun()
		 * @generated
		 */
		EClass MAXIMUN = eINSTANCE.getMaximun();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.CosinusImpl <em>Cosinus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.CosinusImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getCosinus()
		 * @generated
		 */
		EClass COSINUS = eINSTANCE.getCosinus();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.RacineCarreeImpl <em>Racine Carree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.RacineCarreeImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRacineCarree()
		 * @generated
		 */
		EClass RACINE_CARREE = eINSTANCE.getRacineCarree();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.SoustractionImpl <em>Soustraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.SoustractionImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getSoustraction()
		 * @generated
		 */
		EClass SOUSTRACTION = eINSTANCE.getSoustraction();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.DivisionImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.OperateurUnaire <em>Operateur Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.OperateurUnaire
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getOperateurUnaire()
		 * @generated
		 */
		EClass OPERATEUR_UNAIRE = eINSTANCE.getOperateurUnaire();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.NegationImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.InverseImpl <em>Inverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.InverseImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getInverse()
		 * @generated
		 */
		EClass INVERSE = eINSTANCE.getInverse();

		/**
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.FichierBinaireImpl <em>Fichier Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.FichierBinaireImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getFichierBinaire()
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
		 * The meta object literal for the '{@link fr.l127.RessourceGraphique.impl.RefColonneImpl <em>Ref Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.l127.RessourceGraphique.impl.RefColonneImpl
		 * @see fr.l127.RessourceGraphique.impl.RessourceGraphiquePackageImpl#getRefColonne()
		 * @generated
		 */
		EClass REF_COLONNE = eINSTANCE.getRefColonne();

		/**
		 * The meta object literal for the '<em><b>Id Colonne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_COLONNE__ID_COLONNE = eINSTANCE.getRefColonne_IdColonne();

	}

} //RessourceGraphiquePackage
