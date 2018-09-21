public class Main {

    public static void main(String[] args) {
        // write your code here
        IFactory factoryA = new FactoryAImpl();
        System.out.println(factoryA.createProduct().toString());

        IFactory factoryB = new FactoryBImpl();
        System.out.println(factoryB.createProduct().toString());

        IFactory factoryC = new FactoryCImpl();
        System.out.println(factoryC.createProduct().toString());
    }
}
