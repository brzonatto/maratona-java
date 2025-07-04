package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;
    
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Escola() {
    }

    public void imprime() {
        System.out.println("Escola: " + nome);
        if (professores != null) {
            System.out.println("Professores:");
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
        } else {
            System.out.println("Nenhum professor associado.");
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }    
}
