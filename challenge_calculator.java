/*build th logic for a calculator app that shall show basic operations like +,-,*,/ while taking the input from the user 
and shall show decimal places upto two places using printf function and %.2f */

import java.util.Scanner;
public class challenge_calculator {
    public static void main(String[] args) {
        System.out.println("Calculator App");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double sum=num1+num2;
        double diff=num1-num2;
        double product=num1*num2;
        double quotient=num1/num2;
        System.out.printf("Sum: %.2f",sum);
        System.out.printf("\nDifference: %.2f",diff);
        System.out.printf("\nProduct: %.2f",product);
        System.out.printf("\nQuotient: %.2f",quotient);

        
    }
}