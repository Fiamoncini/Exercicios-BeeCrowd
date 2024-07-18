import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int hora = s.nextInt();
        int hora2 = s.nextInt();
        if (hora < hora2) {
            int tempoDecorrido = hora2 - hora;
            System.out.println(	"O JOGO DUROU "+tempoDecorrido+" HORA(S)");
        } else {
            int dia2 = (24 - hora) + hora2;
            System.out.println("O JOGO DUROU "+dia2+" HORA(S)");
        }
    }
 
}
