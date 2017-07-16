package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.Леший;

/**
 * @generated
 */
public interface ЛешийRenderer<T extends Леший> extends RendererBase<T> {
	/**
	 * @generated
	 */
	ЛешийRenderer<Леший> INSTANCE = new ЛешийRenderer<Леший>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ЛешийRenderer<T>() {

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
//		ret.add(ЛешийRenderer.class);
		ret.addAll(RendererBase.super.getResourceBundleClasses(context));
		return ret;
	}
	
	@Override
	default List<EStructuralFeature> getVisibleFeatures(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T obj, FeaturePredicate predicate) throws Exception {
		List<EStructuralFeature> visibleFeatures = RendererBase.super.getVisibleFeatures(context, obj, predicate);
		visibleFeatures.remove(SecurityPackage.Literals.PRINCIPAL__PERMISSIONS);
		return visibleFeatures;
	}
}
