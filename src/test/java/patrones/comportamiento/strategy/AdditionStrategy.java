package patrones.comportamiento.strategy;

public class AdditionStrategy implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
