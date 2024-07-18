import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat ftd = new DecimalFormat("0.000");
        float num = s.nextFloat();
        float num2 = s.nextFloat();
        float consumo = num / num2;
        System.out.println(ftd.format(consumo)+" km/l");
        }
}
