public class CountSubsequence {

    public static void main(String[] args){

        String str = "abc";   //total subsequence of string is 2^n where n is length of string

        int n = str.length();

        int result = (int)Math.pow(2,n);  //(int) using to convert double to int beacuse Math.pow return double value

        System.out.println(result);
    }
}