package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.tasks.RunContainerInput;
import net.plavcak.mavne.plugins.docker.core.tasks.RunContainerTask;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "container-run")
public class ContainerRun extends AbstractCommandGoal<RunContainerTask> {

    @Parameter
    private RunContainerInput container;

    public ContainerRun() {
        super(new RunContainerTask(new CommandExecutor()));
    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker container run.");
    }
}