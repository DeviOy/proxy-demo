import org.junit.Test;
import service.impl.HelloServiceImpl;
import service.impl.HelloServiceStaticProxy;

public class StaticProxyTest {
    @Test
    public void staticProxy(){
        HelloServiceStaticProxy helloServiceStaticProxy=new HelloServiceStaticProxy(new HelloServiceImpl());
        helloServiceStaticProxy.hello();
    }
}
