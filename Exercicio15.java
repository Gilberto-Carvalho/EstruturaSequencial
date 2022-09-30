import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double s, h;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Quanto você ganha por hora? ");
            s = key.nextDouble();
            System.out.print("Quantas horas você trabalhou? ");
            h = key.nextDouble();
            System.out.println("+ Salário bruto: R$" + (s * h));
            System.out.println("- IR (11%): R$" + ((s * h) * 0.11));
            System.out.println("- INSS (8%): R$" + ((s * h) * 0.08));
            System.out.println("- Sindicato (5%): R$" + ((s * h) * 0.05));
            System.out.println("= Salário liquido: R$" + ((s * h) * (1-(0.11 + 0.08 + 0.05))));
        }
    }    
}
