package patrones.estructura.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProxyPattern {

    @Test
    public void methodTest() {

        // Arrange
        RemoteObject remoteObject = new RemoteObjectProxy(new RemoteObjectImpl());

        // Act
        // Assert
        Assertions.assertEquals("RemoteObjectImpl::remoteMethod", remoteObject.remoteMethod());

    }

}
