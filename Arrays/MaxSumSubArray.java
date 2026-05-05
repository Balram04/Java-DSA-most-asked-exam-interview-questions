public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
 
        for (int x : arr) {
            currentSum += x;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum sum of a contiguous subarray is: " + maxSum);
    }
}