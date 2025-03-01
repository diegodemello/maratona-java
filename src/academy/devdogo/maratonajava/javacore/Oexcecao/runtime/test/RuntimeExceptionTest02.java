package academy.devdogo.maratonajava.javacore.Oexcecao.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado.");
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Não existe divisão por zero.");
        }
        return a/b;
    }
}
