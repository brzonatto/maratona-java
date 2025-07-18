package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraDeImposto {
    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("Relatório do Produto: ");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Imposto: " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Validade: " + tomate.getValidade());
        } else if (produto instanceof Televisao) {
            System.out.println("Este é um produto de eletrônicos.");
        } else if (produto instanceof Computador) {
            System.out.println("Este é um computador.");
        }
    }
}
