package factory_method.factory;

import factory_method.product.ConcreteProductA;
import factory_method.product.Product;

/**
 * Created by aandreev on 03.04.2017.
 */
/**Фабрика создания конкретного продукта*/
public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
