package polimorfismo.sobrecarga;

public class PolimorfismoSobreCarga {

    class Example {

        public void print(int x) {
            System.out.println("Printing int: " + x);
        }

        public void print(double x) {
            System.out.println("Printing double: " + x);
        }

        public void print(String x) {
            System.out.println("Printing String: " + x);
        }

    }

}
