public class modifier 
{
    public static void main(String[] args) 
    {
       AccessModifiersDemo obj = new AccessModifiersDemo ();
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicMethod();

        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod();

        System.out.println("Default Variable: " + obj.defaultVar);
        obj.defaultMethod();

        obj.showPrivate();
    }
}
class AccessModifiersDemo 
{
    public int publicVar = 10;
    public void publicMethod() 
    {
        System.out.println("Public method called");
    }

    private int privateVar = 20;
    private void privateMethod() 
    {
        System.out.println("Private method called");
    }

    protected int protectedVar = 30;
    protected void protectedMethod() 
    {
        System.out.println("Protected method called");
    }

    int defaultVar = 40;
    void defaultMethod() 
    {
        System.out.println("Default method called");
    }

    public void showPrivate() {
        System.out.println("Private Variable: " + privateVar);
        privateMethod();
    }
}

