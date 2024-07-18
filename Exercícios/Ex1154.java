import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) {
        DecimalFormat ftd = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        float soma = 0;
        double media = 0;
        int vezes = 0;
        int num = 1;
        while (num > 0) {
            num = s.nextInt();
            if (num > 0) {
            soma += num;
            vezes++;
            }
        }
        media = soma / vezes;
        System.out.println(ftd.format(media));
    }
}
