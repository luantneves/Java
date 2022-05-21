import java.util.Scanner;

public class ContarAte {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        contarAte(num);
    }

    public static void contarAte(int numero){
        

        for(int i = 1; i <= numero; i++){

            System.out.print(" " + i);
        }
    }

}
