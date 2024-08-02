import java.util.Scanner;

public class impar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 != 0) {
            System.out.println(num);
        }
        for(int i = 0; i < 11; i++){
            num++;
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
}
}