package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.Command;
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.TaskResult;
import net.plavcak.mavne.plugins.docker.core.DockerCommand;

public class ImageSaveTask extends CommandTask<ImageSaveInput> {

    public ImageSaveTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(ImageSaveInput input) throws InvalidInputException {
        Command command = DockerCommand.create("save")
                .add("-o")
                .add(input.getFileWithFallback().getAbsolutePath())
                .add(input.getTag());
        return commandExecutor.execute(command);
    }
}