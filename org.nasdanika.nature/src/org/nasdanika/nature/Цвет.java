/**
 */
package org.nasdanika.nature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Цвет</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.nature.NaturePackage#getЦвет()
 * @model
 * @generated
 */
public enum Цвет implements Enumerator {
	/**
	 * The '<em><b>Белый</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #БЕЛЫЙ_VALUE
	 * @generated
	 * @ordered
	 */
	БЕЛЫЙ(0, "Белый", "\u0411\u0435\u043b\u044b\u0439"),

	/**
	 * The '<em><b>Серый</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #СЕРЫЙ_VALUE
	 * @generated
	 * @ordered
	 */
	СЕРЫЙ(1, "Серый", "\u0421\u0435\u0440\u044b\u0439"),

	/**
	 * The '<em><b>Рыжий</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #РЫЖИЙ_VALUE
	 * @generated
	 * @ordered
	 */
	РЫЖИЙ(2, "Рыжий", "\u0420\u044b\u0436\u0438\u0439"),

	/**
	 * The '<em><b>Жёлтый</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ЖЁЛТЫЙ_VALUE
	 * @generated
	 * @ordered
	 */
	ЖЁЛТЫЙ(3, "Жёлтый", "\u0416\u0451\u043b\u0442\u044b\u0439"),

	/**
	 * The '<em><b>Зелёный</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ЗЕЛЁНЫЙ_VALUE
	 * @generated
	 * @ordered
	 */
	ЗЕЛЁНЫЙ(4, "Зелёный", "\u0417\u0435\u043b\u0451\u043d\u044b\u0439");

	/**
	 * The '<em><b>Белый</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Белый</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #БЕЛЫЙ
	 * @model name="Белый"
	 * @generated
	 * @ordered
	 */
	public static final int БЕЛЫЙ_VALUE = 0;

	/**
	 * The '<em><b>Серый</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Серый</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #СЕРЫЙ
	 * @model name="Серый"
	 * @generated
	 * @ordered
	 */
	public static final int СЕРЫЙ_VALUE = 1;

	/**
	 * The '<em><b>Рыжий</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Рыжий</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #РЫЖИЙ
	 * @model name="Рыжий"
	 * @generated
	 * @ordered
	 */
	public static final int РЫЖИЙ_VALUE = 2;

	/**
	 * The '<em><b>Жёлтый</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Жёлтый</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ЖЁЛТЫЙ
	 * @model name="Жёлтый"
	 * @generated
	 * @ordered
	 */
	public static final int ЖЁЛТЫЙ_VALUE = 3;

	/**
	 * The '<em><b>Зелёный</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Зелёный</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ЗЕЛЁНЫЙ
	 * @model name="Зелёный"
	 * @generated
	 * @ordered
	 */
	public static final int ЗЕЛЁНЫЙ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Цвет</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Цвет[] VALUES_ARRAY =
		new Цвет[] {
			БЕЛЫЙ,
			СЕРЫЙ,
			РЫЖИЙ,
			ЖЁЛТЫЙ,
			ЗЕЛЁНЫЙ,
		};

	/**
	 * A public read-only list of all the '<em><b>Цвет</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Цвет> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Цвет</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Цвет get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Цвет result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Цвет</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Цвет getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Цвет result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Цвет</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Цвет get(int value) {
		switch (value) {
			case БЕЛЫЙ_VALUE: return БЕЛЫЙ;
			case СЕРЫЙ_VALUE: return СЕРЫЙ;
			case РЫЖИЙ_VALUE: return РЫЖИЙ;
			case ЖЁЛТЫЙ_VALUE: return ЖЁЛТЫЙ;
			case ЗЕЛЁНЫЙ_VALUE: return ЗЕЛЁНЫЙ;
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
	private Цвет(int value, String name, String literal) {
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
	
} //Цвет
