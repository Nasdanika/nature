/**
 */
package org.nasdanika.nature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Размер</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.nature.NaturePackage#getРазмер()
 * @model
 * @generated
 */
public enum Размер implements Enumerator {
	/**
	 * The '<em><b>Маленький</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #МАЛЕНЬКИЙ_VALUE
	 * @generated
	 * @ordered
	 */
	МАЛЕНЬКИЙ(0, "Маленький", "\u041c\u0430\u043b\u0435\u043d\u044c\u043a\u0438\u0439"),

	/**
	 * The '<em><b>Большой</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #БОЛЬШОЙ_VALUE
	 * @generated
	 * @ordered
	 */
	БОЛЬШОЙ(1, "Большой", "\u0411\u043e\u043b\u044c\u0448\u043e\u0439");

	/**
	 * The '<em><b>Маленький</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Маленький</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #МАЛЕНЬКИЙ
	 * @model name="Маленький"
	 * @generated
	 * @ordered
	 */
	public static final int МАЛЕНЬКИЙ_VALUE = 0;

	/**
	 * The '<em><b>Большой</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Большой</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #БОЛЬШОЙ
	 * @model name="Большой"
	 * @generated
	 * @ordered
	 */
	public static final int БОЛЬШОЙ_VALUE = 1;

	/**
	 * An array of all the '<em><b>Размер</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Размер[] VALUES_ARRAY =
		new Размер[] {
			МАЛЕНЬКИЙ,
			БОЛЬШОЙ,
		};

	/**
	 * A public read-only list of all the '<em><b>Размер</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Размер> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Размер</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Размер get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Размер result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Размер</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Размер getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Размер result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Размер</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Размер get(int value) {
		switch (value) {
			case МАЛЕНЬКИЙ_VALUE: return МАЛЕНЬКИЙ;
			case БОЛЬШОЙ_VALUE: return БОЛЬШОЙ;
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
	private Размер(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Размер
