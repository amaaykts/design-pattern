package strategy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategy = new ConcreteStrategyAdd();
        context.setStrategy(strategy);
        System.out.println(context.strategyExecute(2, 5));

        strategy = new ConcreteStrategyMultiply();
        context.setStrategy(strategy);
        System.out.println(context.strategyExecute(2, 5));

    }
}
