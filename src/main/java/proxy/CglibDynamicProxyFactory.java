package proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author : ylz
 * @date : 2020/12/20 17:01
 */
public class CglibDynamicProxyFactory {
    private CglibDynamicProxy cglibDynamicProxy;

    public CglibDynamicProxyFactory(CglibDynamicProxy cglibDynamicProxy) {
        this.cglibDynamicProxy = cglibDynamicProxy;
    }

    public Object getProxy(){
        Enhancer enhancer=new Enhancer();
        enhancer.setInterfaces(cglibDynamicProxy.getTarget().getClass().getInterfaces());
        enhancer.setCallback(cglibDynamicProxy);
        return enhancer.create();
    }
}
