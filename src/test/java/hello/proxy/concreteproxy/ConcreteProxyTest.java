package hello.proxy.concreteproxy;

import hello.proxy.concreteproxy.code.ConcreteClient;
import hello.proxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {


    @Test
    void noProxy() {
        ConcreteClient client = new ConcreteClient(new ConcreteLogic());
        client.execute();
    }

    @Test
    void addProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }
}
