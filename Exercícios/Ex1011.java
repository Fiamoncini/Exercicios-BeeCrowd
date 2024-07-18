import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        float raio = input.nextFloat();
        double volume = (4/3.0) * 3.14159 * Math.pow(raio,3);
        DecimalFormat ftd = new DecimalFormat("0.000");
        System.out.println("VOLUME = "+ftd.format(volume));
 
    }
 
}
