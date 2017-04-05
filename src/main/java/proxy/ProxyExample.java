package proxy;

/**
 * Created by aandreev on 05.04.2017.
 */
public class ProxyExample {
    public static void main(String[] args) {
        IMath iMath = new ProxyMath();
        System.out.println(iMath.add(1,2));
        System.out.println(iMath.mul(2,3));
    }
}
