package net.plavcak.mavne.plugins.docker.parameters;

import net.plavcak.mavne.plugins.docker.core.tasks.RunComposeInput;
import net.plavcak.mavne.plugins.docker.core.tasks.RunContainerInput;
import net.plavcak.mavne.plugins.docker.core.tasks.RunServiceInput;
import net.plavcak.mavne.plugins.docker.core.tasks.RunStackInput;

public class RunParameter {

    private RunContainerInput container;
    private RunServiceInput service;
    private RunStackInput stack;
    private RunComposeInput compose;

    public RunContainerInput getContainer() {
        return container;
    }

    public void setContainer(RunContainerInput container) {
        this.container = container;
    }

    public RunServiceInput getService() {
        return service;
    }

    public void setService(RunServiceInput service) {
        this.service = service;
    }

    public RunStackInput getStack() {
        return stack;
    }

    public void setStack(RunStackInput stack) {
        this.stack = stack;
    }

    public RunComposeInput getCompose() {
        return compose;
    }

    public void setCompose(RunComposeInput compose) {
        this.compose = compose;
    }
}
