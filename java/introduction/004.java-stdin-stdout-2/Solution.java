
/*
Here is the Input Format and Output Format from the task:

Input Format
There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.

Output Format
There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Double j = scan.nextDouble();
        scan.nextLine();
        String i = scan.nextLine();
        
        

        // Write your code here.

        System.out.println("String: " + i);
        System.out.println("Double: " + j);
        System.out.println("Int: " + k);
    }
}
