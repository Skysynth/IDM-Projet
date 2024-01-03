/**
 */
package fr.l127.RessourceGraphique.impl;

import fr.l127.RessourceGraphique.Bloc;
import fr.l127.RessourceGraphique.FichierBinaire;
import fr.l127.RessourceGraphique.RessourceGraphiquePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fichier Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.impl.FichierBinaireImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link fr.l127.RessourceGraphique.impl.FichierBinaireImpl#getChemin <em>Chemin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FichierBinaireImpl extends BlocImpl implements FichierBinaire {
	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloc> entree;

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
	protected FichierBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourceGraphiquePackage.Literals.FICHIER_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bloc> getEntree() {
		if (entree == null) {
			entree = new EObjectResolvingEList<Bloc>(Bloc.class, this,
					RessourceGraphiquePackage.FICHIER_BINAIRE__ENTREE);
		}
		return entree;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RessourceGraphiquePackage.FICHIER_BINAIRE__CHEMIN,
					oldChemin, chemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RessourceGraphiquePackage.FICHIER_BINAIRE__ENTREE:
			return getEntree();
		case RessourceGraphiquePackage.FICHIER_BINAIRE__CHEMIN:
			return getChemin();
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
		case RessourceGraphiquePackage.FICHIER_BINAIRE__ENTREE:
			getEntree().clear();
			getEntree().addAll((Collection<? extends Bloc>) newValue);
			return;
		case RessourceGraphiquePackage.FICHIER_BINAIRE__CHEMIN:
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
		case RessourceGraphiquePackage.FICHIER_BINAIRE__ENTREE:
			getEntree().clear();
			return;
		case RessourceGraphiquePackage.FICHIER_BINAIRE__CHEMIN:
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
		case RessourceGraphiquePackage.FICHIER_BINAIRE__ENTREE:
			return entree != null && !entree.isEmpty();
		case RessourceGraphiquePackage.FICHIER_BINAIRE__CHEMIN:
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
		result.append(" (chemin: ");
		result.append(chemin);
		result.append(')');
		return result.toString();
	}

} //FichierBinaireImpl
