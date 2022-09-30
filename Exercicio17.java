import java.util.Scanner;

/**
 * Exercicio17
 */
public class Exercicio17 {
    public static void main(String[] args) {
      double a, vg, vp;
      vg = 6 * 18;
      vp = 6 * 3.6;
      try (Scanner key = new Scanner(System.in)){
        System.out.print("Qual a area a ser pintada? ");
        a = key.nextDouble();
        System.out.println("Será necessário comprar " + (Math.ceil(a / vg)) + " latas de 18 litros e custará " + 
        (80 * (Math.ceil(a / vg))) + " reais, ou");
        System.out.println("Será necessário comprar " + (Math.ceil(a / vp)) + " galões de 3,6 litros e custará " + 
        (25 * (Math.ceil(a / vp))) + " reais, ou");
        System.out.println("Será necessário comprar " + (Math.floor((a * 1.1) / vg)) + " latas de 18 litros e " + 
        (Math.ceil(((a * 1.1) % vg) / vp)) + " galões de 3,6 litros e custará " + 
        ((80 * (Math.floor((a * 1.1) / vg))) + (25 * (Math.ceil(((a * 1.1) % vg) / vp)))) + " reais.");
      }  
    }
}