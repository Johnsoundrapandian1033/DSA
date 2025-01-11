package comDSA;

public class ThirdMaximum {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        for(int i= 0; i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int count = 1;
        for (int i =nums.length-1 ; i>0;i--){
            if(nums[i] != nums[i-1]){
                count++;
            }
            if(count == 3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String args[]) {
        int[] a= {3,4,1,5,2};
        int b =thirdMax(a);
        System.out.println(b);

    }
}

