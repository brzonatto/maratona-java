package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        System.out.println("Arrays Multidimensionais em Java");

        // Declaração e inicialização de um array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Impressão dos valores do array bidimensional
        System.out.println("Valores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

        // Declaração e inicialização de um array tridimensional
        int[][][] cubo = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        // Impressão dos valores do array tridimensional
        System.out.println("Valores do cubo:");
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println(); // Nova linha após cada linha do cubo
            }
            System.out.println(); // Nova linha após cada camada do cubo
        }
    }
}
