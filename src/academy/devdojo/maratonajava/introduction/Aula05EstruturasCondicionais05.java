package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 4;

        switch (dia){
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }
    }
}
