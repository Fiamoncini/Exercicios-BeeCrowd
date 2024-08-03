import java.io.IOException;
import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("0.0");
        int testes = s.nextInt();
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float soma = 0;
        for(int i = 0; i < testes; i++){
            num1 = s.nextFloat();
            num2 = s.nextFloat();
            num3 = s.nextFloat();
            num1 *= 2;
            num2 *= 3;
            num3 *= 5;
            soma = (num1 + num2 + num3) / 10;
            System.out.println(df.format(soma));
        }
    }
 
}
