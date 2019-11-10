package net.plavcak.maven.plugins.docker.core.tasks;

import java.util.Map;

public class RunContainerInput {
    private String image;
    private String name;
    private Map<String, String> environment;
    private String command;
    private String restart;
    private boolean rm;
    private String user;

    public String getImage() {
        return image;
    }

    public RunContainerInput setImage(String image) {
        this.image = image;
        return this;
    }

    public String getName() {
        return name;
    }

    public RunContainerInput setName(String name) {
        this.name = name;
        return this;
    }

    public Map<String, String> getEnvironment() {
        return environment;
    }

    public RunContainerInput setEnvironment(Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public RunContainerInput setCommand(String command) {
        this.command = command;
        return this;
    }

    public String getRestart() {
        return restart;
    }

    public RunContainerInput setRestart(String restart) {
        this.restart = restart;
        return this;
    }

    public boolean isRm() {
        return rm;
    }

    public RunContainerInput setRm(boolean rm) {
        this.rm = rm;
        return this;
    }

    public String getUser() {
        return user;
    }

    public RunContainerInput setUser(String user) {
        this.user = user;
        return this;
    }
}
