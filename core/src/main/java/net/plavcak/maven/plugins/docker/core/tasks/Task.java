package net.plavcak.maven.plugins.docker.core.tasks;

import net.plavcak.maven.plugins.docker.core.TaskResult;

public interface Task<T> {

    TaskResult run(T input) throws InvalidInputException;

}
