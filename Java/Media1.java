import java.io.IOException;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        var A = leitor.nextDouble();
        var B = leitor.nextDouble();

        var media = (A * 3.5 + B * 7.5) / 11;

        System.out.println(String.format("MEDIA = %.5f", media));
    }

}