import java.util.*;
public class _135_MinAbsdiffPairs {
    public static void main(String[] args) {
        int A[] ={4,1,8,7};
        int B[] = {2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int minsum= 0;
        for(int i = 0 ;i<A.length ;i++){
            minsum += Math.abs(B[i]-A[i]);
        }
        System.out.println(minsum);
    }
}
