package nl.gridshore.tryout;

import nl.gridshore.tryout.api.MessageService;
import nl.gridshore.tryout.memory.MessageServiceMemory;
import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;

/**
 * Activator class for the in memory implementation of the message service
 */
public class ImplActivator extends DependencyActivatorBase {

    @Override
    public void init(BundleContext context, DependencyManager manager) throws Exception {
        System.out.println("Initializing the memory implementation  of the MessageService.");
        manager.add(createComponent()
                .setInterface(MessageService.class.getName(), null)
                .setImplementation(MessageServiceMemory.class));

    }
}
