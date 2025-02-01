package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios){
            System.out.print(salario + " ");
        }
    }
}
