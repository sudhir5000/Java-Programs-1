import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int h = sc.nextInt();
            float c = sc.nextFloat();
            int ts = sc.nextInt();

            boolean cond1 = h > 50;
            boolean cond2 = c < 0.7;
            boolean cond3 = ts > 5600;

            if(cond1 && cond2 && cond3)
            {
                System.out.println(10);
            }
            else if(cond1 && cond2)
            {
                System.out.println(9);
            }
            else if(cond2 && cond3)
            {
                System.out.println(8);
            }
            else if(cond1 && cond3)
            {
                System.out.println(7);
            }
            else if(cond1 || cond2 || cond3)
            {
                System.out.println(6);
            }
            else
            {
                System.out.println(5);
            }
        }
    }
}