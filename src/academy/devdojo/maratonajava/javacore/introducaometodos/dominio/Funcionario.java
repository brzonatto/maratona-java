package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;

    public double getMediaSalario() {
        if (salarios == null || salarios.length == 0) {
            return 0.0;
        }
        double soma = 0.0;
        for (double salario : salarios) {
            soma += salario;
        }
        mediaSalario = soma / salarios.length;
        return mediaSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print(salario + "\n");
        }
    }
}
