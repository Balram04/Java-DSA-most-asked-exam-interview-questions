//Method 1: using two loops and visited array tc o(n^2) and sc o(n)
class FindDuplicate {
    public static void main(String[] args) {

        String str = "programming";
        char arr[] = str.toCharArray();
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            if(visited[i])
                continue;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    visited[j] = true;
                    break;
                }
            }
        }
    }
}

//Method 2: using HashSet tc o(n) and sc o(n)
import java.util.*;
class FindDuplicate {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}