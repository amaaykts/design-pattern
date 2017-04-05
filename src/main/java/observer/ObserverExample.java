package observer;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ObserverExample {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        Observer observer = new CurrentConditionsDisplay(data);
        data.setMeasurements(29f, 745);
        data.setMeasurements(39f, 760);
        data.setMeasurements(42f, 763);
    }
}
