package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.Command;
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.DockerCommand;
import net.plavcak.mavne.plugins.docker.core.TaskResult;

public class RunComposeTask extends CommandTask<RunComposeInput> {

    public RunComposeTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(RunComposeInput input) throws Exception {
        Command command = DockerCommand.create("docker-compose").add("up")
                .addConditional("-d", input.isDetached())
                .addConditional("--no-color ", input.isNoColor())
                .addConditional("--quiet-pull", input.isQuitePull())
                .addConditional("--no-deps", input.isNoDeps())
                .addConditional("--force-recreate", input.isForceRecreate())
                .addConditional("--always-recreate-deps", input.isAlwaysRecreateDeps())
                .addConditional("--no-recreate", input.isNoRecreate())
                .addConditional("--no-build", input.isNoBuild())
                .addConditional("--no-start", input.isNoStart())
                .addConditional("--build", input.isBuild())
                .addConditional("--abort-on-container-exit", input.isAbortOnContainerExit())
                .addConditionalWithValue("-t", input.getTimeout(), true)
                .addConditional("--renew-anon-volumes", input.isRenewAnonymousVolumes())
                .addConditional("--remove-orphans", input.isRemoveOrphans());
        return commandExecutor.execute(command);
    }
}