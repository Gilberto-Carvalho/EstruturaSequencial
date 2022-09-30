import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double a;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual a sua altura? ");
            a = key.nextDouble();
            System.out.print("O seu peso ideal é: " + ((72.7 * a) - 58) + "kg");
        }
    }    
}
