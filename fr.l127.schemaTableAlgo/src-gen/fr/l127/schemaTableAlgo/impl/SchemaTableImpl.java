/**
 */
package fr.l127.schemaTableAlgo.impl;

import fr.l127.schemaTableAlgo.Catalogue;
import fr.l127.schemaTableAlgo.SchemaTable;
import fr.l127.schemaTableAlgo.SchemaTableAlgoPackage;
import fr.l127.schemaTableAlgo.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.SchemaTableImpl#getTable <em>Table</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.SchemaTableImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaTableImpl extends MinimalEObjectImpl.Container implements SchemaTable {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;

	/**
	 * The cached value of the '{@link #getCatalogue() <em>Catalogue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogue()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalogue> catalogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTableAlgoPackage.Literals.SCHEMA_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table>(Table.class, this, SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Catalogue> getCatalogue() {
		if (catalogue == null) {
			catalogue = new EObjectContainmentEList<Catalogue>(Catalogue.class, this,
					SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE);
		}
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE:
			return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
		case SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE:
			return ((InternalEList<?>) getCatalogue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE:
			return getTable();
		case SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE:
			return getCatalogue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE:
			getTable().clear();
			getTable().addAll((Collection<? extends Table>) newValue);
			return;
		case SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE:
			getCatalogue().clear();
			getCatalogue().addAll((Collection<? extends Catalogue>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE:
			getTable().clear();
			return;
		case SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE:
			getCatalogue().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SchemaTableAlgoPackage.SCHEMA_TABLE__TABLE:
			return table != null && !table.isEmpty();
		case SchemaTableAlgoPackage.SCHEMA_TABLE__CATALOGUE:
			return catalogue != null && !catalogue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaTableImpl
