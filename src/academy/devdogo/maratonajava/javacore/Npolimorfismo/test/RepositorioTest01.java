package academy.devdogo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdogo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico.RepositorioArquivo;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico.RepositorioBancoDeDados;
import academy.devdogo.maratonajava.javacore.Npolimorfismo.sevico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
