package abstract_factory.factory;

import abstract_factory.product.Button;
import abstract_factory.product.Checkbox;
import abstract_factory.product.WindowsButton;
import abstract_factory.product.WindowsCheckbox;

/**
 * Created by aandreev on 04.04.2017.
 */
public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
