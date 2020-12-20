package proxy;

import java.lang.reflect.Proxy;

/**
 * Date:2020/12/20 16:13
 * Description:
 * @author ylz
 */
public class JdkDynamicProxyFactory {
    private JdkDynamicProxy jdkDynamicProxy;

    public JdkDynamicProxyFactory(JdkDynamicProxy jdkDynamicProxy) {
        this.jdkDynamicProxy = jdkDynamicProxy;
    }

    public Object getProxy(){
        Object target=jdkDynamicProxy.getTarget();
        return Proxy.newProxyInstance(jdkDynamicProxy.getClass().getClassLoader(),target.getClass().getInterfaces(),jdkDynamicProxy);
    }
}
