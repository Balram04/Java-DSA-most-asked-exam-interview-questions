//Method 1: using sorting method tc o(n log n) and sc o(n)
import java.util.*;
class Anagram{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        String str1 =sc.nextLine();
        String str2 =sc.nextLine();

        if(str1.length() !=str2.length()){
            System.out.println("Not Anagram ");
            break;
        }
        char[]a =str1.toCharArray();
        char[]b =str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

    if(Arrays.equals(a,b)==true){
        System.out.println("Anagram");
    }else{
      System.out.println("Not Anagram");
       }
    }
}


//Method 2: using frequency array tc o(n) and sc o(1)
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;

        for (int i = 0; i < s2.length(); i++)
            freq[s2.charAt(i) - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("Not Anagram");
                break;
            }
        }

        System.out.println("Anagram");
    }
}