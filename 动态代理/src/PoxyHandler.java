import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PoxyHandler<T> implements InvocationHandler {

    T object;

    PoxyHandler(T object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        Object result = method.invoke(object, args);
        return result;
    }
}
