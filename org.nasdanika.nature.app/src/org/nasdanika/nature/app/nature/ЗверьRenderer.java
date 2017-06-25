package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.Зверь;

/**
 * @generated
 */
public interface ЗверьRenderer<T extends Зверь<?>> extends ЖивоеСуществоRenderer<T> {
	/**
	 * @generated
	 */
	ЗверьRenderer<Зверь<?>> INSTANCE = new ЗверьRenderer<Зверь<?>>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new ЗверьRenderer<T>() {

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
		ret.add(ЗверьRenderer.class);
		ret.addAll(ЖивоеСуществоRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
