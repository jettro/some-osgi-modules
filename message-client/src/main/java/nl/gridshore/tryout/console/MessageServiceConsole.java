package nl.gridshore.tryout.console;

import nl.gridshore.tryout.api.MessageService;

/**
 * Console implementation for the Message Service
 */
public class MessageServiceConsole {
    private volatile MessageService messageService;

    public MessageServiceConsole() {
        System.out.println("Console is created.");
    }

    public void showMessage() {
        System.out.println(messageService.showMessage());
    }

    public void enterMessage(String message) {
        messageService.storeMessage(message);
    }
}
