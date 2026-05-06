// Method 1️⃣ Brute force code with TC o(n^2) and SC o(1)
class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbccdeff";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false; 
         for (int j = 0; j < str.length(); j++) {
             if(str.charAt(i) == str.charAt(j) && i != j) {
                 found = true; 
                  break; 
             }
         }
            if (!found) {
                System.out.println("First non-repeating character is: " + str.charAt(i));
                return;
            }
        }
    }
}

// Method 2️⃣ Optimised code with TC o(n) and SC o(1)

import java.util.*;
class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbccdeff";
        int[] freq = new int[26]; // Assuming only lowercase letters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;       // Increment frequency of each character
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {       // Check if the character is non-repeating
                System.out.println("First non-repeating character is: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
// Method 3️⃣ Using LinkedHashMap to maintain insertion order with TC o(n) and SC o(n)
import java.util.*;

class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "aabbccdeff";
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

       
 // count frequency
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // find first non repeating
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.println("First non-repeating character is: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}