/**
 */
package fr.l127.schemaTableAlgo.impl;

import fr.l127.schemaTableAlgo.Algorithme;
import fr.l127.schemaTableAlgo.SchemaTableAlgoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.AlgorithmeImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.AlgorithmeImpl#getSorties <em>Sorties</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.AlgorithmeImpl#getChemin <em>Chemin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmeImpl extends MinimalEObjectImpl.Container implements Algorithme {
	/**
	 * The default value of the '{@link #getEntrees() <em>Entrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected static final int ENTREES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected int entrees = ENTREES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSorties() <em>Sorties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorties()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSorties() <em>Sorties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorties()
	 * @generated
	 * @ordered
	 */
	protected int sorties = SORTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected String chemin = CHEMIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTableAlgoPackage.Literals.ALGORITHME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEntrees() {
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntrees(int newEntrees) {
		int oldEntrees = entrees;
		entrees = newEntrees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.ALGORITHME__ENTREES,
					oldEntrees, entrees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSorties() {
		return sorties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorties(int newSorties) {
		int oldSorties = sorties;
		sorties = newSorties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.ALGORITHME__SORTIES,
					oldSorties, sorties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChemin() {
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChemin(String newChemin) {
		String oldChemin = chemin;
		chemin = newChemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.ALGORITHME__CHEMIN, oldChemin,
					chemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTableAlgoPackage.ALGORITHME__ENTREES:
			return getEntrees();
		case SchemaTableAlgoPackage.ALGORITHME__SORTIES:
			return getSorties();
		case SchemaTableAlgoPackage.ALGORITHME__CHEMIN:
			return getChemin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SchemaTableAlgoPackage.ALGORITHME__ENTREES:
			setEntrees((Integer) newValue);
			return;
		case SchemaTableAlgoPackage.ALGORITHME__SORTIES:
			setSorties((Integer) newValue);
			return;
		case SchemaTableAlgoPackage.ALGORITHME__CHEMIN:
			setChemin((String) newValue);
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
		case SchemaTableAlgoPackage.ALGORITHME__ENTREES:
			setEntrees(ENTREES_EDEFAULT);
			return;
		case SchemaTableAlgoPackage.ALGORITHME__SORTIES:
			setSorties(SORTIES_EDEFAULT);
			return;
		case SchemaTableAlgoPackage.ALGORITHME__CHEMIN:
			setChemin(CHEMIN_EDEFAULT);
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
		case SchemaTableAlgoPackage.ALGORITHME__ENTREES:
			return entrees != ENTREES_EDEFAULT;
		case SchemaTableAlgoPackage.ALGORITHME__SORTIES:
			return sorties != SORTIES_EDEFAULT;
		case SchemaTableAlgoPackage.ALGORITHME__CHEMIN:
			return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entrees: ");
		result.append(entrees);
		result.append(", sorties: ");
		result.append(sorties);
		result.append(", chemin: ");
		result.append(chemin);
		result.append(')');
		return result.toString();
	}

} //AlgorithmeImpl
