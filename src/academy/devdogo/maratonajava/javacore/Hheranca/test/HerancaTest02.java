package academy.devdogo.maratonajava.javacore.Hheranca.test;

import academy.devdogo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        /*
        0 - O bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai.
        1 - O bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha.
        2 - Alocado espaço em memória pro objeto da superclasse..
        3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai.
        4 - Bloco de inicialização da super classe é executado na ordem em que aparece.
        5 - Construtor da superclasse é executado.
        6 - Alocado espaço em memória pro objeto da subclasse.
        7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado.
        8 - Bloco de inicialização da subclasse é executado na ordem em que aparece.
        9 - Construtor da subclasse é executado.
         */
        Funcionario funcionario = new Funcionario("Diego");
    }
}
