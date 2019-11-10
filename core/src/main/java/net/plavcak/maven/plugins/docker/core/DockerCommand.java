package net.plavcak.maven.plugins.docker.core;

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
}
