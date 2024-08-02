import java.util.Scanner;

public class Ex1073 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i2 = 0;
        int i3 = 0;
        if (n > 5 && n < 2000) {
            for(int i = 1; i <= n; i++){
                if (i % 2 == 0) {
                    i3 += i;
                    i2 = i3 *= i3;
                    System.out.println(i+"^2 = "+ i2);
                    i3 = 0;
                }
            }
        }
    }
}