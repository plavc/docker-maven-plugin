package net.plavcak.mavne.plugins.docker.goals;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

//@Mojo( name = "stack-remove")
public class StackRemove extends AbstractMojo {

    public StackRemove() {

    }

    public void execute() throws MojoExecutionException {
        System.out.println("Docker stack deploy.");
    }
}