import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            int needed = x - y;
            boolean possible = false;
            
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                
                // If notebook fits pages and budget
                if (p >= needed && c <= k) {
                    possible = true;
                }
            }
            
            System.out.println(possible ? "LuckyChef" : "UnluckyChef");
        }
        sc.close();
    }
}
