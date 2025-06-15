package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time() {
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Time: " + nome);
        if (jogadores != null) {
            System.out.println("Jogadores:");
            for (Jogador jogador : jogadores) {
                System.out.println(jogador.getNome());
            }
        } else {
            System.out.println("Nenhum jogador associado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    
}
