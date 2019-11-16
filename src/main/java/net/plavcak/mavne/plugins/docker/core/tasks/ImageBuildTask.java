package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.TaskResult;
import net.plavcak.mavne.plugins.docker.core.DockerCommand;

public class ImageBuildTask extends CommandTask<ImageBuildInput> {

    public ImageBuildTask(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    public TaskResult run(ImageBuildInput input) throws InvalidInputException {
        DockerCommand command = DockerCommand.create("build");
        input.getBuildArgs().forEach((k, v) -> command.add("--build-arg").add(k + "=" + v));
        command.addConditionalWithValue("-t", input.getTag(), true)
                .addConditionalWithValue("-f", input.getFile(), true)
                .addConditional("--compress", input.isCompress())
                .addConditional("--no-cache", input.isNoCache())
                .addConditional("--pull", input.isPull())
                .addConditional("--rm", input.isRm())
                .addConditional("--squash", input.isSquash())
                .addConditionalWithValue("--memory", input.getMemory(), true)
                .addConditionalWithValue("--memory-swap", input.getMemorySwap(), true)
                .addConditionalWithValue("--network", input.getNetwork(), true)
                .addConditionalWithValue("--target", input.getTarget(), true)
                .addConditionalWithValue("--ulimit", input.getUlimit(), true)
                .add(input.getContext());
        return commandExecutor.execute(command);
    }
}
