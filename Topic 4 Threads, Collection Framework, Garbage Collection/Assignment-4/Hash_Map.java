import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap< String, String>  TelephoneBook = new HashMap < String, String>();

        TelephoneBook.put("SARA", "12345678");
        TelephoneBook.put("TARA", "6787348730");
        TelephoneBook.put("LARA", "678645730");
        TelephoneBook.put("MEG", "670967548730");
        TelephoneBook.put("CIA", "8765748730");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name=");
        String name=sc.next().toUpperCase();

        if(TelephoneBook.containsKey(name)) {
            System.out.println(name +"= "+TelephoneBook.get(name));
        }
    }
}