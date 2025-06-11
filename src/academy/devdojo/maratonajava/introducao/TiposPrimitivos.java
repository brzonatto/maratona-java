package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos Primitivos em Java");

        // int, long, short, byte, float, double, char, boolean
        
        int inteiro = 10;
        long inteiroLongo = 100000L;
        double decimalLongo = 2000.0;
        float decimal = 2500.0F;
        byte inteiroPequeno = 10;
        short inteiroCurto = 100;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';

        System.out.println("Valor do inteiro: " + inteiro);
        System.out.println("Valor do inteiro longo: " + inteiroLongo);
        System.out.println("Valor do decimal longo: " + decimalLongo);
        System.out.println("Valor do decimal: " + decimal);
        System.out.println("Valor do inteiro pequeno: " + inteiroPequeno);
        System.out.println("Valor do inteiro curto: " + inteiroCurto);
        System.out.println("Valor do booleano verdadeiro: " + verdadeiro);
        System.out.println("Valor do booleano falso: " + falso);
        System.out.println("Valor do caracter: " + caracter);

        // Casting de tipos primitivos
        // Conversão implícita
        int numeroInt = 100;
        long numeroLongo = numeroInt;
        float numeroFloat = numeroInt;
        double numeroDouble = numeroInt;
        System.out.println("Número int: " + numeroInt);
        System.out.println("Número longo: " + numeroLongo);
        System.out.println("Número float: " + numeroFloat);
        System.out.println("Número double: " + numeroDouble);
        
        // Conversão explícita (casting)
        double numeroDecimal = 9.78;
        int numeroInteiro = (int) numeroDecimal; // Conversão de double para int
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número inteiro após casting: " + numeroInteiro);

        // String (Não é um tipo primitivo, mas é como um tipo primitivo em Java)
        String texto = "Olá, DevDojo!";
        System.out.println("Texto: " + texto);

        // Exercício:
        String nome = "Brunno";
        String endereco = "Rua Coronel Feijó, 165/205";
        double salario = 6500.00;
        String dataRecebimentoSalario = "08/06/2025";

        String textoExercicio = "Eu " + nome + ", morando no endereço " + endereco + 
                                ", confirmo que recebi o salário R$" + salario + 
                                " na data " + dataRecebimentoSalario + ".";

        System.out.println(textoExercicio);
    }
}
