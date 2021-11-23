import java.io.IOException;
import java.util.Scanner;

public class Theon {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
            T = leitor.nextInt();
            if (i == 0 || T < menor) {
                posMenor = i + 1;
                menor = T;
            }
        }
        System.out.println(posMenor);
    }
}