import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {

        final var leitor = new Scanner(System.in);
        var N = leitor.nextInt();

        var result = N;

        for (int i = 1; i < N; i++) {
            result *= (N - i);
        }

        System.out.println(result);
    }
}