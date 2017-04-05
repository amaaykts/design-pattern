package observer;

/**
 * Created by aandreev on 05.04.2017.
 */
/**Интерфейс для уведомления подписчиков*/
public interface Observer {
    void update(float temperature, int pressure);
}
