package org.nasdanika.nature.app.nature;

import java.util.LinkedList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;

/**
 * Base interface for renderers defined in the package.
 * @generated
 */
public interface RendererBase<T extends EObject>
		extends Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, T> {
	/**
	 * @generated
	 */
	default LinkedList<Class<?>> getResourceBundleClasses(
			CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		LinkedList<Class<?>> ret = new LinkedList<>();
		ret.add(RendererBase.class);
		ret.addAll(Renderer.super.getResourceBundleClasses(context));
		return ret;

	}

}
