package org.nasdanika.nature.app.nature;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.Лес;

/**
 * @generated
 */
public interface ЛесRenderer<T extends Лес> extends RendererBase<T> {
	/**
	 * @generated
	 */
	ЛесRenderer<Лес> INSTANCE = new ЛесRenderer<Лес>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ЛесRenderer<T>() {

			@Override
			public ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> getMasterResourceProvider(
					CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
				return masterResourceProvider;
			}

		};
	}

	/**
	 * @generated
	 */
	@Override
	default LinkedList<Class<?>> getResourceBundleClasses(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		LinkedList<Class<?>> ret = new LinkedList<>();
		ret.add(ЛесRenderer.class);
		ret.addAll(RendererBase.super.getResourceBundleClasses(context));
		return ret;
	}
	
	@Override
	default List<EStructuralFeature> getVisibleFeatures(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj, FeaturePredicate predicate) throws Exception {
		List<EStructuralFeature> visibleFeatures = RendererBase.super.getVisibleFeatures(context, obj, predicate);
		visibleFeatures.remove(SecurityPackage.Literals.REALM__PACKAGES);
		visibleFeatures.remove(SecurityPackage.Literals.REALM__GUEST);
		visibleFeatures.remove(SecurityPackage.Literals.REALM__EVERYONE);
		return visibleFeatures;
	}
	
	@Override
	default List<EClass> getReferenceElementTypes(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj, EReference reference) throws Exception {
		
		// Лешие создаются через операцию Создать Лешего. 
		if (reference == NaturePackage.Literals.ЛЕС__ЛЕШИЕ) {
			return Collections.emptyList();
		}
		return RendererBase.super.getReferenceElementTypes(context, obj, reference);
	}

}
