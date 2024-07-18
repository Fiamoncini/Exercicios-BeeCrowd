import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        float y = s.nextFloat();
        if (y > 0 && x < 0) {
            System.out.println("Q2");
        }
        if (y > 0 && x > 0) {
            System.out.println("Q1");
        }
        if (y < 0 && x < 0) {
            System.out.println("Q3");
        }
        if (y < 0 && x > 0) {
            System.out.println("Q4");
        }
        if (y == 0 && x == 0)
        System.out.println("Origem");
        s.close();
        if (y == 0 && x != 0) {
            System.out.println("Eixo X");
        }
        if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }
    }
}
