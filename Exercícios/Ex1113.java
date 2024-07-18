import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int num = s.nextInt();
            int num2 = s.nextInt();
            if (num > num2) {
                System.out.println("Decrescente");
            }
            if (num2 > num) {
                System.out.println("Crescente");
            }
            if (num == num2) {
                break;
            }
        }
    }
}
