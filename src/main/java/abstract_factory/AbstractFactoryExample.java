package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.MacOSFactory;
import abstract_factory.factory.WindowsFactory;
import abstract_factory.product.Button;
import abstract_factory.product.Checkbox;

/**
 * Created by aandreev on 04.04.2017.
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {
        createGUI(new MacOSFactory());
        createGUI(new WindowsFactory());
    }

    private static void createGUI(AbstractFactory factory) {
        Button button = factory.createButton();
        button.paint();

        Checkbox checkbox = factory.createCheckbox();
        checkbox.paint();
    }
}
