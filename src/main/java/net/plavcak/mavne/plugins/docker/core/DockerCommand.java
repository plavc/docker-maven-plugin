package net.plavcak.mavne.plugins.docker.core;

public class DockerCommand extends Command {

    public static DockerCommand create() {
        return new DockerCommand();
    }

    public static DockerCommand create(String cmd) {
        return new DockerCommand().add(cmd);
    }

    private DockerCommand() {
        super();
        this.add("docker");
    }

    public DockerCommand add(String part) {
        super.add(part);
        return this;
    }

    public DockerCommand addConditional(String part, boolean add) {
        super.addConditional(part, add);
        return this;
    }

    public DockerCommand addConditionalWithValue(String part, Object value, boolean add) {
        super.addConditionalWithValue(part, value, add);
        return this;
    }
}
