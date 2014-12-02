package nl.gridshore.tryout.memory;

import nl.gridshore.tryout.api.MessageService;

/**
 * In memory implementation for the Message Service
 */
public class MessageServiceMemory implements MessageService {
    private String message = "This is the default message";

    public MessageServiceMemory() {
        System.out.println("Created the memory impl object");
    }

    @Override
    public String showMessage() {
        return message;
    }

    @Override
    public void storeMessage(String message) {
        this.message = message;
    }
}
