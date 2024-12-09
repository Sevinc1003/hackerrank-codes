import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String aa = a.substring(0, 1).toUpperCase()+a.substring(1, a.length()); 
        
        String bb = b.substring(0, 1).toUpperCase()+b.substring(1, b.length());
        
        
        
        
        System.out.println(a.length()+b.length());
        System.out.println((a.compareTo(b)>0) ? "Yes" : "No");
        System.out.print(aa+" ");
        System.out.print(bb);
        
        
    }
}
