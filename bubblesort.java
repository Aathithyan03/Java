import java.util.Scanner;
class bubblesort
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers to sort:");
        int num = input.nextInt();
        int [] array = new int[num];

        System.out.println("Enter"+num+"integer:");
        for(int i=0;i<num;i++)
        {
            array[i]=input.nextInt();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-1;j++)
            {
                if(array[j]>array[i])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                 }
            }
    
        }
        System.out.println("Sorted list:");
        for(int i=0;i<num;i++)
        {
            System.out.println(array[i] +" ");
        }
    }
}
