/**
 */
package org.nasdanika.nature.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.nature.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.nature.NaturePackage
 * @generated
 */
public class NatureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NaturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureSwitch() {
		if (modelPackage == null) {
			modelPackage = NaturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NaturePackage.ЛЕС: {
				Лес лес = (Лес)theEObject;
				T result = caseЛес(лес);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ЖИВОЕ_СУЩЕСТВО: {
				ЖивоеСущество живоеСущество = (ЖивоеСущество)theEObject;
				T result = caseЖивоеСущество(живоеСущество);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ЗВЕРЬ: {
				Зверь<?> зверь = (Зверь<?>)theEObject;
				T result = caseЗверь(зверь);
				if (result == null) result = caseЖивоеСущество(зверь);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.РАСТЕНИЕ: {
				Растение растение = (Растение)theEObject;
				T result = caseРастение(растение);
				if (result == null) result = caseЖивоеСущество(растение);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ТРАВА: {
				Трава трава = (Трава)theEObject;
				T result = caseТрава(трава);
				if (result == null) result = caseРастение(трава);
				if (result == null) result = caseПища(трава);
				if (result == null) result = caseЖивоеСущество(трава);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ЗАЯЦ: {
				Заяц заяц = (Заяц)theEObject;
				T result = caseЗаяц(заяц);
				if (result == null) result = caseЗверь(заяц);
				if (result == null) result = caseПища(заяц);
				if (result == null) result = caseЖивоеСущество(заяц);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ЛИС: {
				Лис лис = (Лис)theEObject;
				T result = caseЛис(лис);
				if (result == null) result = caseЗверь(лис);
				if (result == null) result = caseЖивоеСущество(лис);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ПИЩА: {
				Пища пища = (Пища)theEObject;
				T result = caseПища(пища);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Лес</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Лес</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЛес(Лес object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Живое Существо</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Живое Существо</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЖивоеСущество(ЖивоеСущество object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Зверь</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Зверь</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <П extends Пища> T caseЗверь(Зверь<П> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Растение</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Растение</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseРастение(Растение object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Трава</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Трава</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseТрава(Трава object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Заяц</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Заяц</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЗаяц(Заяц object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Лис</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Лис</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseЛис(Лис object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Пища</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Пища</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseПища(Пища object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NatureSwitch
