package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {    
    private double salario;
    
    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void declaracao() {
        System.out.println("Eu " + this.nome + " declaro ter recebio o valor de R$" + this.salario);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + salario);
    }    
}
