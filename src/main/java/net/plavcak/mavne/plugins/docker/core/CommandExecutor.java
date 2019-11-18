package net.plavcak.mavne.plugins.docker.core;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class CommandExecutor {

    public TaskResult execute(Command command) throws IOException, InterruptedException, MojoExecutionException {

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(command.build());

        Process process = processBuilder.start();
        StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
        Executors.newSingleThreadExecutor().submit(streamGobbler);
        StreamGobbler streamGobbler2 = new StreamGobbler(process.getErrorStream(), System.err::println);
        Executors.newSingleThreadExecutor().submit(streamGobbler2);
        int exitCode = process.waitFor();
        if (exitCode > 0) {
            throw new MojoExecutionException("Failed to execute command. Exit code: " + exitCode);
        }
        return new TaskResult(exitCode);
    }

    private static class StreamGobbler implements Runnable {
        private InputStream inputStream;
        private Consumer<String> consumer;

        public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
            this.inputStream = inputStream;
            this.consumer = consumer;
        }

        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(consumer);
        }
    }
}
