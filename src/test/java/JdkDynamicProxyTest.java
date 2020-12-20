import org.junit.Test;
import proxy.JdkDynamicProxy;
import proxy.JdkDynamicProxyFactory;
import service.HelloService;
import service.impl.HelloServiceImpl;

/**
 * @author : ylz
 * @date : 2020/12/20 16:30
 */
public class JdkDynamicProxyTest {
    @Test
    public void jdkDynamicProxy(){
        JdkDynamicProxy jdkDynamicProxy=new JdkDynamicProxy(new HelloServiceImpl());
        JdkDynamicProxyFactory jdkDynamicProxyFactory=new JdkDynamicProxyFactory(jdkDynamicProxy);
        HelloService helloServiceProxy = (HelloService) jdkDynamicProxyFactory.getProxy();
        helloServiceProxy.hello();
    }
}
