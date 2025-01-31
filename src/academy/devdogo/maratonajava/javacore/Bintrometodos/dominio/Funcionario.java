package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios[0]);
        System.out.println(this.salarios[1]);
        System.out.println(this.salarios[2]);
    }
}
