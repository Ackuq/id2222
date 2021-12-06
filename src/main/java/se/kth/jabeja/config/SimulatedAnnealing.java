package se.kth.jabeja.config;


public enum SimulatedAnnealing {
    LINEAR("LINEAR"),
    EXPONENTIAL("EXPONENTIAL");
    String name;

    SimulatedAnnealing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
