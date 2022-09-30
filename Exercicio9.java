import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double f;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Qual a temperatura em Fahrenheit? ");
            f = teclado.nextDouble();
            System.out.print("A temperatura em ºC é: " + (5 * ((f - 32) / 9)));
        }
    }
}
