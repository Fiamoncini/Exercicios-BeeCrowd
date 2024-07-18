import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 0; i < num; i++){
            int numero = s.nextInt();
            if (numero % 2 == 0 && numero != 0 && numero > 0) {
                System.out.println("EVEN POSITIVE");
            }
            if (numero % 2 != 0 && numero > 0) {
                System.out.println("ODD POSITIVE");
            }
            if (numero == 0) {
                System.out.println("NULL");
            }
            if (numero % 2 == 0 && numero != 0 && numero < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            if (numero % 2 != 0 && numero != 0 && numero < 0) {
                System.out.println("ODD NEGATIVE");
            }

        }
    }
}
