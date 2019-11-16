package net.plavcak.mavne.plugins.docker.core;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class CommandExecutor {

    private Log log;

    public TaskResult execute(Command command) {

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(command.build());

        try {
            Process process = processBuilder.start();
            StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
            Executors.newSingleThreadExecutor().submit(streamGobbler);
            StreamGobbler streamGobbler2 = new StreamGobbler(process.getErrorStream(), System.err::println);
            Executors.newSingleThreadExecutor().submit(streamGobbler2);
            int exitCode = process.waitFor();
            System.out.println(exitCode);
            return new TaskResult(exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new TaskResult(0);
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
