package net.plavcak.maven.plugins.docker.core.tasks;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException() {
    }

    public InvalidInputException(String message) {
        super(message);
    }
}
