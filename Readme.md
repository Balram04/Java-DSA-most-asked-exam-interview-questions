# Java DSA Problems & Solutions

Each problem now follows this format:
1. Question
2. At least one test case
3. Existing solution approach and complexity

## Input Basics

### 1. Input Without Size - [View Solution](InputWithoutSize.java)
**Question:** Read array elements without taking size first.

**Test Case:**
- Input: `10 20 30 40`
- Output: `10 20 30 40 Size of array: 4`

**Approach:**
1. Read full line using Scanner or BufferedReader
2. Split line into tokens
3. Convert tokens to integer array
4. Print values and array size

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 2. Input With Size - [View Solution](inputwithSIze.java)
**Question:** Read array size first, then read exactly that many elements.

**Test Case:**
- Input:
	`5`
	`1 2 3 4 5`
- Output:
	`1`
	`2`
	`3`
	`4`
	`5`

**Approach:**
1. Read `size`
2. Create array of length `size`
3. Read `size` elements into array
4. Print array

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

## Array Problems

### 3. Two Sum - [View Solution](Arrays/twoSum.java)
**Question:** Given an array and target, find whether a pair exists whose sum is target.

**Test Case:**
- Input: `arr = [2,7,11,15], target = 9`
- Output: `Pair found: 2 and 7`

**Approach:**
1. Create a HashSet to store visited numbers
2. Iterate through the array elements using for-each loop
3. For each element x, calculate the need (target - x)
4. Check if need exists in HashSet; if yes, pair found and print result
5. Otherwise, add current element to HashSet and continue

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 4. Find Duplicate Elements - [View Solution](Arrays/findDuplicate.java)
**Question:** Find and print duplicate elements from an array.

**Test Case:**
- Input: `arr = [1,3,4,2,2,3]`
- Output: `2 3`

**Approach:**
1. Take array size and elements as input from user
2. Use nested loops: outer loop from i=0 to size-1
3. Inner loop from j=i+1 to size-1 to compare with remaining elements
4. If arr[i] == arr[j], print duplicate and break inner loop
5. Use boolean flag to track if any duplicate was found

**Time Complexity:** O(n^2) | **Space Complexity:** O(1)

---

### 5. Remove Duplicate Elements - [View Solution](Arrays/RemoveDuplicate.java)
**Question:** Remove repeated elements and keep only first occurrence order.

**Test Case:**
- Input: `arr = [1,8,6,6,2,7,7,5]`
- Output: `1 8 6 2 7 5`

**Approach:**
1. Use nested loop method to print unique elements only once
2. Alternate method: use `LinkedHashSet` to preserve insertion order

**Time Complexity:** O(n^2) brute force, O(n) with LinkedHashSet | **Space Complexity:** O(1) brute force, O(n) set

---

### 6. Find Min & Max - [View Solution](Arrays/MinMax.java)
**Question:** Find minimum and maximum element in an array.

**Test Case:**
- Input: `arr = [4,2,9,1,7]`
- Output: `Min = 1, Max = 9`

**Approach:**
1. Initialize maxValue to Integer.MIN_VALUE and minValue to Integer.MAX_VALUE
2. Traverse through the entire array
3. Compare each element with current maxValue and update if greater
4. Compare each element with current minValue and update if smaller
5. Display both min and max values after traversal

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 7. Second Largest Element - [View Solution](Arrays/secondLargest.java)
**Question:** Find second largest distinct element in an array.

**Test Case:**
- Input: `arr = [10,20,4,45,99]`
- Output: `Second Largest = 45`

**Approach:**
1. Initialize maxValue and secondMaxValue to Integer.MIN_VALUE
2. Traverse the array once element by element
3. If element > maxValue, update secondMaxValue = maxValue then maxValue = element
4. Else if element > secondMaxValue and element != maxValue, update secondMaxValue
5. Print secondMaxValue after complete traversal as result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 8. Reverse Array - [View Solution](Arrays/Revers.java)
**Question:** Reverse an array in-place.

**Test Case:**
- Input: `arr = [1,2,3,4,5]`
- Output: `5 4 3 2 1`

**Approach:**
1. Initialize two pointers: st at index 0 and end at last index (size-1)
2. Swap elements at st and end positions using temp variable
3. Increment st pointer and decrement end pointer
4. Continue while loop until end > st condition becomes false
5. Print the reversed array elements

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 9. Rotate Array - [View Solution](Arrays/rotate.java)
**Question:** Rotate an array to the right by `k` positions.

