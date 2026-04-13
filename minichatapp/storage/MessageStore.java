package minichatapp.storage;

import java.util.ArrayList;
import java.util.List;

public class MessageStore {

    private static List<String> messages = new ArrayList<>();

    public static void save(String message) {
        messages.add(message);
    }

    public static List<String> getAll() {
        return messages;
    }
}