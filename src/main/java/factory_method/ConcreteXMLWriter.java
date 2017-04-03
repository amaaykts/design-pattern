package factory_method;

/**
 * Created by aandreev on 03.04.2017.
 */
public class ConcreteXMLWriter extends AbstractWriter {
    @Override
    public void write(Object o) {
        System.out.println(o.toString());
    }
}
