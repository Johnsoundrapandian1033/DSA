package comDSA;

public class SortArrayByParity {
    public static int[] parity(int[] nums){
        int st=0,end = nums.length-1;
        while(st < end){
            if(nums[st]%2==1 && nums[end]%2==0){
                int temp =nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
            else if(nums[st]%2==0) st++;
            else end--;
        }
        return nums;
    }
    public static void main(String args[]){
        int[] a ={3,1,4,5,2,8};
        int[] b = parity(a);
        for(int i = 0;i < b.length;i++){
            System.out.println(b[i]);
        }
    }
}
