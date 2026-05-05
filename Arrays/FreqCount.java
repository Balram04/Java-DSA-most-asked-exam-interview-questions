import java.util.*;
public class FreqCount{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size; i++){
            arr[i]=sc.nextInt();     //[1,2,2,3,4,1,4]
        }
        sc.close();

          boolean visited[]=new boolean[size];  //to keep track of visited elements in the array
        for(int i=0;i<size;i++){
               if(visited[i]){
                continue;           //if the element is already visited, skip it
               } 
            int count =1;
              for(int j=i+1;j<size;j++){
               if(arr[i]==arr[j]){
                count ++;
                visited[j]=true;                 //mark the element as visited
               }
              }
              System.out.println(arr[i] +"count is-->"+count);
        }
    }
}


//Time complexity: O(n^2) because of the nested loops. The outer loop runs n times and the inner loop also runs n times in the worst case, leading to n*n = n^2 operations.
//Space complexity: O(n) because of the visited array, which can take up to n space in the worst case if all elements are unique.

//m-2 by using HashMap to store the frequency count of each element in the array. This way, we can achieve a time complexity of O(n) and space complexity of O(n) in the worst case.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            // STEP 1: check key exist
            if (map.containsKey(num)) {
                // STEP 2: get old value  //map.put(num,map.getorDefault(num,0)+1); can be used to avoid step 2 and 3,4
                int count = map.get(num);
                // STEP 3: update value
                count = count + 1;
                // STEP 4: put back
                map.put(num, count);
            } else {
                // first time entry
                map.put(num, 1);
            }
        }
          map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}