import java.util.Scanner;

public class MaiorNumero{


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("## PROGRAMA MAIOR NUMERO ##");
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        int[] vetor = digitarNumeros(tamanho);
        System.out.println("O maior número do vetor é: " +maiorNumero(vetor));
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

    public static int maiorNumero(int[] numeros){
        int maior = numeros[0];
        for(int i = 1; i < numeros.length; i++){

            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;

    }

}