import java.lang.reflect.Proxy;

/**
 * @author wangdong
 */
public class SimpleAOP {
    /**
     * 生成动态代理
     *
     * @param bean
     * @param advice
     * @return
     */
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
