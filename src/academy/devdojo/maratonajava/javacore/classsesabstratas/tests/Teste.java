package academy.devdojo.maratonajava.javacore.classsesabstratas.tests;

import academy.devdojo.maratonajava.javacore.classsesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classsesabstratas.dominio.Gerente;

public class Teste {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Carlos", 5000, "TI");
        System.out.println(g1);

        Desenvolvedor d1 = new Desenvolvedor("Ana", 4000, "Java");
        System.out.println(d1);
    }
}
