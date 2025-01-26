package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticoes01 {
    public static void main(String[] args) {
        int count = 12;

        while(count < 10){
            System.out.println(count);
            count++;
        }

        count = 0;

        do{
            System.out.println("Dentro do do-while");
            count++;
        }while(count < 10);

        int tabuada = 5;
        for(int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada*i);
        }
    }
}
