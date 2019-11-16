package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.Command;
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.TaskResult;

public class RunStackTask extends CommandTask<RunStackInput> {

    public RunStackTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(RunStackInput input) throws InvalidInputException {
        return commandExecutor.execute(Command.create());
    }
}