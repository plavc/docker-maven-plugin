package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.Command;
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.TaskResult;

public class RunContainerTask extends CommandTask<RunContainerInput> {

    public RunContainerTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(RunContainerInput input) throws InvalidInputException {
        return commandExecutor.execute(Command.create());
    }
}