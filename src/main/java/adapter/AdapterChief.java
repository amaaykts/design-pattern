package adapter;

/**
 * Created by aandreev on 05.04.2017.
 */
public class AdapterChief implements Chief {
    private Plumber plumber = new Plumber();

    @Override
    public void makeBreakfast() {
        plumber.getKey();
    }

    @Override
    public void makeDinner() {
        plumber.getPipe();
    }

    @Override
    public void makeSupper() {
        plumber.getScrewDriver();
    }
}
