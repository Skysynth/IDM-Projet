/**
 */
package fr.l127.ressourceGraphique.impl;

import fr.l127.ressourceGraphique.Bloc;
import fr.l127.ressourceGraphique.RessourceGraphique;
import fr.l127.ressourceGraphique.RessourceGraphiquePackage;

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
 * An implementation of the model object '<em><b>Ressource Graphique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.ressourceGraphique.impl.RessourceGraphiqueImpl#getBloc <em>Bloc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceGraphiqueImpl extends MinimalEObjectImpl.Container implements RessourceGraphique {
	/**
	 * The cached value of the '{@link #getBloc() <em>Bloc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloc()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloc> bloc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceGraphiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourceGraphiquePackage.Literals.RESSOURCE_GRAPHIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bloc> getBloc() {
		if (bloc == null) {
			bloc = new EObjectContainmentEList<Bloc>(Bloc.class, this,
					RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC);
		}
		return bloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC:
			return ((InternalEList<?>) getBloc()).basicRemove(otherEnd, msgs);
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
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC:
			return getBloc();
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
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC:
			getBloc().clear();
			getBloc().addAll((Collection<? extends Bloc>) newValue);
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
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC:
			getBloc().clear();
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
		case RessourceGraphiquePackage.RESSOURCE_GRAPHIQUE__BLOC:
			return bloc != null && !bloc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RessourceGraphiqueImpl
