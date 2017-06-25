package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.Трава;

/**
 * @generated
 */
public interface ТраваRenderer<T extends Трава> extends РастениеRenderer<T>, ПищаRenderer<T> {
	/**
	 * @generated
	 */
	ТраваRenderer<Трава> INSTANCE = new ТраваRenderer<Трава>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ТраваRenderer<T>() {

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
		ret.add(ТраваRenderer.class);
		ret.addAll(РастениеRenderer.super.getResourceBundleClasses(context));
		ret.addAll(ПищаRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
