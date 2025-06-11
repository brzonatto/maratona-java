package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        if (estudante == null) {
            System.out.println("Estudante não pode ser nulo");
            return;
        }
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
