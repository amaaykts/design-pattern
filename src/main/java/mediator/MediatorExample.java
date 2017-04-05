package mediator;

import mediator.components.ConcreteColleague1;
import mediator.components.ConcreteColleague2;
import mediator.mediator.ConcreteMediator;

/**
 * Created by aandreev on 05.04.2017.
 */
public class MediatorExample {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}
