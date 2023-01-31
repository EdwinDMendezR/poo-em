package patrones.procesos.workflow;

public class PaymentStep  implements WorkflowStep {
    @Override
    public void execute() {
        System.out.println("Making the payment");
    }
}
