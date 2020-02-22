 class Book
{
    long  isbn;float price;
    String title, author;

    Book(long  isbn, String title, String author, float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;


    }

    void displaydetails() {
        System.out.println("ISBN:" + isbn);
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
    }

    void discountedprice(int discount) {
        float Discounted_price = price-(price * discount/100);
        System.out.print("Discount: " + discount + "\nAmount to be Paid after Discount: " +Discounted_price);

    }

}

public class Book_details
{
   public static void main(String args[])
   {
       Book mybook=new Book(973329114,"A Time to Be Happy","Nayantara Sahgal",250);
       mybook.displaydetails();
       mybook.discountedprice(15);
   }
   }
