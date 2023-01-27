package patrones.comportamiento.chain.responsibility;

public class Error {

    public enum Severity {
        CRITICAL, WARNING, DEBUG
    }

    private Severity severity;
    private String message;

    public Error(Severity severity, String message) {
        this.severity = severity;
        this.message = message;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

}
