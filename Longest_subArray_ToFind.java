package comDSA;
import java.util.*;
public class Longest_subArray_ToFind {
    class Solution{


        // Function for finding maximum and value pair
        public static int lenOfLongSubarr (int A[], int N, int K) {
            Map<Integer,Integer>map=new HashMap<>();
            map.put(0,-1);
            int maxLength =0,sum=0;
            for(int i =0 ; i<A.length;i++){
                sum+=A[i];
                if(map.containsKey(sum-K)){
                    maxLength = Math.max(maxLength,i-map.get(sum-K));
                }
                if(!map.containsKey(sum)){
                    map.put(sum,i);
                }
            }
            return maxLength;
        }


    }

}
