/**
 */
package fr.l127.RessourceGraphique.impl;

import fr.l127.RessourceGraphique.Bloc;
import fr.l127.RessourceGraphique.Negation;
import fr.l127.RessourceGraphique.RessourceGraphiquePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.RessourceGraphique.impl.NegationImpl#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegationImpl extends BlocImpl implements Negation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourceGraphiquePackage.Literals.NEGATION;
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
							RessourceGraphiquePackage.NEGATION__ENTREE, oldEntree, entree));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RessourceGraphiquePackage.NEGATION__ENTREE, oldEntree,
					entree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RessourceGraphiquePackage.NEGATION__ENTREE:
			if (resolve)
				return getEntree();
			return basicGetEntree();
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
		case RessourceGraphiquePackage.NEGATION__ENTREE:
			setEntree((Bloc) newValue);
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
		case RessourceGraphiquePackage.NEGATION__ENTREE:
			setEntree((Bloc) null);
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
		case RessourceGraphiquePackage.NEGATION__ENTREE:
			return entree != null;
		}
		return super.eIsSet(featureID);
	}

} //NegationImpl
