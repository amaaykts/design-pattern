package observer;

/**
 * Created by aandreev on 05.04.2017.
 */
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private int pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Сейчас значения:%.1f градусов цельсия. Давление %d мм рт. ст.\n", temperature, pressure);
    }
}
