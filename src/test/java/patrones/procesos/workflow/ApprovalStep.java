package patrones.procesos.workflow;

public class ApprovalStep implements WorkflowStep {
    @Override
    public void execute() {
        System.out.println("Approving the task");
    }
}
