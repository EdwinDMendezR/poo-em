package patrones.procesos.workflow;

import org.junit.jupiter.api.Test;

public class WorkflowPattern {

    @Test
    public void methodTest() {

        // Arrange
        Workflow workflow = new Workflow();
        workflow.addStep(new ApprovalStep());
        workflow.addStep(new PaymentStep());
        workflow.run();

        // Act

        // Assert

    }

}
