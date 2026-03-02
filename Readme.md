# Java DSA Problems & Solutions

## 📚 Array Problems

### 1. Two Sum - [View Solution](Arrays/twoSum.java)
**Approach:**
1. Create a HashSet to store visited numbers
2. Iterate through the array elements using for-each loop
3. For each element x, calculate the need (target - x)
4. Check if need exists in HashSet; if yes, pair found and print result
5. Otherwise, add current element to HashSet and continue

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 2. Find Duplicate Elements - [View Solution](Arrays/findDuplicate.java)
**Approach:**
1. Take array size and elements as input from user
2. Use nested loops: outer loop from i=0 to size-1
3. Inner loop from j=i+1 to size-1 to compare with remaining elements
4. If arr[i] == arr[j], print duplicate and break inner loop
5. Use boolean flag to track if any duplicate was found

**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### 3. Find Min & Max - [View Solution](Arrays/MinMax.java)
**Approach:**
1. Initialize maxValue to Integer.MIN_VALUE and minValue to Integer.MAX_VALUE
2. Traverse through the entire array
3. Compare each element with current maxValue and update if greater
4. Compare each element with current minValue and update if smaller
5. Display both min and max values after traversal

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 4. Second Largest Element - [View Solution](Arrays/secondLargest.java)
**Approach:**
1. Initialize maxValue and secondMaxValue to Integer.MIN_VALUE
2. Traverse the array once element by element
3. If element > maxValue, update secondMaxValue = maxValue then maxValue = element
4. Else if element > secondMaxValue and element != maxValue, update secondMaxValue
5. Print secondMaxValue after complete traversal as result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 5. Reverse Array - [View Solution](Arrays/Revers.java)
**Approach:**
1. Initialize two pointers: st at index 0 and end at last index (size-1)
2. Swap elements at st and end positions using temp variable
3. Increment st pointer and decrement end pointer
4. Continue while loop until end > st condition becomes false
5. Print the reversed array elements

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 6. Rotate Array - [View Solution](Arrays/rotate.java)
**Approach:**
1. Create a Swap helper function that reverses array section using two pointers
2. Handle edge case: calculate k = k % size to optimize rotations
3. Reverse first (size - k) elements using Swap function
4. Reverse last k elements using Swap function
5. Reverse the entire array to get final rotated array

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 7. Move Zeros to End - [View Solution](Arrays/moveZero.java)
**Approach:**
1. Initialize count variable to 0 to track position of non-zero elements
2. Traverse array and check if current element is non-zero
3. If non-zero, place element at count index and increment count
4. After traversal, fill remaining positions from count to end with zeros
5. Result: all non-zeros moved to front, all zeros at end

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 8. Frequency Count - [View Solution](Arrays/FreqCount.java)
**Approach:**
1. Create a boolean visited array to track processed elements
2. For each unvisited element, initialize count to 1
3. Compare with all subsequent elements and increment count if match found
4. Mark matching elements as visited to avoid reprocessing
5. Print element with its frequency count

**Time Complexity:** O(n²) | **Space Complexity:** O(n)

---

### 9. Equilibrium Index - [View Solution](Arrays/EquilibriumIndx.java)
**Approach:**
1. Calculate total sum of all array elements first
2. Initialize leftSum to 0 and rightSum to totalSum
3. Traverse array: first subtract current element from rightSum
4. Check if leftSum equals rightSum; if yes, equilibrium index found
5. Add current element to leftSum for next iteration

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 10. Maximum Sum Subarray (Kadane's Algorithm) - [View Solution](Arrays/MaxSumSubArray.java)
**Approach:**
1. Initialize maxSum to Integer.MIN_VALUE and currentSum to 0
2. Traverse array and add each element to currentSum
3. If currentSum exceeds maxSum, update maxSum
4. If currentSum becomes negative, reset it to 0
5. Return maxSum as the result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 11. Subarray with Given Sum - [View Solution](Arrays/SubArraySum.java)
**Approach:**
1. Initialize currentSum to 0 and start pointer to 0
2. Use end pointer loop from 0 to array length
3. Add arr[end] to currentSum and expand window
4. While currentSum > target, shrink window by subtracting arr[start] and incrementing start
5. If currentSum equals target, print start and end indices

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## 🔢 Number Theory Problems

### 12. Armstrong Number - [View Solution](Arrays/amstrong.java)
**Approach:**
1. Take number as input and store original value for comparison
2. Count total digits in the number using a while loop
3. Extract each digit using modulo 10 operation
4. Calculate sum of each digit raised to power of digit count
5. Compare final sum with original number to check if Armstrong

**Time Complexity:** O(d) where d is number of digits | **Space Complexity:** O(1)

---

### 13. Armstrong Numbers in Range - [View Solution](Arrays/ArmstrongInRange.java)
**Approach:**
1. Take start and end range as input
2. For each number in range, count its digits
3. Calculate sum of powers of digits
4. Compare sum with original number
5. If match found, print the Armstrong number

**Time Complexity:** O(n*d) where n is range size | **Space Complexity:** O(1)

---

### 14. GCD (Greatest Common Divisor) - [View Solution](Arrays/gcd.java)
**Approach:**
1. Take two numbers as input from user
2. Find the smaller of the two numbers using Math.min()
3. Initialize gcd variable to 1
4. Loop from 1 to smaller number and check if both numbers divisible by i
5. Update gcd with current value i whenever divisibility condition is satisfied

**Time Complexity:** O(min(a,b)) | **Space Complexity:** O(1)

---

### 15. Rearrange Array by Sign - [View Solution](Arrays/rearrangeArray.java)
**Approach:**
1. Create a result array of same size as input array
2. Initialize pos pointer to 0 (for even indices) and neg pointer to 1 (for odd indices)
3. Iterate through input array using for-each loop
4. If num > 0, place it at result[pos] and increment pos by 2
5. If num is negative, place it at result[neg] and increment neg by 2

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 16. Stock Buy and Sell (Best Time to Buy and Sell Stock) - [View Solution](Arrays/StockBuySell.java)
**Approach:**
1. Initialize minPrice to Integer.MAX_VALUE and maxProfit to 0
2. Iterate through prices array using for-each loop
3. If current price < minPrice, update minPrice with current price
4. Else if (price - minPrice) > maxProfit, update maxProfit
5. Return maxProfit as the result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## 🚀 Getting Started

1. Clone this repository
2. Navigate to the JAVA coding directory
3. Compile any Java file: `javac filename.java`
4. Run the compiled file: `java filename`

## 📝 Note
- All solutions include comments explaining the logic
- Time and space complexity mentioned for each solution
- Some problems include both brute force and optimized approaches