public class Majority {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate)
                count++;
            else
                count--;
        }


        // Step 2: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate)
                count++;
        }

        if (count > nums.length / 2)
            return candidate;

        return -1; // no majority element
    }
}

//approach 2: using HashMap to count frequency of each element and find the one with count > n/2. Time complexity: O(n) and space complexity: O(n) in worst case if all elements are unique.
import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // if no majority element
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElement(nums));
    }
}