package patterns;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        this.strategy.algorithmInterface();
    }
}
