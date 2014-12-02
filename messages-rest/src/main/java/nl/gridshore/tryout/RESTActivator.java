package nl.gridshore.tryout;

import nl.gridshore.tryout.api.MessageService;
import nl.gridshore.tryout.rest.MessageResource;
import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

/**
 * Activator to register the REST endpoint
 */
public class RESTActivator extends DependencyActivatorBase {
    @Override
    public void init(BundleContext context, DependencyManager manager) throws Exception {
        System.out.println("Initialize the REST activator.");

        manager.add(
                createComponent()
                        .setInterface(Object.class.getName(), null)
                        .setImplementation(MessageResource.class)
                        .add(createServiceDependency().setService(MessageService.class))
        );
    }
}
