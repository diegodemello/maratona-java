package academy.devdojo.maratonajava.introduction;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args){
        int[][] arrayInt = new int[2][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        for(int[] arrayBase: arrayInt){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
