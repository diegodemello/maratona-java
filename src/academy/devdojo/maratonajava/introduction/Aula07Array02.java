package academy.devdojo.maratonajava.introduction;

public class Aula07Array02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Guilherme";
        nomes[1] = "Leandro";
        nomes[2] = "Diego";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
