import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float codpeca = input.nextFloat();
        float numpeca = input.nextFloat();
        double valorpeca = input.nextFloat();
        float codepeca2 = input.nextFloat();
        float numpeca2 = input.nextFloat();
        double valorpeca2 = input.nextFloat();
        double respeca1 = numpeca * valorpeca;
        double respeca2 = numpeca2 * valorpeca2;
        double total = respeca1 + respeca2;
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("VALOR A PAGAR: R$ "+ftd.format(total));
 
    }
 
}
