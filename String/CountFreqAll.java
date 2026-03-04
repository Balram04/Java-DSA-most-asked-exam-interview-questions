//Method 1: using two loops and visited array tc o(n^2) and sc o(n)
class CountFreqAll {
    public static void main(String[] args) {

        String str = "programming";
        char arr[] = str.toCharArray();
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if(visited[i])
                continue;

            int count = 1;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }
    }
}

//Method 2: using HashMap tc o(n) and sc o(n)
import java.util.*;
class CountFreqAll {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // System.out.println(map); // directly call toString();
//         for(char key : map.keySet()) {
//     System.out.println(key + " : " + map.get(key));
// }
               map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}