import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat ftd = new DecimalFormat("0.00");
        Scanner escolha = new Scanner(System.in);
        int escolher = escolha.nextInt();
        if (escolher == 1) {
            int numero = escolha.nextInt();
            int preco = numero * 4;
            System.out.println("Total: R$ "+ftd.format(preco));
        }
        if (escolher == 2) {
            int numero = escolha.nextInt();
            double preco = numero * 4.50;
            System.out.println("Total: R$ "+ftd.format(preco));
        }
        if (escolher == 3) {
            int numero = escolha.nextInt();
            double preco = numero * 5;
            System.out.println("Total: R$ "+ftd.format(preco));
        }
        if (escolher == 4) {
            int numero = escolha.nextInt();
            double preco = numero * 2;
            System.out.println("Total: R$ "+ftd.format(preco));
        }
        if (escolher == 5) {
            int numero = escolha.nextInt();
            double preco = numero * 1.5;
            System.out.println("Total: R$ "+ftd.format(preco));
        }
    }
}
