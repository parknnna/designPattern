package structural.proxyPattern;

public class ProxyFactory {
    public Subject getObject() {
        return new Proxy(new RealSubject());
    }
}