**Test Case:**
- Input: `arr = [1,2,3,4,5], k = 2`
- Output: `4 5 1 2 3`

**Approach:**
1. Create a Swap helper function that reverses array section using two pointers
2. Handle edge case: calculate k = k % size to optimize rotations
3. Reverse first (size - k) elements using Swap function
4. Reverse last k elements using Swap function
5. Reverse the entire array to get final rotated array

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 10. Move Zeros to End - [View Solution](Arrays/moveZero.java)
**Question:** Move all zeros to the end while maintaining non-zero element order.

**Test Case:**
- Input: `arr = [0,1,0,3,12]`
- Output: `1 3 12 0 0`

**Approach:**
1. Initialize count variable to 0 to track position of non-zero elements
2. Traverse array and check if current element is non-zero
3. If non-zero, place element at count index and increment count
4. After traversal, fill remaining positions from count to end with zeros
5. Result: all non-zeros moved to front, all zeros at end

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 11. Frequency Count - [View Solution](Arrays/FreqCount.java)
**Question:** Count frequency of each element in an array.

**Test Case:**
- Input: `arr = [1,2,2,3,1]`
- Output: `1->2, 2->2, 3->1`

**Approach:**
1. Create a boolean visited array to track processed elements
2. For each unvisited element, initialize count to 1
3. Compare with all subsequent elements and increment count if match found
4. Mark matching elements as visited to avoid reprocessing
5. Print element with its frequency count

**Time Complexity:** O(n^2) | **Space Complexity:** O(n)

---

### 12. Equilibrium Index - [View Solution](Arrays/EquilibriumIndx.java)
**Question:** Find an index where left-side sum equals right-side sum.

**Test Case:**
- Input: `arr = [1,3,5,2,2]`
- Output: `Equilibrium index = 2`

