import java.util.Scanner;

/**
 * Exercicio3
 */
public class Exercicio3 {
    public static void main(String[] args) {
        double va, vb;
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o primeiro argumento: ");
            va = sc.nextDouble();
            System.out.print("Digite o segundo argumento:");
            vb = sc.nextDouble();
            System.out.print("A soma dos argumentos é: " + (va + vb));
        }
    }
}