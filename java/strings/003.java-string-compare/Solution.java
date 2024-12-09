import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(getSmallestAndLargest(s, k));
        
      //qwerty  qwer wert erty
      
     }
     
     public static String getSmallestAndLargest(String s, int k){
        ArrayList<String> array = new ArrayList<>();
        
        for(int i = 0; i<=s.length()-k; i++){
            array.add(s.substring(i, i+k));
        }
        Collections.sort(array);
        String finall = array.get(0)+ "\n" + array.get(array.size()-1);
        
        return finall;
     }
}
