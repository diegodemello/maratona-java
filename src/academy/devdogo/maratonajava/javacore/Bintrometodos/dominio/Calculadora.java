package academy.devdogo.maratonajava.javacore.Bintrometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimiDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por 0");
        }else{
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros:");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;
        for (int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    // Validar número primo ou não
    // Retornar true se for
    // False se não for

    public boolean numeroPrimo(int num){
        int qdiv = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                qdiv += 1;
            }
        }
        if(qdiv == 2){
            return true;
        }else{
            return false;
        }
    }


    public void listaDuplicada(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        }
    }
}
