package patrones.procesos.workflow;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List<WorkflowStep> steps = new ArrayList<>();

    public void addStep(WorkflowStep step) {
        steps.add(step);
    }

    public void run() {
        for (WorkflowStep step : steps) {
            step.execute();
        }
    }
}
