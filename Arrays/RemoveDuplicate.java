//m1 tc o(n^2) sc o(1)
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input = "1,8,6,6,2,7,7,5";
        String[] parts = input.split(",");

        int arr[] = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        for(int i = 0; i < arr.length; i++){
            boolean duplicate = false;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

//m2 by LinkedHashSet  tc o(n) sc o(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int arr[] = {1,8,6,6,2,7,7,5};

        LinkedHashSet<Integer> LH = new LinkedHashSet<>();

        for(int x : arr){
            LH.add(x);
        }

        System.out.println(LH);
    }
}