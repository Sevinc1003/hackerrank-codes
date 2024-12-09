
/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and 
each integer will be in the inclusive range from 0 to 999.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original 
input has less than three digits, you must pad your output's leading digits with zeroes. */


import java.util.*;

public class Solution{
    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, StringBuilder> verilen = new LinkedHashMap<>();



        for(int i = 0; i<3; i++){
            String inp = sc.nextLine();
            String[] splitted = inp.split(" ");

            verilen.put(splitted[0], new StringBuilder(splitted[1]));
        
        }

        for(StringBuilder i : verilen.values()){
            if(i.length()<=3){
                while(i.length()<3){
                    i.insert(0, "0");
                }
            }
        }



        System.out.println("================================");

        for(String i : verilen.keySet()){
            System.out.println(i+ " ".repeat(15-i.length()) + verilen.get(i));
        }

        System.out.println("================================");
    }
}
