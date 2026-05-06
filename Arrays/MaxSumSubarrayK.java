//brute force 
// for (int i = 0; i <= n - k; i++) {
//     int sum = 0;
//     for (int j = i; j < i + k; j++) {
//         sum += arr[j];
//     }
//     maxSum = Math.max(maxSum, sum);
// }

//“Brute force me har window ka sum recompute ho raha tha. Sliding window me hum previous sum reuse karke sirf entering aur exiting elements adjust karte hain.”
public class MaxSumSubarrayK {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid: k is greater than array size");
            return;
        }

        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // slide window
        for (int i =1; i < n; i++) {
            sum = sum - arr[i -1] + arr[i + k -1];  // remove exiting element and add entering element
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}

//Dry run with arr = [2, 1, 5, 1, 3, 2] and k = 3
// [2, 1, 5] → sum = 8

// Slide →
// (remove 2, add 1)

// [1, 5, 1] → sum = 7

// Slide →
// (remove 1, add 3)

// [5, 1, 3] → sum = 9