package academy.devdojo.maratonajava.javacore.modificadorestatico.tests;

import academy.devdojo.maratonajava.javacore.modificadorestatico.dominio.Carro;

public class Test {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca", 200);
        Carro c2 = new Carro("Civic", 300);
        Carro c3 = new Carro("Ferrari", 400);

        Carro.setVelocidadeLimite(180); // Alterando a velocidade limite para todos os carros

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
