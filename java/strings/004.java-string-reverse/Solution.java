
/*A palindrome is a word, phrase, number, or other sequence of characters 
which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

*/


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] array = word.toCharArray();

        String wordRev = "";
        for (char charr : array) {
            wordRev = charr + wordRev;
        }

        System.out.println((word.equals(wordRev)) ? "Yes" : "No");

    }

}



        

        

          

    

     

                   

        
    