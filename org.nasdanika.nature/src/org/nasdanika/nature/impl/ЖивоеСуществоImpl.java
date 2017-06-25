/**
 */
package org.nasdanika.nature.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.ЖивоеСущество;
import org.nasdanika.nature.Размер;
import org.nasdanika.nature.Цвет;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Живое Существо</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl#getРазмер <em>Размер</em>}</li>
 *   <li>{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl#getЦвет <em>Цвет</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ЖивоеСуществоImpl extends CDOObjectImpl implements ЖивоеСущество {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЖивоеСуществоImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.ЖИВОЕ_СУЩЕСТВО;
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
	public Размер getРазмер() {
		return (Размер)eGet(NaturePackage.Literals.ЖИВОЕ_СУЩЕСТВО__РАЗМЕР, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setРазмер(Размер newРазмер) {
		eSet(NaturePackage.Literals.ЖИВОЕ_СУЩЕСТВО__РАЗМЕР, newРазмер);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Цвет getЦвет() {
		return (Цвет)eGet(NaturePackage.Literals.ЖИВОЕ_СУЩЕСТВО__ЦВЕТ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setЦвет(Цвет newЦвет) {
		eSet(NaturePackage.Literals.ЖИВОЕ_СУЩЕСТВО__ЦВЕТ, newЦвет);
	}

} //ЖивоеСуществоImpl
