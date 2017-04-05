package strategy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
