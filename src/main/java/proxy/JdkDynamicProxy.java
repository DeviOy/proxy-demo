package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : ylz
 * @date : 2020/12/20 16:0
 */
public class JdkDynamicProxy implements InvocationHandler {
    private Object target;

    public JdkDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("你好，我是小王");
        Object result=method.invoke(target,objects);
        System.out.println("好的，下次家里聊！");
        return result;
    }
}
