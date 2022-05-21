import java.util.Scanner;

public class Termometro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua temperatura: ");
        double temperatura = input.nextDouble();
        System.out.println(febre(temperatura) ? "Você está com febre" : "Você está bem!");
    }

    public static boolean febre(double temperatura){
        boolean valor = temperatura >= 37;
        return valor;
    }
}
