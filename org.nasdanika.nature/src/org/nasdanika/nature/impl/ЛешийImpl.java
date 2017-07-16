/**
 */
package org.nasdanika.nature.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.impl.LoginUserImpl;
import org.nasdanika.core.AuthorizationProvider;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.Context;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.ЖивоеСущество;
import org.nasdanika.nature.Лес;
import org.nasdanika.nature.Леший;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Леший</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.nature.impl.ЛешийImpl#getPasswordHash <em>Password Hash</em>}</li>
 *   <li>{@link org.nasdanika.nature.impl.ЛешийImpl#getИмя <em>Имя</em>}</li>
 *   <li>{@link org.nasdanika.nature.impl.ЛешийImpl#getПитомцы <em>Питомцы</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ЛешийImpl extends LoginUserImpl<LoginPasswordCredentials> implements Леший {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ЛешийImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.ЛЕШИЙ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPasswordHash() {
		return (byte[])eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHash(byte[] newPasswordHash) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, newPasswordHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getИмя() {
		return (String)eGet(NaturePackage.Literals.ЛЕШИЙ__ИМЯ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setИмя(String newИмя) {
		eSet(NaturePackage.Literals.ЛЕШИЙ__ИМЯ, newИмя);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ЖивоеСущество> getПитомцы() {
		return (EList<ЖивоеСущество>)eGet(NaturePackage.Literals.ЛЕШИЙ__ПИТОМЦЫ, true);
	}
	
	@Override
	public AccessDecision authorize(Context context, EObject target, String action, String qualifier, Map<String, Object> environment) throws Exception {
		// Лешим разрешается видеть имя, логин и живых существ других леших.		
		if (AuthorizationProvider.StandardAction.read.name().equals(action) && target instanceof Лес && (CoreUtil.isBlank(qualifier) || qualifier.equals("лешие"))) {
			return AccessDecision.ALLOW;
		}
		if (AuthorizationProvider.StandardAction.read.name().equals(action) && target instanceof Леший && (CoreUtil.isBlank(qualifier) || qualifier.equals("login") || qualifier.equals("имя") || qualifier.equals("питомцы"))) {
			return AccessDecision.ALLOW;
		}
		return super.authorize(context, target, action, qualifier, environment);
	}

} //ЛешийImpl
