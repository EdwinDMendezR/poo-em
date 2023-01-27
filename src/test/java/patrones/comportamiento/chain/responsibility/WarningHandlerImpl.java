package patrones.comportamiento.chain.responsibility;

public class WarningHandlerImpl  implements ErrorHandler {
    private ErrorHandler nextHandler;

    @Override
    public void handleError(Error error) {
        if (error.getSeverity() == Error.Severity.WARNING) {
            System.out.println("WarningHandlerImpl:manejar error de advertencia");
        } else {
            nextHandler.handleError(error);
        }
    }

    @Override
    public void setNextHandler(ErrorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
