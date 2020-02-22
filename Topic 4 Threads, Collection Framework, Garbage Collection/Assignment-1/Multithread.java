public class Multithread {
    public static void main(String args[]) {

        for(int n=1;n<6;n++)
        {
            int random=(int)(Math.random()*10);
            System.out.println("Number:"+random);

            int fact=1;
            if(random==0)
            {
                System.out.println("Factorial of :"+random+ ":1 ");
            }
            else {
                for (int i = 1; i <= random; i++)
                {
                    fact=fact*i;
                }
                System.out.println("Factorial of "+random+":"+fact);
            }
            }
        }

    }



