/**
 */
package fr.l127.schemaTableAlgo.impl;

import fr.l127.schemaTableAlgo.Colonne;
import fr.l127.schemaTableAlgo.Contrainte;
import fr.l127.schemaTableAlgo.SchemaTableAlgoPackage;
import fr.l127.schemaTableAlgo.TypeColonne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.ColonneImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.ColonneImpl#getTypeColonne <em>Type Colonne</em>}</li>
 *   <li>{@link fr.l127.schemaTableAlgo.impl.ColonneImpl#getContrainte <em>Contrainte</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColonneImpl extends MinimalEObjectImpl.Container implements Colonne {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeColonne() <em>Type Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeColonne()
	 * @generated
	 * @ordered
	 */
	protected static final TypeColonne TYPE_COLONNE_EDEFAULT = TypeColonne.CHAINE_CARACTERES;

	/**
	 * The cached value of the '{@link #getTypeColonne() <em>Type Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeColonne()
	 * @generated
	 * @ordered
	 */
	protected TypeColonne typeColonne = TYPE_COLONNE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContrainte() <em>Contrainte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainte()
	 * @generated
	 * @ordered
	 */
	protected Contrainte contrainte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTableAlgoPackage.Literals.COLONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.COLONNE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeColonne getTypeColonne() {
		return typeColonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeColonne(TypeColonne newTypeColonne) {
		TypeColonne oldTypeColonne = typeColonne;
		typeColonne = newTypeColonne == null ? TYPE_COLONNE_EDEFAULT : newTypeColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.COLONNE__TYPE_COLONNE,
					oldTypeColonne, typeColonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte getContrainte() {
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContrainte(Contrainte newContrainte, NotificationChain msgs) {
		Contrainte oldContrainte = contrainte;
		contrainte = newContrainte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SchemaTableAlgoPackage.COLONNE__CONTRAINTE, oldContrainte, newContrainte);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrainte(Contrainte newContrainte) {
		if (newContrainte != contrainte) {
			NotificationChain msgs = null;
			if (contrainte != null)
				msgs = ((InternalEObject) contrainte).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SchemaTableAlgoPackage.COLONNE__CONTRAINTE, null, msgs);
			if (newContrainte != null)
				msgs = ((InternalEObject) newContrainte).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SchemaTableAlgoPackage.COLONNE__CONTRAINTE, null, msgs);
			msgs = basicSetContrainte(newContrainte, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTableAlgoPackage.COLONNE__CONTRAINTE,
					newContrainte, newContrainte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTableAlgoPackage.COLONNE__CONTRAINTE:
			return basicSetContrainte(null, msgs);
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
		case SchemaTableAlgoPackage.COLONNE__ID:
			return getId();
		case SchemaTableAlgoPackage.COLONNE__TYPE_COLONNE:
			return getTypeColonne();
		case SchemaTableAlgoPackage.COLONNE__CONTRAINTE:
			return getContrainte();
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
		case SchemaTableAlgoPackage.COLONNE__ID:
			setId((Integer) newValue);
			return;
		case SchemaTableAlgoPackage.COLONNE__TYPE_COLONNE:
			setTypeColonne((TypeColonne) newValue);
			return;
		case SchemaTableAlgoPackage.COLONNE__CONTRAINTE:
			setContrainte((Contrainte) newValue);
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
		case SchemaTableAlgoPackage.COLONNE__ID:
			setId(ID_EDEFAULT);
			return;
		case SchemaTableAlgoPackage.COLONNE__TYPE_COLONNE:
			setTypeColonne(TYPE_COLONNE_EDEFAULT);
			return;
		case SchemaTableAlgoPackage.COLONNE__CONTRAINTE:
			setContrainte((Contrainte) null);
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
		case SchemaTableAlgoPackage.COLONNE__ID:
			return id != ID_EDEFAULT;
		case SchemaTableAlgoPackage.COLONNE__TYPE_COLONNE:
			return typeColonne != TYPE_COLONNE_EDEFAULT;
		case SchemaTableAlgoPackage.COLONNE__CONTRAINTE:
			return contrainte != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", typeColonne: ");
		result.append(typeColonne);
		result.append(')');
		return result.toString();
	}

} //ColonneImpl
