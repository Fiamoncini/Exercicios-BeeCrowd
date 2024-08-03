import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        do {
            num = s.nextInt();
            if (num == 0) {
                break;
            }
            for(int i = 1; i <= num; i++){
                if (i < num) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        } while (num != 0);
    }
 
}
