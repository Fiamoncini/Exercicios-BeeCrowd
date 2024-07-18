import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (true) {
            int num = s.nextInt();
            if (num == 1) {
                alcool++;
            } else if (num == 2) {
                gasolina++;
            } else if (num == 3) {
                diesel++;
            } else if (num == 4) {
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
