package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto  {
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.preco * 0.21;
    }
}
