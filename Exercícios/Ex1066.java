import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();
        int num5 = s.nextInt();
        int numerospares = 0;
        int numerosimpares = 0;
        int numerospositivos = 0;
        int numerosnegativos = 0;
        if (num1 % 2 == 0) {
            numerospares += 1;
        }
        if (num2 % 2 == 0) {
            numerospares += 1;
        }
        if (num3 % 2 == 0) {
            numerospares += 1;
        }
        if (num4 % 2 == 0) {
            numerospares += 1;
        }
        if (num5 % 2 == 0) {
            numerospares += 1;
        }
        if (num1 % 2 != 0) {
            numerosimpares += 1;
        }
        if (num2 % 2 != 0) {
            numerosimpares += 1;
        }
        if (num3 % 2 != 0) {
            numerosimpares += 1;
        }
        if (num4 % 2 != 0) {
            numerosimpares += 1;
        }
        if (num5 % 2 != 0) {
            numerosimpares += 1;
        }
        if (num1 > 0) {
            numerospositivos += 1;
        }
        if (num2 > 0) {
            numerospositivos += 1;
        }
        if (num3 > 0) {
            numerospositivos += 1;
        }
        if (num4 > 0) {
            numerospositivos += 1;
        }
        if (num5 > 0) {
            numerospositivos += 1;
        }
        if (num1 < 0) {
            numerosnegativos += 1;
        }
        if (num2 < 0) {
            numerosnegativos += 1;
        }
        if (num3 < 0) {
            numerosnegativos += 1;
        }
        if (num4 < 0) {
            numerosnegativos += 1;
        }
        if (num5 < 0) {
            numerosnegativos += 1;
        }
        System.out.println(numerospares+" valor(es) par(es)");
        System.out.println(numerosimpares+" valor(es) impar(es)");
        System.out.println(numerospositivos+" valor(es) positivo(s)");
        System.out.println(numerosnegativos+" valor(es) negativo(s)");
        s.close();

    }
 
}
