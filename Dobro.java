import java.util.Scanner;

public class Dobro {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = input.nextInt();
    int vetor[] = digitarNumeros(tamanho);
    dobro(vetor);
    
    }

    public static int[] digitarNumeros(int vezes){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[vezes];
        for(int i = 0; i < vezes; i++){
            System.out.print("Digite o " +  (i + 1) + "° número do vetor: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

     public static void dobro(int[] numeros){
         System.out.print("O dobro do vetor é: ");
        for(int i = 0; i < numeros.length; i++){
           numeros[i] = numeros[i] * 2;
           System.out.print(numeros[i] + " ");
        }
    }


}
