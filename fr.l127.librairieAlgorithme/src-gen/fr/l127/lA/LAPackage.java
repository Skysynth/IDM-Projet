/**
 * generated by Xtext 2.32.0
 */
package fr.l127.lA;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.l127.lA.LAFactory
 * @model kind="package"
 * @generated
 */
public interface LAPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lA";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.l127.fr/LA";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lA";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LAPackage eINSTANCE = fr.l127.lA.impl.LAPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.l127.lA.impl.LibrairieImpl <em>Librairie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.l127.lA.impl.LibrairieImpl
   * @see fr.l127.lA.impl.LAPackageImpl#getLibrairie()
   * @generated
   */
  int LIBRAIRIE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRAIRIE__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRAIRIE__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Librairie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRAIRIE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.l127.lA.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.l127.lA.impl.AlgorithmeImpl
   * @see fr.l127.lA.impl.LAPackageImpl#getAlgorithme()
   * @generated
   */
  int ALGORITHME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHME__NAME = 0;

  /**
   * The feature id for the '<em><b>Entrees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHME__ENTREES = 1;

  /**
   * The feature id for the '<em><b>Sorties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHME__SORTIES = 2;

  /**
   * The feature id for the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHME__CHEMIN = 3;

  /**
   * The number of structural features of the '<em>Algorithme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.l127.lA.impl.EntreeImpl <em>Entree</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.l127.lA.impl.EntreeImpl
   * @see fr.l127.lA.impl.LAPackageImpl#getEntree()
   * @generated
   */
  int ENTREE = 2;

  /**
   * The feature id for the '<em><b>Id Colonne</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTREE__ID_COLONNE = 0;

  /**
   * The number of structural features of the '<em>Entree</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTREE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.l127.lA.impl.SortieImpl <em>Sortie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.l127.lA.impl.SortieImpl
   * @see fr.l127.lA.impl.LAPackageImpl#getSortie()
   * @generated
   */
  int SORTIE = 3;

  /**
   * The feature id for the '<em><b>Id Colonne</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTIE__ID_COLONNE = 0;

  /**
   * The number of structural features of the '<em>Sortie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTIE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.l127.lA.Librairie <em>Librairie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Librairie</em>'.
   * @see fr.l127.lA.Librairie
   * @generated
   */
  EClass getLibrairie();

  /**
   * Returns the meta object for the attribute '{@link fr.l127.lA.Librairie#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.l127.lA.Librairie#getName()
   * @see #getLibrairie()
   * @generated
   */
  EAttribute getLibrairie_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.l127.lA.Librairie#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.l127.lA.Librairie#getElements()
   * @see #getLibrairie()
   * @generated
   */
  EReference getLibrairie_Elements();

  /**
   * Returns the meta object for class '{@link fr.l127.lA.Algorithme <em>Algorithme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Algorithme</em>'.
   * @see fr.l127.lA.Algorithme
   * @generated
   */
  EClass getAlgorithme();

  /**
   * Returns the meta object for the attribute '{@link fr.l127.lA.Algorithme#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.l127.lA.Algorithme#getName()
   * @see #getAlgorithme()
   * @generated
   */
  EAttribute getAlgorithme_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.l127.lA.Algorithme#getEntrees <em>Entrees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entrees</em>'.
   * @see fr.l127.lA.Algorithme#getEntrees()
   * @see #getAlgorithme()
   * @generated
   */
  EReference getAlgorithme_Entrees();

  /**
   * Returns the meta object for the containment reference list '{@link fr.l127.lA.Algorithme#getSorties <em>Sorties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sorties</em>'.
   * @see fr.l127.lA.Algorithme#getSorties()
   * @see #getAlgorithme()
   * @generated
   */
  EReference getAlgorithme_Sorties();

  /**
   * Returns the meta object for the attribute '{@link fr.l127.lA.Algorithme#getChemin <em>Chemin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chemin</em>'.
   * @see fr.l127.lA.Algorithme#getChemin()
   * @see #getAlgorithme()
   * @generated
   */
  EAttribute getAlgorithme_Chemin();

  /**
   * Returns the meta object for class '{@link fr.l127.lA.Entree <em>Entree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entree</em>'.
   * @see fr.l127.lA.Entree
   * @generated
   */
  EClass getEntree();

  /**
   * Returns the meta object for the attribute '{@link fr.l127.lA.Entree#getIdColonne <em>Id Colonne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Colonne</em>'.
   * @see fr.l127.lA.Entree#getIdColonne()
   * @see #getEntree()
   * @generated
   */
  EAttribute getEntree_IdColonne();

  /**
   * Returns the meta object for class '{@link fr.l127.lA.Sortie <em>Sortie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sortie</em>'.
   * @see fr.l127.lA.Sortie
   * @generated
   */
  EClass getSortie();

  /**
   * Returns the meta object for the attribute '{@link fr.l127.lA.Sortie#getIdColonne <em>Id Colonne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Colonne</em>'.
   * @see fr.l127.lA.Sortie#getIdColonne()
   * @see #getSortie()
   * @generated
   */
  EAttribute getSortie_IdColonne();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LAFactory getLAFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.l127.lA.impl.LibrairieImpl <em>Librairie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.l127.lA.impl.LibrairieImpl
     * @see fr.l127.lA.impl.LAPackageImpl#getLibrairie()
     * @generated
     */
    EClass LIBRAIRIE = eINSTANCE.getLibrairie();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRAIRIE__NAME = eINSTANCE.getLibrairie_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRAIRIE__ELEMENTS = eINSTANCE.getLibrairie_Elements();

    /**
     * The meta object literal for the '{@link fr.l127.lA.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.l127.lA.impl.AlgorithmeImpl
     * @see fr.l127.lA.impl.LAPackageImpl#getAlgorithme()
     * @generated
     */
    EClass ALGORITHME = eINSTANCE.getAlgorithme();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALGORITHME__NAME = eINSTANCE.getAlgorithme_Name();

    /**
     * The meta object literal for the '<em><b>Entrees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALGORITHME__ENTREES = eINSTANCE.getAlgorithme_Entrees();

    /**
     * The meta object literal for the '<em><b>Sorties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALGORITHME__SORTIES = eINSTANCE.getAlgorithme_Sorties();

    /**
     * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALGORITHME__CHEMIN = eINSTANCE.getAlgorithme_Chemin();

    /**
     * The meta object literal for the '{@link fr.l127.lA.impl.EntreeImpl <em>Entree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.l127.lA.impl.EntreeImpl
     * @see fr.l127.lA.impl.LAPackageImpl#getEntree()
     * @generated
     */
    EClass ENTREE = eINSTANCE.getEntree();

    /**
     * The meta object literal for the '<em><b>Id Colonne</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTREE__ID_COLONNE = eINSTANCE.getEntree_IdColonne();

    /**
     * The meta object literal for the '{@link fr.l127.lA.impl.SortieImpl <em>Sortie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.l127.lA.impl.SortieImpl
     * @see fr.l127.lA.impl.LAPackageImpl#getSortie()
     * @generated
     */
    EClass SORTIE = eINSTANCE.getSortie();

    /**
     * The meta object literal for the '<em><b>Id Colonne</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SORTIE__ID_COLONNE = eINSTANCE.getSortie_IdColonne();

  }

} //LAPackage
