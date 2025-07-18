package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Televisao extends Produto{

    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.preco * 0.06;
    }
}
