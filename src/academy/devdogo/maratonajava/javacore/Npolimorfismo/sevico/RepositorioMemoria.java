package academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio  {
    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
