import java.lang.reflect.Proxy;

public class PoxyTest {

    public static void main(String[] args) {
        IPerson woman = new Woman("大猪蹄子" , 1000000000);
        PoxyHandler<IPerson> womanPoxyHandler = new PoxyHandler<IPerson>(woman);
        IPerson womanProxy = (IPerson) Proxy.newProxyInstance(IPerson.class.getClassLoader(), new Class<?>[]{IPerson.class}, womanPoxyHandler);
        womanProxy.handleMoney();
    }
}
