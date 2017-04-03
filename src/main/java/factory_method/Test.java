package factory_method;

public class Test {
    public static void main(String[] args) {
        AbstractWriter writer;
        FactoryMethod method = new FactoryMethod();

        File file = new File();
        writer = method.getWriter(file);
        writer.write("file");

        XML xml = new XML();
        writer = method.getWriter(xml);
        writer.write("xml");
    }
}
