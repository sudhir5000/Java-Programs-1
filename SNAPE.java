import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            double b = sc.nextDouble();
            double ls = sc.nextDouble();

            double minRS = Math.sqrt((ls * ls) - (b * b));
            double maxRS = Math.sqrt((ls * ls) + (b * b));

            System.out.println(minRS + " " + maxRS);
        }
    }
}