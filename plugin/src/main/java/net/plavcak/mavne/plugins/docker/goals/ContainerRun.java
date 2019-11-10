package net.plavcak.mavne.plugins.docker.goals;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "run")
public class ContainerRun extends AbstractMojo {

    public ContainerRun() {

    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker container run.");
    }
}