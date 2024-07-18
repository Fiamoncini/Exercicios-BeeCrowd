import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        while (true) {
            System.out.println("I="+i + " J="+j);
            j -= 1;
            System.out.println("I="+i + " J="+j);
            j -= 1;
            System.out.println("I="+i + " J="+j);
            j += 2;
            i += 2;
            if (i == 11) {
                break;
            }
            }
        }
}
