package net.plavcak.mavne.plugins.docker.goals;

import net.plavcak.maven.plugins.docker.core.tasks.Task;
import net.plavcak.mavne.plugins.docker.parameters.RunParameter;
import org.apache.maven.plugins.annotations.Parameter;

public abstract class AbstractRunGoal<T extends Task> extends AbstractCommandGoal<T> {

    @Parameter
    private RunParameter runParameter;

    public AbstractRunGoal(T task) {
        super(task);
    }

    public RunParameter getRunParameter() {
        return runParameter;
    }

    public void setRunParameter(RunParameter runParameter) {
        this.runParameter = runParameter;
    }
}
