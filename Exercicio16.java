import java.util.Scanner;
import java.lang.Math;

public class Exercicio16 {
    public static void main(String[] args) {
        double a;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual a area a ser pintada? ");
            a = key.nextDouble();
            System.out.print("Será necessário " + (Math.ceil(a / (18 * 3))) + " e ficará em " + (80 * (Math.ceil(a / (18 * 3)))) + " reais.");
        }
    }    
}
