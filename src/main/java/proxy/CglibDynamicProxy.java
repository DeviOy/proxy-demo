package proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : ylz
 * @date : 2020/12/20 16:42
 */
public class CglibDynamicProxy implements MethodInterceptor {
    private  Object target;

    public CglibDynamicProxy(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("你好，我是小王！");
        Object result=method.invoke(target, objects);
        System.out.println("好的，下次家里聊！");
        return result;
    }
}
