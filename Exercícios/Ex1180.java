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
        ArrayList<Integer> teste = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int numero;
        int menor = Integer.MAX_VALUE;
        int posicao = 0;
        for(int i = 0; i < num; i++){
            numero = s.nextInt();
            teste.add(numero);
            if (teste.get(i) < menor) {
                menor = teste.get(i);
                posicao = i;
            }
    }
        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: " + posicao);
}  
 
}
