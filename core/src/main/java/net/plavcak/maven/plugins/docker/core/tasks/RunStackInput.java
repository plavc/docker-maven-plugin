package net.plavcak.maven.plugins.docker.core.tasks;

public class RunStackInput {
    private String namespace;
    private boolean prune;
    private String resolveImage;
    private boolean withRegistryAuth;
    private String kubeconfig;
    private String orchestrator;

    public String getNamespace() {
        return namespace;
    }

    public RunStackInput setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public boolean isPrune() {
        return prune;
    }

    public RunStackInput setPrune(boolean prune) {
        this.prune = prune;
        return this;
    }

    public String getResolveImage() {
        return resolveImage;
    }

    public RunStackInput setResolveImage(String resolveImage) {
        this.resolveImage = resolveImage;
        return this;
    }

    public boolean isWithRegistryAuth() {
        return withRegistryAuth;
    }

    public RunStackInput setWithRegistryAuth(boolean withRegistryAuth) {
        this.withRegistryAuth = withRegistryAuth;
        return this;
    }

    public String getKubeconfig() {
        return kubeconfig;
    }

    public RunStackInput setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }

    public String getOrchestrator() {
        return orchestrator;
    }

    public RunStackInput setOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
        return this;
    }
}
