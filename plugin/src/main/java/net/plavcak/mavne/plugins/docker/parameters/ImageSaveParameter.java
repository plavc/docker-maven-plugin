package net.plavcak.mavne.plugins.docker.parameters;

import net.plavcak.maven.plugins.docker.core.tasks.ImageSaveInput;

public class ImageSaveParameter {

    private ImageSaveInput image;

    public ImageSaveInput getImage() {
        return image;
    }

    public void setImage(ImageSaveInput image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImageSaveParameter{" +
                "image=" + image +
                '}';
    }
}
