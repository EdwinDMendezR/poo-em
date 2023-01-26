package patrones.estructura.proxy;

public class RemoteObjectImpl implements RemoteObject {

    @Override
    public String remoteMethod() {
        return "RemoteObjectImpl::remoteMethod";
    }

}
