import java.util.Scanner;

public class CriarSequencia {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("## PROGRAMA DA SEQUENCIA ##");
        System.out.print("Informe um limite: ");

        int a = input.nextInt();

        int[] x = criarSeq(a);
        printarArray(x);
        /* for(int i = 0; i < x.length; i++){
            System.out.println((i + 1) + "° posição do array " + x[i]);
        }
 */

    }

    public static int[] criarSeq(int limite){

        int[] numeros = new int[limite];
        for(int i = 0; i < limite; i++){
            numeros[i] = i + 1;
        }
        return numeros;
    }


    public static void printarArray(int[] numeros){ //void é para função que não tem um retorno
        for(int item = 0; item < numeros.length; item++){ 
            System.out.println((item + 1) + "° posição do array " + numeros[item]);
        }
    }

    
    
}
