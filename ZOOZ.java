import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
           
            System.out.print("1");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("0");
            }
            System.out.println("1");
        }
        sc.close();
    }
}
