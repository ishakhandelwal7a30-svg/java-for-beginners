/* You are given a code with initialization of count. 
Your task is to add the following operations, in this order:
    Use the increment operator (++) four times to add 4 to count
    Use the multiplication operator (*) to multiply count by 2
    Use the decrement operator (--) once to subtract 1 from count */

public class operators3 {
    public static void main(String[] args){
        int count=2;
        count++;//where count++ adds 1 to the value i.e count becomes 3
        count++; // count becomes 4
        count=count*2;//here 4*2=8 
        count--;
        System.out.println(count);
    }
    
}
