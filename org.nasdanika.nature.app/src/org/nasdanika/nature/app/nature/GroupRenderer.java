package org.nasdanika.nature.app.nature;

import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.app.Renderer;
import org.nasdanika.cdo.web.routes.app.ResourceProvider;

public interface GroupRenderer extends RendererBase<Group> {

	
	GroupRenderer INSTANCE = new GroupRenderer() {};	
	
	@Override
	default Renderer<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, Group> chain(ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> masterResourceProvider) throws Exception {
		return new GroupRenderer() {
			
			@Override
			public ResourceProvider<CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> getMasterResourceProvider(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
				return masterResourceProvider;
			}
			
		};
	}	
	
}
