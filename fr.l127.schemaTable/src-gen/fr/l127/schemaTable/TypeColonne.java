/**
 */
package fr.l127.schemaTable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Colonne</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.l127.schemaTable.SchemaTablePackage#getTypeColonne()
 * @model
 * @generated
 */
public enum TypeColonne implements Enumerator {
	/**
	 * The '<em><b>Chaine Caracteres</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAINE_CARACTERES_VALUE
	 * @generated
	 * @ordered
	 */
	CHAINE_CARACTERES(0, "ChaineCaracteres", "ChaineCaracteres"),

	/**
	 * The '<em><b>Nombre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMBRE_VALUE
	 * @generated
	 * @ordered
	 */
	NOMBRE(1, "Nombre", "Nombre");

	/**
	 * The '<em><b>Chaine Caracteres</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAINE_CARACTERES
	 * @model name="ChaineCaracteres"
	 * @generated
	 * @ordered
	 */
	public static final int CHAINE_CARACTERES_VALUE = 0;

	/**
	 * The '<em><b>Nombre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMBRE
	 * @model name="Nombre"
	 * @generated
	 * @ordered
	 */
	public static final int NOMBRE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Colonne</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeColonne[] VALUES_ARRAY = new TypeColonne[] { CHAINE_CARACTERES, NOMBRE, };

	/**
	 * A public read-only list of all the '<em><b>Type Colonne</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeColonne> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Colonne</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeColonne get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeColonne result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Colonne</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeColonne getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeColonne result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Colonne</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeColonne get(int value) {
		switch (value) {
		case CHAINE_CARACTERES_VALUE:
			return CHAINE_CARACTERES;
		case NOMBRE_VALUE:
			return NOMBRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeColonne(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TypeColonne
