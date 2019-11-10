package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.CommandExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageBuildTaskTest {

    @Test
    void run() {
        ImageBuildTask task = new ImageBuildTask(new CommandExecutor());

        task.run(ImageBuildInput.create()
                .setTag("plavc/docker-maven-plugin:test"));
    }
}