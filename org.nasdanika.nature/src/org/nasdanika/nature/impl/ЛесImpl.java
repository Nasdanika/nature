/**
 */
package org.nasdanika.nature.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.ЖивоеСущество;
import org.nasdanika.nature.Лес;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Лес</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.impl.ЛесImpl#getЖивоесущество <em>Живоесущество</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ЛесImpl extends CDOObjectImpl implements Лес {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ЖивоеСущество> getЖивоесущество() {
		return (EList<ЖивоеСущество>)eGet(NaturePackage.Literals.ЛЕС__ЖИВОЕСУЩЕСТВО, true);
	}

} //ЛесImpl
