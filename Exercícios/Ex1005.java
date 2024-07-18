import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner soma = new Scanner(System.in);
        float num1 = soma.nextFloat();
        float num2 = soma.nextFloat();
        double somar = (num1 * 3.5) + (num2 * 7.5);
        double somar2 = somar / 11;
        DecimalFormat ftd = new DecimalFormat("0.00000");
        System.out.println("MEDIA = "+ftd.format(somar2));
        soma.close();
    }
 
}
