


import java.util.*;

public class Solution{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Integer sum = 0;

        List<int[]> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            queries.add(new int[]{a, b, n});
        }

        for(int[] i: queries){
            sum = i[0];
            for(int ii = 0; ii<i[2];ii++){
                sum = sum+ (int)( (Math.pow(2, ii))*i[1]);
                System.out.print(sum+" ");

            }
            System.out.println();
            sum=0;

        }
    }
}
