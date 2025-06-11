package academy.devdojo.maratonajava.javacore.introducaometodos.tests;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class Test {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        c1.somaDoisNumeros();
        c1.subtraiDoisNumeros();

        c1.multiplicaDoisNumeros(5, 5);

        double resultado = c1.divideDoisNumeros(20, 0);
        System.out.println("Resultado da divisão: " + resultado);

        Estudante e1 = new Estudante();
        e1.nome = "João";
        e1.idade = 20;
        e1.sexo = 'M';

        ImpressoraEstudante i1 = new ImpressoraEstudante();
        i1.imprime(e1);
    }
}
