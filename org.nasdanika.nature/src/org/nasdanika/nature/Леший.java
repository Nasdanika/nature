/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.cdo.security.LoginPasswordHashUser;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Леший</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.Леший#getИмя <em>Имя</em>}</li>
 *   <li>{@link org.nasdanika.nature.Леший#getПитомцы <em>Питомцы</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.nature.NaturePackage#getЛеший()
 * @model annotation="org.nasdanika.cdo.web.render label='{{\u0438\u043c\u044f}} ({{login}})'"
 * @generated
 */
public interface Леший extends LoginPasswordHashUser {
	/**
	 * Returns the value of the '<em><b>Имя</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Имя</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Имя</em>' attribute.
	 * @see #setИмя(String)
	 * @see org.nasdanika.nature.NaturePackage#getЛеший_Имя()
	 * @model required="true"
	 * @generated
	 */
	String getИмя();

	/**
	 * Sets the value of the '{@link org.nasdanika.nature.Леший#getИмя <em>Имя</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Имя</em>' attribute.
	 * @see #getИмя()
	 * @generated
	 */
	void setИмя(String value);

	/**
	 * Returns the value of the '<em><b>Питомцы</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.nature.ЖивоеСущество}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Питомцы</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Питомцы</em>' containment reference list.
	 * @see org.nasdanika.nature.NaturePackage#getЛеший_Питомцы()
	 * @model containment="true"
	 *        annotation="org.nasdanika.cdo.web.render type-column='{{icon}} {{eclass-label}}'"
	 * @generated
	 */
	EList<ЖивоеСущество> getПитомцы();

} // Леший
