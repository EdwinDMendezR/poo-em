package patrones.comportamiento.chain.responsibility;

public interface ErrorHandler {
    void handleError(Error error);
    void setNextHandler(ErrorHandler nextHandler);
}
