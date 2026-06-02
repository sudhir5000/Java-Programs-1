public class Main {
    public static void main(String[] args) {
        int lines = 4;
        int stars = 4;

       
        for (int i = 1; i <= lines; i++) {
           
            for (int j = 1; j <= stars; j++) {
                System.out.print("*"); 
            }
            
            System.out.println();
        }
    }
}
