package net.plavcak.mavne.plugins.docker.core.tasks;

import net.plavcak.mavne.plugins.docker.core.TaskResult;

public interface Task<T> {

    TaskResult run(T input) throws InvalidInputException;

}
