package comDSA;//import static java.io.ObjectInputFilter.merge;

public class ZeroReplaceElements{
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6 };
        int n = 3;
        // int length = nums1.length;
        int j =0;
        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        for( int k =0 ; k < nums1.length-1;k++)
        {
            for(int l =k+1;l<nums1.length;l++)
            {
                if(nums1[k] > nums1[l])
                {
                    int temp  = nums1[k];
                    nums1[k] = nums1[l];
                    nums1[l] = temp;
                }
            }
        }
        // System.out.print("[");
        int idx = 0;
        for( int k= 0; k< nums1.length;k++){
            System.out.println(nums1[k]);
        }
    }
}