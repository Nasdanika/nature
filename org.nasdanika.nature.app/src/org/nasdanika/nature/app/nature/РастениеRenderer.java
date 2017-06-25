package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;
import org.nasdanika.nature.Растение;

/**
 * @generated
 */
public interface РастениеRenderer<T extends Растение> extends ЖивоеСуществоRenderer<T> {
	/**
	 * @generated
	 */
	РастениеRenderer<Растение> INSTANCE = new РастениеRenderer<Растение>() {
	};

	/**
	 * @generated
	 */
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> chain(
			ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider)
			throws Exception {

		return new РастениеRenderer<T>() {

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
		ret.add(РастениеRenderer.class);
		ret.addAll(ЖивоеСуществоRenderer.super.getResourceBundleClasses(context));
		return ret;
	}

}
