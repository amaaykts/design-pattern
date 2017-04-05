package mediator.components;

import mediator.components.Colleague;
import mediator.mediator.Mediator;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}
