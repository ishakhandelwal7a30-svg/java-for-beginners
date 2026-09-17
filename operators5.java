/* write a code to perform the following actions on two strings strr1="hello', str2="Hello"
   1. compare two strring using equals funcion whether both are same or different
   2. compare two strings using equalsIgnoreCase to check whether they are same or not */
  
public class operators5 {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "Hello";
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equalsIgnoreCase(str2);
        System.out.println("answer1: " + result1);
        System.out.println("answer2: " + result2);
    }
}
