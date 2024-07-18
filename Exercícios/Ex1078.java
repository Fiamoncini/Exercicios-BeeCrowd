import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroantes = 0;
        int resultado = 0;
        int numero = s.nextInt();
        for(int i = 0; i < 10; i++){
        numeroantes++;
        resultado = numeroantes * numero;
        System.out.println(numeroantes+" x "+numero +" = "+resultado);
    }}
 
}
