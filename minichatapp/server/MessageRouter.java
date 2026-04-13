package minichatapp.server;

import minichatapp.model.User;
import minichatapp.storage.MessageStore;

public class MessageRouter {

    public static void broadcast(String message, User sender) {

        MessageStore.save(message);

        for (User user : UserManager.getUsers()) {
            if (user != sender) {
                user.getWriter().println(message);
            }
        }
    }
}