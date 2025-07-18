package academy.devdojo.maratonajava.javacore.modificadorfinal.tests;

import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;

public class Teste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setNome("Fusca");
        System.out.println(c1.getNome());
        System.out.println(Carro.getVelocidadeLimite());
    }
}