package academy.devdojo.maratonajava.javacore.associacao.tests;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class Test {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Ronaldo");
        Jogador j2 = new Jogador("Ronaldinho");
        Jogador j3 = new Jogador("Messi");

        Jogador[] jogadores = {j1, j2, j3};

        Time t1 = new Time("Barcelona", jogadores);

        t1.imprime();

        Professor p1 = new Professor("Carlos");
        Professor p2 = new Professor("Ana");
        Professor p3 = new Professor("Maria");

        Professor[] professores = {p1, p2, p3};

        Escola e1 = new Escola("Escola A", professores);

        e1.imprime();
    }
}
