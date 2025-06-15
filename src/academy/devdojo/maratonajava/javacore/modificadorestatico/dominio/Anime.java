package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static{
        System.out.println("Bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome do anime: " + nome);
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }
}
