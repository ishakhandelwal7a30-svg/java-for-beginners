/*You are given a code that prints the numbers from 1 to 20 (including).
Your task is to add if and continue statements so that only even numbers will be printed 
(2, 4, 6, ...). */

public class loop_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}