import java.util.Scanner;
class Shape
{
    void showArea()
    {
        System.out.println("No area calculated");
    }
    class Square extends Shape
    {
        double side=4;
    
    void showArea()
    {
        System.out.println("Square Area " +(side * side));
    }
    public class Main{
    public static void main (String[] args) {
        Shape myShape=new Shape();
        myShape.showArea();
    }
}
}
}