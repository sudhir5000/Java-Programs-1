import java.util.Scanner;
public class Main{ 
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n=sc.nextInt();
        long c=sc.nextLong();
        
        
    long sum=0;
    for(int j=0;j<n;j++)
    {
        sum+=sc.nextInt();
    }
    if(sum<=c)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
}
}
}