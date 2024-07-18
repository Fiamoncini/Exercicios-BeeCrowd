import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner soma = new Scanner(System.in);
        float num1 = soma.nextFloat();
        float num2 = soma.nextFloat();
        float num3 = soma.nextFloat();
        double media = ((num1 * 2) + (num2 *3) + (num3 * 5)) / 10;
        DecimalFormat ftd = new DecimalFormat("0.0");
        System.out.println("MEDIA = "+ftd.format(media));
        soma.close();
    }
 
}
