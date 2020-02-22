class Book1 {
    long isbn=12345678;
    float price=400;
    String title="A Time to Be Happy";
    Book1()

    {
        System.out.println("ISBN  "+isbn);
        System.out.println("Price "+price);
        System.out.println("Title "+title);


    }


}

class Magazine extends Book1
{
    String type;
    Magazine(String type)
    {

        System.out.println("Type "+type);
    }

}
class Novel extends Book1
{
    String author;
    Novel(String author)
    {

        System.out.println("Author "+author);
    }

}
        public class TestInheritance {
            public static void main(String args[]) {

                Magazine m=new Magazine("Fiction");
                System.out.println("------------------------------------");

                Novel n=new Novel("Nayantara Sahgal");



            }
        }

