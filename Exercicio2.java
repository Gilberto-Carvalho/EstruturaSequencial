import java.util.Scanner;

/**
 * Exercicio2
 */
public class Exercicio2 {
    static String variavel;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Escreva um numero: ");
            variavel = sc.nextLine();
        }
        System.out.print("Seu numero é: ");
        System.out.print(variavel);
    }
}