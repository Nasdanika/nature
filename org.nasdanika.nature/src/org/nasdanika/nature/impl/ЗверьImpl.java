/**
 */
package org.nasdanika.nature.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.Зверь;
import org.nasdanika.nature.Пища;
import org.nasdanika.nature.Размер;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Зверь</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ЗверьImpl<П extends Пища> extends ЖивоеСуществоImpl implements Зверь<П> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЗверьImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.ЗВЕРЬ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ест(П пища) {
		EcoreUtil.delete(пища);
		setРазмер(Размер.БОЛЬШОЙ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NaturePackage.ЗВЕРЬ___ЕСТ__ПИЩА:
				ест((П)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ЗверьImpl
