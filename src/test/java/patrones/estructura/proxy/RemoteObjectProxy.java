package patrones.estructura.proxy;

public class RemoteObjectProxy implements RemoteObject {

    private RemoteObject remoteObject;

    public RemoteObjectProxy(RemoteObject remoteObject) {
        this.remoteObject = remoteObject;
    }

    @Override
    public String remoteMethod() {
        return remoteObject.remoteMethod();
    }
}
