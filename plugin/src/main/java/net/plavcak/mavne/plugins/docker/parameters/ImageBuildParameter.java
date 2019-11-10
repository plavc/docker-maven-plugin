package net.plavcak.mavne.plugins.docker.parameters;

import net.plavcak.maven.plugins.docker.core.tasks.ImageBuildInput;

public class ImageBuildParameter {

    private ImageBuildInput image;

    public ImageBuildInput getImage() {
        return image;
    }

    public void setImage(ImageBuildInput image) {
        this.image = image;
    }
}
