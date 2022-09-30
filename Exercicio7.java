import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double L;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Qual o tamanho do lado do quadrado? ");
            L = teclado.nextDouble();
            System.out.print("O dobro da area do quadrado é: " + ((L * L) * 2));
        }
    }
}
