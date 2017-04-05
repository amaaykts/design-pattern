package builder;

/**
 * Класс реализующий builder, имеет теже поля что и наш продукт Computer
 */
public class ComputerBuilder implements Builder {
    private String display;
    private String systemBlock;
    private String manipulator;

    @Override
    public void buildSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;

    }

    @Override
    public void buildDisplay(String display) {
        this.display = display;

    }

    @Override
    public void buildManipulators(String manipulator) {
        this.manipulator = manipulator;

    }

    public Computer getComputer() {
        return new Computer(display, systemBlock, manipulator);
    }

}
