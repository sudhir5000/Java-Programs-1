class Employee
{
    double salary=3000;
    
}
class Manager extends Employee
{
    double bonus=1000;
    void printSalary()
    {
        System.out.println("Total Salary="+(salary+bonus));
    }
public class SalarySimple
{
    public static void main(String []args)
    {
        Manager mgr=new Manager();
        mgr.printSalary();
    }
}
}