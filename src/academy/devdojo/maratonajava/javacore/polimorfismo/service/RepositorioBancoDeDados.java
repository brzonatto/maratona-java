package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no banco de dados");
    }
}
