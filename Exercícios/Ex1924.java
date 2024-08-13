import java.util.Scanner;
public class Ex1924 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String resposta = "";
        if (num > 1 && num < 2000) {
            for(int i = 0; i < num; i++){
                resposta = s.next();
                if (resposta.length() < 1 || resposta.length() >= 100) {
                    return;
                }
            }
        }
        System.out.println("Ciencia da Computacao");
        }
    }

