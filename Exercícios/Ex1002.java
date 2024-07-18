import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner area = new Scanner(System.in);
        double raio = area.nextDouble();
        double raio2 = raio * raio;
        double n = 3.14159;
        double areaf = (raio2 * n);
        DecimalFormat ftd = new DecimalFormat("0.0000");
        System.out.println("A="+ftd.format(areaf));
        area.close();
    }
 
}
