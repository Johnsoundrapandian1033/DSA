/*package comDSA;

import java.util.*;

public class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> pattern(int N) {
        int c = -5;
        if (N <= 0) {
            list.add(N);
            return list;
        } else {
            check(N, c);
        }
        return list;
    }

    void check(int val, int c) {
        if (!list.contains(val) && c == 5) return;
        else list.add(val);
        if (val <= 0) {
            c = 5;
        }
        check(val + c, c);
    }
}

public class Recursion_List_print_pattern {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> list = new ArrayList<>();
        int val = 16;
        list = sol.pattern(val);
        System.out.println(list);  // Print the list to verify the output
    }
}
*/