package strategy;

/**
 * Created by helmeter on 5/4/16.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algrithmInterface();
    }
}
