package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Myproxy implements InvocationHandler {
    private Object target;

    public Myproxy() {
    }

    public Myproxy(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理类方法增强在此处理");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
