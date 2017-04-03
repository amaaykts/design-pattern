package factory_method;

/**
 * Created by aandreev on 03.04.2017.
 */

import factory_method.factory.ConcreteCreatorA;
import factory_method.factory.ConcreteCreatorB;
import factory_method.factory.Creator;
import factory_method.product.Product;

/**
 * Пример использования фабричного метода
 */
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();  //Создаем конкретного создателя
        Product product = creatorA.factoryMethod(); //Получаем продукт (это будет конкретный продукт)
        System.out.printf("Created{%s}\n", product.getClass());

        Creator creatorB = new ConcreteCreatorB();
        product = creatorB.factoryMethod();
        System.out.printf("Created{%s}\n", product.getClass());

    }
}
