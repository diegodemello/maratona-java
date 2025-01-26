package academy.devdojo.maratonajava.introduction;

public class Aula04Operadores {
    public static void main(String[] args) {
        int idade = 20;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQue30);
        System.out.println(isDentroDaLeiMenorQue30);

        // Banking

        double valorTotalContaCorrente = 114;
        double valorTotalCaixinha = 3500;
        float valorPlaystation = 2000;

        boolean isPlaystationCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalCaixinha >= valorPlaystation;
        System.out.println(isPlaystationCompravel);

        //
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
