package academy.devdojo.maratonajava.javacore.sobrecargametodos.tests;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class Test {
    public static void main(String[] args) {
        Anime a1 = new Anime("Attack on Titan", "Ação", 12);
        System.out.println(a1.toString());
    }   
}
