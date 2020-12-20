import org.junit.Test;
import service.impl.HelloServiceImpl;
import proxy.HelloServiceStaticProxy;

public class StaticProxyTest {
    @Test
    public void staticProxy(){
        HelloServiceStaticProxy helloServiceStaticProxy=new HelloServiceStaticProxy(new HelloServiceImpl());
        helloServiceStaticProxy.hello();
    }
}
