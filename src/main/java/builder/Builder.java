package builder;

/**
 * Интерфейс билдера, реализовать методы
 */
public interface Builder {
    void buildSystemBlock(String systemBlock);

    void buildDisplay(String display);

    void buildManipulators(String manipulator);
}
