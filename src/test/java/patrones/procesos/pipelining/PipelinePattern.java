package patrones.procesos.pipelining;

import org.junit.jupiter.api.Test;

public class PipelinePattern {

    @Test
    public void methodTest() {

        // Arrange
        Pipeline pipeline = new Pipeline();
        pipeline.add(new DataFilter());
        pipeline.add(new DataTransform());
        pipeline.add(new DataStore());

        pipeline.run(100);

        // Act

        // Assert

    }

}
