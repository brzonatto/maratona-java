package academy.devdojo.maratonajava.javacore.polimorfismo.tests;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculadoraDeImposto;

public class Teste {
    public static void main(String[] args) {
        Computador c1 = new Computador("Dell Inspiron", 3000.00);
        Tomate t1 = new Tomate("Tomate Italiano", 5.00, "2023-12-31");
        Televisao tv1 = new Televisao("Samsung 55'", 2500.00);

        CalculadoraDeImposto.calcularImposto(c1);
        CalculadoraDeImposto.calcularImposto(t1);
        CalculadoraDeImposto.calcularImposto(tv1);

        Produto p1 = new Tomate("Brasileiro", 3500.00, "2024-01-01");

        CalculadoraDeImposto.calcularImposto(p1);
        
    }
}
