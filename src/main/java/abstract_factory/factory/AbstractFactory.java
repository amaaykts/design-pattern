package abstract_factory.factory;

import abstract_factory.product.Button;
import abstract_factory.product.Checkbox;

/**
 * Created by aandreev on 04.04.2017.
 */
public interface AbstractFactory {
    Button createButton();

    Checkbox createCheckbox();

}
