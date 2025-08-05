class emp
{
    String name;
    int salary;
    emp(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Enter employee name:"+name);
        System.out.println("Enter employee salary:"+salary);
    }
}
public class emp1
{
    public static void main(String args[])
    {
        emp obj=new emp("aathi",50000);
        obj.display();
    }
}