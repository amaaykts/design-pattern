package observer;

/**
 * Created by aandreev on 05.04.2017.
 */
/**Интерфейс для подписки, отписки и уведомления*/
public interface Observable {
    void registerObserver(Observer o);

    void removeRegister(Observer o);

    void notifyObservers();
}
