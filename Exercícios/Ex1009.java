import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();
        double comissao = vendas * 0.15;
        double salariofinal = salario + comissao;
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("TOTAL = R$ "+ftd.format(salariofinal));
    }
 
}
