import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double r;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Qual o raio do circulo? ");
            r = teclado.nextDouble();
            System.out.print("A area do circulo é´: " + ((Math.PI) * r * r));
        }
    }
}
