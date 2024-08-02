import java.util.Scanner;

public class pum {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j = 1;
        for(int i = 0; i < n; i++){
            System.out.print(j+" ");
            j++;
            System.out.print(j+" ");
            j++;
            System.out.print(j+" ");
            System.out.println("PUM");
            j += 2;
        }
    }
}
