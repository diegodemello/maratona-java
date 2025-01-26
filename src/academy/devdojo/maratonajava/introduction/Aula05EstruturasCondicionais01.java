package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 20;
        boolean isComprarBebida = idade >= 18;

        if(isComprarBebida){
            System.out.println("Comprou");
        }

        if(!isComprarBebida){
            System.out.println("Não autorizado a comprar.");
        }
    }
}
