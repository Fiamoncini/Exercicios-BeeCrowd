import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double divisao = 0;
        for(int i = 0; i < n; i++){
            double num1 = s.nextDouble();
            double num2 = s.nextDouble();
            if (num2 != 0) {
                divisao = num1 / num2;
                System.out.println(divisao);
            } else{
                System.out.println("divisao impossivel");
            }
        }
    }
 
}
