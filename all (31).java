
class Bank
{
    private String name="Sudhir";
    protected double money=500;
    
    public String getName()
    {
        return name;
    }
    public void show()
    {
        System.out.println(name+" has $"+money);
    }
}
class Savings extends Bank
{
    public void show()
    {
        System.out.println("Savings account-"+getName()+":$"+money);
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Bank account=new Savings();
        account.show();
    }
}