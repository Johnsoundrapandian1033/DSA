package comDSA;

import java.util.*;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        // Convert the numbers to strings
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i]"+nums[i]);
            strs[i] = String.valueOf(nums[i]);
        }

        // Sort the array using a custom comparator
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        System.out.println((strs[1]+strs[0]).compareTo(strs[0]+strs[1]));
        for(int i =0 ; i<strs.length;i++){
            System.out.println("strs[i]"+strs[i]);
        }

        // If the largest number is "0", the result is "0"
        if (strs[0].equals("0")) {
            return "0";
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        System.out.println("Output: " + largestNumber(nums1)); // Output: "210"

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Output: " + largestNumber(nums2)); // Output: "9534330"
    }
}

