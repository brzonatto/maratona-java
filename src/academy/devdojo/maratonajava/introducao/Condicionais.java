package academy.devdojo.maratonajava.introducao;

public class Condicionais {
    public static void main(String[] args) {
        System.out.println("Condicionais em Java");

        // Estruturas condicionais: if, else if, else, switch

        int idade = 20;

        // Exemplo de if-else
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        // Exemplo de switch
        String dia = "Segunda";

        switch (dia) {
            case "Segunda":
                System.out.println("Hoje é segunda-feira");
                break;
            case "Terça":
                System.out.println("Hoje é terça-feira");
                break;
            case "Quarta":
                System.out.println("Hoje é quarta-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        // Exemplo de operador ternário
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado do operador ternário: " + resultado);        
    }
}
