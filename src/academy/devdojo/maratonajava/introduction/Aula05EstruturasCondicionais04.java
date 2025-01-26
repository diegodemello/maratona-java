package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 12;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("Sexo masculino");
                break;
            case 'F':
                System.out.println("Sexo feminino");
                break;
            default:
                System.out.println("Não identificado");
        }
    }
}
