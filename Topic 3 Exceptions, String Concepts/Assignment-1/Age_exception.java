
class InvalidAgeException extends Exception{
    @Override
    public String toString() {
        return ("Age must be >=18 and <60");
    }
}

public class Age_exception {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        if(age>=18 && age<60)
            System.out.println(name+" has proper Age");
        else
            try {
                throw new InvalidAgeException();
            }
            catch(InvalidAgeException ex) {
                ex.printStackTrace();
            }
    }

}