**Approach:**
1. Calculate total sum of all array elements first
2. Initialize leftSum to 0 and rightSum to totalSum
3. Traverse array: first subtract current element from rightSum
4. Check if leftSum equals rightSum; if yes, equilibrium index found
5. Else Add current element to leftSum for next iteration and check again till found

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 13. Maximum Sum Subarray (Kadane's Algorithm) - [View Solution](Arrays/MaxSumSubArray.java)
**Question:** Find the maximum sum among all contiguous subarrays.

**Test Case:**
- Input: `arr = [-2,1,-3,4,-1,2,1,-5,4]`
- Output: `6`

**Approach:**
1. Initialize maxSum to Integer.MIN_VALUE and currentSum to 0
2. Traverse array and add each element to currentSum
3. If currentSum exceeds maxSum, update maxSum
4. If currentSum becomes negative, reset it to 0
5. Return maxSum as the result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 14. Subarray with Given Sum - [View Solution](Arrays/SubArraySum.java)
**Question:** Find a contiguous subarray whose sum equals target.

**Test Case:**
- Input: `arr = [1,2,3,4,5], target = 9`
- Output: `Subarray found from index 1 to 3`

**Approach:**
1. Initialize currentSum to 0 and start pointer to 0
2. Use end pointer loop from 0 to array length
3. Add arr[end] to currentSum and expand window
4. While currentSum > target, shrink window by subtracting arr[start] and incrementing start
5. If currentSum equals target, print start and end indices

**Time Complexity:** O(n) optimized, O(n^2) brute force | **Space Complexity:** O(1)

---

### 15. Subarray with Sum K - [View Solution](Arrays/SubarrayWithSumk.java)
**Question:** Print all subarrays whose sum equals `k`.

**Test Case:**
- Input: `arr = [1,2,1,3], k = 3`
- Output: `[1,2]` and `[3]`

**Approach:**
1. Use outer loop to iterate through each starting position i
2. Initialize sum to 0 for each starting position
3. Use inner loop from j=i to find all subarrays starting at i
4. Add each element to sum and check if sum equals target
5. When match found, print subarray from index i to j

**Time Complexity:** O(n^2) | **Space Complexity:** O(1)

---

### 16. Rearrange Array by Sign - [View Solution](Arrays/rearrangeArray.java)
**Question:** Rearrange array so positives and negatives are placed alternately.

**Test Case:**
- Input: `arr = [3,1,-2,-5,2,-4]`
- Output: `[3,-2,1,-5,2,-4]`

**Approach:**
1. Create a result array of same size as input array
2. Initialize pos pointer to 0 (for even indices) and neg pointer to 1 (for odd indices)
3. Iterate through input array using for-each loop
4. If num > 0, place it at result[pos] and increment pos by 2
5. If num is negative, place it at result[neg] and increment neg by 2

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 17. Stock Buy and Sell - [View Solution](Arrays/StockBuySell.java)
**Question:** Find maximum profit from one buy and one sell.

**Test Case:**
- Input: `prices = [7,1,5,3,6,4]`
- Output: `5`

**Approach:**
1. Initialize minPrice to Integer.MAX_VALUE and maxProfit to 0
2. Iterate through prices array using for-each loop
3. If current price < minPrice, update minPrice with current price
4. Else if (price - minPrice) > maxProfit, update maxProfit
5. Return maxProfit as the result

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

## Number Theory Problems

### 18. Armstrong Number - [View Solution](Arrays/amstrong.java)
**Question:** Check whether a number is an Armstrong number.

**Test Case:**
- Input: `153`
- Output: `Armstrong`

**Approach:**
1. Take number as input and store original value for comparison
2. Count total digits in the number using a while loop
3. Extract each digit using modulo 10 operation
4. Calculate sum of each digit raised to power of digit count
5. Compare final sum with original number to check if Armstrong

**Time Complexity:** O(d) where d is number of digits | **Space Complexity:** O(1)

---

### 19. Armstrong Numbers in Range - [View Solution](Arrays/ArmstrongInRange.java)
**Question:** Print all Armstrong numbers in a given range.

**Test Case:**
- Input: `1 500`
- Output: `1 153 370 371 407`

**Approach:**
1. Take start and end range as input
2. For each number in range, count its digits
3. Calculate sum of powers of digits
4. Compare sum with original number
5. If match found, print the Armstrong number

**Time Complexity:** O(n*d) where n is range size | **Space Complexity:** O(1)

---

### 20. GCD (Greatest Common Divisor) - [View Solution](Arrays/gcd.java)
**Question:** Find the greatest common divisor of two integers.

**Test Case:**
- Input: `a = 24, b = 36`
- Output: `12`

**Approach:**
1. Take two numbers as input from user
2. Find the smaller of the two numbers using Math.min()
3. Initialize gcd variable to 1
4. Loop from 1 to smaller number and check if both numbers divisible by i
5. Update gcd with current value i whenever divisibility condition is satisfied

**Time Complexity:** O(min(a,b)) | **Space Complexity:** O(1)

---

### 21. Prime Numbers in Range and Count - [View Solution](Arrays/PrimeCount.java)
**Question:** Print prime numbers between `start` and `end`, and also print their count.

**Test Case:**
- Input: `10 20`
- Output: `11 13 17 19` and `Count of prime numbers: 4`

**Approach:**
1. Iterate through every number in range
2. For each number, check divisibility up to `sqrt(num)`
3. If divisible by any number, mark as non-prime
4. If prime, print and increment count

**Time Complexity:** O(n * sqrt(m)) approximately | **Space Complexity:** O(1)

---

## 2D Array Problems

### 22. Print Matrix - [View Solution](2D-Array/PrintMatrix.java)
**Question:** Read and print a matrix.

**Test Case:**
- Input:
	`2 2`
	`1 2`
	`3 4`
- Output:
	`1 2`
	`3 4`

**Approach:**
1. Read row and column count
2. Fill matrix using nested loops
3. Print matrix using nested loops

**Time Complexity:** O(r*c) | **Space Complexity:** O(r*c)

---

### 23. Matrix Row Sum - [View Solution](2D-Array/MatrixRowSum.java)
**Question:** Print sum of each row in a matrix.

**Test Case:**
- Input:
	`2 3`
	`1 2 3`
	`4 5 6`
- Output:
	`sum of row 1 is 6`
	`sum of row 2 is 15`

**Approach:**
1. Read matrix values
2. For each row, accumulate sum
3. Print row sum

**Time Complexity:** O(r*c) | **Space Complexity:** O(r*c)

---

### 24. Matrix Column Sum - [View Solution](2D-Array/MatrixColSum.java)
**Question:** Print sum of each column in a matrix.

**Test Case:**
- Input:
	`2 3`
	`1 2 3`
	`4 5 6`
- Output:
	`sum of col 1 is 5`
	`sum of col 2 is 7`
	`sum of col 3 is 9`

**Approach:**
1. Read matrix values
2. For each column, accumulate sum
3. Print column sum

**Time Complexity:** O(r*c) | **Space Complexity:** O(r*c)

---

### 25. Diagonal Sum - [View Solution](2D-Array/DiagonalSum.java)
**Question:** Find sum of primary diagonal elements of a matrix.

**Test Case:**
- Input:
	`3 3`
	`1 2 3`
	`4 5 6`
	`7 8 9`
- Output: `Diagonal Sum = 15`

**Approach:**
1. Read matrix
2. Traverse indices `(i, j)`
3. Add `arr[i][j]` where `i == j`

**Time Complexity:** O(r*c) | **Space Complexity:** O(r*c)

---

### 26. Parking Lot Row with Maximum Cars - [View Solution](2D-Array/ParkingLot.java)
**Question:** In a 0/1 matrix, find row with maximum number of 1s.

**Test Case:**
- Input:
	`3 4`
	`1 0 1 1`
	`0 1 0 0`
	`1 1 1 0`
- Output: `Row 1 have maximum number of 1`

**Approach:**
1. Read matrix
2. Count number of ones for each row
3. Track max count and row index
4. Print the row having maximum ones

**Time Complexity:** O(r*c) | **Space Complexity:** O(r*c)

---

## String Problems

### 27. Check Anagram - [View Solution](String/Anagram.java)
**Question:** Check whether two strings are anagrams.

**Test Case:**
- Input: `listen` and `silent`
- Output: `Anagram`

**Approach:**
1. Take two strings as input and check if lengths are equal
2. Convert both strings to character arrays
3. Sort both character arrays using Arrays.sort()
4. Compare sorted arrays using Arrays.equals()
5. If equal, strings are anagrams; otherwise not

**Time Complexity:** O(n log n) | **Space Complexity:** O(n)

---

### 28. Check Only Digits - [View Solution](String/CheckOnlyDigit.java)
**Question:** Check if a string contains only numeric digits.

**Test Case:**
- Input: `12345`
- Output: `true`

**Approach:**
1. Initialize boolean flag isOnlyDigits to true
2. Iterate through each character of the string
3. Use Character.isDigit() to check if character is a digit
4. If any character is not a digit, set flag to false and break
5. Print result based on final flag value

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 29. Count Frequency of All Characters - [View Solution](String/CountFreqAll.java)
**Question:** Count frequency of each character in a string.

**Test Case:**
- Input: `banana`
- Output: `b=1, a=3, n=2`

**Approach:**
1. Convert string to character array
2. Create a boolean visited array to track processed characters
3. For each unvisited character, initialize count to 1
4. Compare with remaining characters and increment count for matches
5. Mark matching characters as visited and print character with frequency

**Time Complexity:** O(n^2) | **Space Complexity:** O(n)

---

### 30. Find Duplicate Characters - [View Solution](String/FindDuplicate.java)
**Question:** Print duplicate characters from a string.

**Test Case:**
- Input: `programming`
- Output: `r g m`

**Approach:**
1. Convert string to character array
2. Create boolean visited array to avoid reprocessing
3. Use nested loops to compare each character with subsequent ones
4. If duplicate found, print it and mark as visited
5. Break inner loop after finding first occurrence of duplicate

**Time Complexity:** O(n^2) | **Space Complexity:** O(n)

---

### 31. First Non-Repeating Character - [View Solution](String/FirstNonRepeatingChar.java)
**Question:** Find the first non-repeating character in a string.

**Test Case:**
- Input: `swiss`
- Output: `w`

**Approach:**
1. Create frequency array of size 26 for lowercase letters
2. Traverse string and increment frequency for each character
3. Traverse string again to find character with frequency 1
4. Print first character with frequency 1 and return
5. If no non-repeating character found, print appropriate message

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 32. Longest Common Prefix - [View Solution](String/longestCommonPrefix.java)
**Question:** Find longest common prefix among multiple strings.

**Test Case:**
- Input: `[flower, flow, flight]`
- Output: `fl`

**Approach:**
1. Take n strings as input and store in array
2. Sort the array of strings alphabetically
3. Compare only first and last string (extremes after sorting)
4. Increment index i while characters at position i match in both
5. Return substring from 0 to i as the longest common prefix

**Time Complexity:** O(n log n) | **Space Complexity:** O(n)

---

### 33. Longest Common Substring - [View Solution](String/LongestCommanSubstring.java)
**Question:** Find longest substring common to two strings.

**Test Case:**
- Input: `abcdef` and `zabcf`
- Output: `abc`

**Approach:**
1. Generate all substrings of first string
2. Check if second string contains each substring
3. Track the longest matching substring

**Time Complexity:** O(n^3) | **Space Complexity:** O(1)

---

### 34. Longest Word in String - [View Solution](String/LongestWordString.java)
**Question:** Find longest word in a sentence.

**Test Case:**
- Input: `I love programming daily`
- Output: `programming`

**Approach:**
1. Take sentence as input from user
2. Split the sentence into words array using space delimiter
3. Initialize longest variable as empty string
4. Iterate through words and compare length with longest
5. Update longest if current word has greater length

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 35. Palindrome String - [View Solution](String/PalindromString.java)
**Question:** Check if a string is palindrome.

**Test Case:**
- Input: `madam`
- Output: `Palindrome`

**Approach:**
1. Take string input and convert to lowercase
2. Store original string for comparison
3. Create StringBuilder with input string
4. Use reverse() method to reverse the string
5. Compare reversed string with original using equals()

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 36. Print All Substrings - [View Solution](String/PrintSubString.java)
**Question:** Print every possible substring of a string.

**Test Case:**
- Input: `abc`
- Output: `a, ab, abc, b, bc, c`

**Approach:**
1. Get length of input string n
2. Use outer loop i from 0 to n-1 for starting positions
3. Use inner loop j from i to n-1 for ending positions
4. Use substring(i, j+1) to extract substring
5. Print each substring on new line

**Time Complexity:** O(n^2) substrings generated | **Space Complexity:** O(1)

---

### 37. Remove Spaces - [View Solution](String/RemoveSpace.java)
**Question:** Remove all spaces from a string.

**Test Case:**
- Input: `my name is java`
- Output: `mynameisjava`

**Approach:**
1. Take string input with spaces
2. Use replace() method with parameters (" ", "")
3. Replace all space characters with empty string
4. Store result in new string variable
5. Print both original and space-removed strings

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 38. Remove Vowels - [View Solution](String/RemoveVowels.java)
**Question:** Remove all vowels from a given string.

**Test Case:**
- Input: `Education`
- Output: `dctn`

**Approach:**
1. Take string input from user using Scanner
2. Iterate through each character of the string
3. Check if character is not a vowel (both lowercase and uppercase)
4. If not a vowel, print the character
5. Continue until all characters are processed

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 39. Reverse String - [View Solution](String/reverseString.java)
**Question:** Reverse a given string.

**Test Case:**
- Input: `hello`
- Output: `olleh`

**Approach:**
1. Take string input from user
2. Initialize empty string rev for reversed result
3. Loop from last index (length-1) down to 0
4. Append each character to rev string
5. Print the reversed string

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 40. String Compression (Run Length Encoding) - [View Solution](String/shortWord.java)
**Question:** Compress string by replacing repeated characters with character+count.

**Test Case:**
- Input: `aaabbc`
- Output: `a3b2c1`

**Approach:**
1. Initialize count to 1 for tracking consecutive characters
2. Loop from index 1 and compare each character with previous
3. If characters match, increment count
4. If different, print previous character with its count
5. Reset count to 1 and continue; handle last character separately

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 41. Valid Parentheses - [View Solution](String/ValidPrantheses.java)
**Question:** Check whether brackets are valid and balanced.

**Test Case:**
- Input: `{[()]}`
- Output: `Valid`

**Approach:**
1. Create a Stack to store opening brackets
2. Iterate through each character in the string
3. If opening bracket, push to stack
4. If closing bracket, pop from stack and check if it matches
5. If stack is empty at end, parentheses are valid

**Time Complexity:** O(n) | **Space Complexity:** O(n)

---

### 42. Count Vowels and Consonants - [View Solution](String/VowelConsonantCount.java)
**Question:** Count number of vowels and consonants in a string.

**Test Case:**
- Input: `hello`
- Output: `vowels = 2, consonants = 3`

**Approach:**
1. Initialize vowels and consonants counters to 0
2. Convert string to lowercase for uniform checking
3. Iterate through each character using for-each loop
4. Check if character is letter; if yes, check if vowel using indexOf()
5. Increment respective counter and print both counts

**Time Complexity:** O(n) | **Space Complexity:** O(1)

---

### 43. Count Subsequences - [View Solution](String/CountSubsequence.java)
**Question:** Count total number of subsequences in a string.

**Test Case:**
- Input: `abc`
- Output: `8`

**Approach:**
1. Use formula `2^n` where `n` is string length
2. Compute with `Math.pow(2, n)`
3. Cast to int and print result

**Time Complexity:** O(1) for formula evaluation | **Space Complexity:** O(1)

---

## Getting Started

1. Navigate to JAVA coding directory
2. Compile any Java file: `javac filename.java`
3. Run the compiled file: `java ClassName`

## Note
- Questions and test cases are now added before each solution
- Time and space complexity mentioned for every solution
- Some files include both brute force and optimized approaches