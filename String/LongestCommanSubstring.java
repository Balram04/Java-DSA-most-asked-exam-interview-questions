//tc: O(n^3) sc: O(1)
import java.util.*;
class LongestCommanSubstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        String result="";
  for(int i=0;i<s1.length();i++){
    
    for(int j=i+1;j<=s1.length();j++){
        String sub =s1.substring(i,j);

        if(s2.contains(sub) && sub.length()>result.length()){
            result=sub;
        }
    }
  }
  System.out.println(result);
    }
}