package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
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

}
