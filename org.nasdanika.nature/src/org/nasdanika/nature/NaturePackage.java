/**
 */
package org.nasdanika.nature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.cdo.security.SecurityPackage;

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
	 * The feature id for the '<em><b>Administrators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__ADMINISTRATORS = SecurityPackage.LOGIN_PASSWORD_REALM__ADMINISTRATORS;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__GUEST = SecurityPackage.LOGIN_PASSWORD_REALM__GUEST;

	/**
	 * The feature id for the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__EVERYONE = SecurityPackage.LOGIN_PASSWORD_REALM__EVERYONE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__PACKAGES = SecurityPackage.LOGIN_PASSWORD_REALM__PACKAGES;

	/**
	 * The feature id for the '<em><b>Лешие</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС__ЛЕШИЕ = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Лес</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___AUTHENTICATE__OBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___GET_ALL_USERS = SecurityPackage.LOGIN_PASSWORD_REALM___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___CLEAR_PERMISSIONS__EOBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___IS_ADMINISTRATOR__PRINCIPAL = SecurityPackage.LOGIN_PASSWORD_REALM___IS_ADMINISTRATOR__PRINCIPAL;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = SecurityPackage.LOGIN_PASSWORD_REALM___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___GET_USER__STRING = SecurityPackage.LOGIN_PASSWORD_REALM___GET_USER__STRING;

	/**
	 * The operation id for the '<em>Создать Лешего</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС___СОЗДАТЬ_ЛЕШЕГО__STRING_STRING_STRING_STRING = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Лес</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕС_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl <em>Живое Существо</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЖивоеСуществоImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЖивоеСущество()
	 * @generated
	 */
	int ЖИВОЕ_СУЩЕСТВО = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЗверьImpl <em>Зверь</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЗверьImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗверь()
	 * @generated
	 */
	int ЗВЕРЬ = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.РастениеImpl <em>Растение</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.РастениеImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getРастение()
	 * @generated
	 */
	int РАСТЕНИЕ = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ТраваImpl <em>Трава</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ТраваImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getТрава()
	 * @generated
	 */
	int ТРАВА = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЗаяцImpl <em>Заяц</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЗаяцImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЗаяц()
	 * @generated
	 */
	int ЗАЯЦ = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЛисImpl <em>Лис</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЛисImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛис()
	 * @generated
	 */
	int ЛИС = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.Пища <em>Пища</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.Пища
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getПища()
	 * @generated
	 */
	int ПИЩА = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.impl.ЛешийImpl <em>Леший</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.impl.ЛешийImpl
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛеший()
	 * @generated
	 */
	int ЛЕШИЙ = 1;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__MEMBER_OF = SecurityPackage.LOGIN_PASSWORD_HASH_USER__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__PERMISSIONS = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__DISABLED = SecurityPackage.LOGIN_PASSWORD_HASH_USER__DISABLED;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__LOGIN = SecurityPackage.LOGIN_PASSWORD_HASH_USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__PASSWORD_HASH = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH;

	/**
	 * The feature id for the '<em><b>Имя</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__ИМЯ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Питомцы</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ__ПИТОМЦЫ = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Леший</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = SecurityPackage.LOGIN_PASSWORD_HASH_USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ___ACCEPT__PRINCIPALVISITOR = SecurityPackage.LOGIN_PASSWORD_HASH_USER___ACCEPT__PRINCIPALVISITOR;

	/**
	 * The operation id for the '<em>Get Realm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ___GET_REALM = SecurityPackage.LOGIN_PASSWORD_HASH_USER___GET_REALM;

	/**
	 * The number of operations of the '<em>Леший</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛЕШИЙ_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО__PERMISSIONS = SecurityPackage.PROTECTED__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Размер</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО__РАЗМЕР = SecurityPackage.PROTECTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Цвет</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО__ЦВЕТ = SecurityPackage.PROTECTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Живое Существо</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО_FEATURE_COUNT = SecurityPackage.PROTECTED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = SecurityPackage.PROTECTED___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО___GET_GRANTEES = SecurityPackage.PROTECTED___GET_GRANTEES;

	/**
	 * The number of operations of the '<em>Живое Существо</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT = SecurityPackage.PROTECTED_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ__PERMISSIONS = ЖИВОЕ_СУЩЕСТВО__PERMISSIONS;

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
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = ЖИВОЕ_СУЩЕСТВО___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗВЕРЬ___GET_GRANTEES = ЖИВОЕ_СУЩЕСТВО___GET_GRANTEES;

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
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ__PERMISSIONS = ЖИВОЕ_СУЩЕСТВО__PERMISSIONS;

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
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = ЖИВОЕ_СУЩЕСТВО___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ___GET_GRANTEES = ЖИВОЕ_СУЩЕСТВО___GET_GRANTEES;

	/**
	 * The number of operations of the '<em>Растение</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int РАСТЕНИЕ_OPERATION_COUNT = ЖИВОЕ_СУЩЕСТВО_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА__PERMISSIONS = РАСТЕНИЕ__PERMISSIONS;

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
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = РАСТЕНИЕ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА___GET_GRANTEES = РАСТЕНИЕ___GET_GRANTEES;

	/**
	 * The number of operations of the '<em>Трава</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ТРАВА_OPERATION_COUNT = РАСТЕНИЕ_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ__PERMISSIONS = ЗВЕРЬ__PERMISSIONS;

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
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = ЗВЕРЬ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЗАЯЦ___GET_GRANTEES = ЗВЕРЬ___GET_GRANTEES;

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
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС__PERMISSIONS = ЗВЕРЬ__PERMISSIONS;

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
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP = ЗВЕРЬ___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Get Grantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ЛИС___GET_GRANTEES = ЗВЕРЬ___GET_GRANTEES;

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
	int РАЗМЕР = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.nature.Цвет <em>Цвет</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.nature.Цвет
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЦвет()
	 * @generated
	 */
	int ЦВЕТ = 10;


	/**
	 * The meta object id for the '<em>Diagnostic</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic
	 * @see org.nasdanika.nature.impl.NaturePackageImpl#getDiagnostic()
	 * @generated
	 */
	int DIAGNOSTIC = 11;


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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.nature.Лес#getЛешие <em>Лешие</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Лешие</em>'.
	 * @see org.nasdanika.nature.Лес#getЛешие()
	 * @see #getЛес()
	 * @generated
	 */
	EReference getЛес_Лешие();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.nature.Лес#создатьЛешего(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Создать Лешего</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Создать Лешего</em>' operation.
	 * @see org.nasdanika.nature.Лес#создатьЛешего(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getЛес__СоздатьЛешего__String_String_String_String();

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
	 * Returns the meta object for class '{@link org.nasdanika.nature.Леший <em>Леший</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Леший</em>'.
	 * @see org.nasdanika.nature.Леший
	 * @generated
	 */
	EClass getЛеший();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.nature.Леший#getИмя <em>Имя</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Имя</em>'.
	 * @see org.nasdanika.nature.Леший#getИмя()
	 * @see #getЛеший()
	 * @generated
	 */
	EAttribute getЛеший_Имя();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.nature.Леший#getПитомцы <em>Питомцы</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Питомцы</em>'.
	 * @see org.nasdanika.nature.Леший#getПитомцы()
	 * @see #getЛеший()
	 * @generated
	 */
	EReference getЛеший_Питомцы();

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
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Diagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Diagnostic</em>'.
	 * @see org.eclipse.emf.common.util.Diagnostic
	 * @model instanceClass="org.eclipse.emf.common.util.Diagnostic"
	 * @generated
	 */
	EDataType getDiagnostic();

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
		 * The meta object literal for the '<em><b>Лешие</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЛЕС__ЛЕШИЕ = eINSTANCE.getЛес_Лешие();

		/**
		 * The meta object literal for the '<em><b>Создать Лешего</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ЛЕС___СОЗДАТЬ_ЛЕШЕГО__STRING_STRING_STRING_STRING = eINSTANCE.getЛес__СоздатьЛешего__String_String_String_String();

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
		 * The meta object literal for the '{@link org.nasdanika.nature.impl.ЛешийImpl <em>Леший</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.nature.impl.ЛешийImpl
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getЛеший()
		 * @generated
		 */
		EClass ЛЕШИЙ = eINSTANCE.getЛеший();

		/**
		 * The meta object literal for the '<em><b>Имя</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ЛЕШИЙ__ИМЯ = eINSTANCE.getЛеший_Имя();

		/**
		 * The meta object literal for the '<em><b>Питомцы</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ЛЕШИЙ__ПИТОМЦЫ = eINSTANCE.getЛеший_Питомцы();

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

		/**
		 * The meta object literal for the '<em>Diagnostic</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Diagnostic
		 * @see org.nasdanika.nature.impl.NaturePackageImpl#getDiagnostic()
		 * @generated
		 */
		EDataType DIAGNOSTIC = eINSTANCE.getDiagnostic();

	}

} //NaturePackage
