package nl.gridshore.tryout.api;

/**
 * Service to interact with the current message.
 */
public interface MessageService {
    /**
     * Returns the current message to the caller.
     *
     * @return String containing the current message
     */
    String showMessage();

    /**
     * Stores the provided message as the new message to return.
     *
     * @param message String containing the new message
     */
    void storeMessage(String message);
}
