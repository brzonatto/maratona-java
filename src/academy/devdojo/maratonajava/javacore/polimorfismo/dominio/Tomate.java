package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Tomate extends Produto  {
    private String validade;   

    public Tomate(String nome, double preco, String validade) {
        super(nome, preco);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.preco * 0.06; // Exemplo de taxa de imposto para tomate
    }
}
