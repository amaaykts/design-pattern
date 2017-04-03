package factory_method.factory;

import factory_method.product.ConcreteProductA;
import factory_method.product.ConcreteProductB;
import factory_method.product.Product;

/**
 * Created by aandreev on 03.04.2017.
 */

/**
 * Фабрика создания конкретного продукта
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
