import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double a;
        int s;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite '1' se você for homem, e '2' se você for mulher: ");
            s = key.nextInt();
            System.out.print("Qual a sua altura? ");
            a = key.nextDouble();
            if (s == 1){
                System.out.print("Seu peso ideal é: " + ((72.7 * a) - 58));
            }
            else if (s==2){
                System.out.print("Seu peso ideal é: " + ((62.1 * a) - 44.7));
            }
            else{
                System.out.print("IDENTIDADE SEXUAL INVALIDA");
            }
        }
    }
}
