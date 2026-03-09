public class shortWord {
    public static void main(String[] args) {

        String str = "aaabbcc";
        int count = 1;

        for(int i = 1; i < str.length(); i++) {

            if(str.charAt(i) == str.charAt(i-1)) {
                count++;
            } 
            else {
                System.out.print(str.charAt(i-1));
                System.out.print(count);
                count = 1;
            }
        }

        // print last character
        System.out.print(str.charAt(str.length()-1));
        System.out.print(count);
    }
}

//method 2 using StringBuilder
import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int count = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                count++;
                i++;
            }
            if(count == 1)
                sb.append(s.charAt(i));
            else
                sb.append(s.charAt(i)).append(count);
        }
        System.out.println(sb.toString());
    }
}
