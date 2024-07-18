import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        float num3 = s.nextFloat();
        float num4 = s.nextFloat();
        float num5 = s.nextFloat();
        int contador = 0;
        if (num1 % 2 == 0) {
             contador += 1;
        }
        if (num2 % 2 == 0) {
             contador += 1;
        }
        if (num3 % 2 == 0) {
             contador += 1;
        }
        if (num4 % 2 == 0) {
             contador += 1;
        }
        if (num5 % 2 == 0) {
             contador += 1;
        }
        System.out.println(contador+" valores pares");
    }
}
