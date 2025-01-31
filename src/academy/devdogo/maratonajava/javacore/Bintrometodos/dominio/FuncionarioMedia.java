package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class FuncionarioMedia {
    public void mediaSalarial(Funcionario funcionario){
        double media = (funcionario.salarios[0] + funcionario.salarios[1] + funcionario.salarios[2]) / 3;
        System.out.println("Media dos três salários: R$ " + media);
    }
}
