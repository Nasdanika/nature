/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Живое Существо</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.ЖивоеСущество#getРазмер <em>Размер</em>}</li>
 *   <li>{@link org.nasdanika.nature.ЖивоеСущество#getЦвет <em>Цвет</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.nature.NaturePackage#getЖивоеСущество()
 * @model abstract="true"
 *        annotation="org.nasdanika.cdo.web.render label='{{\u0440\u0430\u0437\u043c\u0435\u0440}} {{\u0446\u0432\u0435\u0442}} {{eclass-name}}'"
 * @extends CDOObject
 * @generated
 */
public interface ЖивоеСущество extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Размер</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.nature.Размер}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Размер</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Размер</em>' attribute.
	 * @see org.nasdanika.nature.Размер
	 * @see #setРазмер(Размер)
	 * @see org.nasdanika.nature.NaturePackage#getЖивоеСущество_Размер()
	 * @model
	 * @generated
	 */
	Размер getРазмер();

	/**
	 * Sets the value of the '{@link org.nasdanika.nature.ЖивоеСущество#getРазмер <em>Размер</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Размер</em>' attribute.
	 * @see org.nasdanika.nature.Размер
	 * @see #getРазмер()
	 * @generated
	 */
	void setРазмер(Размер value);

	/**
	 * Returns the value of the '<em><b>Цвет</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.nature.Цвет}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Цвет</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Цвет</em>' attribute.
	 * @see org.nasdanika.nature.Цвет
	 * @see #setЦвет(Цвет)
	 * @see org.nasdanika.nature.NaturePackage#getЖивоеСущество_Цвет()
	 * @model
	 * @generated
	 */
	Цвет getЦвет();

	/**
	 * Sets the value of the '{@link org.nasdanika.nature.ЖивоеСущество#getЦвет <em>Цвет</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Цвет</em>' attribute.
	 * @see org.nasdanika.nature.Цвет
	 * @see #getЦвет()
	 * @generated
	 */
	void setЦвет(Цвет value);

} // ЖивоеСущество
