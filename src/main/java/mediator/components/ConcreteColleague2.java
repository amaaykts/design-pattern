package mediator.components;

import mediator.components.Colleague;
import mediator.mediator.Mediator;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}
