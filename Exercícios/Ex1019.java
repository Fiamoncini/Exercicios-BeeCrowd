import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tempoTotalSegundos = input.nextInt();
        int horas = tempoTotalSegundos / 3600;
        int minutos = (tempoTotalSegundos % 3600) / 60;
        int segundos = tempoTotalSegundos % 60;
        System.out.printf("%d:%01d:%01d\n", horas, minutos, segundos);
        input.close();
    }
}
