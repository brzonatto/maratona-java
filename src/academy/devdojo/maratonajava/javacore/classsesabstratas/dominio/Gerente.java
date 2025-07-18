package academy.devdojo.maratonajava.javacore.classsesabstratas.dominio;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente [departamento=" + departamento 
                + ", nome=" + nome 
                + ", salario=" + salario + "]";
    }

    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.2;
    }

    @Override
    public void imprime() {
        System.out.println("Gerente: " + nome 
                            + ", Salario: " + salario 
                            + ", Departamento: " + departamento);
    }
}
