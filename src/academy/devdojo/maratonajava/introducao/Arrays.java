package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays em Java");

        // Declaração e inicialização de arrays
        int[] numeros = new int[5]; // Array de inteiros com 5 elementos
        String[] nomes = {"Alice", "Bob", "Charlie"}; // Array de strings com 3 elementos

        // Atribuição de valores ao array de inteiros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 10; // Atribui múltiplos de 10
        }        

        // Impressão dos valores do array de inteiros
        System.out.println("Valores do array de inteiros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Impressão dos valores do array de strings
        System.out.println("Valores do array de strings:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
