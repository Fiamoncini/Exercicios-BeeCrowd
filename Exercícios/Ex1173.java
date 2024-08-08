import java.text.DecimalFormat;
import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        DecimalFormat ftd = new DecimalFormat("0");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        float[] lista = new float[11];
        float adicionar = 0;
        adicionar = num;
        if (num <= 50) {
            lista[0] = num;
            for(int i = 1; i < lista.length; i++){
                lista[i] = adicionar * 2;
                adicionar = lista[i];
            }
            for(int i = 0; i < lista.length; i++){
                System.out.println("N["+i+"] = " +ftd.format(lista[i]));
            }
        }
        }
    }