import java.util.Scanner;
/* import java.util.Date; */

public class Java{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite um número:");
        int valor1 = myObj.nextInt();
        System.out.print("Digite outro número:");
        int valor2 = myObj.nextInt();
        System.out.println("A soma entre os dois valores digitados é: " + soma(valor1, valor2));
}

public static int soma(int valor1, int valor2){
    int total = valor1 + valor2;
    return total;
}

}