

/*Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown n lines of input from stdin(System.in) until you reach EOF; 
each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the 
line content received as input. */


import java.util.*;

public class Solution {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lineNumber +=1;
            System.out.println(lineNumber + " "+ line);
            
        }
    }
}
