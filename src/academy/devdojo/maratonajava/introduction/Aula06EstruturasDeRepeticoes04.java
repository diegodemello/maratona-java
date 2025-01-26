package academy.devdojo.maratonajava.introduction;

// Dado o valor de um carro, descubra quantas vezes pode ser parcelado
// Condição valorParcela >= 1000

public class Aula06EstruturasDeRepeticoes04 {
    public static void main(String[] args){
        double precoCarro = 55000;

        for (int parcelas = 1; parcelas <= precoCarro; parcelas++){
            double valorParcela = precoCarro/parcelas;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcelas + " R$" + valorParcela);
        }
    }
}
