package academy.devdojo.maratonajava.javacore.introducaometodos.tests;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

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

        c1.somaVarArgs(1, 2, 3, 4, 5);
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setIdade(30);
        double[] salarios = {2500.00, 3000.00, 3500.00};
        f1.setSalarios(salarios);
        f1.imprimeDados();
        f1.getMediaSalario();

        Pessoa p1 = new Pessoa();
        p1.setNome("Carlos");
        p1.setIdade(25);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
