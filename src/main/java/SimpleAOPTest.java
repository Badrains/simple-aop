/**
 * @author wangdong
 */
public class SimpleAOPTest {

    public static void main(String[] args) {
        //-----切面逻辑
        MethodInvocation logTask = () -> System.out.println("log task start");
        //-----业务逻辑
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        //-----创建Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        //-----为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl, beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();

    }
}
