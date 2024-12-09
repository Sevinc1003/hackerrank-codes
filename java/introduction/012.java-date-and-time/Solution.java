
/*You are given a date. You just need to write the method, getDay, 
which returns the day on that date. To simplify your task, we have 
provided a portion of the code in the editor.

Example
month = 8
day = 14
year = 2017


The method should return MONDAY as the day on that date. */


import java.io.*;
import java.time.LocalDate;

class Result {

    //method which i wrote
    public static String findDay(int month, int day, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        String dayName = date.getDayOfWeek().name();
        
        return dayName;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
