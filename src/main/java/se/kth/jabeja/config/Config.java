package se.kth.jabeja.config;

public class Config {
    private Integer numPartitions;
    private Integer rounds;
    private Integer randomNeighborsSampleSize;
    private Float temperature;
    private Float delta;
    private Integer seed;
    private Integer uniformRandomSampleSize;
    private String graphFile;
    private String outputDir;
    private GraphInitColorPolicy initColorPolicy;
    private NodeSelectionPolicy nodeSelectionPolicy;
    private SimulatedAnnealing simulatedAnnealing;
    private Float alpha;
    private Integer restartSA;

    public Config setRandNeighborsSampleSize(Integer closeby_neighbors) {
        this.randomNeighborsSampleSize = closeby_neighbors;
        return this;
    }

    public Config setUniformRandSampleSize(Integer rnd_list_size) {
        this.uniformRandomSampleSize = rnd_list_size;
        return this;
    }

    public Integer getNumPartitions() {
        if (numPartitions == null) {
            throw new NullPointerException("Num partitions is not set");
        }
        return numPartitions;
    }

    public Config setNumPartitions(Integer num_partitions) {
        this.numPartitions = num_partitions;
        return this;
    }

    public Integer getRounds() {
        if (rounds == null) {
            throw new NullPointerException("Rounds is not set");
        }
        return rounds;
    }

    public Config setRounds(Integer rounds) {
        this.rounds = rounds;
        return this;
    }

    public Integer getRandomNeighborSampleSize() {
        if (randomNeighborsSampleSize == null) {
            throw new NullPointerException("Close by neighbors are not set");
        }
        return randomNeighborsSampleSize;
    }

    public Float getTemperature() {
        if (temperature == null) {
            throw new NullPointerException("Temperature is not set");
        }
        return temperature;
    }

    public Config setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    public Float getDelta() {
        if (delta == null) {
            throw new NullPointerException("Delta is not set");
        }
        return delta;
    }

    public Config setDelta(Float delta) {
        this.delta = delta;
        return this;
    }

    public Integer getSeed() {
        if (seed == null) {
            throw new NullPointerException("Seed is not set");
        }
        return seed;
    }

    public Config setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }

    public Integer getUniformRandomSampleSize() {
        if (uniformRandomSampleSize == null) {
            throw new NullPointerException("Random list size is not set");
        }
        return uniformRandomSampleSize;
    }

    public SimulatedAnnealing getSimulatedAnnealing() {
        if (this.simulatedAnnealing == null) {
            throw new NullPointerException("Simulated annealing is not set");
        }
        return this.simulatedAnnealing;
    }

    public Config setSimulatedAnnealing(SimulatedAnnealing simulatedAnnealing) {
        this.simulatedAnnealing = simulatedAnnealing;
        return this;
    }

    public String getGraphFilePath() {
        if (graphFile == null) {
            throw new NullPointerException("Graph file path is not set");
        }
        return graphFile;
    }

    public Config setGraphFilePath(String graphFilePath) {
        this.graphFile = graphFilePath;
        return this;
    }

    public GraphInitColorPolicy getGraphInitialColorPolicy() {
        if (initColorPolicy == null) {
            throw new NullPointerException("Graph initial color policy is not defined.");
        }
        return initColorPolicy;
    }

    public Config setGraphInitialColorPolicy(GraphInitColorPolicy policy) {
        this.initColorPolicy = policy;
        return this;
    }

    public NodeSelectionPolicy getNodeSelectionPolicy() {
        if (nodeSelectionPolicy == null) {
            throw new NullPointerException("Node selection policy is not defined.");
        }
        return nodeSelectionPolicy;
    }

    public Config setNodeSelectionPolicy(NodeSelectionPolicy nodeSelectionPolicy) {
        this.nodeSelectionPolicy = nodeSelectionPolicy;
        return this;
    }

    public String getOutputDir() {
        if (outputDir == null) {
            throw new NullPointerException("Output dir is not set");
        }
        return outputDir;

    }

    public Config setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    public Float getAlpha() {
        if (alpha == null) {
        }
        return alpha;
    }

    public Config setAlpha(Float alpha) {
        this.alpha = alpha;
        return this;
    }

    public Integer getRestartSA() {
        return this.restartSA;
    }

    public Config setRestartSA(Integer restartSA) {
        this.restartSA = restartSA;
        return this;
    }

    public Config createJabejaConfig() {
        return new Config();
    }

}