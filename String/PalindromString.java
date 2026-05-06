import java.util.*;

class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            str=str.toLowerCase();    //lower than assigne
        String original = str;

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (sb.toString().equals(original)) {
            System.out.println("Palindrome hai");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

// import java.util.*;

class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome hai");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}