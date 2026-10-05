
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
            double valor1 = leitor.nextDouble();
            double valor2 = leitor.nextDouble();
            double valor3 = leitor.nextDouble();

            double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f%n", media);
        }
        leitor.close();
    }
}
