import java.util.Scanner;

public class Largest_Number {
    public static void main(String args[])
    {
        int n,max;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        n=s.nextInt();
        int array_numbers[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            array_numbers[i]=s.nextInt();

        }
        max=array_numbers[0];
        for(int i=0;i<n;i++)
        {
            if(max <array_numbers[i])
            {
                max=array_numbers[i];
            }

        }
        System.out.println("Maximum value: "+max);
    }
}
