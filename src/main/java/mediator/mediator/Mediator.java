package mediator.mediator;

import mediator.components.Colleague;

/**
 * Created by aandreev on 05.04.2017.
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

