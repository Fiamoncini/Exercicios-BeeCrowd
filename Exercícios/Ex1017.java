import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempogasto = input.nextInt();
        float velmedia = input.nextFloat();
        double distancia = tempogasto * velmedia;
        double consumo = distancia / 12;
        DecimalFormat ftd = new DecimalFormat("0.000");
        System.out.println(ftd.format(consumo));
    }
}
