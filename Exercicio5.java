import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double m;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Qual a distancia em metros? ");
            m = teclado.nextDouble();
            System.out.print("A distancia em centimetros é de: " + (m * 100));
        }
    }
}
