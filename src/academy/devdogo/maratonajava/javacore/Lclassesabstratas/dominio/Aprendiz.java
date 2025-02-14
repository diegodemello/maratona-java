package academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Aprendiz extends Funcionario {
    public Aprendiz(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString() {
        return "Aprendiz{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
