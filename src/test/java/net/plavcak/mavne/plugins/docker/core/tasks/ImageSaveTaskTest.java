package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.CommandExecutor;
import org.junit.jupiter.api.Test;

import java.io.File;

class ImageSaveTaskTest {

    @Test
    void save() {
        /*
        ImageSaveTask dockerImageSave = new ImageSaveTask(new CommandExecutor());

        dockerImageSave.run(ImageSaveInput.create()
                .setTag("ngen/iec104-adapter-service")
                .setFile(new File("ngen-iec104-adapter-service.tar")));

         */
    }

    @Test
    void saveWithoutFile() {
        /*
        ImageSaveTask dockerImageSave = new ImageSaveTask(new CommandExecutor());
        dockerImageSave.run(ImageSaveInput.create().setTag("ngen/iec104-adapter-service"));

         */
    }
}