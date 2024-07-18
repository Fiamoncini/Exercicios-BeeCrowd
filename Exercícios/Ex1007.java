import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner soma = new Scanner(System.in);
        int num1 = soma.nextInt();
        int num2 = soma.nextInt();
        int num3 = soma.nextInt();
        int num4 = soma.nextInt();
        float diferenca = ((num1 * num2) - (num3 * num4));
        DecimalFormat ftd = new DecimalFormat("0");
        System.out.println("DIFERENCA = "+ftd.format(diferenca));
    }
 
}
