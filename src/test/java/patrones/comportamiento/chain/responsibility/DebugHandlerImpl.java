package patrones.comportamiento.chain.responsibility;

public class DebugHandlerImpl implements ErrorHandler {
    private ErrorHandler nextHandler;

    @Override
    public void handleError(Error error) {
        if (error.getSeverity() == Error.Severity.DEBUG) {
            System.out.println("DebugHandlerImpl:manejar error de advertencia");
        } else {
            nextHandler.handleError(error);
        }
    }

    @Override
    public void setNextHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}