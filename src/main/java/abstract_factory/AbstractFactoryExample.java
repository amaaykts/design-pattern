package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.MacOSFactory;
import abstract_factory.factory.WindowsFactory;
import abstract_factory.product.Button;
import abstract_factory.product.Checkbox;

import java.io.InputStreamReader;

/**
 * Created by aandreev on 04.04.2017.
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory macOS = new MacOSFactory();
        createGUI(macOS);

        AbstractFactory windows = new WindowsFactory();
        createGUI(windows);
    }

    private static void createGUI(AbstractFactory factory) {
        Button button = factory.createButton();
        button.paint();

        Checkbox checkbox = factory.createCheckbox();
        checkbox.paint();
    }
}
