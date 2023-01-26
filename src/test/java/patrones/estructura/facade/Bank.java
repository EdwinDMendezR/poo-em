package patrones.estructura.facade;


public class Bank {

    public void verify() {
        System.out.println("verifica que el número de cuenta y la cantidad sean válidos");
    }

    public void getBalance() {
        System.out.println("devuelve el saldo de la cuenta especificada");
    }

    public void withdraw() {
        System.out.println("retira una cantidad específica de una cuenta");
    }

    public void deposit() {
        System.out.println("deposita una cantidad específica en una cuenta");
    }

}
