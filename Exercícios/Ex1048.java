import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat ftd = new DecimalFormat("0.00");
        Scanner salario = new Scanner(System.in);
        float salario2 = salario.nextFloat();
        if (salario2 <= 400) {
            double aumento = salario2 * 0.15;
            double novosalario = salario2 + aumento;
            System.out.println("Novo salario: "+ftd.format(novosalario));
            System.out.println("Reajuste ganho: "+ftd.format(aumento));
            System.out.println("Em percentual: 15 %");
        }
        if (salario2 <= 800 && salario2 >= 400.01) {
            double aumento = salario2 * 0.12;
            double novosalario = salario2 + aumento;
            System.out.println("Novo salario: "+ftd.format(novosalario));
            System.out.println("Reajuste ganho: "+ftd.format(aumento));
            System.out.println("Em percentual: 12 %");
        }
        if (salario2 <= 1200 && salario2 >= 800.01) {
            double aumento = salario2 * 0.10;
            double novosalario = salario2 + aumento;
            System.out.println("Novo salario: "+ftd.format(novosalario));
            System.out.println("Reajuste ganho: "+ftd.format(aumento));
            System.out.println("Em percentual: 10 %");
        }
        if (salario2 <= 2000 && salario2 >= 1200.01) {
            double aumento = salario2 * 0.07;
            double novosalario = salario2 + aumento;
            System.out.println("Novo salario: "+ftd.format(novosalario));
            System.out.println("Reajuste ganho: "+ftd.format(aumento));
            System.out.println("Em percentual: 7 %");
        }
        if (salario2 > 2000) {
            double aumento = salario2 * 0.04;
            double novosalario = salario2 + aumento;
            System.out.println("Novo salario: "+ftd.format(novosalario));
            System.out.println("Reajuste ganho: "+ftd.format(aumento));
            System.out.println("Em percentual: 4 %");
        }
    }
}
