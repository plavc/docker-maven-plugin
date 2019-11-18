package net.plavcak.mavne.plugins.docker.goals;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

//@Mojo( name = "service-run")
public class RunService extends AbstractMojo {

    public RunService() {

    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker service run.");
    }
}