import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dias = s.nextInt();
        int anos = dias / 365;
        int meses = (dias % 365) / 30;
        int dias2 = (dias % 365) % 30;
        System.out.println(anos+ " ano(s)");
        System.out.println(meses+ " mes(es)");
        System.out.println(dias2+ " dia(s)");
    }
}
