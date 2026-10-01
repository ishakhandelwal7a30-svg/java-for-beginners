/*WAP in java to exceute a programm where we insert value of a and b and a >= b && !b < 10 
 the code inside the if statement will be executed and c will equal 3.*/

 public class decision_making_1{
    public static void main(String[] args) {
        int a = 12;
        int b = 11;    
        int c = 0;
        if (a >= b && !(b < 10)) {
            c = 2;
        }
        c += 1;
        System.out.println("c = " + c);
    }
}