package abstract_factory.product;

/**
 * Created by aandreev on 04.04.2017.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println(getClass().getName());
    }
}
