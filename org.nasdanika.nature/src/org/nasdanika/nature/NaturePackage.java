/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.nature.NatureFactory
 * @model kind="package"
 * @generated
 */
public interface NaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.nature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.nature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NaturePackage eINSTANCE = org.nasdanika.nature.impl.NaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЛесImpl <em>Лес</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЛесImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛес()
	 * @generated
	 */
	int ЛЕС = 0;

	/**
	 * The feature id for the '<em><b>Живоесущество</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__ЖИВОЕСУЩЕСТВО = 0;

	/**
	 * The number of structural features of the '<em>Лес</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Лес</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl <em>Живое Существо</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЖивоеСуществоImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЖивоеСущество()
	 * @generated
	 */
	int ЖИВОЕ_СУЩЕСТВО = 1;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО__РАЗМЕР = 0;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО__ЦВЕТ = 1;

	/**
	 * The number of structural features of the '<em>Живое Существо</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Живое Существо</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЗверьImpl <em>Зверь</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЗверьImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗверь()
	 * @generated
	 */
	int ЗВЕРЬ = 2;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ__РАЗМЕР = ЖИВОЕ_СУЩЕСТВО__РАЗМЕР;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ__ЦВЕТ = ЖИВОЕ_СУЩЕСТВО__ЦВЕТ;

	/**
	 * The number of structural features of the '<em>Зверь</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ_FEATURE_COUNT = ЖИВОЕ_СУЩЕСТВО_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Ест</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ___ЕСТ__ПИЩА = ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Зверь</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ_OPERATION_COUNT = ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.РастениеImpl <em>Растение</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.РастениеImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getРастение()
	 * @generated
	 */
	int РАСТЕНИЕ = 3;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ__РАЗМЕР = ЖИВОЕ_СУЩЕСТВО__РАЗМЕР;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ__ЦВЕТ = ЖИВОЕ_СУЩЕСТВО__ЦВЕТ;

	/**
	 * The number of structural features of the '<em>Растение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ_FEATURE_COUNT = ЖИВОЕ_СУЩЕСТВО_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Растение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ_OPERATION_COUNT = ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ТраваImpl <em>Трава</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ТраваImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getТрава()
	 * @generated
	 */
	int ТРАВА = 4;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА__РАЗМЕР = РАСТЕНИЕ__РАЗМЕР;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА__ЦВЕТ = РАСТЕНИЕ__ЦВЕТ;

	/**
	 * The number of structural features of the '<em>Трава</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА_FEATURE_COUNT = РАСТЕНИЕ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Трава</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА_OPERATION_COUNT = РАСТЕНИЕ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЗаяцImpl <em>Заяц</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЗаяцImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗаяц()
	 * @generated
	 */
	int ЗАЯЦ = 5;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ__РАЗМЕР = ЗВЕРЬ__РАЗМЕР;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ__ЦВЕТ = ЗВЕРЬ__ЦВЕТ;

	/**
	 * The number of structural features of the '<em>Заяц</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ_FEATURE_COUNT = ЗВЕРЬ_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Ест</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ___ЕСТ__ПИЩА = ЗВЕРЬ___ЕСТ__ПИЩА;

	/**
	 * The number of operations of the '<em>Заяц</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ_OPERATION_COUNT = ЗВЕРЬ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЛисImpl <em>Лис</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЛисImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛис()
	 * @generated
	 */
	int ЛИС = 6;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС__РАЗМЕР = ЗВЕРЬ__РАЗМЕР;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС__ЦВЕТ = ЗВЕРЬ__ЦВЕТ;

	/**
	 * The number of structural features of the '<em>Лис</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС_FEATURE_COUNT = ЗВЕРЬ_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Ест</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС___ЕСТ__ПИЩА = ЗВЕРЬ___ЕСТ__ПИЩА;

	/**
	 * The number of operations of the '<em>Лис</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС_OPERATION_COUNT = ЗВЕРЬ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.Пища <em>Пища</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.Пища
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getПища()
	 * @generated
	 */
	int ПИЩА = 7;

	/**
	 * The number of structural features of the '<em>Пища</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПИЩА_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Пища</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ПИЩА_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.Размер <em>Размер</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.Размер
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getРазмер()
	 * @generated
	 */
	int РАЗМЕР = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.Цвет <em>Цвет</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.Цвет
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЦвет()
	 * @generated
	 */
	int ЦВЕТ = 9;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Лес <em>Лес</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Лес</em>'.
	 * @see org.nasdanika.nature.Лес
	 * @generated
	 */
	EClass getЛес();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.nature.Лес#getЖивоесущество <em>Живоесущество</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Живоесущество</em>'.
	 * @see org.nasdanika.nature.Лес#getЖивоесущество()
	 * @see #getЛес()
	 * @generated
	 */
	EReference getЛес_Живоесущество();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.ЖивоеСущество <em>Живое Существо</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Живое Существо</em>'.
	 * @see org.nasdanika.nature.ЖивоеСущество
	 * @generated
	 */
	EClass getЖивоеСущество();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.nature.ЖивоеСущество#getРазмер <em>Размер</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Размер</em>'.
	 * @see org.nasdanika.nature.ЖивоеСущество#getРазмер()
	 * @see #getЖивоеСущество()
	 * @generated
	 */
	EAttribute getЖивоеСущество_Размер();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.nature.ЖивоеСущество#getЦвет <em>Цвет</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Цвет</em>'.
	 * @see org.nasdanika.nature.ЖивоеСущество#getЦвет()
	 * @see #getЖивоеСущество()
	 * @generated
	 */
	EAttribute getЖивоеСущество_Цвет();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Зверь <em>Зверь</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Зверь</em>'.
	 * @see org.nasdanika.nature.Зверь
	 * @generated
	 */
	EClass getЗверь();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.nature.Зверь#ест(org.nasdanika.nature.Пища) <em>Ест</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ест</em>' operation.
	 * @see org.nasdanika.nature.Зверь#ест(org.nasdanika.nature.Пища)
	 * @generated
	 */
	EOperation getЗверь__Ест__Пища();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Растение <em>Растение</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Растение</em>'.
	 * @see org.nasdanika.nature.Растение
	 * @generated
	 */
	EClass getРастение();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Трава <em>Трава</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Трава</em>'.
	 * @see org.nasdanika.nature.Трава
	 * @generated
	 */
	EClass getТрава();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Заяц <em>Заяц</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Заяц</em>'.
	 * @see org.nasdanika.nature.Заяц
	 * @generated
	 */
	EClass getЗаяц();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Лис <em>Лис</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Лис</em>'.
	 * @see org.nasdanika.nature.Лис
	 * @generated
	 */
	EClass getЛис();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.nature.Пища <em>Пища</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Пища</em>'.
	 * @see org.nasdanika.nature.Пища
	 * @generated
	 */
	EClass getПища();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.nature.Размер <em>Размер</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Размер</em>'.
	 * @see org.nasdanika.nature.Размер
	 * @generated
	 */
	EEnum getРазмер();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.nature.Цвет <em>Цвет</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Цвет</em>'.
	 * @see org.nasdanika.nature.Цвет
	 * @generated
	 */
	EEnum getЦвет();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NatureFactory getNatureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЛесImpl <em>Лес</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЛесImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛес()
		 * @generated
		 */
		EClass ЛЕС = eINSTANCE.getЛес();

		/**
		 * The meta object literal for the '<em><b>Живоесущество</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЛЕС__ЖИВОЕСУЩЕСТВО = eINSTANCE.getЛес_Живоесущество();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl <em>Живое Существо</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЖивоеСуществоImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЖивоеСущество()
		 * @generated
		 */
		EClass ЖИВОЕ_СУЩЕСТВО = eINSTANCE.getЖивоеСущество();

		/**
		 * The meta object literal for the '<em><b>Размер</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЖИВОЕ_СУЩЕСТВО__РАЗМЕР = eINSTANCE.getЖивоеСущество_Размер();

		/**
		 * The meta object literal for the '<em><b>Цвет</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЖИВОЕ_СУЩЕСТВО__ЦВЕТ = eINSTANCE.getЖивоеСущество_Цвет();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЗверьImpl <em>Зверь</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЗверьImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗверь()
		 * @generated
		 */
		EClass ЗВЕРЬ = eINSTANCE.getЗверь();

		/**
		 * The meta object literal for the '<em><b>Ест</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ЗВЕРЬ___ЕСТ__ПИЩА = eINSTANCE.getЗверь__Ест__Пища();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.РастениеImpl <em>Растение</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.РастениеImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getРастение()
		 * @generated
		 */
		EClass РАСТЕНИЕ = eINSTANCE.getРастение();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ТраваImpl <em>Трава</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ТраваImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getТрава()
		 * @generated
		 */
		EClass ТРАВА = eINSTANCE.getТрава();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЗаяцImpl <em>Заяц</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЗаяцImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗаяц()
		 * @generated
		 */
		EClass ЗАЯЦ = eINSTANCE.getЗаяц();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЛисImpl <em>Лис</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЛисImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛис()
		 * @generated
		 */
		EClass ЛИС = eINSTANCE.getЛис();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.Пища <em>Пища</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.Пища
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getПища()
		 * @generated
		 */
		EClass ПИЩА = eINSTANCE.getПища();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.Размер <em>Размер</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.Размер
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getРазмер()
		 * @generated
		 */
		EEnum РАЗМЕР = eINSTANCE.getРазмер();

		/**
		 * The meta object literal for the '{@link org.nasdanika.nature.Цвет <em>Цвет</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.Цвет
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЦвет()
		 * @generated
		 */
		EEnum ЦВЕТ = eINSTANCE.getЦвет();

	}

} //NaturePackage
