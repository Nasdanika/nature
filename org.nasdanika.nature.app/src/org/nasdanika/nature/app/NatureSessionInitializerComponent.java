package org.nasdanika.nature.app;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.cdo.security.Action;
import org.nasdanika.cdo.security.Class;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Package;
import org.nasdanika.cdo.security.SecurityFactory;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.core.CoreUtil.TokenSource;
// Import model package(s)
import org.nasdanika.nature.NatureFactory;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.Лес;
import org.osgi.service.component.ComponentContext;

public class NatureSessionInitializerComponent implements CDOSessionInitializer {
	
	private List<String> initialContent = new ArrayList<>();
	
	public void activate(ComponentContext componentContext) {
		Object ic = componentContext.getProperties().get("initial-content");
		TokenSource pts = token -> System.getProperties().get(token);
		if (ic instanceof String) {
			initialContent.add(CoreUtil.interpolate((String) ic, pts));
		} else if (ic instanceof String[]) {
			for (String ice: (String[]) ic) {
				initialContent.add(CoreUtil.interpolate(ice, pts));
			}
		}		
	}	
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(NaturePackage.eINSTANCE);

		packageRegistry.putEPackage(NaturePackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			String resourceName = "/Nature";
			if (!transaction.hasResource(resourceName) ) {
				CDOResource cRes = transaction.createResource(resourceName);
				
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

				resourceSet.getPackageRegistry().put(NaturePackage.eNS_URI, NaturePackage.eINSTANCE);
				
				Лес лес = NatureFactory.eINSTANCE.createЛес();
				cRes.getContents().add(лес);
				
				лес.setGuest(SecurityFactory.eINSTANCE.createGuest());
				Group everyone = SecurityFactory.eINSTANCE.createGroup();
				everyone.setName("Все-все-все");
				лес.setEveryone(everyone);
				
				// Контроль доступа к живым существам.
				Package naturePackage = SecurityFactory.eINSTANCE.createPackage();
				naturePackage.setName("Природа");
				naturePackage.setNsURI("urn:org.nasdanika.nature");
				лес.getPackages().add(naturePackage);
				
				Class живоеСуществоClass = SecurityFactory.eINSTANCE.createClass();
				живоеСуществоClass.setName("ЖивоеСущество");
				naturePackage.getClasses().add(живоеСуществоClass);
				
				Action видетьAction = SecurityFactory.eINSTANCE.createAction();
				видетьAction.setName("Видеть");
				видетьAction.getIncludePatterns().add("read:*");
				видетьAction.getExcludePatterns().add("read:permissions");
				живоеСуществоClass.getActions().add(видетьAction);
			}
			transaction.commit();
			transaction.close();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
	
}

