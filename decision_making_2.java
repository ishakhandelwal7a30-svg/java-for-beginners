/*WAP which gets as input a number that indicates the wind speed and stores it in a variable 
named wind.
Your task is to initialize variable status based on the conditions:

"Calm" if wind is smaller than 8,
"Breeze" if wind is between 8 and 31 (including 8 and 31).
"Gale" if wind is between 32 and 63 (including 32 and 63)
"Storm" otherwise*/

import java.util.Scanner; // Scanner is pre defined class in java
public class decision_making_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value"); // where scanner is now assigned that it shall take input from user
        int wind = scanner.nextInt(); 
        String status = "unset";
        if (wind<8) {
            status="Calm";
        }else if (wind>=8 && wind<=31){
            status="Breeze";
        }else if (wind>=32 && wind<=63){
            status="Gale";
        }else{
            status="Storm";
        }
        System.out.println("status = " + status);
        scanner.close(); // Closing the scanner after use
    }
}