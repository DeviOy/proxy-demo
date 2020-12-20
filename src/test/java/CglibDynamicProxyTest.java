import org.junit.Test;
import proxy.CglibDynamicProxy;
import proxy.CglibDynamicProxyFactory;
import service.HelloService;
import service.impl.HelloServiceImpl;

/**
 * @author : ylz
 * @date : 2020/12/20 17:03
 */
public class CglibDynamicProxyTest {
    @Test
    public void CglibDynamicProxy(){
        CglibDynamicProxy  cglibDynamicProxy=new CglibDynamicProxy(new HelloServiceImpl());
        CglibDynamicProxyFactory cglibDynamicProxyFactory=new CglibDynamicProxyFactory(cglibDynamicProxy);
        HelloService helloServiceProxy= (HelloService) cglibDynamicProxyFactory.getProxy();
        helloServiceProxy.hello();
    }
}
