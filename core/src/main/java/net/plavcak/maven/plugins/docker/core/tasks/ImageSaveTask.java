package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.Command;
import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.TaskResult;
import net.plavcak.maven.plugins.docker.core.DockerCommand;

public class ImageSaveTask extends CommandTask<ImageSaveInput> {

    public ImageSaveTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(ImageSaveInput input) throws InvalidInputException {
        Command command = DockerCommand.create("save").add("-o").add(input.getFileWithFallback().getAbsolutePath()).add(input.getTag());
        return commandExecutor.execute(command);
    }
}