import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner soma = new Scanner(System.in);
        int num1 = soma.nextInt();
        int num2 = soma.nextInt();
        int somar = num1 + num2;
        System.out.println("SOMA = "+somar);
        soma.close();
    }
 
}
