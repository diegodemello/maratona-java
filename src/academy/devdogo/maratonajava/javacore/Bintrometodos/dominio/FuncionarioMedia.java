package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class FuncionarioMedia {
    public void mediaSalarial(Funcionario funcionario){
        double soma = 0;
        for(double salario: funcionario.getSalarios()){
            soma += salario;
        }
        double media = soma / funcionario.getSalarios().length;
        System.out.println("Media dos três salários: R$ " + media);
    }
}
