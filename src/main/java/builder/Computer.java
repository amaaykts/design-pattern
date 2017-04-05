package builder;

/**
 * Класс компьютер
 */
public class Computer {
    private String display;
    private String systemBlock;
    private String manipulator;

    public Computer(String display, String systemBlock, String manipulator) {
        this.display = display;
        this.systemBlock = systemBlock;
        this.manipulator = manipulator;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setManipulator(String manipulator) {
        this.manipulator = manipulator;
    }

    public String getDisplay() {
        return display;
    }

    public String getSystemBlock() {
        return systemBlock;
    }

    public String getManipulator() {
        return manipulator;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", systemBlock='" + systemBlock + '\'' +
                ", manipulator='" + manipulator + '\'' +
                '}';
    }
}
