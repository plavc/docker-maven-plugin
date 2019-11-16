package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.mavne.plugins.docker.core.tasks.Task;
import org.apache.maven.plugin.AbstractMojo;

public abstract class AbstractCommandGoal<T extends Task> extends AbstractMojo {

    protected T task;

    public AbstractCommandGoal(T task) {
        this.task = task;
    }

    public T getTask() {
        return task;
    }
}
