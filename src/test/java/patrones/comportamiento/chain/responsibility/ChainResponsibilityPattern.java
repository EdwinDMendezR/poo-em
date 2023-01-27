package patrones.comportamiento.chain.responsibility;

import org.junit.jupiter.api.Test;

public class ChainResponsibilityPattern {

    @Test
    public void methodTest() {

        // Arrange

        ErrorHandler errorHandler = new ErrorHandlerImpl();
        ErrorHandler warningHandler = new WarningHandlerImpl();
        ErrorHandler debugHandler = new DebugHandlerImpl();

        errorHandler.setNextHandler(warningHandler);
        warningHandler.setNextHandler(debugHandler);

        Error error = new Error(Error.Severity.WARNING, "Error de advertencia");
        errorHandler.handleError(error);
        // Act

        // Assert

    }

}
