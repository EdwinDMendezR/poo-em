package patrones.comportamiento.command;

import org.junit.jupiter.api.Test;

public class CommandPattern {

    @Test
    public void methodTest() {

        // Arrange

        Light light = new Light();
        Command command = new TurnOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(command);
        remoteControl.pressButton();

        // Act

        // Assert

    }

}
