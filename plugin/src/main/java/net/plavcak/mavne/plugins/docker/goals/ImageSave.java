package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.tasks.ImageSaveTask;
import net.plavcak.mavne.plugins.docker.parameters.ImageSaveParameter;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo( name = "save")
public class ImageSave extends AbstractCommandGoal<ImageSaveTask> {

    @Parameter
    private ImageSaveParameter save;

    public ImageSave() {
        super(new ImageSaveTask(new CommandExecutor()));
    }

    public void execute() throws MojoExecutionException {
        if(save != null && save.getImage() != null
                && save.getImage().getFile() != null
                && save.getImage().getTag() != null) {
            task.run(save.getImage());
        } else {
            getLog().error("Invalid parameters.");
        }
    }
}