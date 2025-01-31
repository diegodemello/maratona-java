package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudantes estudantes){
        System.out.println(estudantes.nome);
        System.out.println(estudantes.sexo);
        System.out.println(estudantes.idade);
        estudantes.nome = "Diego";
    }
}
