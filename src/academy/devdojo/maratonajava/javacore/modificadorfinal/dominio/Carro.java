package academy.devdojo.maratonajava.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    private static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }
}