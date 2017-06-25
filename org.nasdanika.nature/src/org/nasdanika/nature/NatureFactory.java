/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.nature.NaturePackage
 * @generated
 */
public interface NatureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NatureFactory eINSTANCE = org.nasdanika.nature.impl.NatureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Лес</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Лес</em>'.
	 * @generated
	 */
	Лес createЛес();

	/**
	 * Returns a new object of class '<em>Трава</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Трава</em>'.
	 * @generated
	 */
	Трава createТрава();

	/**
	 * Returns a new object of class '<em>Заяц</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Заяц</em>'.
	 * @generated
	 */
	Заяц createЗаяц();

	/**
	 * Returns a new object of class '<em>Лис</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Лис</em>'.
	 * @generated
	 */
	Лис createЛис();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NaturePackage getNaturePackage();

} //NatureFactory
