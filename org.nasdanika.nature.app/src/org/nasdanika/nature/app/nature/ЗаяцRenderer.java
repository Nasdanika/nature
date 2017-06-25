package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.Заяц;

/**
 * @generated
 */
public interface ЗаяцRenderer<T extends Заяц> extends ЗверьRenderer<T>, ПищаRenderer<T> {
	/**
	 * @generated
	 */
	ЗаяцRenderer<Заяц> INSTANCE = new ЗаяцRenderer<Заяц>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ЗаяцRenderer<T>() {

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
		ret.add(ЗаяцRenderer.class);
		ret.addAll(ЗверьRenderer.super.getResourceBundleClasses(context));
		ret.addAll(ПищаRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
