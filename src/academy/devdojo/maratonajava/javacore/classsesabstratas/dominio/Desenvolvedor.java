package academy.devdojo.maratonajava.javacore.classsesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [linguagem=" + linguagem 
                + ", nome=" + nome 
                + ", salario=" + salario + "]";
    }

   @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.1;
    }

   @Override
   public void imprime() {
        System.out.println("Desenvolvedor: " + nome 
                            + ", Salario: " + salario 
                            + ", Linguagem: " + linguagem);
   }

    
}
