package comDSA;
import java.util.*;
public class DissapearedInArray {
    public static ArrayList<Integer>findDissapeardNumber(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if ( !numSet.contains(i)) {
              numList.add(i);
            }
        }
        return (ArrayList<Integer>) numList;
    }
    public static void main(String args[]){
         int[] a= {5,7,3,11,10,9,4,1,8};
         List<Integer>disapeard = new ArrayList<>();
         //DissapearedInArray dis = new DissapearedInArray();

           disapeard= findDissapeardNumber(a);
             System.out.println(disapeard);

    }
}
