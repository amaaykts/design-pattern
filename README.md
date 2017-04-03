# Шаблоны проектирования
## Фабричный метод
![Диаграмма](https://upload.wikimedia.org/wikipedia/ru/f/f0/FactoryMethodPattern.png "Диаграмма")

[реализация](https://refactoring.guru/ru/design-patterns/factory-method/java/example)
[реализация из Wikipedia](https://ru.wikipedia.org/wiki/%D0%A4%D0%B0%D0%B1%D1%80%D0%B8%D1%87%D0%BD%D1%8B%D0%B9_%D0%BC%D0%B5%D1%82%D0%BE%D0%B4_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

Factory Method - это паттерн создания объектов, порождающий шаблон (creational pattern). Данный шаблон проектирования предоставляет интерфейс для создания экземпляров некоторого класса. В момент создания наследники могут определить, какой класс инстанциировать.

Иными словами, Фабрика делегирует создание объектов наследникам родительского класса. Это позволяет использовать в коде программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне.

У нас есть класс фабрики в котором присутствует метод возвращающий общий класс продукта.

    public abstract class Creator {
        public abstract Product factoryMethod();
    }

Каждый конкретный класс создатель должен наследовать данный класс и сам решить какой продукт создавать.

    public class ConcreteCreatorA extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductA();
        }
    }

## Одиночка

Задача этого шаблона ограничить количество экземпляров некоторого класса в пределах приложения.

![Диаграмма](http://cdn.crunchify.com/wp-content/uploads/2013/02/Singleton-Pattern-Java.png "Диаграмма")

## Итератор
