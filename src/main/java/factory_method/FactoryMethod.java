package factory_method;


/**
 * Created by aandreev on 03.04.2017.
 */
public class FactoryMethod {
    public AbstractWriter getWriter(Object o) {
        AbstractWriter writer = null;
        if (o instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (o instanceof XML) {
            writer = new ConcreteXMLWriter();
        }
        return writer;
    }
}
