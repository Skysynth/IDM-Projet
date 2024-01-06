/**
 */
package fr.l127.RessourceGraphique.impl;

import fr.l127.RessourceGraphique.Bloc;
import fr.l127.RessourceGraphique.RessourceGraphiquePackage;
import fr.l127.RessourceGraphique.Resultat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.impl.ResultatImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link fr.l127.RessourceGraphique.impl.ResultatImpl#getIdColonne <em>Id Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultatImpl extends BlocImpl implements Resultat {
	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected Bloc entree;

	/**
	 * The default value of the '{@link #getIdColonne() <em>Id Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColonne()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_COLONNE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getIdColonne() <em>Id Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColonne()
	 * @generated
	 * @ordered
	 */
	protected int idColonne = ID_COLONNE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourceGraphiquePackage.Literals.RESULTAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloc getEntree() {
		if (entree != null && entree.eIsProxy()) {
			InternalEObject oldEntree = (InternalEObject) entree;
			entree = (Bloc) eResolveProxy(oldEntree);
			if (entree != oldEntree) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RessourceGraphiquePackage.RESULTAT__ENTREE, oldEntree, entree));
			}
		}
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloc basicGetEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntree(Bloc newEntree) {
		Bloc oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RessourceGraphiquePackage.RESULTAT__ENTREE, oldEntree,
					entree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdColonne() {
		return idColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdColonne(int newIdColonne) {
		int oldIdColonne = idColonne;
		idColonne = newIdColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RessourceGraphiquePackage.RESULTAT__ID_COLONNE,
					oldIdColonne, idColonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RessourceGraphiquePackage.RESULTAT__ENTREE:
			if (resolve)
				return getEntree();
			return basicGetEntree();
		case RessourceGraphiquePackage.RESULTAT__ID_COLONNE:
			return getIdColonne();
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
		case RessourceGraphiquePackage.RESULTAT__ENTREE:
			setEntree((Bloc) newValue);
			return;
		case RessourceGraphiquePackage.RESULTAT__ID_COLONNE:
			setIdColonne((Integer) newValue);
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
		case RessourceGraphiquePackage.RESULTAT__ENTREE:
			setEntree((Bloc) null);
			return;
		case RessourceGraphiquePackage.RESULTAT__ID_COLONNE:
			setIdColonne(ID_COLONNE_EDEFAULT);
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
		case RessourceGraphiquePackage.RESULTAT__ENTREE:
			return entree != null;
		case RessourceGraphiquePackage.RESULTAT__ID_COLONNE:
			return idColonne != ID_COLONNE_EDEFAULT;
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
		result.append(" (idColonne: ");
		result.append(idColonne);
		result.append(')');
		return result.toString();
	}

} //ResultatImpl
