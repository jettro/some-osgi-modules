package nl.gridshore.tryout.rest;

import nl.gridshore.tryout.api.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Rest endpoint class to provide the Message resource.
 */
@Path("message")
public class MessageResource {
    private volatile MessageService messageService;

    @GET
    @Produces(APPLICATION_JSON)
    public Message message() {
        if (messageService == null) {
            return new Message("No service found");
        }
        return new Message(messageService.showMessage());
    }

    @POST
    @Produces(APPLICATION_JSON)
    public Message message(Message message) {
        if (messageService == null) {
            return new Message("No service found");
        }
        messageService.storeMessage(message.getMessage());
        return new Message(messageService.showMessage());
    }
}
