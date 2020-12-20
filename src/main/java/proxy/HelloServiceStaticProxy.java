package proxy;

import service.HelloService;

public class HelloServiceStaticProxy implements HelloService {
    private  HelloService helloService;

    public HelloServiceStaticProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    public void hello() {
        System.out.println("你好，我是小王");
        this.helloService.hello();
        System.out.println("好的，下次家里聊！");
    }

}
