package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.Command;
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.TaskResult;

public class RunServiceTask extends CommandTask<RunServiceInput> {

    public RunServiceTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(RunServiceInput input) throws InvalidInputException {
        return commandExecutor.execute(Command.create());
    }
}