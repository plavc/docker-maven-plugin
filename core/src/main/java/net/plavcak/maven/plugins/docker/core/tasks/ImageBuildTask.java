package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.TaskResult;
import net.plavcak.maven.plugins.docker.core.DockerCommand;

public class ImageBuildTask implements Task<ImageBuildInput> {

    private CommandExecutor commandExecutor;

    public ImageBuildTask(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @Override
    public TaskResult run(ImageBuildInput input) throws InvalidInputException {
        DockerCommand command = DockerCommand.create("build");
        input.getBuildArgs().forEach((k, v) -> command.add("--build-arg").add(k + "=" + v));
        command.add("-t").add(input.getTag())
                .add("-f").add(input.getFile())
                .add(input.getContext());
        return commandExecutor.execute(command);
    }
}
