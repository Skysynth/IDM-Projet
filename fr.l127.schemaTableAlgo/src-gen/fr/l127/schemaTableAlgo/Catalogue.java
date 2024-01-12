/**
 */
package fr.l127.schemaTableAlgo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.Catalogue#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.Catalogue#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getCatalogue_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.l127.schemaTableAlgo.Catalogue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' containment reference list.
	 * The list contents are of type {@link fr.l127.schemaTableAlgo.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' containment reference list.
	 * @see fr.l127.schemaTableAlgo.SchemaTableAlgoPackage#getCatalogue_Algorithme()
	 * @model containment="true"
	 * @generated
	 */
	EList<Algorithme> getAlgorithme();

} // Catalogue
