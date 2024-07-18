import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os valores
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = scanner.nextInt();
        }

        // Copiando os valores para outra array para preservar a ordem original
        int[] valoresOriginais = Arrays.copyOf(valores, valores.length);

        // Ordenando os valores
        Arrays.sort(valores);

        // Mostrando os valores em ordem crescente
        for (int valor : valores) {
            System.out.println(valor);
        }

        // Linha em branco
        System.out.println();

        // Mostrando os valores na sequência como foram lidos
        for (int valor : valoresOriginais) {
            System.out.println(valor);
        }
    }
}
