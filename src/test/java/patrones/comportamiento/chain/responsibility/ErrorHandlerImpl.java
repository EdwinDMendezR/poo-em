package patrones.comportamiento.chain.responsibility;

public class ErrorHandlerImpl implements ErrorHandler {

    private ErrorHandler nextHandler;

    @Override
    public void handleError(Error error) {
        if (error.getSeverity() == Error.Severity.CRITICAL) {
            System.out.println("ErrorHandlerImpl:manejar error de advertencia");
        } else {
            nextHandler.handleError(error);
        }
    }

    @Override
    public void setNextHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
