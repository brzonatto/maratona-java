package academy.devdojo.maratonajava.javacore.introducaoclasses.tests;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class Test {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.nome = "João";
        e1.idade = 20;
        e1.sexo = 'M';   
        
        System.out.println("Nome: " + e1.nome);
        System.out.println("Idade: " + e1.idade);
        System.out.println("Sexo: " + e1.sexo);

        Professor p1 = new Professor();
        p1.nome = "Maria";
        p1.idade = 35;
        p1.sexo = 'F';

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Sexo: " + p1.sexo);

        Carro c1 = new Carro();
        c1.nome = "Fusca";
        c1.modelo = "Volkswagen";
        c1.ano = 1976;

        System.out.println("Nome: " + c1.nome);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.ano);

        Carro c2 = new Carro();
        c2.nome = "Civic";
        c2.modelo = "Honda";
        c2.ano = 2020;

        System.out.println("Nome: " + c2.nome);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Ano: " + c2.ano);
        
    }
}
