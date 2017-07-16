/**
 */
package org.nasdanika.nature.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.impl.LoginPasswordRealmImpl;
import org.nasdanika.cdo.security.util.DiagnosticHelper;
import org.nasdanika.nature.NatureFactory;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.Лес;
import org.nasdanika.nature.Леший;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Лес</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.impl.ЛесImpl#getЛешие <em>Лешие</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ЛесImpl extends LoginPasswordRealmImpl implements Лес {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЛесImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.ЛЕС;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Леший> getЛешие() {
		return (EList<Леший>)eGet(NaturePackage.Literals.ЛЕС__ЛЕШИЕ, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Diagnostic создатьЛешего(String login, String имя, String пароль, String подтверждениеПароля) throws Exception {
		BasicDiagnostic ret = new BasicDiagnostic();
		DiagnosticHelper diagnosticHelper = new DiagnosticHelper(ret, "Лес", 0, this);
		for (Леший леший: this.getЛешие()) {
			if (леший.getLogin().equals(login)) {
				diagnosticHelper.addDiagnostic(Diagnostic.ERROR, "Леший с таким login уже существует", null, NaturePackage.Literals.ЛЕС___СОЗДАТЬ_ЛЕШЕГО__STRING_STRING_STRING_STRING.getEParameters().get(0));
				break;
			}
		}
		
		if (!пароль.equals(подтверждениеПароля)) {
			diagnosticHelper.addDiagnostic(Diagnostic.ERROR, "Пароль и подтверждение не совпадают", null, NaturePackage.Literals.ЛЕС___СОЗДАТЬ_ЛЕШЕГО__STRING_STRING_STRING_STRING.getEParameters().get(3));			
		}
		
		if (diagnosticHelper.isSuccess()) {
			Леший леший = NatureFactory.eINSTANCE.createЛеший();
			леший.setLogin(login);
			леший.setИмя(имя);
			setPasswordHash(леший, пароль);
			getЛешие().add(леший);
			diagnosticHelper.addDiagnostic(Diagnostic.OK, "Леший '"+login+"' создан", null, NaturePackage.Literals.ЛЕС__ЛЕШИЕ);
		}
		
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NaturePackage.ЛЕС___СОЗДАТЬ_ЛЕШЕГО__STRING_STRING_STRING_STRING:
				try {
					return создатьЛешего((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Леший> getAllUsers() {
		return getЛешие();
	}

} //ЛесImpl
