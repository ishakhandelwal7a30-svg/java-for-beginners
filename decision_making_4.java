/*Create a program that checks if a number is positive, negative, or zero using the ternary 
operator. The program should:
Take an integer input from the user.
Use the ternary operator to determine if the number is positive, negative, or zero.
Print the result in the format: "The number is [positive/negative/zero]". */


import java.util.Scanner;

public class Ma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        
        // Write your code below
        result=(number>0) ? "positive":(number<0) ? "negative":"zero";
        
        System.out.println("The number is " + result);
        scanner.close();
    }
}

