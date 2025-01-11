package comDSA;

public class Movezeros {
    public static void main(String args[]) {
        int[] nums = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        /*int i = 0, n = nums.length, j = i + 1, mid;
        while (j < n ) {
            if (nums[i] == 0 && nums[j] > nums[i]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[i] == 0 && nums[i]> nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            }
            else {
                i++;
                j++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
         }*/
        int i =0,j =0;
        for(i =0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int in = j;j<nums.length;j++){
            nums[i++] = 0;
        }

      }
    }

