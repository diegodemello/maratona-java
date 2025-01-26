package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiroTeto = 34712;
        double segundoTeto = 68507;
        double imposto;

        if(salarioAnual <= primeiroTeto){
            imposto = salarioAnual * (9.7/100);
        } else if (salarioAnual >= primeiroTeto && salarioAnual <= segundoTeto) {
            imposto = salarioAnual * (37.35/100);
        }else{
            imposto = salarioAnual * (49.5/100);
        }

        System.out.println(imposto);
    }
}
