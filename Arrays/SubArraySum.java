//method 1: Brute Force approach, time complexity O(n^2) and space complexity O(1)
class SubArraySum{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == target) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }
                if (currentSum > target) {
                    break; // No need to continue if the sum has already exceeded the target
                }
            }
        }

        System.out.println("No subarray found");
    }
}

// Optimized version using sliding window technique, time complexity O(n) and space complexity O(1)
class SubArraySum{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;

        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}