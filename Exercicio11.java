import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int a, b;
        double c;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Digite um numero inteiro: ");
            a = teclado.nextInt();
            System.out.print("Digite mais um numero inteiro: ");
            b = teclado.nextInt();
            System.out.print("Digite um numero real: ");
            c = teclado.nextDouble();
            System.out.println("O produto do primeiro com a metade do segundo é: " + (a * (b / 2)));
            System.out.println("A soma do triplo do primeiro numero com o terceiro numero é: " + ((a * 3) + c));
            System.out.print("O cubo do terceiro numero é: " + (Math.pow(c, 3)));
        }
    }
}
