//method 1 by using stack tcs o(n) and sc o(n)
import java.util.*;
class ValidPrantheses{
     public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        String str =sc.nextLine();
        Stack<Character>stack=new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch =='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    System.out.println("invalid");
                    return;
                }
                char top=stack.pop();
                if((ch==')' && top!='(')||
                (ch=='}' && top!='{')||
                (ch==']' && top!='[')){
                    System.out.println("invalid");
                    return;
            }
        }
    }
         if(stack.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
     }
}

//method 2 using string tcs o(n^2) and sc o(1)
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        if(s.length() == 0)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}