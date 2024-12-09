
/*If B <= 0 or H <= 0 , the output should be 
"java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. 
The next line contains H: the height of the parallelogram.

Output Format

If both values are greater than zero, then the main method must 
output the area of the parallelogram. Otherwise, print 
"java.lang.Exception: Breadth and height must be positive" without quotes. */


import java.util.*;

public class Solution {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int en = sc.nextInt();
        int uzun = sc.nextInt();
        int sahe = 0;

        try{
            if(uzun>0 && en>0){
                sahe =  en * uzun;
                System.out.println(sahe);
            }
            else{
                throw new Exception("Breadth and height must be positive");

            }
        }
        catch(Exception e){
            System.out.println("java.lang.Exception: " + e.getMessage());
        }

        
    }
}
