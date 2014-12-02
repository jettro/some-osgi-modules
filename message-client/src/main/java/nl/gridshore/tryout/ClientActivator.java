package nl.gridshore.tryout;

import nl.gridshore.tryout.api.MessageService;
import nl.gridshore.tryout.console.MessageServiceConsole;
import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.apache.felix.service.command.CommandProcessor;
import org.osgi.framework.BundleContext;

import java.util.Properties;

/**
 * Activator class for the console class.
 */
public class ClientActivator extends DependencyActivatorBase {
    @Override
    public void init(BundleContext context, DependencyManager manager) throws Exception {
        System.out.println("Initialize the client bundle");
        Properties props = new Properties();
        props.put(CommandProcessor.COMMAND_SCOPE, "messageservice");
        props.put(CommandProcessor.COMMAND_FUNCTION, new String[]{"showMessage", "enterMessage"});

        manager.add(createComponent()
                .setInterface(Object.class.getName(), props)
                .setImplementation(MessageServiceConsole.class)
                .add(createServiceDependency().setService(MessageService.class).setRequired(true)));

    }
}
