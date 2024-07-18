import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        if (numero == 61) {
            System.out.println("Brasilia");
        }
        else if (numero == 71) {
            System.out.println("Salvador");
        }
        else if (numero == 11) {
            System.out.println("Sao Paulo");
        }
        else if (numero == 21) {
            System.out.println("Rio de Janeiro");
        }
        else if (numero == 32) {
            System.out.println("Juiz de Fora");
        }
        else if (numero == 19) {
            System.out.println("Campinas");
        }
        else if (numero == 27) {
            System.out.println("Vitoria");
        }
        else if (numero == 31) {
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");
        }
    }
 
}
