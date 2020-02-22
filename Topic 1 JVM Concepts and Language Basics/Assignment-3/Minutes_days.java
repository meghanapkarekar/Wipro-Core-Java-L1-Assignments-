import java.util.Scanner;

public class Minutes_days {
    public static void main(String args[]) {

        double minutes_in_year=60*24*365;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter input ");
        double minutes= input.nextDouble();

        long years=(long)(minutes/minutes_in_year);
        int days=(int)(minutes/60/24)%365;
        System.out.println("Input from user:"+(int)minutes+"\nYears ="+years+"\n Days="+days);
    }

}
