package academy.devdojo.maratonajava.introducao;

public class Repeticao {
    public static void main(String[] args) {
        System.out.println("Repetição em Java");

        // Estruturas de repetição: for, while, do-while

        // Exemplo de for
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i no for: " + i);
        }

        for (int i = 0; i < 50; i++) {            
            System.out.println("Valor de i no for: " + i);
            if (i == 25) {
                System.out.println("Chegou no meio do loop, encerra o loop");
                break; // Para o loop quando i é 25
            }
        }

        for (int i = 0; i < 50; i++) {            
            System.out.println("Valor de i no for: " + i);
            if (i > 25) {
                System.out.println("Chegou no meio do loop, pulando para o próximo");
                continue; // quando i for maior que 25 volta para o inicio do loop, ignorando o restante do código
            }
            System.out.println("Este código só é executado se i for menor ou igual a 25");
        }

        // Exemplo de while
        int j = 0;
        while (j < 5) {
            System.out.println("Valor de j no while: " + j);
            j++;
        }

        // Exemplo de do-while
        int k = 0;
        do {
            System.out.println("Valor de k no do-while: " + k);
            k++;
        } while (k < 5);
    }
}
