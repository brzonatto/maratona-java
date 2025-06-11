package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operadores em Java");

        // Operadores Aritméticos
        int a = 10;
        int b = 20;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (b / a));
        System.out.println("Módulo: " + (b % a));

        // Operadores de Atribuição
        int c = 5;
        c += 2; // c = c + 2
        System.out.println("Atribuição com adição: " + c);
        c -= 1; // c = c - 1
        System.out.println("Atribuição com subtração: " + c);
        c *= 3; // c = c * 3
        System.out.println("Atribuição com multiplicação: " + c);
        c /= 2; // c = c / 2
        System.out.println("Atribuição com divisão: " + c);
        c %= 2; // c = c % 2
        System.out.println("Atribuição com módulo: " + c);
        
        // Operadores Unários
        int d = 5;
        System.out.println("Pré-incremento: " + (++d)); // Incrementa antes de usar
        System.out.println("Pós-incremento: " + (d++)); // Usa e depois incrementa
        System.out.println("Valor após pós-incremento: " + d);
        System.out.println("Pré-decremento: " + (--d)); // Decrementa antes de usar
        System.out.println("Pós-decremento: " + (d--)); // Usa e depois decrementa
        System.out.println("Valor após pós-decremento: " + d);
        
        // Operadores de Comparação
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Desigualdade: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        
        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("E lógico: " + (x && y));
        System.out.println("Ou lógico: " + (x || y));
        System.out.println("Não lógico onde x é true: " + !x);
        
        // Operador Ternário
        String resultado = (a > b) ? "A é maior que B" : "A é menor ou igual a B";
        System.out.println(resultado);
    }
}
