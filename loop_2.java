/*Write a program that gets one input, double number.
Use a while loop to divide the input by 2 as long as the number is bigger or equal to 3.5.
Print the first number that is smaller than 3.5.*/

import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        double num=scanner.nextDouble();
        while(num>=3.5){
            num/=2;
        }
        System.out.println(num);
        scanner.close();
    }
}