import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<Double> Lista = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            double numero = s.nextDouble();
                Lista.add(numero);
        }
        for(int i = 0; i < Lista.size(); i++){
            if (Lista.get(i) <= 10) {
                System.out.println("A["+i+"] = " +Lista.get(i));
            }
        }
    }
 
}
