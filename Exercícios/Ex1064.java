import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        DecimalFormat ftd = new DecimalFormat("0.0");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        float num3 = s.nextFloat();
        float num4 = s.nextFloat();
        float num5 = s.nextFloat();
        float num6 = s.nextFloat();
        int numerospostivos = 0;
        float medianumeros = 0;
        if (num1 >= 0) {
            numerospostivos += 1;
            medianumeros += num1;
        }
        if (num2 >= 0) {
            numerospostivos += 1;
            medianumeros += num2;
        }
        if (num3 >= 0) {
            numerospostivos += 1;
            medianumeros += num3;
        }
        if (num4 >= 0) {
            numerospostivos += 1;
            medianumeros += num4;
        }
        if (num5 >= 0) {
            numerospostivos += 1;
            medianumeros += num5;
        }
        if (num6 >= 0) {
            numerospostivos += 1;
            medianumeros += num6;
        }
        System.out.println(numerospostivos+" valores positivos");
        float media = medianumeros / numerospostivos;
        System.out.println(ftd.format(media));
    }
 
}
