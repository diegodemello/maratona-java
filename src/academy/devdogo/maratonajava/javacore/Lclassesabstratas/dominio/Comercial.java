package academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Comercial extends Funcionario{
    public Comercial(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
