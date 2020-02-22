public  class ArrayIndexTest
{
    public static void main(String args[])
{
    int num;
    int a[]=new int[args.length];
    double avg=0;

    for(int i=0;i<args.length;i++)
    {
        num=Integer.parseInt(args[i]);
        a[i]=num;
        avg=num;
        System.out.println("Number::"+num);


    }
    try {
        if(a.length!=5)
        {throw new ArrayIndexOutOfBoundsException();}
        else
        {
            avg=avg/a.length;
            System.out.println(avg);

        }

    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e+":Please pass 5 integer");
    }
}
}
