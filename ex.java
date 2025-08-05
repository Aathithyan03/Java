import java.io.*;
import java.util.Scanner;
class ex
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x=sc.nextInt();
        System.out.print("Enter the value of y: ");
        y=sc.nextInt();

        //if statement
        if(x>y)
        {
            System.out.println(x + " is greater than " + y );
        }

        //if else statement
        if(x<y)
        {
            System.out.println(x + " is smaller than " + y );
        }
        else
        {
            System.out.println(x + " is greater than " + y );
        }

        //else if statement
        if(x<y)
        {
            System.out.println(x + " is smaller than " + y );
        }
        else if(x>y)
        {
            System.out.println(x + " is greater than " + y );
        }
        else
        {
            System.out.println(x + " is equal to " + y );
        }
    }
}