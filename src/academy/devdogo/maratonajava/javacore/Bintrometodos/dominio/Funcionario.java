package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios){
            System.out.print(salario + " ");
        }
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
