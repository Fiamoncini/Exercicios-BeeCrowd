import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();
        float num3 = s.nextFloat();
        float num4 = s.nextFloat();
        float num5 = s.nextFloat();
        float num6 = s.nextFloat();
        int positivos = 0;
        if (num1 > 0){
            positivos++;
        }
        if (num2 > 0){
            positivos++;
        }
        if (num3 > 0){
            positivos++;
        }
        if (num4 > 0){
            positivos++;
        }
        if (num5 > 0){
            positivos++;
        }
        if (num6 > 0){
            positivos++;
        }
        System.out.println(positivos+" valores positivos");
        s.close();

    }
 
}
