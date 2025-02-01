package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class FuncionarioMedia {
    public void mediaSalarial(Funcionario funcionario){
        double soma = 0;
        for(double salario: funcionario.salarios){
            soma += salario;
        }
        double media = soma / funcionario.salarios.length;
        System.out.println("Media dos três salários: R$ " + media);
    }
}
