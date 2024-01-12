/**
 */
package fr.l127.schemaTableAlgo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.Algorithme#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.Algorithme#getSorties <em>Sorties</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.Algorithme#getChemin <em>Chemin</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' attribute.
	 * @see #setEntrees(int)
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getAlgorithme_Entrees()
	 * @model
	 * @generated
	 */
	int getEntrees();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTableAlgo.Algorithme#getEntrees <em>Entrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrees</em>' attribute.
	 * @see #getEntrees()
	 * @generated
	 */
	void setEntrees(int value);

	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' attribute.
	 * @see #setSorties(int)
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getAlgorithme_Sorties()
	 * @model
	 * @generated
	 */
	int getSorties();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTableAlgo.Algorithme#getSorties <em>Sorties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorties</em>' attribute.
	 * @see #getSorties()
	 * @generated
	 */
	void setSorties(int value);

	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getAlgorithme_Chemin()
	 * @model
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTableAlgo.Algorithme#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

} // Algorithme
