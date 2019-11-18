package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.tasks.ImageBuildTask;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

//@Mojo( name = "run-compose")
public class RunCompose extends AbstractRunGoal<ImageBuildTask> {

    public RunCompose() {
        super(new ImageBuildTask(new CommandExecutor()));
    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker container run.");
    }
}