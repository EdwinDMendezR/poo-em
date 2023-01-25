package patrones.estructura.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterPattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        AdapterA adapterA = new AdapterA();
        Target target = new Adapter(adapterA);
        // Assert
        Assertions.assertEquals("Adapter Message SchemaspecificRequest", target.request());
    }

}
