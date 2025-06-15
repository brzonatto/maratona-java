package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;

    public Anime() {

    }

    public Anime(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }    

    public Anime(String nome, String tipo, int episodios, String estudio) {
        this(nome, tipo, episodios);
        this.estudio = estudio;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getEpisodios() {
        return episodios;
    }
    
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", episodios=" + episodios +
                ", estudio='" + estudio + '\'' +
                '}';
    }
}
