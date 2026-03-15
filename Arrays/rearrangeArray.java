class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0; // Pointer for even indices
        int neg = 1;  // Pointer for odd indices

        for (int num : nums) {
            if (num > 0) { // Positive number
                result[pos] = num;
                pos += 2; // Move to the next even index
            } else { // Negative number
                result[neg] = num;
                neg += 2; // Move to the next odd index
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, -2, 3, -4, 2};
        int[] rearranged = rearrangeArray(nums);
        for (int num : rearranged) {
            System.out.print(num + " ");  // Output: 1 -1 3 -2 -4 2
        }
    }
}