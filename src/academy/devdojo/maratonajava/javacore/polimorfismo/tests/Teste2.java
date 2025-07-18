package academy.devdojo.maratonajava.javacore.polimorfismo.tests;

import academy.devdojo.maratonajava.javacore.polimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioMemoria;

public class Teste2 {
    public static void main(String[] args) {
        Repositorio r1 = new RepositorioMemoria();
        r1.salvar();

        Repositorio r2 = new RepositorioArquivo();
        r2.salvar();

        Repositorio r3 = new RepositorioBancoDeDados();
        r3.salvar();
    }
}
