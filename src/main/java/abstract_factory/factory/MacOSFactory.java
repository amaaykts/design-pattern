package abstract_factory.factory;

import abstract_factory.product.Button;
import abstract_factory.product.Checkbox;
import abstract_factory.product.MacOSButton;
import abstract_factory.product.MacOSCheckbox;

/**
 * Created by aandreev on 04.04.2017.
 */
public class MacOSFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
