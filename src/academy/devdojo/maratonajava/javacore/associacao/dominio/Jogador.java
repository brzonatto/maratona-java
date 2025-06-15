package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador() {
    }
    
    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }  

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", time=" + (time != null ? time.getNome() : "Nenhum time associado") +
                '}';
    }

}
