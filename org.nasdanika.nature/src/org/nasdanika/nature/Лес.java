/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Лес</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Лес является домом для различных живых существ.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.Лес#getЖивоесущество <em>Живоесущество</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.nature.NaturePackage#getЛес()
 * @model annotation="org.nasdanika.cdo.web.render label='{{eclass-name}}' icon='{{context-path}}/images/forest.png'"
 * @extends CDOObject
 * @generated
 */
public interface Лес extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Живоесущество</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.nature.ЖивоеСущество}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Живоесущество</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Живоесущество</em>' containment reference list.
	 * @see org.nasdanika.nature.NaturePackage#getЛес_Живоесущество()
	 * @model containment="true"
	 *        annotation="org.nasdanika.cdo.web.render model-element-label='\u0416\u0438\u0432\u044b\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0430' type-column='{{icon}} {{eclass-label}}'"
	 * @generated
	 */
	EList<ЖивоеСущество> getЖивоесущество();

} // Лес
