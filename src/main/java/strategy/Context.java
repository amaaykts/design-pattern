package strategy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int strategyExecute(int a, int b){
        return strategy.execute(a, b);
    }
}
