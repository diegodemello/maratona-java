package academy.devdogo.maratonajava.javacore.GassociacaoExercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Imprime ALUNO");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(seminario.getTitulo());
    }
}
