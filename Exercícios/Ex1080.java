import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero2 = 0;
        int posicao = 0;
        for(int i = 1; i < 101; i++){
            int numero = s.nextInt();
            if (numero > numero2) {
                numero2 = numero;
                posicao = i;
            }
        }
        System.out.println(numero2);
        System.out.println(posicao);
    }
 
}
