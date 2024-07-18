import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int in = 0;
        int out = 0;
        for(int i = 0; i < n; i++){
            float numero = s.nextFloat();
            if (numero > 20 || numero < 10) {
                out++;
            } else{
                in++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
