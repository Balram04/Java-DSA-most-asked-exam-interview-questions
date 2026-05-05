import java.util.*;
class MaxDifference {
    public static void main(String[] args) {
        MaxDifference md = new MaxDifference();
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(md.maxDifference(arr)); // Output: 8
    }

    public int maxDifference(int[] arr) {
        int min = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;
            maxDiff = Math.max(maxDiff, diff);
            min = Math.min(min, arr[i]);
        }

        return maxDiff;
    }
}