package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import net.plavcak.maven.plugins.docker.core.tasks.ImageSaveInput;
import net.plavcak.maven.plugins.docker.core.tasks.ImageSaveTask;
import org.junit.jupiter.api.Test;

import java.io.File;

class ImageSaveTaskTest {

    @Test
    void save() {
        ImageSaveTask dockerImageSave = new ImageSaveTask(new CommandExecutor());

        dockerImageSave.run(ImageSaveInput.create()
                .setTag("ngen/iec104-adapter-service")
                .setFile(new File("ngen-iec104-adapter-service.tar")));
    }

    @Test
    void saveWithoutFile() {
        ImageSaveTask dockerImageSave = new ImageSaveTask(new CommandExecutor());
        dockerImageSave.run(ImageSaveInput.create().setTag("ngen/iec104-adapter-service"));
    }
}