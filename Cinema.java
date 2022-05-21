import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        String dia = input.next();
        System.out.println("Digite quantos ingressos inteiros");
        int inteiras = input.nextInt();
        System.out.println("Digite quantos ingressos meia");
        int meias = input.nextInt();

        System.out.println("O total dos ingressos é: " + calcularIngressos(dia,inteiras,meias));
        

    }

    public static double calcularIngressos(String dia, int inteiras, int meias){
        double total = 0;
        double ingressos = 27.0;
        if(dia.equals("quarta")){
            total = (ingressos / 2) * (inteiras + meias) ;
              
        }else{
            total = (ingressos * inteiras) + ((ingressos * meias) / 2);
             
        }
        return total; 
    }
}
