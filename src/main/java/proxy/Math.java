package proxy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class Math implements IMath {
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double mul(double x, double y) {
        return x * y;
    }
}
