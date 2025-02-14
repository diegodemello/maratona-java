package academy.devdogo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio.Aprendiz;
import academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio.Comercial;
import academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdogo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Giovane", 18000);
        Comercial comercial = new Comercial("Nelton", 27000);
        Aprendiz aprendiz = new Aprendiz("Diego", 1518);
        System.out.println(gerente);
        System.out.println(comercial);
        System.out.println(aprendiz);
    }
}
