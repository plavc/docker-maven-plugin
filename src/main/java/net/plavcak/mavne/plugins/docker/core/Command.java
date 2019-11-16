package net.plavcak.mavne.plugins.docker.core;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private static boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

    private List<String> commands = new ArrayList<>();

    public static Command create() {
        return new Command();
    }

    public static Command create(String cmd) {
        return new Command().add(cmd);
    }

    protected Command() {
        if (isWindows) {
            commands.add("cmd");
            commands.add("/c");
        } else {
            commands.add("sh");
            commands.add("-c");
        }
    }

    public Command add(String part) {
        if(part != null) {
            commands.add(part);
        }
        return this;
    }

    public Command addConditional(String part, boolean add) {
        if(add) {
            return this.add(part);
        }
        return this;
    }

    public Command addConditionalWithValue(String part, Object value, boolean add) {
        if(add && value != null) {
            return this.add(part).add(value.toString());
        }
        return this;
    }

    public List<String> build() {
        return commands;
    }
}
