import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double s, h;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Quanto você ganha por hora? ");
            s = teclado.nextDouble();
            System.out.print("Quantas horas você trabalhou no mês? ");
            h = teclado.nextDouble();
            System.out.print("Seu salário será: " + (s * h));
        }
    }
}
