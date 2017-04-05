package builder;

/**
 * Created by aandreev on 05.04.2017.
 */
public class BuilderExample {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Director director = new Director();
        director.constructCheapComputer(builder);

        System.out.println(builder.getComputer());
    }
}
