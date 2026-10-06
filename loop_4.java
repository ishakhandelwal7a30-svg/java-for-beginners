/*You are given a code that prints the numbers from 1 to 20 (including).
Your task is to add if and break statements so that only the numbers 
from 1 to 15 will be printed, the loop will exit before printing the numbers from 16 to 20.*/

public class loop_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i==16){
                break;
            }
            System.out.println(i);
        }
    }
}