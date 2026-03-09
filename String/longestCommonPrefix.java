//Tc o(nlogn) sc o(n)
import java.util.*;

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[n-1];

        int i = 0;
        while(i < first.length() && i < last.length() )
              if(first.charAt(i) == last.charAt(i)){
            i++;
        }else{
            break;
        }
        if(i == 0)
            System.out.println("-1");
        else
            System.out.println(first.substring(0, i));
    }
}