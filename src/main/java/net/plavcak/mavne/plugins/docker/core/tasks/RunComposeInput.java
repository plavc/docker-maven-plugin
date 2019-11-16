package net.plavcak.mavne.plugins.docker.core.tasks;

public class RunComposeInput {

    private boolean detached;
    private boolean noColor;
    private boolean quitePull;
    private boolean noDeps;
    private boolean forceRecreate;
    private boolean alwaysRecreateDeps;
    private boolean noRecreate;
    private boolean noBuild;
    private boolean noStart;
    private boolean build;
    private boolean abortOnContainerExit;
    private Integer timeout;
    private boolean renewAnonymousVolumes;
    private boolean removeOrphans;

    public boolean isDetached() {
        return detached;
    }

    public RunComposeInput setDetached(boolean detached) {
        this.detached = detached;
        return this;
    }

    public boolean isNoColor() {
        return noColor;
    }

    public RunComposeInput setNoColor(boolean noColor) {
        this.noColor = noColor;
        return this;
    }

    public boolean isQuitePull() {
        return quitePull;
    }

    public RunComposeInput setQuitePull(boolean quitePull) {
        this.quitePull = quitePull;
        return this;
    }

    public boolean isNoDeps() {
        return noDeps;
    }

    public RunComposeInput setNoDeps(boolean noDeps) {
        this.noDeps = noDeps;
        return this;
    }

    public boolean isForceRecreate() {
        return forceRecreate;
    }

    public RunComposeInput setForceRecreate(boolean forceRecreate) {
        this.forceRecreate = forceRecreate;
        return this;
    }

    public boolean isAlwaysRecreateDeps() {
        return alwaysRecreateDeps;
    }

    public RunComposeInput setAlwaysRecreateDeps(boolean alwaysRecreateDeps) {
        this.alwaysRecreateDeps = alwaysRecreateDeps;
        return this;
    }

    public boolean isNoRecreate() {
        return noRecreate;
    }

    public RunComposeInput setNoRecreate(boolean noRecreate) {
        this.noRecreate = noRecreate;
        return this;
    }

    public boolean isNoBuild() {
        return noBuild;
    }

    public RunComposeInput setNoBuild(boolean noBuild) {
        this.noBuild = noBuild;
        return this;
    }

    public boolean isNoStart() {
        return noStart;
    }

    public RunComposeInput setNoStart(boolean noStart) {
        this.noStart = noStart;
        return this;
    }

    public boolean isBuild() {
        return build;
    }

    public RunComposeInput setBuild(boolean build) {
        this.build = build;
        return this;
    }

    public boolean isAbortOnContainerExit() {
        return abortOnContainerExit;
    }

    public RunComposeInput setAbortOnContainerExit(boolean abortOnContainerExit) {
        this.abortOnContainerExit = abortOnContainerExit;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public RunComposeInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public boolean isRenewAnonymousVolumes() {
        return renewAnonymousVolumes;
    }

    public RunComposeInput setRenewAnonymousVolumes(boolean renewAnonymousVolumes) {
        this.renewAnonymousVolumes = renewAnonymousVolumes;
        return this;
    }

    public boolean isRemoveOrphans() {
        return removeOrphans;
    }

    public RunComposeInput setRemoveOrphans(boolean removeOrphans) {
        this.removeOrphans = removeOrphans;
        return this;
    }
}
