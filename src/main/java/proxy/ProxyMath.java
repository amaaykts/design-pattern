package proxy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ProxyMath implements IMath {
    private Math math;

    @Override
    public double add(double x, double y) {
        if (math == null)
            math = new Math();

        return math.add(x, y);
    }

    @Override
    public double mul(double x, double y) {
        if (math == null)
            math = new Math();

        return math.mul(x, y);
    }
}
