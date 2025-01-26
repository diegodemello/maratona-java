package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticoes02 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000000; i++){
            if(i % 2 == 0){
                System.out.println(i + " é par!");
            }
        }
    }
}
