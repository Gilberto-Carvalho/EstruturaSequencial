import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        double a, v;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual o tamanho do arquivo em Mb? ");
            a = key.nextDouble();
            System.out.print("Qual a velocidade da internet em Mbps? ");
            v = key.nextDouble();
            System.out.print("Será necessário aproximadamente " + (a / (v * 60)) + " minutos para finalizar o download.");
        }
    }
}
