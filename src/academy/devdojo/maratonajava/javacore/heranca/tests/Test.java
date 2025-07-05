package academy.devdojo.maratonajava.javacore.heranca.tests;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class Test {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", "12345-678");

        Pessoa p1 = new Pessoa("João", "123.456.789-00", e1);

        p1.imprimir();

        Funcionario f1 = new Funcionario("Maria", "987.654.321-00", e1);
        f1.setSalario(3000.00);
        f1.imprimir();
        f1.declaracao();
    }
}
