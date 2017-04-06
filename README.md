# Шаблоны проектирования

![Диаграмма](https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Uml_classes_ru.svg/300px-Uml_classes_ru.svg.png "Диаграмма")

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

## Абстрактная фабрика

Абстрактная фабрика (англ. Abstract factory) — порождающий шаблон проектирования, предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не специфицируя их конкретных классов. Шаблон реализуется созданием абстрактного класса Factory, который представляет собой интерфейс для создания компонентов системы (например, для оконного интерфейса он может создавать окна и кнопки). Затем пишутся классы, реализующие этот интерфейс.

![Диаграмма](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Abstract_factory_UML.svg/677px-Abstract_factory_UML.svg.png "Диаграмма")

[описание](https://ru.wikipedia.org/wiki/%D0%90%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D0%B0%D1%8F_%D1%84%D0%B0%D0%B1%D1%80%D0%B8%D0%BA%D0%B0_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

У нас есть интерфейс продукта с методами. Есть интерфейс абстрактной фабрики в котором есть методы создания продуктов.

    public interface AbstractFactory {
        Button createButton();
        Checkbox createCheckbox();
    }

Есть классы реализизующие данный интерфейс и все методы и решающие какое именно семество объектов создавать.

    public class MacOSFactory implements AbstractFactory {
        public Button createButton() {
            return new MacOSButton();
        }

        public Checkbox createCheckbox() {
            return new MacOSCheckbox();
        }
    }

### Плюсы

- изолирует конкретные классы;
- упрощает замену семейств продуктов;
- гарантирует сочетаемость продуктов.

### Применение

- Система не должна зависеть от того, как создаются, компонуются и представляются входящие в неё объекты.
- Входящие в семейство взаимосвязанные объекты должны использоваться вместе и вам необходимо обеспечить выполнение этого ограничения.
- Система должна конфигурироваться одним из семейств составляющих её объектов.
- Требуется предоставить библиотеку объектов, раскрывая только их интерфейсы, но не реализацию.

## Строитель (Builder)

Строитель (англ. Builder) — порождающий шаблон проектирования предоставляет способ создания составного объекта.

![Диаграмма](https://refactoring.guru/images/patterns/content/builder/ru-BuilderStructure.png "Диаграмма")

[описание](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D0%BE%D0%B8%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

### Цель

Отделяет конструирование сложного объекта от его представления, так что в результате одного и того же процесса конструирования могут получаться разные представления.

### Плюсы

- позволяет изменять внутреннее представление продукта;
- изолирует код, реализующий конструирование и представление;
- дает более тонкий контроль над процессом конструирования.

### Применение

- алгоритм создания сложного объекта не должен зависеть от того, из каких частей состоит объект и как они стыкуются между собой;
- процесс конструирования должен обеспечивать различные представления конструируемого объекта.

Паттерн Строитель предлагает определить и формализовать все шаги конструирования продукта в общем интерфейсе — Строителе.

Чтобы создать продукт, потребуется поочерёдно вызывать методы класса, реализующего интерфейс Строителя.

В программе может быть несколько видов Строителей, при условии, что все они реализуют общий интерфейс. Они могут по-разному реализовывать шаги строительства (например, делать стены из камня, бронированные двери и прочее). За счёт общего интерфейса, их можно взаимозаменять, чтобы получать продукты с разными свойствами.

Чтобы не загромождать клиентский код вызовами методов Строителя, можно ввести промежуточный класс Директор. В этом случае Директор будет отвечать за порядок вызова шагов, а Строитель — за реализацию этих шагов.

### Шаги реализации

- Убедитесь в том, что у вас есть общие шаги построения продукта, а также вариации шагов, которые приводят к созданию различных представлений продуктов.
- Создайте интерфейс Строителя, с шагами для производства всех возможных представлений продуктов.
- Создайте классы Конкретных строителей для каждого из представлений. Реализуйте их шаги строительства.
- Подумайте о создании класса Директора. Его методы будут создавать различные конфигурации продуктов, вызывая разные шаги одного и того же строителя.
- Клиентский код должен создавать и объекты-Строители и объекты-Директоры. Строители подаются либо в конструктор Директора, либо в его строительный метод.
- Чтобы начать строительство, клиент должен вызывать метод объекта-Директора.
- Результат строительства можно вернуть из Директора, но только если все продукты имеют общий интерфейс. В обратном случае, каждый Строитель должен иметь собственный метод получения результата.

У нас есть интерфейс который должен быть реализован. Данный интерфейс предоставляет методы для построения какого - то объекта и они будут общие для всех наследников.

    public interface Builder {
        void buildSystemBlock(String systemBlock);
        void buildDisplay(String display);
        void buildManipulators(String manipulator);
    }
    
Класс реализующий интерфейс также имеет метод создающий и возвращающий продукт (это могут быть разные методы).
    
    public Computer getComputer() {
            return new Computer(display, systemBlock, manipulator);
        }
        
Для удобства создания мы используем класс Директор в котором реализуем методы и конструируем наш объект.

    public void constructCheapComputer(Builder builder) {
        builder.buildDisplay("Samsung");
        builder.buildSystemBlock("Everest");
        builder.buildManipulators("mouse + keyboard");
    }
    
    
 ## Адаптер (Adapter)

 Адаптер (англ. Adapter) — структурный шаблон проектирования, предназначенный для организации использования функций объекта, недоступного для модификации, через специально созданный интерфейс.
 
 ![Диаграмма](https://refactoring.guru/images/patterns/content/adapter/ru-AdapterStructure.png "Диаграмма")
 
 [описание](https://ru.wikipedia.org/wiki/%D0%90%D0%B4%D0%B0%D0%BF%D1%82%D0%B5%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

Обеспечивает совместную работу классов с несовместимыми интерфейсами.

### Шаги реализации
- Убедитесь, что у вас есть два класса с неудобными интерфейсами:
    - полезный служебный класс, который вы не можете изменять (он либо сторонний, либо от него зависит другой код);
    - один или несколько классов приложения, несовместимых с этим служебным классом из-за неудобного или несовпадающего интерфейса.
- Опишите клиентский интерфейс, через который классы приложения смогли бы использовать сторонний класс.
- Создайте класс адаптера, реализовав этот интерфейс.
- Поместите в адаптер поле-ссылку на объект служебного класса. В случае простой адаптации этот объект можно передавать через параметры методов адаптера.
- Реализуйте все методы клиентского интерфейса в адаптере. Адаптер должен делегировать основную работу стороннему объекту.
- Приложение должно использовать адаптер только через клиентский интерфейс. Это позволит легко изменять и добавлять адаптеры в будущем.

### Пример JDK
- InputStreamReader(InputStream is)


## Стратегия (Strategy)

Стратегия (англ. Strategy) — поведенческий шаблон проектирования, предназначенный для определения семейства алгоритмов, инкапсуляции каждого из них и обеспечения их взаимозаменяемости. Это позволяет выбирать алгоритм путём определения соответствующего класса. Шаблон Strategy позволяет менять выбранный алгоритм независимо от объектов-клиентов, которые его используют.

![Диаграмма](https://refactoring.guru/images/patterns/content/strategy/ru-StrategyStructure.png "Диаграмма")
 
[описание](https://ru.wikipedia.org/wiki/%D0%90%D0%B4%D0%B0%D0%BF%D1%82%D0%B5%D1%80_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

По типу клиента (или по типу обрабатываемых данных) выбрать подходящий алгоритм, который следует применить. Если используется правило, которое не подвержено изменениям, нет необходимости обращаться к шаблону «стратегия».

Класс, который использует алгоритм (Context), включает абстрактный класс (Strategy), обладающий абстрактным методом, определяющим способ вызова алгоритма. Каждый производный класс реализует один требуемый вариант алгоритма.

Замечание: метод вызова алгоритма не должен быть абстрактным, если требуется реализовать некоторое поведение, принимаемое по умолчанию.

### Шаги реализации
- Определите алгоритм, который подвержен частым изменениям. Также подойдёт алгоритм, имеющий несколько вариаций, которые выбираются во время выполнения программы.
- Создайте интерфейс Стратегии, описывающий этот алгоритм. Он должен быть общим для всех вариантов алгоритма.
- Поместите вариации алгоритма в собственные классы — Конкретные стратегии — которые реализуют этот интерфейс.
- В контексте привязывайтесь к общему интерфейсу алгоритма, а не к конкретным классам реализациям.

У нас есть интерфейс с методом который общий для всех. 

    public interface Strategy {
        int execute(int a, int b);
    }
    
Конкретная стратегия реализует данный метод по своему.

    public class ConcreteStrategyAdd implements Strategy {
        public int execute(int a, int b) {
            return a + b;
        }
    }
    
Также у нас есть класс Context который в setter принимает стратегию и есть метод для выполнения метода стратегии

    public class Context {
        private Strategy strategy;
        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }
        public int strategyExecute(int a, int b){
            return strategy.execute(a, b);
        }
    }
    
## Наблюдатель (Observer)

Наблюдатель (англ. Observer) — поведенческий шаблон проектирования. Также известен как «подчинённые» (Dependents). Создает механизм у класса, который позволяет получать экземпляру объекта этого класса оповещения от других объектов об изменении их состояния, тем самым наблюдая за ними.

![Диаграмма](https://upload.wikimedia.org/wikipedia/commons/8/8a/Observer_UML.png "Диаграмма")

![Диаграмма](https://refactoring.guru/images/patterns/content/observer/ru-ObserverStructure.png "Диаграмма")
 
[описание](https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

Определяет зависимость типа «один ко многим» между объектами таким образом, что при изменении состояния одного объекта все зависящие от него оповещаются об этом событии.

При реализации шаблона «наблюдатель» обычно используются следующие классы:

- Observable — интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
- Observer — интерфейс, с помощью которого наблюдатель получает оповещение; 
- ConcreteObservable — конкретный класс, который реализует интерфейс Observable;
- ConcreteObserver — конкретный класс, который реализует интерфейс Observer.

### Область применения
Шаблон «наблюдатель» применяется в тех случаях, когда система обладает следующими свойствами:

- существует, как минимум, один объект, рассылающий сообщения;
- имеется не менее одного получателя сообщений, причём их количество и состав могут изменяться во время работы приложения;
- нет надобности очень сильно связывать взаимодействующие объекты, что полезно для повторного использования.
Данный шаблон часто применяют в ситуациях, в которых отправителя сообщений не интересует, что делают получатели с предоставленной им информацией.

### Шаги реализации
- Разбейте вашу функциональность на две части: независимое ядро и опциональные зависимые части.
- Независимое ядро станет Издателем. Зависимые части станут Подписчиками.
- Создайте интерфейс Подписчика. В большинстве случаев, достаточно определить один метод update().
- Создайте интерфейс Издателя и опишите в нём операции управления подпиской. Помните, что издатель должен работать только с общим интерфейсом Подписчиков. Вы можете объявить базовый издатель абстрактным классом. В этом случае, в него можно поместить реализацию подписки по умолчанию.
- Создайте или измените классы Конкретных издателей так, чтобы при каждом изменении состояния, они слали оповещения всем своим подписчикам.
- Реализуйте метод оповещения в Конкретных подписчиках. Издатель может отправлять какие-то данные вместе с оповещением (например, в параметрах). Возможен и другой вариант, когда подписчик, получив оповещение, сам берёт из объекта издателя нужные данные. Но при этом подписчик привяжет себя к конкретному классу издателя.
- Клиент создаёт необходимое количество объектов подписчиков и регистрирует их у издателей.

Observer - наблюдатель

    public interface Observer {
        void update(float temperature, int pressure);
    }
    
Observable - наблюдаемый(за кем наблюдают)

    public interface Observable {
        void registerObserver(Observer o);
        void removeRegister(Observer o);
        void notifyObservers();
    }
    
## Итератор (Iterator)

Iterator — поведенческий шаблон проектирования. Представляет собой объект, позволяющий получить последовательный доступ к элементам объекта-агрегата без использования описаний каждого из агрегированных объектов.

![Диаграмма](https://refactoring.guru/images/patterns/content/iterator/ru-IteratorStructure.png "Диаграмма")
 
[описание](https://refactoring.guru/ru/design-patterns/iterator)

Даёт возможность последовательно обходить все элементы составного объекта, не раскрывая его внутреннего представления.

## Шаги реализации
- Создайте общий интерфейс Итераторов. Обычно там живут такие операции:  первыйЭлемент, следующийЭлемент, текущийЭлемент, естьЛиЕщеЭлементы.
- Создайте интерфейс Коллекции и опишите в нём метод получитьИтератор, который должен возвращать объект Итератор.
- Создайте классы Конкретных итераторов для тех коллекций, в которых нужно обходить элементы.
- Реализуйте методы получитьИтератор в конкретных классах коллекций. Они должны создавать новый итератор того класса, который способен работать с данным типом коллекции. Коллекция должна передавать собственную ссылку в созданный итератор.
- В клиентском коде и в классах коллекций не должно остаться кода обхода элементов.

Клиент должен будет получать новый итератор из объекта коллекции каждый раз когда ему нужно пройтись по элементам списка.

## Часто используется
- Коллекции

## Заместитель (proxy)

Заместитель (англ. Proxy) — структурный шаблон проектирования, который предоставляет объект, который контролирует доступ к другому объекту, перехватывая все вызовы (выполняет функцию контейнера).

![Диаграмма](https://refactoring.guru/images/patterns/content/proxy/ru-ProxyStructure.png "Диаграмма")
 
[описание](https://ru.wikipedia.org/wiki/Proxy_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))

Шаблон Proxy может применяться в случаях работы с сетевым соединением, с огромным объектом в памяти (или на диске) или с любым другим ресурсом, который сложно или тяжело копировать. Хорошо известный пример применения — объект, подсчитывающий число ссылок.

Оборачивает полезный объект или сервис специальным объектом-заменителем, который «притворяется» оригиналом и перехватывает все вызовы к нему, а затем после некоторой обработки, направляет их обёрнутому объекту.

### Прокси и близкие к нему шаблоны
- Адаптер обеспечивает отличающийся интерфейс к объекту.
- Прокси обеспечивает тот же самый интерфейс.
- Декоратор обеспечивает расширенный интерфейс.

## Шаги реализации
- Определите интерфейс, который бы сделал заместитель и оригинальный объект взаимозаменямыми.
- Подумайте о введении фабрики, которая решала бы какой из объектов создавать — заместитель или реальный сервисный объект.
- Создайте класс заместителя. Он должен содержать ссылку на сервисный объект.
- Реализуйте методы заместителя в зависимости от его предназначения. В большинстве случаев, проделав какую-то полезную работу, методы заместителя должны передать запрос сервисному объекту.
- Подумайте, не реализовать ли вам ленивую инициализацию сервисного объекта при первом обращении клиента к методам заместителя.

У нас есть общий интерфейс для реального класса и для прокси

    public interface IMath {
        double add(double x, double y);
        double mul(double x, double y);
    }
Класс прокси вызывает методы реального класса

    public class ProxyMath implements IMath {
        private Math math;
        public double add(double x, double y) {
            if (math == null)
                math = new Math();
    
            return math.add(x, y);
        }
    }
    
Реальный класс выглядит примерно так
    
    public class Math implements IMath {
        public double add(double x, double y) {
            return x + y;
        }
    }
    
## Посредник (Mediator)

Посредник (англ. Mediator) — поведенческий шаблон проектирования, обеспечивающий взаимодействие множества объектов, формируя при этом слабую связанность и избавляя объекты от необходимости явно ссылаться друг на друга.

![Диаграмма](https://upload.wikimedia.org/wikipedia/commons/e/e4/Mediator_design_pattern.png "Диаграмма")
 
[описание](https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D1%81%D1%80%D0%B5%D0%B4%D0%BD%D0%B8%D0%BA_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))
[ссылка на видео](https://www.youtube.com/watch?v=ZnyNsrcLl2I)

"Посредник" определяет интерфейс для обмена информацией с объектами "Коллеги", "Конкретный посредник" координирует действия объектов "Коллеги". Каждый класс "Коллеги" знает о своем объекте "Посредник", все "Коллеги" обмениваются информацией только с посредником, при его отсутствии им пришлось бы обмениваться информацией напрямую. "Коллеги" посылают запросы посреднику и получают запросы от него. "Посредник" реализует кооперативное поведение, пересылая каждый запрос одному или нескольким "Коллегам".

## Шаги реализации
- Найдите группу тесно переплетённых классов или объектов, отвязав которые друг от друга, можно получить некоторую пользу. Например, чтобы повторно использовать их код в другой программе.
- Создайте общий интерфейс Посредников и опишите в нём методы для взаимодействия с Компонентами. В простейшем случае достаточно одного метода для получения оповещений от компонентов.
- Реализуйте этот интерфейс в классе Конкретного посредника. Поместите в него поля, которые будут содержать ссылки на все объекты компонентов.
- Переместите код создания компонентов в класс Конкретного посредника. Посредник должен передавать себя в конструктор компонента.
- Измените код компонентов так, чтобы они вызывали метод оповещения посредника, а не методы других компонентов. С другого конца, посредник должен вызывать методы нужного компонента, когда получает оповещение.

У нас есть абстрактный класс коллег у которых в конструктор передается медиатор

    public abstract class Colleague {
        protected Mediator mediator;
        public Colleague(Mediator mediator) {
            this.mediator = mediator;
        }
        public void send(String message) {
            mediator.send(message, this);
        }
        public abstract void notify(String message);
    }
    
Есть абстрактный класс Медиатора c методом уведомления и указания конкретного Коллеги
    
    public abstract class Mediator {
        public abstract void send(String message, Colleague colleague);
    }
    
Когда коллеги отправляют письмо, оно отправляется через mediator (вызывается метод Медиатора) а также передается коллега который вызывает метод

## Команда (Command)

Команда (англ. Command) — поведенческий шаблон проектирования, используемый при объектно-ориентированном программировании, представляющий действие. Объект команды заключает в себе само действие и его параметры.

![Диаграмма](https://upload.wikimedia.org/wikipedia/ru/0/0c/Command.gif "Диаграмма")
 
[описание](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D0%B0_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F))
[ссылка на видео](https://www.youtube.com/watch?v=T3oXyVYmkyY)

Превращает операцию в объект. Это позволяет передавать операции как аргументы при вызове методов, ставить операции в очередь, логировать их, а также поддерживать отмену операций.

Создание структуры, в которой класс-отправитель и класс-получатель не зависят друг от друга напрямую. Организация обратного вызова к классу, который включает в себя класс-отправитель.

## Шаги реализации

- Определите какие классы в вашей программе должны играть роль Отправителей и Получателей. Обычно, Отправителем будет один из классов пользовательского интерфейса, а Получателем — класс бизнес-логики.
- Создайте общий интерфейс Команд. В нём должен быть определён метод выполнить.
- Создайте классы Конкретных команд и реализуйте методы их общего интерфейса.
- Добавьте в Конкретнуя команду поле для хранения объекта Получателя, если таковой нужен для её работы.
- Добавьте в классы Отправителей поля для хранения Команд. Измените Отправителей так, чтобы они делегировали команде реакцию на действие пользователя.
- В основном коде приложение, создавайте объекты Конкретных команд, подавая в них нужных Получателей. Затем, создавайте объекты Отправителей, подавая в них созданные Команды.
