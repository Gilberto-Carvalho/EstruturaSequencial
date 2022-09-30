import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double p, e;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual o peso do peixe? ");
            p = key.nextDouble();
            if (p < 50){
                System.out.print("Peixe com menos de 50kg; não é necessário pagar imposto.");
            }
            else{
                e = (p - 50);
                System.out.print("O peixe excede " + e + "kg perante ao estabelecido pelo estado de São Paulo, e você terá que pagar: " + (e * 4) + " reais de imposto.");
            }
        }
    }
}
