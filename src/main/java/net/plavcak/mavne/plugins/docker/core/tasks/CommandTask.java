package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.CommandExecutor;

public abstract class CommandTask<T> implements Task<T> {

    CommandExecutor commandExecutor;

    CommandTask(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    public CommandExecutor getCommandExecutor() {
        return commandExecutor;
    }

    public void setCommandExecutor(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }
}
