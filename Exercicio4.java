import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double va, vb, vc, vd;
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Qual a primeira nota? ");
            va = teclado.nextDouble();
            System.out.print("Qual a segunda nota? ");
            vb = teclado.nextDouble();
            System.out.print("Qual a terceira nota? ");
            vc = teclado.nextDouble();
            System.out.print("Qual a terceira nota? ");
            vd = teclado.nextDouble();
            System.out.print("A sua media do bimestre foi: " + ((va + vb + vc + vd) / 4));
        }
    }
}
