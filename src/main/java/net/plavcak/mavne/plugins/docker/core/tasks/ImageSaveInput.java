package net.plavcak.mavne.plugins.docker.core.tasks;

import java.io.File;

public class ImageSaveInput {

    private static final String FILE_EXTENSION = ".tar";

    public static ImageSaveInput create() {
        return new ImageSaveInput();
    }

    private String tag;
    private File file;

    public String getTag() {
        return tag;
    }

    public ImageSaveInput setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public File getFile() {
        return file;
    }

    public File getFileWithFallback() {
        if (file != null) {
            return file;
        } else if (tag != null){
            return getFileFromTag();
        } else {
            return null;
        }
    }

    public ImageSaveInput setFile(File file) {
        this.file = file;
        return this;
    }

    protected File getFileFromTag() {
        return new File(getTag().replaceAll("/", "_") + FILE_EXTENSION);
    }

    @Override
    public String toString() {
        return "DockerSaveImageModel{" +
                "image='" + tag + '\'' +
                ", file=" + file +
                '}';
    }
}
