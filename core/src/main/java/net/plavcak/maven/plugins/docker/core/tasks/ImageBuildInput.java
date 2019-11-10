package net.plavcak.maven.plugins.docker.core.tasks;

import java.util.HashMap;
import java.util.Map;

public class ImageBuildInput {

    /**
     * 	Name and optionally a tag in the ‘name:tag’ format
     */
    private String tag;
    /**
     * Name of the Dockerfile (Default is ‘PATH/Dockerfile’)
     */
    private String file = "Dockerfile";
    /**
     * A build’s context is the set of files located in the specified PATH or URL.
     */
    private String context = ".";
    /**
     * 	Set build-time variables
     */
    private Map<String, String> buildArgs = new HashMap<>();
    /**
     * Set metadata for an image
     */
    private Map<String, String> labels = new HashMap<>();
    /**
     * Memory limit
     */
    private String memory;
    /**
     * Swap limit equal to memory plus swap: ‘-1’ to enable unlimited swap
     */
    private String memorySwap;
    /**
     * Set the networking mode for the RUN instructions during build
     */
    private String network;
    /**
     * Do not use cache when building the image
     */
    private boolean noCache;
    /**
     * Compress the build context using gzip
     */
    private boolean compress;
    /**
     * Always attempt to pull a newer version of the image
     */
    private boolean pull;

    public static ImageBuildInput create() {
        return new ImageBuildInput();
    }

    public String getTag() {
        return tag;
    }

    public ImageBuildInput setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getFile() {
        return file;
    }

    public ImageBuildInput setFile(String file) {
        this.file = file;
        return this;
    }

    public String getContext() {
        return context;
    }

    public ImageBuildInput setContext(String context) {
        this.context = context;
        return this;
    }

    public Map<String, String> getBuildArgs() {
        return buildArgs;
    }

    public ImageBuildInput setBuildArgs(Map<String, String> buildArgs) {
        this.buildArgs = buildArgs;
        return this;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public ImageBuildInput setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public ImageBuildInput setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getMemorySwap() {
        return memorySwap;
    }

    public ImageBuildInput setMemorySwap(String memorySwap) {
        this.memorySwap = memorySwap;
        return this;
    }

    public String getNetwork() {
        return network;
    }

    public ImageBuildInput setNetwork(String network) {
        this.network = network;
        return this;
    }

    public boolean isNoCache() {
        return noCache;
    }

    public ImageBuildInput setNoCache(boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    public boolean isCompress() {
        return compress;
    }

    public ImageBuildInput setCompress(boolean compress) {
        this.compress = compress;
        return this;
    }

    public boolean isPull() {
        return pull;
    }

    public ImageBuildInput setPull(boolean pull) {
        this.pull = pull;
        return this;
    }
}
