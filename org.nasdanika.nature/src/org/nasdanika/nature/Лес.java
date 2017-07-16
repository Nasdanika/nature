/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.LoginPasswordRealm;

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
 *   <li>{@link org.nasdanika.nature.Лес#getЛешие <em>Лешие</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.nature.NaturePackage#getЛес()
 * @model annotation="org.nasdanika.cdo.web.render label='{{eclass-name}}' icon='{{context-path}}/images/forest.png'"
 * @generated
 */
public interface Лес extends LoginPasswordRealm {
	/**
	 * Returns the value of the '<em><b>Лешие</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.nature.Леший}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Лешие</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Лешие</em>' containment reference list.
	 * @see org.nasdanika.nature.NaturePackage#getЛес_Лешие()
	 * @model containment="true"
	 *        annotation="org.nasdanika.cdo.web.render view-features='login \u0438\u043c\u044f disabled' view='list'"
	 * @generated
	 */
	EList<Леший> getЛешие();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.nature.Diagnostic" exceptions="org.nasdanika.cdo.security.Exception" парольAnnotation="org.nasdanika.cdo.web.render input-type='password'" подтверждениеПароляAnnotation="org.nasdanika.cdo.web.render input-type='password'"
	 *        annotation="org.nasdanika.cdo.web.render web-operation='role: factory\r\nfeature: \u043b\u0435\u0448\u0438\u0435\r\n'"
	 * @generated
	 */
	Diagnostic создатьЛешего(String login, String имя, String пароль, String подтверждениеПароля) throws Exception;

} // Лес
