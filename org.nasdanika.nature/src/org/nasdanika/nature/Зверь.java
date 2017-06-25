/**
 */
package org.nasdanika.nature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Зверь</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.nature.NaturePackage#getЗверь()
 * @model abstract="true"
 * @generated
 */
public interface Зверь<П extends Пища> extends ЖивоеСущество {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="org.nasdanika.cdo.web.render web-operation='# Web Operation'"
	 * @generated
	 */
	void ест(П пища);

} // Зверь
