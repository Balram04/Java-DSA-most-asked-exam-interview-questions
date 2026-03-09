import java.util.*;

public class PrintSubString {
    public static void main(String[] args) {

        String str = "abc";
        int n = str.length();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.println(str.substring(i, j + 1));
            }
        }
    }
}