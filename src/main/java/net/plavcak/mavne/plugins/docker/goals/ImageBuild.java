package net.plavcak.mavne.plugins.docker.goals;
 
import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import net.plavcak.mavne.plugins.docker.core.tasks.ImageBuildTask;
import net.plavcak.mavne.plugins.docker.parameters.ImageBuildParameter;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "build")
public class ImageBuild extends AbstractCommandGoal<ImageBuildTask> {

    @Parameter
    private ImageBuildParameter build;

    public ImageBuild() {
        super(new ImageBuildTask(new CommandExecutor()));
    }

    public void execute() throws MojoExecutionException {
        task.run(build.getImage());
    }
}