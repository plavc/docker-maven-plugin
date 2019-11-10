package net.plavcak.maven.plugins.docker.core;

public class TaskResult {

    private int exitCode;

    public TaskResult(int exitCode) {
        this.exitCode = exitCode;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }
}
