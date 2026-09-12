/* write a code that initialises the following variables
1. k with value 88
2. PI with value 3.14
3. name with text "bob" */

public class variable6 {
    public static void main(String[] args) {
        int k = 88;
        final double PI = 3.14;
        String name = "bob";

        // Correct way to concatenate strings with variables
        System.out.println("k: " + k);
        System.out.println("PI: " + PI);
        System.out.println("Name: " + name);
    }
}

