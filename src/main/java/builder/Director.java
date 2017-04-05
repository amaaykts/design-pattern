package builder;

/**
 * Created by aandreev on 05.04.2017.
 */
public class Director {
    public void constructCheapComputer(Builder builder) {
        builder.buildDisplay("Samsung");
        builder.buildSystemBlock("Everest");
        builder.buildManipulators("mouse + keyboard");
    }
}
