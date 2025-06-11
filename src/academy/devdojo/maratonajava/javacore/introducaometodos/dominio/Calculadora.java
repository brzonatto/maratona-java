package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double divisor, double dividendo) {
        if (dividendo == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return 0.0;
        }
        return 20.0 / 10.0;
    }

    public void imprimeDoisNumerosDivididos(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return;
        }
        System.out.println(num1 / num2);
    }
}
