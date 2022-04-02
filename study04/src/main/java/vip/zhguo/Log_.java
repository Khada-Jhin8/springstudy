package vip.zhguo;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log_ implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("springAOP进来了");
    }
}
