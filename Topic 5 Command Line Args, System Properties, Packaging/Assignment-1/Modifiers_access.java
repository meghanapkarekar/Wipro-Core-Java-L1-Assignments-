import testpackage.*;

public class Modifiers_access {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();

        foundation.Var4 = 5;

        System.out.println("Only Variable 4 is accessible::"+foundation.Var4);
    }
}
