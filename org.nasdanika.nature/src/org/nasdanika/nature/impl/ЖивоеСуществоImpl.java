/**
 */
package org.nasdanika.nature.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.ProtectedPermission;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.Context;
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
 *   <li>{@link org.nasdanika.nature.impl.ЖивоеСуществоImpl#getPermissions <em>Permissions</em>}</li>
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
	@SuppressWarnings("unchecked")
	public EList<ProtectedPermission> getPermissions() {
		return (EList<ProtectedPermission>)eGet(SecurityPackage.Literals.PROTECTED__PERMISSIONS, true);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccessDecision authorize(Context context, Principal principal, String action, String qualifier, Map<String, Object> environment) throws Exception {
		return ЖивоеСущество.super.authorize(context, principal, action, qualifier, environment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Principal> getGrantees() {
		return ЖивоеСущество.super.getGrantees();
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
			case NaturePackage.ЖИВОЕ_СУЩЕСТВО___AUTHORIZE__CONTEXT_PRINCIPAL_STRING_STRING_MAP:
				try {
					return authorize((Context)arguments.get(0), (Principal)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Map<String, Object>)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case NaturePackage.ЖИВОЕ_СУЩЕСТВО___GET_GRANTEES:
				return getGrantees();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ЖивоеСуществоImpl
