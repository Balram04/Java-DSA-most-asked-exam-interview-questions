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

### 17. Subarray with Sum K - [View Solution](Arrays/SubarrayWithSumk.java)
**Approach:**
1. Use outer loop to iterate through each starting position i
2. Initialize sum to 0 for each starting position
3. Use inner loop from j=i to find all subarrays starting at i
4. Add each element to sum and check if sum equals target
5. When match found, print subarray from index i to j

**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### 18. Remove Vowels - [View Solution](Arrays/RemoveVowels.java)
**Approach:**
1. Take string input from user using Scanner
2. Iterate through each character of the string
3. Check if character is not a vowel (both lowercase and uppercase)
4. If not a vowel, print the character
5. Continue until all characters are processed

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## 📝 String Problems

### 19. Check Anagram - [View Solution](String/Anagram.java)
**Approach:**
1. Take two strings as input and check if lengths are equal
2. Convert both strings to character arrays
3. Sort both character arrays using Arrays.sort()
4. Compare sorted arrays using Arrays.equals()
5. If equal, strings are anagrams; otherwise not

**Time Complexity:** O(n log n) | **Space Complexity:** O(n)

---

### 20. Check Only Digits - [View Solution](String/CheckOnlyDigit.java)
**Approach:**
1. Initialize boolean flag isOnlyDigits to true
2. Iterate through each character of the string
3. Use Character.isDigit() to check if character is a digit
4. If any character is not a digit, set flag to false and break
5. Print result based on final flag value

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 21. Count Frequency of All Characters - [View Solution](String/CountFreqAll.java)
**Approach:**
1. Convert string to character array
2. Create a boolean visited array to track processed characters
3. For each unvisited character, initialize count to 1
4. Compare with remaining characters and increment count for matches
5. Mark matching characters as visited and print character with frequency

**Time Complexity:** O(n²) | **Space Complexity:** O(n)

---

### 22. Find Duplicate Characters - [View Solution](String/FindDuplicate.java)
**Approach:**
1. Convert string to character array
2. Create boolean visited array to avoid reprocessing
3. Use nested loops to compare each character with subsequent ones
4. If duplicate found, print it and mark as visited
5. Break inner loop after finding first occurrence of duplicate

**Time Complexity:** O(n²) | **Space Complexity:** O(n)

---

### 23. First Non-Repeating Character - [View Solution](String/FirstNonRepeatingChar.java)
**Approach:**
1. Create frequency array of size 26 for lowercase letters
2. Traverse string and increment frequency for each character
3. Traverse string again to find character with frequency 1
4. Print first character with frequency 1 and return
5. If no non-repeating character found, print appropriate message

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 24. Longest Common Prefix - [View Solution](String/longestCommonPrefix.java)
**Approach:**
1. Take n strings as input and store in array
2. Sort the array of strings alphabetically
3. Compare only first and last string (extremes after sorting)
4. Increment index i while characters at position i match in both
5. Return substring from 0 to i as the longest common prefix

**Time Complexity:** O(n log n) | **Space Complexity:** O(n)

---

### 25. Longest Word in String - [View Solution](String/LongestWordString.java)
**Approach:**
1. Take sentence as input from user
2. Split the sentence into words array using space delimiter
3. Initialize longest variable as empty string
4. Iterate through words and compare length with longest
5. Update longest if current word has greater length

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 26. Palindrome String - [View Solution](String/PalindromString.java)
**Approach:**
1. Take string input and convert to lowercase
2. Store original string for comparison
3. Create StringBuilder with input string
4. Use reverse() method to reverse the string
5. Compare reversed string with original using equals()

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 27. Print All Substrings - [View Solution](String/PrintSubString.java)
**Approach:**
1. Get length of input string n
2. Use outer loop i from 0 to n-1 for starting positions
3. Use inner loop j from i to n-1 for ending positions
4. Use substring(i, j+1) to extract substring
5. Print each substring on new line

**Time Complexity:** O(n²) | **Space Complexity:** O(1)

---

### 28. Remove Spaces - [View Solution](String/RemoveSpace.java)
**Approach:**
1. Take string input with spaces
2. Use replace() method with parameters (" ", "")
3. Replace all space characters with empty string
4. Store result in new string variable
5. Print both original and space-removed strings

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 29. Reverse String - [View Solution](String/reverseString.java)
**Approach:**
1. Take string input from user
2. Initialize empty string rev for reversed result
3. Loop from last index (length-1) down to 0
4. Append each character to rev string
5. Print the reversed string

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 30. String Compression (Run Length Encoding) - [View Solution](String/shortWord.java)
**Approach:**
1. Initialize count to 1 for tracking consecutive characters
2. Loop from index 1 and compare each character with previous
3. If characters match, increment count
4. If different, print previous character with its count
5. Reset count to 1 and continue; handle last character separately

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 31. Valid Parentheses - [View Solution](String/ValidPrantheses.java)
**Approach:**
1. Create a Stack to store opening brackets
2. Iterate through each character in the string
3. If opening bracket, push to stack
4. If closing bracket, pop from stack and check if it matches
5. If stack is empty at end, parentheses are valid

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 32. Count Vowels and Consonants - [View Solution](String/VowelConsonantCount.java)
**Approach:**
1. Initialize vowels and consonants counters to 0
2. Convert string to lowercase for uniform checking
3. Iterate through each character using for-each loop
4. Check if character is letter; if yes, check if vowel using indexOf()
5. Increment respective counter and print both counts

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