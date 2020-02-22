import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String args[])
    {
        int sum=0,digit=0,results=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter digits to find sum of digits:");
        digit= (int) input.nextDouble();

        if(digit>999 && digit<=9999)
        {
            while (digit != 0) {
                sum = sum + digit % 10;
                digit = digit / 10;

            }
            System.out.println("The sum of all the digits entered is :" + sum);
        }
        else {
            System.out.print("Digit should be enter 4 digit only");
        }


    }
}
