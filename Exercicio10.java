import java.util.Scanner;

/**
 * Exercicio10
 */
public class Exercicio10 {

    public static void main(String[] args) {
        double c;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual a temperatura em Celsios? ");
            c = key.nextDouble();
            System.out.print("A temperatura em ºF é: " + (((c / 5) * 9) + 32));
        }
    }
}