 /* write a code your to assign boolean values (true or false) to variables b1, b2, and b3 so
  that b4 evaluates to true.The variable b4 is calculated using the following logic:
   It performs an AND operation (&&) between b1, b2, and the NOT of b3
   For b4 to be true, all parts of the AND operation must be true */

   public class operators6{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = b1 && b2 && (!b3);
        System.out.println("b4 = " + b4);

    }
   }
