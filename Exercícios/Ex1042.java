import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = scanner.nextInt();
        }
        int[] valoresOriginais = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valores);
        for (int valor : valores) {
            System.out.println(valor);
        }
        System.out.println();
        for (int valor : valoresOriginais) {
            System.out.println(valor);
        }
    }
}
