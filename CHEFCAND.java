import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                int N = sc.nextInt();
                int X = sc.nextInt();
                
                if (X >= N) {
                    System.out.println(0);
                } else {
                    int needed = N - X;
                    int packets = (needed + 3) / 4;
                    System.out.println(packets);
                }
            }
        }
        sc.close(); 
    } 
} 
