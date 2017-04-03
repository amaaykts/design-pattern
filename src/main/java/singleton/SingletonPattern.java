package singleton;

/**
 * Created by aandreev on 03.04.2017.
 */
public class SingletonPattern {
    private static SingletonPattern ourInstance = new SingletonPattern();

    public static SingletonPattern getInstance() {
        return ourInstance;
    }

    private SingletonPattern() {
    }
}
