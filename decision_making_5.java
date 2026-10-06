/*write a code which gets input two numbers n1 and n2 and a single char string op.
The possible values for op are +, -, / and *
Your task is to set the variable result based on the conditions:
if op is +, set result with n1 + n2.
if op is -, set result with n1 - n2.
if op is /, set result with n1 / n2.
if op is *, set result with n1 * n2.
Important: In Java, strings cannot be compared with ==. To compare a string, 
use the .equals() method instead. For example, to check if op is +, write: op.equals("+")*/

import java.util.Scanner;
public class decision_making_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n1 = scanner.nextInt(); 
        int n2 = scanner.nextInt(); 
        scanner.nextLine(); 
        String op = scanner.nextLine(); 
        double result = 0;
        result=(op.equals("+")) ? n1 + n2 :
                (op.equals("-")) ? n1 - n2 :
                (op.equals("*")) ? n1 * n2 :
                (op.equals("/")) ? (double)n1 / n2 : 0;
        
        System.out.println(result);
    }
}
