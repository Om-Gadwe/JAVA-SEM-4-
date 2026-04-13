package minichatapp.model;

import java.io.PrintWriter;

public class User {
    private String name;
    private PrintWriter writer;

    public User(String name, PrintWriter writer) {
        this.name = name;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public PrintWriter getWriter() {
        return writer;
    }
}