import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int numero1 = s.nextInt();
            int numero2 = s.nextInt();
            if (numero1 > 0 && numero2 > 0) {
                System.out.println("primeiro");
            }
            if (numero1 < 0 && numero2 > 0) {
                System.out.println("segundo");
            }
            if (numero1 < 0 && numero2 < 0) {
                System.out.println("terceiro");
            }
            if (numero1 > 0 && numero2 < 0) {
                System.out.println("quarto");
            }
            if (numero1 == 0 || numero2 == 0) {
                break;
            }
        }
    }
}
