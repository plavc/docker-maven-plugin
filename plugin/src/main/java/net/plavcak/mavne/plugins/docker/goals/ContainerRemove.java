package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.tasks.RunContainerInput;
import net.plavcak.maven.plugins.docker.core.tasks.RunContainerTask;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "container-remove")
public class ContainerRemove extends AbstractCommandGoal<RunContainerTask> {

    @Parameter
    private RunContainerInput container;

    public ContainerRemove() {
        super(new RunContainerTask(new CommandExecutor()));
    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker container run.");
    }
}