import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int numfunc = input.nextInt();
        int numhoras = input.nextInt();
        double valorhora = input.nextFloat();
        double salario = numhoras * valorhora;
        DecimalFormat ftd = new DecimalFormat("0.00");
        System.out.println("NUMBER = "+numfunc);
        System.out.println("SALARY = U$ "+ftd.format(salario));
        input.close();
 
    }
 
}
