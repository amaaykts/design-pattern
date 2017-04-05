package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aandreev on 05.04.2017.
 */
public class WeatherData implements Observable {
    private float temperature;
    private int pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeRegister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure);
        }
    }

    public void setMeasurements(float temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
