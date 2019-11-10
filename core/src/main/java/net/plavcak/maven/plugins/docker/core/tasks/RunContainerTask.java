package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.Command;
import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.TaskResult;

public class RunContainerTask extends CommandTask<RunContainerInput> {

    public RunContainerTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(RunContainerInput input) throws InvalidInputException {
        return commandExecutor.execute(Command.create());
    }
}